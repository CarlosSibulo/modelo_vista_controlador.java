public class Modulo {
    private int primerNumero;
    private int segundoNumero;

    public Modelo() {
        // Crear los atributos
        this.primerNumero = 0;
        this.segundoNumero = 0;
    }

    public int getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public boolean guardarDatos(int datoPrimerNumero, int datoSegundoNumero) {
        System.out.print("Conectando a la base de datos...");
        System.out.print(datoPrimerNumero);
        System.out.print(datoSegundoNumero);
        boolean datosGuardados = true;
        return datosGuardados;
    }
}
