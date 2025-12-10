
    import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Env {

    private static HashMap<String, String> variables = new HashMap<>();

    static {
        try {
            BufferedReader br = new BufferedReader(new FileReader(".env"));
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("=")) {
                    String[] parts = line.split("=", 2);
                    variables.put(parts[0].trim(), parts[1].trim());
                }
            }

            br.close();
        } catch (Exception e) {
            System.out.println("WARNING: No se pudo cargar .env");
        }
    }

    public static String get(String key) {
        return variables.getOrDefault(key, "");
    }
}

