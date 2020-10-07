package vehiculo;

public class Automovil extends Vehiculo{
    private int puestos;
    public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante frabricante,int puestos){
        super(placa,4,100, nombre,precio,peso,"FWD",frabricante);
        this.puestos = puestos;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
