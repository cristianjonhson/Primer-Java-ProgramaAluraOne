public class NamingConventionDetector {
    public static void main(String[] args) {
        // Ejemplos de cadenas a verificar
        String[] testStrings = {
                "myMethod",           // método en camelCase
                "MyClass",            // clase en PascalCase
                "IShape",             // interfaz en PascalCase con convención I
                "myVariable",         // variable en camelCase
                "SomeOtherMethod",    // método en PascalCase
                "anotherVariable",    // variable en camelCase
                "Some_class",         // NO sigue ninguna convención
                "some_other_method"   // NO sigue ninguna convención
        };

        for (String test : testStrings) {
            System.out.println(test + " - " + detectConvention(test));
        }
    }

    public static String detectConvention(String str) {
        if (str == null || str.isEmpty()) {
            return "Cadena vacía o nula";
        }

        // Comprobación para clases o interfaces (PascalCase)
        if (str.matches("[A-Z][a-zA-Z0-9]*")) {
            if (str.startsWith("I")) {
                return "Interfaz (PascalCase)";
            } else {
                return "Clase (PascalCase)";
            }
        }

        // Comprobación para métodos (camelCase)
        if (str.matches("[a-z]+([A-Z][a-z]*)*")) {
            return "Método (camelCase)";
        }

        // Comprobación para variables (camelCase)
        if (str.matches("^[a-z][a-zA-Z0-9]*")) {
            return "Variable (camelCase)";
        }

        return "Convención no reconocida";
    }
}
