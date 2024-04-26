import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RegistroNotas {
    private ArrayList<Double> notas;

    public RegistroNotas() {
        notas = new ArrayList<>();
    }

    public void registrarNota(double nota) {
        notas.add(nota);
    }

    public void pedirNotas(Scanner scanner, int cantidadNotas) {
        System.out.println("Por favor, ingrese las notas:");
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            registrarNota(nota);
        }
    }

    public void listarNotas() {
        System.out.println("Notas registradas: " + notas);
    }

    public int contarNotas() {
        return notas.size();
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) return 0.0;
        double sum = 0;
        for (double nota : notas) {
            sum += nota;
        }
        return sum / notas.size();
    }

    public void listarNotasMayoresATres() {
        System.out.println("Notas mayores a 3.0:");
        for (double nota : notas) {
            if (nota > 3.0) {
                System.out.println(nota);
            }
        }
    }

    public int[] estudiantesGanaronPerdieron() {
        int ganaron = 0, perdieron = 0;
        for (double nota : notas) {
            if (nota >= 3.0) {
                ganaron++;
            } else {
                perdieron++;
            }
        }
        return new int[]{ganaron, perdieron};
    }

    public double notaMayor() {
        return Collections.max(notas);
    }

    public double notaMenor() {
        return Collections.min(notas);
    }

    public void eliminarNotas() {
        notas.clear();
    }


    public void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar notas");
        System.out.println("2. Listar notas");
        System.out.println("3. Calcular promedio");
        System.out.println("4. Listar notas mayores a 3.0");
        System.out.println("5. Estudiantes que ganaron y perdieron");
        System.out.println("6. Mostrar nota mayor");
        System.out.println("7. Mostrar nota menor");
        System.out.println("8. Eliminar todas las notas");
        System.out.println("9. Salir");
        System.out.print("Opción: ");
    }

    
    public void procesarOpcion(Scanner scanner, int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad de notas a registrar: ");
                int cantidadNotas = scanner.nextInt();
                pedirNotas(scanner, cantidadNotas);
                break;
            case 2:
                listarNotas();
                break;
            case 3:
                System.out.println("Promedio: " + calcularPromedio());
                break;
            case 4:
                listarNotasMayoresATres();
                break;
            case 5:
                int[] resultados = estudiantesGanaronPerdieron();
                System.out.println("Estudiantes que ganaron: " + resultados[0]);
                System.out.println("Estudiantes que perdieron: " + resultados[1]);
                break;
            case 6:
                System.out.println("Nota mayor: " + notaMayor());
                break;
            case 7:
                System.out.println("Nota menor: " + notaMenor());
                break;
            case 8:
                eliminarNotas();
                System.out.println("Todas las notas han sido eliminadas.");
                break;
            case 9:
                System.out.println("¡Hasta luego!");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    
    public static void main(String[] args) {
        RegistroNotas registro = new RegistroNotas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            registro.mostrarMenu();
            opcion = scanner.nextInt();
            registro.procesarOpcion(scanner, opcion);
        } while (opcion != 9);

        scanner.close();
    }
}
