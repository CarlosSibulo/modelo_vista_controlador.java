import java.util.List;
import java.util.ArrayList;

public class Controlador {
    private List<Numero> listaNumeros;
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        listaNumeros = new ArrayList<>();
    }

    public void ejecutarTemperatura(int numero) {
        String resultado = modelo.obtenerTemperatura(numero);
        listaNumeros = new ArrayList<>();
        vista.mostrarTemperatura(resultado);
    }
}
