import java.util.Scanner;

public class CineVista {
    public static void main(String[] args) {
        CineControlador cineControlador = new CineControlador(10);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de reserva de asientos de cine.");
        boolean ejecutando = true;

        while (ejecutando) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cineControlador.mostrarAsientos();
                    break;
                case 2:
                    System.out.print("Introduce tu nombre: ");
                    String clienteNombre = scanner.next();
                    System.out.print("Introduce tu email: ");
                    String clienteEmail = scanner.next();
                    Reserva cliente = new Reserva(clienteNombre, clienteEmail);

                    System.out.print("Introduce el número del asiento que deseas reservar: ");
                    int numeroAsiento = scanner.nextInt();

                    cineControlador.reservarAsiento(numeroAsiento, cliente);
                    break;
                case 3:
                    ejecutando = false;
                    System.out.println("Gracias por usar el sistema de reserva. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }
}
