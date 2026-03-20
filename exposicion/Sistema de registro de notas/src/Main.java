import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");

        int contador = 0;
        double suma = 0;
        int opcion;

        String listaNotas = "";

        do {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una nota:"));

            suma += nota;
            contador++;

            listaNotas += nota + "\n";

            opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra nota?");
        } while (opcion == JOptionPane.YES_OPTION);

        double promedio = suma / contador;

        String estado;
        if (promedio >= 70) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }

        JOptionPane.showMessageDialog(null,
                "Resumen del estudiante\n" +
                        "Nombre: " + nombre + "\n" +
                        "Notas ingresadas:\n" + listaNotas +
                        "Cantidad de notas: " + contador + "\n" +
                        "Promedio: " + promedio + "\n" +
                        "Estado: " + estado);
    }
}