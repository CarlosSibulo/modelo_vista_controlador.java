import java.util.Scanner;

public class VistaControlLuces {

    public static void encenderLuces() {
        Scanner scanner = new Scanner(System.in);
        Noche noche = new Noche();
        int entrada = scanner.nextInt();  
        
        if (entrada == 1) {  
            noche.setControlLuces(true);  
            System.out.println("Luces encendidas");
        } else {
            noche.setControlLuces(false);
            System.out.println("Luces apagadas");
        }
    }

    public static void apagarLuces() {
        Dia dia = new Dia();
        int entrada = new Scanner(System.in).nextInt();  
        
        if (entrada == 1) {  
            dia.setControlLuces(false);
            System.out.println("Luces apagadas");
        } else {
            dia.setControlLuces(true);
            System.out.println("Luces encendidas");
        }
    }
}
