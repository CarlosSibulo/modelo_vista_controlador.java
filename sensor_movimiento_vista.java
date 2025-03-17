import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class VistaSensorMovimiento extends VBox {
    private Label etiquetaEstado;

    public VistaSensorMovimiento() {
        etiquetaEstado = new Label("Estado: Sin detección de movimiento");
        this.getChildren().add(etiquetaEstado);
    }

    public void mostrarMenu(boolean movimientoDetectado) {
        Menu menu = new Menu();
        int opcionMovimiento = menu.nextInt(); // Asumí que 'menu' es una instancia de la clase Menu que lee opciones
        activarSensor();
        
        while (true) {
            if (movimientoDetectado) {
                System.out.println("Estado: ¡Movimiento detectado!");
            } else {
                System.out.println("Estado: Sin detección de movimiento");
            }
        }
    }

    private void activarSensor() {
        // Lógica para activar el sensor (puedes completar esto dependiendo de la implementación de tu sensor)
    }
}
