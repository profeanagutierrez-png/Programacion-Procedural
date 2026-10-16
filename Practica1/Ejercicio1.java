public class Ejercicio1 {
    public static void main(String[] args) {
        int dni, dias;
        double porc;
        String apellido;
        String nombre;
        for (int i = 0;i < 2;i++) {
            System.out.println("Ingrese el nombre del docente: ");
            nombre = System.console().readLine();
            System.out.println("Ingrese el apellido del alumno: ");
            apellido = System.console().readLine();
            System.out.println("Ingrese el dni del alumno: ");
            dni = Integer.parseInt(System.console().readLine());
            System.out.println("Ingrese la cantidad de dias de asistencia: ");
            dias = Integer.parseInt(System.console().readLine());
            porc = (dias * 100) / 30;
            System.out.println("El porcentaje de asistencia del alumno " + nombre + " " + apellido + " con dni " + dni + " es: " + porc + "%");
        }

        System.out.println("Fin del programa");
    }
}
