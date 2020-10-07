package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private String pais;
    private int cantidadVehiculos;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, String pais) {
        super();
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        int x = 0;
        int cantidadVehiculos = 0;
        for (int i = 0; i < fabricantes.size(); i++) {
            if (fabricantes.get(i).cantidadVehiculos > cantidadVehiculos) {
                x = i;
                cantidadVehiculos = fabricantes.get(i).cantidadVehiculos;
            }
        }
        return fabricantes.get(x);
    }
}
