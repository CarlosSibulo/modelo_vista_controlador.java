public class Modelo {
    private String valorTemperatura;
    private String tipoSensor;

    public void controlar(String datoTemperatura, String datoSensor) {
        this.valorTemperatura = datoTemperatura;
        this.tipoSensor = datoSensor;
    }

    public String obtenerTemperatura() {
        return valorTemperatura; 
    }

    public void establecerTemperatura(String datoTemperatura) {
        this.valorTemperatura = datoTemperatura;
    }

    public String obtenerSensor() {
        return tipoSensor;
    }

    public void establecerSensor(String datoSensor) {
        this.tipoSensor = datoSensor;
    }
}
