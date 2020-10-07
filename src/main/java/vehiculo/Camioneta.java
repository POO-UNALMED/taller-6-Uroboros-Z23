package vehiculo;

public class Camioneta extends Vehiculo{
    private boolean volco;
    private static int cantidadCa;
    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante frabricante, boolean volco) {
        super(placa,puertas,90,nombre,precio,peso,"4X4",frabricante);
        this.volco = volco;
        cantidadCa++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCa() {
        return cantidadCa;
    }
}
