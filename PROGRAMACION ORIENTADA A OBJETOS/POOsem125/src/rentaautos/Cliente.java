package rentaautos;

import java.time.Instant;

public class Cliente {

    private final int id;
    private final String nombre;
    private double adeudo;

    public Cliente(final int id, final String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Factura rentar(final Auto auto) {
        auto.decrementarCantidad();
        this.adeudo += auto.getPrecioRenta();
        return new Factura(Instant.now(), auto.getPrecioRenta());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAdeudo() {
        return adeudo;
    }

}
