public class Vista {

    public class Calculadora {
        boolean continuar = true;

        public void iniciar() {
            while (continuar) {
                System.out.println("Ingrese el primer número: ");
                double primerNumero = TomarDatos.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double segundoNumero = TomarDatos.nextDouble();
                System.out.println("Seleccione una operación (+, -, *, /): ");
                char operacionSeleccionada = TomarDatos.next().charAt(0);
                double resultadoOperacion = 0;
                boolean operacionValida = true;
            }
        }
    }

    public class CalcularOperaciones {
        public double sumar(double primerNumero, double segundoNumero) {
            return primerNumero + segundoNumero;
        }

        public double restar(double primerNumero, double segundoNumero) {
            return primerNumero - segundoNumero;
        }

        public double multiplicar(double primerNumero, double segundoNumero) {
            return primerNumero * segundoNumero;
        }

        public double dividir(double primerNumero, double segundoNumero) {
            if (segundoNumero == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            return primerNumero / segundoNumero;
        }
    }
}
