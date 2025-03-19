import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private Calculadora calculadora;
    private List<Numero> listaNumeros;
    private Vista vista;

    public Controlador() {
        this.calculadora = new Calculadora();
        listaNumeros = new ArrayList<>();
        this.vista = new Vista();
    }

    public void iniciar() {
        boolean continuarOperacion = true;
        
        while (continuarOperacion) {
            System.out.println("Ingrese el primer número: ");
            double primerNumero = TomarDatos.nextDouble();
            System.out.println("Ingrese el segundo número: ");
            double segundoNumero = TomarDatos.nextDouble();
            System.out.println("Seleccione una operación (+, -, *, /): ");
            char operacionSeleccionada = TomarDatos.next().charAt(0);
            double resultadoOperacion = 0;
            boolean operacionValida = true;

            switch (operacionSeleccionada) {
                case '+':
                    resultadoOperacion = calculadora.sumar(primerNumero, segundoNumero);
                    break;
                case '-':
                    resultadoOperacion = calculadora.restar(primerNumero, segundoNumero);
                    break;
                case '*':
                    resultadoOperacion = calculadora.multiplicar(primerNumero, segundoNumero);
                    break;
                case '/':
                    try {
                        resultadoOperacion = calculadora.dividir(primerNumero, segundoNumero);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida. Por favor, seleccione una operación válida.");
                    operacionValida = false;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultadoOperacion);
            }

            System.out.println("¿Desea realizar otro cálculo? (s/n): ");
            char respuestaUsuario = TomarDatos.next().charAt(0);
            if (respuestaUsuario != 's' && respuestaUsuario != 'S') {
                continuarOperacion = false;
            }
        }

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        TomarDatos.close();
    }
}
