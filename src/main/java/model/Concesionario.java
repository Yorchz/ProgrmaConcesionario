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

    public void setVehiculosEnOferta(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche, int precio, int oferta) throws IOException {

        Vehiculo vehiculo = new Vehiculo(id, puertas, asientos, extrasCoche, modeloDeCoche, precio);
        vehiculo.setOferta(oferta);
        String contenidoOfertas = vehiculo.getVehiculo().toString() + vehiculo.getOferta();

        String fileName = "VehiculosEnOferta.txt";

        try{

            FileWriter fw = new FileWriter(fileName, true);

            BufferedReader br = new BufferedReader(new FileReader(rutaOferta));

            if ((br.readLine() == null)){
                fw.write("Id, Puertas, Asientos, Extras, Modelo, Precio, Descuanto \n");
                fw.write(contenidoOfertas + "\n");
            }
            else{
                fw.write(contenidoOfertas + "\n");
            }
            fw.close();
            br.close();
        }

        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

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

    public void setVehiculosVenta(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche, int precio) throws IOException {

        Vehiculo vehiculo = new Vehiculo(id, puertas, asientos, extrasCoche, modeloDeCoche, precio);
        String contenido = vehiculo.getVehiculo().toString();

        String fileName = "VehiculosEnVenta.txt";

        try{

            FileWriter fw = new FileWriter(fileName, true);

            BufferedReader br = new BufferedReader(new FileReader(rutaVenta));

            if ((br.readLine() == null)){
                fw.write("Id, Puertas, Asientos, Extras, Modelo, Precio \n");
                fw.write(contenido + "\n");
            }
            else{
                fw.write(contenido + "\n");
            }
            fw.close();
            br.close();
        }

        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

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

    public void setVehiculosPropietario(String vehiculo) {

        String vehiculoPropio = vehiculo ;

        String fileName = "VehiculosEnPropiedad.txt";

        try{
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(vehiculoPropio + "\n");
            fw.close();
        }

        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

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
