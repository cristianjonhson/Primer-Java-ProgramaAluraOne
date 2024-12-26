public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a ScreenMatch");
        System.out.println("Película: Matrix");
        int fechaDeLanzamiento = 1999;
        System.out.println(fechaDeLanzamiento);

        boolean incluidoPlan = true;
        String incluidoEnPlan = incluidoPlan ? "Sí" : "No"; // Usamos el operador ternario
        System.out.println("¿Está incluido en el plan? " + incluidoEnPlan);
    }
}
