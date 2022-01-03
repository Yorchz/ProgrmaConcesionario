package model;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioNoRegistrado {

    private String nombre;
    private String telefono;
    public String reservas;

    private ArrayList vehiculos = new ArrayList();
    private ArrayList vehiculosOferta = new ArrayList();
    public ArrayList citas = new ArrayList();
    private ArrayList vehiculoReservado = new ArrayList();


    Path path = Paths.get("");
    private String rutaReserva = path.toAbsolutePath().toString() + "/VehiculosReservados.txt";




    public UsuarioNoRegistrado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //-----------------------------------------------------

    public void reservarVehiculo(String fecha, String planDePago, Oficina oficina){

        Reservar reservar = new Reservar(fecha,planDePago, oficina);
        reservas = reservar.getFecha() +", "+ reservar.getPlanDePago() +", "+ reservar.getOficina();

        String fileName = "VehiculosReservados.txt";

        try{

            FileWriter fw = new FileWriter(fileName, true);

            BufferedReader br = new BufferedReader(new FileReader(rutaReserva));

            if ((br.readLine() == null)){
                fw.write("Fecha, Plan de pago, Oficina \n");
                fw.write(reservas + "\n");
            }
            else{
                fw.write(reservas + "\n");
            }
            fw.close();
            br.close();
        }

        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void verReservas() throws FileNotFoundException {

        File doc = new File(rutaReserva);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i++){
            vehiculoReservado.add(obj.nextLine());
        }
        //return vehiculoReservado;
        //Esta parte es la que printea el mensaje seria a la de la interfaz. Es la misma o muy parecita con todas las funciones
        for(int i = 0;i< vehiculoReservado.size();i++){
            System.out.println(vehiculoReservado.get(i));
        }
    }

    //-----------------------------------------------------

    public void verVehiculos() throws FileNotFoundException {

        //ESTE PROCESO SE IMPLEMENTE DIRECTAMENTE EN LA INTERFAZ GRAFICA AQUI SOLO IRIA HASTA EL ARRAYLIS VEHICULOS EL FOR EN LA INTERFAZ.

        Concesionario concesionario = new Concesionario("Fernando", "8976");
        vehiculos = concesionario.getVehiculosVenta();

        //return vehiculos;

        for(int i = 0;i< vehiculos.size();i++){
            System.out.println(vehiculos.get(i));
        }
    }

    //-----------------------------------------------------

    public void verOfertas() throws FileNotFoundException {

        Concesionario concesionario = new Concesionario("Fernando", "8976");
        vehiculosOferta = concesionario.getVehiculosEnOferta();

        //return vehiculos;

        for(int i = 0;i< vehiculosOferta.size();i++){
            System.out.println(vehiculosOferta.get(i));
        }
    }

    //-----------------------------------------------------


    public ArrayList solicitarCita(String fecha, int hora, String nombre, String telefono) {

        Cita cita = new Cita(fecha, hora, nombre, telefono);
        citas.add(cita);
        return cita.getCita();
    }

    //-----------------------------------------------------

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
