import java.util.Scanner;

public class ModeloSensorMovimiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sensor sensor = new Sensor();
        scanner.close();
    }

    public class MenuSensorMovimiento {
        Menu menu = new Menu();
        String movimiento = scanner.nextLine(); 
        activarSensor();

        private boolean movimientoDetectado;

        public boolean isMovimientoDetectado() {
            return movimientoDetectado;
        }

        public void setMovimientoDetectado(boolean movimientoDetectado) {
            this.movimientoDetectado = movimientoDetectado;
        }

        private void activarSensor() {
        }
    }
}
