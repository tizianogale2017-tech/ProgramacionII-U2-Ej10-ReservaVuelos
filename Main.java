package Ejercicio10_reservaVuelos;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("AR1234");
        vuelo.agregarAsiento(new Asiento("1A", "Business"));
        vuelo.agregarAsiento(new Asiento("1B", "Business"));
        vuelo.agregarAsiento(new Asiento("10C", "Turista"));

        Pasajero p1 = new Pasajero("Sofía Herrera", "35111222");
        Pasajero p2 = new Pasajero("Martín Acosta", "38999888");

        p1.solicitarReserva(vuelo, "1A");
        p2.solicitarReserva(vuelo, "1A");
        p2.solicitarReserva(vuelo, "99Z");
        p2.solicitarReserva(vuelo, "10C");
    }
}
