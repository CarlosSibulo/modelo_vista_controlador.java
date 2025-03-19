import java.util.Scanner;
import java.util.ArrayList;

public class Vista {
    private List<Temperatura> listaTemperaturas;

    public Vista() {
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de control de temperatura.");
        boolean ejecutando = true;
        listaTemperaturas = new ArrayList<>();

        while (ejecutando) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar temperatura");
            System.out.println("2. Registrar temperatura (°C)");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlador.mostrarTemperatura();
                    break;
                case 2:
                    System.out.print("Introduce la temperatura (°C): ");
                    String temperaturaEntrada = scanner.next();
                    Temperatura nuevaTemperatura = new Temperatura();
                    nuevaTemperatura.setValor(temperaturaEntrada);  // Asumí que tienes un setter en la clase Temperatura

                    // Aquí se debe agregar la nueva temperatura a la lista
                    listaTemperaturas.add(nuevaTemperatura);
                    break;
                case 3:
                    ejecutando = false;
                    System.out.println("Gracias por usar el sistema de control. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }
}
