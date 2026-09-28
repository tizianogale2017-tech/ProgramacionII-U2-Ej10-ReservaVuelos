package Ejercicio10_reservaVuelos;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String codigo;
    private List<Asiento> asientos = new ArrayList<>();

    public Vuelo(String codigo) {
        this.codigo = codigo;
    }

    public void agregarAsiento(Asiento asiento) {
        asientos.add(asiento);
    }

    public boolean reservarAsiento(String numeroAsiento) {
        for (Asiento a : asientos) {
            if (a.getNumero().equals(numeroAsiento)) {
                if (a.isOcupado()) {
                    return false;
                }
                a.setOcupado(true);
                return true;
            }
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }
}
