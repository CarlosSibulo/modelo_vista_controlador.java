import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_Controlador {
    private List<Numeros> listaNumeros;
    private ModeloFizzBuzz modelo;
    private VistaFizzBuzz vista;

    public FizzBuzz_ControladorModeloFizzBuzz modelo, VistaFizzBuzz vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutarFizzBuzz(int numero) {
        String resultado = modelo.obtenerValorFizzBuzz(numero);
        listaNumeros = new ArrayList<>();
        vista.mostrarFizzBuzz(resultado);
    }
}
