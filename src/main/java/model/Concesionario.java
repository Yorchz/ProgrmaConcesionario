package model;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Concesionario {
    
    Path path = Paths.get("");

    private String rutaReserva = path.toAbsolutePath().toString() + "/VehiculosReservados.txt";
    private String rutaVenta = path.toAbsolutePath().toString() + "/VehiculosEnVenta.txt";
    private String rutaOferta = path.toAbsolutePath().toString() + "/VehiculosEnOferta.txt";
    private String rutaPropiedad = path.toAbsolutePath().toString() + "/VehiculosEnPropiedad.txt";
    private String rutaValidacion = path.toAbsolutePath().toString() + "/Usuario.txt";
    private String citas = path.toAbsolutePath().toString() + "/Citas.txt";
    
    
    private ArrayList vehiculoConfiguradoPrint = new ArrayList();

    //------------------------------------------------------------------

    public String[] getVehiculosEnOferta() throws FileNotFoundException {

        ArrayList vehiculos = new ArrayList();

        File doc = new File(rutaOferta);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i+=3){
             vehiculos.add(obj.nextLine());
        }
        
        String[] v = (String[]) vehiculos.toArray(new String[0]);
        
        return v;
    }

    //-----------------------------------------------------------------

    public String[] getVehiculosVenta() throws FileNotFoundException {

        ArrayList vehiculos = new ArrayList();

        File doc = new File(rutaVenta);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i+=3){
             vehiculos.add(obj.nextLine());
        }
        
        String[] v = (String[]) vehiculos.toArray(new String[0]);
        
        return v;
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

    public ArrayList getUsuariosValidados() throws FileNotFoundException {

        ArrayList UsuariosValidados = new ArrayList();

        File doc = new File(rutaValidacion);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i = i++){
            UsuariosValidados.add(obj.nextLine());
        }
        return UsuariosValidados;
    }

    public String[] historialDeCitas() throws FileNotFoundException {

        ArrayList citasLeidas = new ArrayList();

        File doc = new File(citas);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i++){
            citasLeidas.add(obj.nextLine());
        }
        String[] revision = (String[]) citasLeidas.toArray(new String[0]);

        return revision;
    }

    public void modificarPerfil(String nombre, String correo, String contrasena) {
        
        File doc = new File(rutaValidacion);
        
        
    }

    public String[] verReservas() throws FileNotFoundException {

        File doc = new File(rutaReserva);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i++){
            vehiculoConfiguradoPrint.add(obj.nextLine());
        }
        String[] reservados = (String[]) vehiculoConfiguradoPrint.toArray(new String[0]);

        return reservados;
        
    }

    public void actualizarVenta(String coche) {
        
        Path path = Paths.get("");
        String rutaVenta = path.toAbsolutePath().toString() + "/VehiculosEnVenta.txt";
        String archivo = "VehiculosEnVenta.txt";
        
        ArrayList reservas = new ArrayList();
        
        File doc = new File(rutaVenta);
        Scanner obj = null;
        try {
            obj = new Scanner(doc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0;obj.hasNextLine();i++){
                reservas.add(obj.nextLine());
        }
        
        String[] reserva = (String[]) reservas.toArray(new String[0]);
        
        for(int i = 0;i< reserva.length;i++) {
            if(coche.equals(reserva[i])){
                reserva[i] = coche +" - " + Disponibilidad.Reservado;
            }
        }
        
        // Sobre escribimos
        
        try{

            FileWriter fw = new FileWriter(archivo);
            for(int i = 0;i< reserva.length;i++) {
                fw.write(reserva[i] + "\n");
            }

            fw.close();
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        
        
    }
    
    
    
    public void actualizarOferta(String coche) {
        
        Path path = Paths.get("");
        String rutaVenta = path.toAbsolutePath().toString() + "/VehiculosEnOferta.txt";
        String archivo = "VehiculosEnOferta.txt";

        ArrayList reservas = new ArrayList();

        File doc = new File(rutaVenta);
        Scanner obj = null;
        try {
            obj = new Scanner(doc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0;obj.hasNextLine();i++){
            reservas.add(obj.nextLine());
        }

        String[] reserva = (String[]) reservas.toArray(new String[0]);

        for(int i = 0;i< reserva.length;i++) {
            if(coche.equals(reserva[i])){
                reserva[i] = coche + " - " + Disponibilidad.Reservado;
            }
        }


        try{

            FileWriter fw = new FileWriter(archivo);
            for(int i = 0;i< reserva.length;i++) {
                fw.write(reserva[i] + "\n");
            }

            fw.close();
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }

}
