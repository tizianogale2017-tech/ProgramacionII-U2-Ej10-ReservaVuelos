package Ejercicio10_reservaVuelos;

public class Asiento {
    private String numero;
    private String clase;
    private boolean ocupado;

    public Asiento(String numero, String clase) {
        this.numero = numero;
        this.clase = clase;
        this.ocupado = false;
    }

    public String getNumero() {
        return numero;
    }

    public String getClase() {
        return clase;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
