import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Estudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String NombreEstudiante;
        String Continuar;
        double suma = 0;
        double promedio = 0;
        System.out.println("SISTEMA DE NOTAS\n");
        System.out.println("Ingrese el nombre del estudiante: ");
        NombreEstudiante = scanner.nextLine();

        do{
            System.out.print("Ingrese una nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            notas.add(nota);
            suma += nota;

            System.out.println("¿Ingresar otra nota? (Si/No): ");
            Continuar = scanner.next();
        } while (Continuar.equalsIgnoreCase("Si"));
        promedio = suma / notas.size();

        String estado;
        if (promedio >= 90) {
            estado = "Excelente";
        } else if (promedio >= 70) {
            estado = "Aprobado";
        } else {
            estado = "Desaprobado";
        }

        System.out.println("====RESUMEN DEL ESTUDAINTE====");
        System.out.println("Nombre: " + NombreEstudiante);
        System.out.println("Notas ingresadas: " + notas);
        System.out.println("Promedio del estudiante " + NombreEstudiante + ": " + promedio);
        System.out.println("Estado del estudiante: " + estado);
    }
}
