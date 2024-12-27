public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a ScreenMatch");
        System.out.println("Película: Matrix");
        String sinopsis = getString();

        // Imprimir la sinopsis
        System.out.println(sinopsis);

        // Comprobación de si está incluido en el plan
        boolean incluidoPlan = true;
        String incluidoEnPlan = incluidoPlan ? "Sí" : "No"; // Usamos el operador ternario
        System.out.println("¿Está incluido en el plan? " + incluidoEnPlan);

        String contrasena= "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.printf("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares%n", nombre, edad, valor);

        String nombrej = "Cris";
        int aulas = 4;

        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje""".formatted(nombrej, aulas);

        System.out.println(mensaje);

        int x = 10;
        double y = x; // casting implícito
        System.out.println(y);


        double xx = 10.5;
        int yy = (int) xx; // casting explícito
        System.out.println(yy);

    }

    private static String getString() {
        int fechaDeLanzamiento = 1999;

        // Crear el Text Block con la sinopsis y la fecha de lanzamiento
        return """
                Matrix es una película de ciencia ficción dirigida por las hermanas Wachowski.\s
                La historia sigue a Neo, un joven programador que descubre que el mundo en el que vive\s
                no es real, sino una simulación creada por las máquinas para controlar a la humanidad.
                Neo se une a un grupo de rebeldes que luchan para liberar a la humanidad de la Matrix.
                Fecha de lanzamiento:\s""" +  fechaDeLanzamiento;
    }
}
