package Ejercicio10_reservaVuelos;

public class Pasajero {
    private String nombre;
    private String dni;

    public Pasajero(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public boolean solicitarReserva(Vuelo vuelo, String numeroAsiento) {
        boolean confirmada = vuelo.reservarAsiento(numeroAsiento);
        if (confirmada) {
            System.out.println("COMPROBANTE: " + nombre + " (DNI " + dni + ") - Vuelo " + vuelo.getCodigo()
                    + " - Asiento " + numeroAsiento + " confirmado.");
        } else {
            System.out.println("RECHAZO: " + nombre + " no pudo reservar el asiento " + numeroAsiento
                    + " en el vuelo " + vuelo.getCodigo() + " (inexistente u ocupado).");
        }
        return confirmada;
    }
}
