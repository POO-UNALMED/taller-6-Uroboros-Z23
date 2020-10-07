package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante frabricante;
    private static int cantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante frabricante) {
        super();
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.frabricante = frabricante;
        cantidadVehiculos++;
        frabricante.setCantidadvehiculos();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFrabricante() {
        return frabricante;
    }

    public void setFrabricante(Fabricante frabricante) {
        this.frabricante = frabricante;
    }

    public static int getCantidadVehiculos() { return cantidadVehiculos; }

    public static void setCantidadVehiculos(int cantidadVehiculos) { Vehiculo.cantidadVehiculos = cantidadVehiculos; }

    public String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.getCantidadA() + "\n Camionetas: " + Camioneta.getCantidadCa() + "\n Camiones: " + Camion.getCantidadCam();
    }
}
