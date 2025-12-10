import java.io.*;

public class Env {

    private static java.util.HashMap<String, String> variables = new java.util.HashMap<>();

    static {
        try {
            File f = new File(".env");
            System.out.println("Intentando cargar: " + f.getAbsolutePath());

            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("=")) {
                    String[] parts = line.split("=", 2);
                    variables.put(parts[0].trim(), parts[1].trim());
                }
            }

            br.close();
        } catch (Exception e) {
            System.out.println("WARNING: No se pudo cargar .env: " + e.getMessage());
        }
    }

    public static String get(String key) {
        return variables.getOrDefault(key, "");
    }
}
