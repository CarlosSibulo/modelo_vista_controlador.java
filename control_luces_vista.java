import java.util.Scanner;

public class VistaControlLuces {

    public static void encenderLuces() {
        Scanner scanner = new Scanner(System.in);
        Noche noche = new Noche();
        int entrada = scanner.nextInt();  // Corregido, no está claro el propósito de 'Sensor' y 'luces'
        
        if (entrada == 1) {  // Supuse que '1' representaría que es de noche
            noche.setControlLuces(true);  // Renombrado el método para hacerlo más claro
            System.out.println("Luces encendidas");
        } else {
            noche.setControlLuces(false);
            System.out.println("Luces apagadas");
        }
    }

    public static void apagarLuces() {
        Dia dia = new Dia();
        int entrada = new Scanner(System.in).nextInt();  // Utilizo scanner nuevamente para tomar la entrada
        
        if (entrada == 1) {  // Supuse que '1' representaría que es de día
            dia.setControlLuces(false);
            System.out.println("Luces apagadas");
        } else {
            dia.setControlLuces(true);
            System.out.println("Luces encendidas");
        }
    }
}
