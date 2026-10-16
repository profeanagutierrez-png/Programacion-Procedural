import java.util.Scanner;
public class Leerdatos {
    public static void main(String[] args) {
        String nombre;   
       // Se crea el objeto Scanner conectado al teclado
        Scanner teclado = new Scanner(System.in);

        // Lectura de texto (cadena de caracteres)
        System.out.println("Ingrese su nombre:");
        
        nombre = teclado.nextLine();

        // Lectura de números enteros
        System.out.println("Ingrese un número:");
        int valor;
        valor = teclado.nextInt();
    }
}
    
