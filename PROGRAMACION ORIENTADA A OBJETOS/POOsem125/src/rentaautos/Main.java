package rentaautos;

import java.util.List;
import java.util.Random;

public class Main {

    private final static List<Auto> AUTOS = List.of(
            new Auto("Sedan", "Toyota", "Corolla", 1000, 10),
            new Auto("Sedan", "Nissan", "Sentra", 900, 5),
            new Auto("Sedan", "Chevrolet", "Cruze", 800, 3),
            new Auto("SUV", "Toyota", "RAV4", 1200, 7),
            new Auto("SUV", "Nissan", "X-Trail", 1100, 4),
            new Auto("SUV", "Chevrolet", "Traverse", 1000, 2)
    );

    private final static List<Cliente> CLIENTES = List.of(
            new Cliente(1, "Juan"),
            new Cliente(2, "Pedro"),
            new Cliente(3, "Maria"),
            new Cliente(4, "Ana"),
            new Cliente(5, "Luis")
    );

    private final static Random RANDOM = new Random();

    public static void main(final String[] args) {
        for (int i = 0; i < RANDOM.nextInt(10); i++) {
            final Cliente cliente = randomCliente();
            final Auto auto = randomAuto();
            final Factura factura = cliente.rentar(auto);
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Auto: " + auto.getTipo() + " " + auto.getMarca() + " " + auto.getModelo());
            System.out.println("Factura: " + factura.getNumero());
            System.out.println("Fecha: " + factura.getFecha());
            System.out.println("Importe: " + factura.getImporte());
            System.out.println();
        }

        for (final Cliente cliente : CLIENTES) {
            System.out.println("Cliente: " + cliente.getNombre() + " #" + cliente.getId());
            System.out.println("Adeudo: " + cliente.getAdeudo());
            System.out.println();
        }

        for (final Auto auto : AUTOS) {
            System.out.println("Auto: " + auto.getTipo() + " " + auto.getMarca() + " " + auto.getModelo());
            System.out.println("Cantidad: " + auto.getCantidadAutos());
            System.out.println();
        }
    }

    private static <T> T random(final List<T> list) {
        return list.get(RANDOM.nextInt(list.size()));
    }

    private static Auto randomAuto() {
        return random(AUTOS);
    }

    private static Cliente randomCliente() {
        return random(CLIENTES);
    }

}
