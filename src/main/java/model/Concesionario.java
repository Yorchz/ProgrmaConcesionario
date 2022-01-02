package model;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {


    private String nombre;
    private String id;
    private static ArrayList vehiculosPropiedad = new ArrayList();
    private String ruta = "C:\\Users\\jorge\\OneDrive - Universidad de Las Palmas de Gran Canaria\\Documents\\Universidad\\SegundoAño_GCID\\Primer cuatrimestre\\Ing de software\\ConcesionarioIS\\VehiculosEnVenta.txt";

    public Concesionario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    //------------------------------------------------------------------

    public void setVehiculosVenta(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche) throws IOException {

        Vehiculo vehiculo = new Vehiculo(id, puertas, asientos, extrasCoche, modeloDeCoche);
        String contenido = vehiculo.getVehiculo().toString();

        String fileName = "VehiculosEnVenta.txt";

        try{

            FileWriter fw = new FileWriter(fileName, true);

            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String bfRead;

            System.out.println(br.readLine());

            if ((br.readLine() == null)){
                fw.write("Id, Puertas, Asientos, Extras, Modelo" + "\n");
                fw.write(contenido + "\n");
            }

            else{
                while ((bfRead = br.readLine()) != null) {
                    if (bfRead.equals(contenido)) {
                        System.out.println("Ya se ha añadido");
                    }
                    else {
                        fw.write(contenido + "\n");
                    }
                }
            }
            fw.close();
            br.close();
        }

        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public String getVehiculosVenta() throws FileNotFoundException {

        /*

        File doc = new File(ruta);
        Scanner obj = new Scanner(doc);

        while (obj.hasNextLine()){
            return obj.nextLine();
        }*/

        return null;
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
