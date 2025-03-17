public class fizzbus_modulo {
    public class Juego_FizzBuzz {
    public class FizzBuzz {
    public String obtenerResultado(int cantidad) {
        if (cantidad % 3 == 0 && cantidad % 5 == 0) {
            return "FizzBuzz";
        } else if (cantidad % 3 == 0) {
            return "Fizz";
        } else if (cantidad % 5 == 0) {
            return "Buzz";
             } else {
            return Integer.toString(cantidad);
        }
    }
    }
    } 
}
    
