package model;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioNoRegistrado {

    private String nombre;
    private String correo;
    private String reservas;
    private String configurado;


    private String[] vehiculos = new String[100];
    private String[] vehiculosOferta = new String[100];
    private ArrayList vehiculoReservado = new ArrayList();


    




    public UsuarioNoRegistrado(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    //-----------------------------------------------------

    public void reservarVehiculo(String fecha, String planDePago, String oficina, String coche){

        Reservar reservar = new Reservar(fecha,planDePago, oficina);
        reservas = reservar.getFecha() +", "+ reservar.getPlanDePago() +", "+ reservar.getOficina() + ", "+ coche;

        String fileName = "VehiculosReservados.txt";

        try{

            FileWriter fw = new FileWriter(fileName, true);


            fw.write(reservas + "\n");
            fw.close();
        } 

        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void reservarVehiculoConfigurado(String fecha, String planDePago, String oficina, String coche, String color, String llantas, String cambio){

        Reservar reservar = new Reservar(fecha,planDePago, oficina);
        reservas = reservar.getFecha() +", "+ reservar.getPlanDePago() +", "+ reservar.getOficina() + ", " + coche + ", "+color+", "+llantas+", "+cambio;

        String fileName = "VehiculosReservados.txt";

        try{

            FileWriter fw = new FileWriter(fileName, true);


            fw.write(reservas + "\n");
            
            
            fw.close();
        }

        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    
    
    

    //-----------------------------------------------------

    
    public void solicitarCita(String fecha, String hora, String nombre, String correo, String concesionario) {

        Cita citas = new Cita(fecha, hora, nombre, correo, concesionario);
        String cita = citas.getCita();
        String fileName = "Citas.txt";

        try{

            FileWriter fw = new FileWriter(fileName, true);
            fw.write(cita + "\n");
            fw.close();
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    
    

    //-----------------------------------------------------

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
