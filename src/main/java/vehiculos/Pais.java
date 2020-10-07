package vehiculos;
import java.util.ArrayList;
public class Pais {
    private String nombre;
    private int cantidadVehiculos;
    private static ArrayList<Pais> pais = new ArrayList<Pais>();

    public Pais(String nombre){
        super();
        this.nombre = nombre;
        pais.add(this);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static Pais paisMasVendedor(){
        int x = 0;
        int cantidadVehiculos = 0;
        for (int i = 0; i < pais.size(); i++) {
            if (pais.get(i).cantidadVehiculos>cantidadVehiculos){
                x = i;
                cantidadVehiculos=pais.get(i).cantidadVehiculos;
            }
        }
        return pais.get(x);
    }
}
