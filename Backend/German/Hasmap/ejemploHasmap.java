package Hasmap;
  import java.util.HashMap;
import java.util.Map;

public class ejemploHasmap {
  
    public static void main(String[] args) {

        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Colombia", "Bogotá");
        capitales.put("Perú", "Lima");
        capitales.put("Argentina", "Buenos Aires");

        System.out.println("Capital de Perú: " + capitales.get("Perú"));

        System.out.println("\nListado de países y capitales:");
        for (Map.Entry<String, String> entry : capitales.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}


