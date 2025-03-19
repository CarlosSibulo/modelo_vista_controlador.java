public class Modelo {
    private String temperatura;
    private String humedad;

    public Modelo() {
        // Crear los atributos
        this.temperatura = "";
        this.humedad = "";
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura; // Corregí el uso incorrecto de los paréntesis
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad; // Corregí el uso incorrecto de los paréntesis
    }

    public boolean guardarDatos(String datoTemperatura, String datoHumedad) {
        System.out.print("Conectando a la base de datos...");
        System.out.println("Temperatura: " + datoTemperatura);
        System.out.println("Humedad: " + datoHumedad);
        boolean datoGuardado = true;
        return datoGuardado;
    }
}
