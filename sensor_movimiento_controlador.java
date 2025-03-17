public class ControladorSensorMovimiento {
    private SensorMovimiento modelo;
    private VistaSensorMovimiento vista;

    public ControladorSensorMovimiento(SensorMovimiento modelo, VistaSensorMovimiento vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void detectarMovimiento(boolean movimientoDetectado) {
        modelo.setMovimientoDetectado(movimientoDetectado);
        vista.actualizarEstado(modelo.isMovimientoDetectado());
    }
}
