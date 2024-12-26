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
