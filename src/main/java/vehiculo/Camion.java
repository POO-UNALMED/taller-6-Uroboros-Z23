package vehiculo;

public class Camion extends Vehiculo{
    private String ejes;
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante frabricante,String ejes){
        super(placa,2,80,nombre,precio,peso,"4X2",frabricante);
        this.ejes = ejes;
        
    }
}
