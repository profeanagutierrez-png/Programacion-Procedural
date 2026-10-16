//El programa tendrá una variable denominada nota.Si la nota es mayor o igual a 6, deberá mostrar: Aprobado
public class EstadoAlumno {

    public static void main(String[] args) {

        double nota = 8;

        System.out.println("Nota: " + nota);
        System.out.println();

        if (nota >= 6) {

            System.out.println("Estado: APROBADO");

        } else {

            System.out.println("Estado: DESAPROBADO");
        }
    }
}