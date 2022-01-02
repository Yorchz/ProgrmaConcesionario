package model;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class Concesionario {


    private String nombre;
    private String id;
    private static ArrayList vehiculosPropiedad = new ArrayList();
    //private static ArrayList vehiculosVenta = new ArrayList();


    public Concesionario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    //------------------------------------------------------------------

    public void setVehiculosVenta(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche) throws IOException {

        Vehiculo vehiculo = new Vehiculo(id, puertas, asientos, extrasCoche, modeloDeCoche);
        String Contenido = vehiculo.getVehiculo().toString();

        String fileName = "CochesEnVenta.txt";
        //Arreglar que se repita, lelendolo con un if
        try{

            FileWriter fw = new FileWriter(fileName, true);
            fw.write(Contenido);
            fw.write("\n");
            fw.close();
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void getVehiculosVenta(){

    }



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
