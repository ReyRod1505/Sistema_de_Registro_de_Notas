import java.util.Scanner;
import java.util.InputMismatchException;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String name = sc.nextLine();

        double gradeSum = 0;
        int gradesNumber = 0;
        String continuee;

        do {
            System.out.print("Ingrese una nota (0-100): ");

            try {
                double grade = sc.nextDouble();

                if (grade >= 0 && grade <= 100)  {
                    gradeSum += grade;
                    gradesNumber++;
                } else {
                    System.out.println("Nota inválida. Por favor, ingrese una nota entre 0 y 100.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número.");
                sc.next(); // limpiar el dato
            }

            System.out.print("¿Desea ingresar otra nota? (s/n): ");
            continuee = sc.next();

        } while (continuee.equalsIgnoreCase("s"));

        if (gradesNumber > 0) {
            double average = gradeSum / gradesNumber;

            String estadoAcademico;
            if (average >= 70) {
                estadoAcademico = "Aprobado";
            } else {
                estadoAcademico = "Reprobado";
            }

            System.out.println("\nResumen del estudiante:");
            System.out.println("Nombre: " + name);
            System.out.println("Promedio: " + average);
            System.out.println("Estado Académico: " + estadoAcademico);
        } else {
            System.out.println("No se ingresaron notas para el estudiante.");
        }

        sc.close();
    }
}