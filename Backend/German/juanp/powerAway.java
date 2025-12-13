package juanp;


import java.util.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
// Asegúrate de que Gson esté en tu CLASSPATH para que esto funcione
import com.google.gson.Gson; 
import com.google.gson.JsonSyntaxException;

public class powerAway {

    // =========================================================================
    //  ESTRUCTURAS DE DATOS PARA LA API (ANIDADAS)
    // =========================================================================
    
    // Clase que mapea el contenido del mensaje
    static class Message {
        public String role;
        public String content;
        public Message() {} 
    }

    // Clase que mapea el objeto choice
    static class Choice {
        public int index;
        public Message message;
        public Choice() {} 
    }

    // Clase que mapea la respuesta completa de la API
    static class OpenRouterResponse {
        public List<Choice> choices;
        public OpenRouterResponse() {} 
    }

    // Clase auxiliar para construir el cuerpo de la solicitud JSON
    static class OpenRouterRequest {
        public String model;
        public Message[] messages;
        public OpenRouterRequest(String model, Message[] messages) {
            this.model = model;
            this.messages = messages;
        }
    }
    
    // =========================================================================
    //  CLIENTE DE OPENROUTER (ANIDADO)
    // =========================================================================
    
    private static final String API_URL = "https://openrouter.ai/api/v1/chat/completions";
    
    // ⚠️ ATENCIÓN: REEMPLAZA ESTA CLAVE CON TU CLAVE REAL DE OPENROUTER ⚠️
    private static final String API_KEY = "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"; 
    
    private static final String MODEL_NAME = "deepseek/deepseek-chat"; 

