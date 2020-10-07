package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int cantidadvehiculos;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais) {
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setCantidadvehiculos() {
        this.cantidadvehiculos++;
        pais.setCantidadvehiculos();
    }

    public int getCantidadvehiculos() {
        return cantidadvehiculos;
    }

    public static Fabricante fabricaMayorVentas() {
        int x = 0;
        int cantidadVehiculos = 0;
        for (int i = 0; i < fabricantes.size(); i++) {
            if (fabricantes.get(i).cantidadvehiculos > cantidadVehiculos) {
                x = i;
                cantidadVehiculos = fabricantes.get(i).cantidadvehiculos;
            }
        }
        return fabricantes.get(x);
    }
}
