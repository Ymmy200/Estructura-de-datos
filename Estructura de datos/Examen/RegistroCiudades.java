import java.util.ArrayList;
import java.util.Scanner;

public class RegistroCiudades {
    private ArrayList<String> ciudades;

    public RegistroCiudades() {
        ciudades = new ArrayList<>();
    }

    public void agregarCiudad(String ciudad) {
        ciudades.add(ciudad);
    }

    public void ingresarCiudades(Scanner scanner) {
        System.out.println("Ingrese las ciudades (ingrese 'fin' para terminar):");
        String ciudad;
        do {
            System.out.print("Ciudad: ");
            ciudad = scanner.nextLine();
            if (!ciudad.equalsIgnoreCase("fin")) {
                agregarCiudad(ciudad);
            }
        } while (!ciudad.equalsIgnoreCase("fin"));
    }

    public void buscarCiudad(String ciudad) {
        if (ciudades.contains(ciudad)) {
            System.out.println(ciudad + " se encuentra registrada.");
        } else {
            System.out.println(ciudad + " no se encuentra registrada.");
        }
    }

    public void eliminarCiudad(String ciudad) {
        if (ciudades.contains(ciudad)) {
            ciudades.remove(ciudad);
            System.out.println(ciudad + " ha sido eliminada.");
        } else {
            System.out.println(ciudad + " no se encuentra registrada, no se puede eliminar.");
        }
    }

    public void listarCiudades() {
        System.out.println("Ciudades registradas:");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }

    public static void main(String[] args) {
        RegistroCiudades registro = new RegistroCiudades();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ingresar ciudades");
            System.out.println("2. Buscar ciudad");
            System.out.println("3. Eliminar ciudad");
            System.out.println("4. Verificar si una ciudad está registrada");
            System.out.println("5. Listar ciudades");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    registro.ingresarCiudades(scanner);
                    break;
                case 2:
                    System.out.print("Ingrese la ciudad a buscar: ");
                    String ciudadBuscar = scanner.nextLine();
                    registro.buscarCiudad(ciudadBuscar);
                    break;
                case 3:
                    System.out.print("Ingrese la ciudad a eliminar: ");
                    String ciudadEliminar = scanner.nextLine();
                    registro.eliminarCiudad(ciudadEliminar);
                    break;
                case 4:
                    System.out.print("Ingrese la ciudad a verificar: ");
                    String ciudadVerificar = scanner.nextLine();
                    registro.buscarCiudad(ciudadVerificar);
                    break;
                case 5:
                    registro.listarCiudades();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
