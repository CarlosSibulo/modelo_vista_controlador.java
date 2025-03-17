// Clase Cliente
public class Reserva {
    private String clienteNombre;
    private String clienteEmail;

    public Reserva(String clienteNombre, String clienteEmail) {
        this.clienteNombre = clienteNombre;
        this.clienteEmail = clienteEmail;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }
}

// Clase Lugar
public class Asiento {
    private int asientoNumero;
    private boolean estaReservado;

    public Asiento(int asientoNumero) {
        this.asientoNumero = asientoNumero;
        this.estaReservado = false;
    }

    public int getAsientoNumero() {
        return asientoNumero;
    }

    public boolean isEstaReservado() {
        return estaReservado;
    }

    public void reservar() {
        this.estaReservado = true;
    }
}

    
