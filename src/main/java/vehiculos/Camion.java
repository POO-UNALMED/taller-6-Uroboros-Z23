package vehiculos;

public class Camion extends Vehiculo{
    private String ejes;
    private static int cantidadCam;
    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante frabricante,String ejes){
        super(placa,2,80,nombre,precio,peso,"4X2",frabricante);
        this.ejes = ejes;
        cantidadCam++;

    }

    public String getEjes() {
        return ejes;
    }

    public void setEjes(String ejes) {
        this.ejes = ejes;
    }

    public static int getCantidadCam() {
        return cantidadCam;
    }
}
