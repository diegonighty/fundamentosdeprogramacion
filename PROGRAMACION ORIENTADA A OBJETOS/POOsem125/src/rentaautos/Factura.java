package rentaautos;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class Factura {

    private final static AtomicInteger CONTADOR = new AtomicInteger(0);

    private final int numero;
    private final Instant fecha;
    private final double importe;

    public Factura(
            final int numero,
            final Instant fecha,
            final double importe
    ) {
        this.numero = numero;
        this.fecha = fecha;
        this.importe = importe;
    }

    public Factura(
            final Instant fecha,
            final double importe
    ) {
        this(generarNumero(), fecha, importe);
    }

    public int getNumero() {
        return numero;
    }

    public Instant getFecha() {
        return fecha;
    }

    public double getImporte() {
        return importe;
    }

    public static int generarNumero() {
        return CONTADOR.incrementAndGet();
    }
}
