public class ControladorLuces {
    private ModeloLuz modelo;
    private VistaLuz vista;

    public ControladorLuces(ModeloLuz modelo, VistaLuz vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarEstadoLuces(boolean movimientoDetectado) {
        modelo.setEstadoLuz(movimientoDetectado); // Cambia el estado de las luces según el sensor
        vista.mostrarEstadoLuz(modelo.isLuzEncendida()); // Actualiza la vista
    }
}

import java.util.Scanner;

public class AplicacionLucesPorMovimiento {
    public static void main(String[] args) {
        ModeloLuz modelo = new ModeloLuz();
        VistaLuz vista = new VistaLuz();
        ControladorLuces controlador = new ControladorLuces(modelo, vista);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simulación de sensor de movimiento. Ingresa '1' si hay movimiento, '0' si no lo hay (Ctrl+C para salir):");
        while (true) {
            int movimiento = scanner.nextInt();
            boolean movimientoDetectado = movimiento == 1;
            controlador.actualizarEstadoLuces(movimientoDetectado);
        }
    }
}
