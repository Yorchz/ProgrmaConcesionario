package model;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Concesionario {


    private String nombre;
    private String id;

    Path path = Paths.get("");
    private String rutaVenta = path.toAbsolutePath().toString() + "/VehiculosEnVenta.txt";
    private String rutaOferta = path.toAbsolutePath().toString() + "/VehiculosEnOferta.txt";
    private String rutaPropiedad = path.toAbsolutePath().toString() + "/VehiculosEnPropiedad.txt";

    public Concesionario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    //------------------------------------------------------------------

    public ArrayList getVehiculosEnOferta() throws FileNotFoundException {

        ArrayList vehiculosOferta = new ArrayList();

        File doc = new File(rutaOferta);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i++){
            vehiculosOferta.add(obj.nextLine());
        }
        return vehiculosOferta;
    }

    //-----------------------------------------------------------------


    public ArrayList getVehiculosVenta() throws FileNotFoundException {

        ArrayList vehiculos = new ArrayList();

        File doc = new File(rutaVenta);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i++){
             vehiculos.add(obj.nextLine());
        }
        return vehiculos;
    }

    //------------------------------------------------------------------

    public ArrayList getVehiculosPropietario() throws FileNotFoundException {

        ArrayList vehiculosPropiedad = new ArrayList();

        File doc = new File(rutaPropiedad);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i++){
            vehiculosPropiedad.add(obj.nextLine());
        }
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
