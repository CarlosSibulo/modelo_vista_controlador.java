import java.util.Scanner;

public class ModeloSensorMovimiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sensor sensor = new Sensor();
        scanner.close();
    }

    public class MenuSensorMovimiento {
        Menu menu = new Menu();
        String movimiento = scanner.nextLine(); // Asumiendo que 'scanner' es el que se usará para leer
        activarSensor();

        private boolean movimientoDetectado;

        public boolean isMovimientoDetectado() {
            return movimientoDetectado;
        }

        public void setMovimientoDetectado(boolean movimientoDetectado) {
            this.movimientoDetectado = movimientoDetectado;
        }

        // Método para activar el sensor, asumiendo que se debe implementar
        private void activarSensor() {
            // Implementación para activar el sensor
        }
    }
}
