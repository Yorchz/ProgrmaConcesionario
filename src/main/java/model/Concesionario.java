package model;

import java.util.ArrayList;

public class Concesionario {


    private String nombre;
    private String id;
    private static ArrayList vehiculosPropiedad = new ArrayList();

    public Concesionario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    //------------------------------------------------------------------



    public void setVehiculosPropietario(String vehiculo) {

        vehiculosPropiedad.add(vehiculo);

    }

    public ArrayList getVehiculosPropietario(){
        return vehiculosPropiedad;

    }

    //-------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String telefono) {
        this.id = telefono;
    }

}