    /**
     * Envía una solicitud de chat a DeepSeek a través de OpenRouter.
     */
    public static String obtenerRespuestaDeepSeek(String mensaje) {
        
        Gson gson = new Gson();

        // 1. Construir el cuerpo de la solicitud
        Message userMessage = new Message();
        userMessage.role = "user";
        userMessage.content = mensaje.replace("\"", "\\\""); // Escapar comillas
        
        OpenRouterRequest requestBody = new OpenRouterRequest(MODEL_NAME, new Message[]{userMessage});
        String jsonBody = gson.toJson(requestBody);
            
        // 2. Construir la Petición HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Authorization", "Bearer " + API_KEY)
                .header("Content-Type", "application/json")
                // El Referer es requerido por OpenRouter
                .header("HTTP-Referer", "https://github.com/proyecto-powerAway-java") 
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        // 3. Enviar y Procesar la Respuesta
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                // Parsear la respuesta JSON para extraer el mensaje
                OpenRouterResponse responseObj = gson.fromJson(response.body(), OpenRouterResponse.class);
                
                if (responseObj != null && responseObj.choices != null && !responseObj.choices.isEmpty()) {
                    return responseObj.choices.get(0).message.content;
                } else {
                    return "Error: Respuesta API vacía o inválida. Cuerpo: " + response.body();
                }
            } else {
                return "❌ Error en la API: Código " + response.statusCode() + ". Cuerpo: " + response.body();
            }

        } catch (JsonSyntaxException e) {
            return "❌ Error de sintaxis JSON al parsear la respuesta: " + e.getMessage();
        } catch (Exception e) {
            return "❌ Error de conexión/I/O. Verifique su conexión y la CLAVE API.";
        }
    }

    // =========================================================================
    //  LÓGICA DE POWERAWAY
    // =========================================================================

    public static void agregarDispositivo(
            ArrayList<String> listaDispositivos,
            HashMap<String, String> estado,
            HashMap<String, Double> consumo,
            ArrayList<String> historial,
            Scanner input) {

        input.nextLine(); 
        System.out.print("Ingrese el nombre del nuevo dispositivo: ");
        String nuevo = input.nextLine().trim();

        if (estado.containsKey(nuevo)) {
            System.out.println(" El dispositivo ya existe en el sistema.");
            return;
        }

        listaDispositivos.add(nuevo);
        estado.put(nuevo, "ENCENDIDO");
        consumo.put(nuevo, Math.random() * 500 + 50);
        historial.add(nuevo + " fue agregado al sistema.");

        System.out.println(" ✅ Dispositivo agregado correctamente.");
    }

    public static void cambiarEstadoDispositivo(
            String nuevoEstado, 
            String mensajeInput,
            HashMap<String, String> estado, 
            ArrayList<String> historial, 
            Scanner input) {
        
        System.out.print(mensajeInput);
        input.nextLine();
        String dispositivo = input.nextLine();
        
        if (estado.containsKey(dispositivo)) {
            estado.put(dispositivo, nuevoEstado);
            historial.add(dispositivo + " fue " + nuevoEstado + (nuevoEstado.equals("SUSPENDIDO") ? " (modo ahorro)." : " remotamente."));
            System.out.println(" ✅ Dispositivo " + nuevoEstado + ".");
        } else {
            System.out.println(" ⚠️ No existe ese dispositivo.");
        }
    }

    public static void main(String[] args) {

        // Inicialización de datos
        String[] dispositivosIniciales = {"Televisor", "Plancha", "Ventilador", "Lámparas", "Computador", "Nevera", "Aire acondicionado","Estufa"};
        ArrayList<String> dispositivos = new ArrayList<>(Arrays.asList(dispositivosIniciales));
        
        HashMap<String, String> estado = new HashMap<>();
        HashMap<String, Double> consumo = new HashMap<>();
        ArrayList<String> historial = new ArrayList<>();

        for (String d : dispositivos) {
            estado.put(d, "ENCENDIDO");
            consumo.put(d, Math.random() * 500 + 50);
        }

        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n========= POWERAWAY CONTROL (v1.1 con DeepSeek) =========");
            System.out.println("1. Ver dispositivos conectados");
            System.out.println("2. Apagar dispositivo");
            System.out.println("3. Suspender dispositivo");
            System.out.println("4. Ver consumo energético");
            System.out.println("5. Ver historial de acciones");
            System.out.println("6. Agregar nuevo dispositivo");
            System.out.println("7. 🤖 Consultar a DeepSeek (Consejos de ahorro)");
            System.out.println("8. Salir"); 
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" Opción inválida. Ingrese un número.");
                input.nextLine(); 
                continue;
            }

            switch (opcion) {

                case 1:
                    System.out.println("\n--- Lista de dispositivos ---");
                    for (String d : dispositivos) {
                        System.out.printf("👉 %-20s -> Estado: %s\n", d, estado.get(d));
                    }
                    break;

                case 2:
                    cambiarEstadoDispositivo("APAGADO", "Ingrese el nombre del dispositivo a APAGAR: ", estado, historial, input);
                    break;

                case 3:
                    cambiarEstadoDispositivo("SUSPENDIDO", "Ingrese el nombre del dispositivo a SUSPENDER: ", estado, historial, input);
                    break;

                case 4:
                    System.out.println("--- Consumo energético (Watts) ---");
                    double totalConsumo = 0;
                    for (String d : dispositivos) {
                        double cons = consumo.get(d);
                        String est = estado.get(d);
                        
                        double factor = 0.0;
                        if (est.equals("ENCENDIDO")) {
                            factor = 1.0;
                        } else if (est.equals("SUSPENDIDO")) {
                            factor = 0.15;
                        }
                        
                        double consumoActual = cons * factor;
                        
                        totalConsumo += consumoActual;
                        System.out.printf("⚡ %-20s -> %.2f Watts (Estado: %s)\n", d, consumoActual, est);
                    }
                    System.out.printf("\nTOTAL Consumo Activo Estimado: %.2f Watts\n", totalConsumo);
                    break;

                case 5:
                    System.out.println("--- Historial de acciones ---");
                    if (historial.isEmpty()) {
                        System.out.println("Aún no se ha realizado ninguna acción.");
                    } else {
                        for (String h : historial) {
                            System.out.println("- " + h);
                        }
                    }
                    break;

                case 6:
                    agregarDispositivo(dispositivos, estado, consumo, historial, input);
                    break;
                
                case 7:
                    System.out.println("\n--- Pregunta a DeepSeek ---");
                    input.nextLine();
                    System.out.println("Escribe tu consulta sobre ahorro de energía, dispositivos o tu hogar inteligente:");
                    System.out.print(">>> ");
                    String preguntaUsuario = input.nextLine();

                    System.out.println("\n... Contactando a DeepSeek vía OpenRouter ...");
                    String respuestaIA = obtenerRespuestaDeepSeek(preguntaUsuario);

                    System.out.println("\n==============================================");
                    System.out.println("🤖 DeepSeek dice: \n" + respuestaIA);
                    System.out.println("==============================================");
                    break;

                case 8: 
                    System.out.println("Saliendo del sistema... Gracias por usar PowerAway.");
                    break;

                default:
                    System.out.println(" Opción incorrecta, intente de nuevo.");
            }

        } while (opcion != 8);
        input.close();
    }
}