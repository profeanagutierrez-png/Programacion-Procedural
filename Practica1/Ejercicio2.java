public class Ejercicio2 {
    public static void main(String[] args) {

        double ventad, suma;
        suma = 0;

        System.out.println("Ingrese el monto de venta diaria (0 para terminar): ");
        ventad = Double.parseDouble(System.console().readLine());

        while (ventad != 0) {
            suma = suma + ventad;

            System.out.println("Ingrese el siguiente monto de venta diaria (0 para terminar): ");
            ventad = Double.parseDouble(System.console().readLine());
        }

        System.out.println("La suma total de ventas es: " + suma);
    }
}