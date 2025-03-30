package rentaautos;

public class Auto {

    private final String tipo;
    private final String marca;
    private final String modelo;
    private final double precioRenta;
    private int cantidadAutos;

    public Auto(
            final String tipo,
            final String marca,
            final String modelo,
            final double precioRenta,
            final int cantidadAutos
    ) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precioRenta = precioRenta;
        this.cantidadAutos = cantidadAutos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioRenta() {
        return precioRenta;
    }

    public int getCantidadAutos() {
        return cantidadAutos;
    }

    public void decrementarCantidad() {
        cantidadAutos--;
    }
}
