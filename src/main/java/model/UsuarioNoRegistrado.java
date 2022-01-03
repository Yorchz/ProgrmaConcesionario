package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsuarioNoRegistrado {

    private String nombre;
    private String telefono;
    private ArrayList vehiculos = new ArrayList();


    public UsuarioNoRegistrado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //-----------------------------------------------------

    public void reservarVehiculo(){

    }

    public void verVehiculos() throws FileNotFoundException {

        //ESTE PROCESO SE IMPLEMENTE DIRECTAMENTE EN LA INTERFAZ GRAFICA AQUI SOLO IRIA HASTA EL ARRAYLIS VEHICULOS EL FOR EN LA INTERFAZ.

        Concesionario concesionario = new Concesionario("Fernando", "8976");
        vehiculos = concesionario.getVehiculosVenta();

        //return vehiculos;

        for(int i = 0;i< vehiculos.size();i++){
            System.out.println(vehiculos.get(i));
        }
    }

    public void verOfertas() throws FileNotFoundException {

        Concesionario concesionario = new Concesionario("Fernando", "8976");
        vehiculos = concesionario.getVehiculosEnOferta();

        //return vehiculos;

        for(int i = 0;i< vehiculos.size();i++){
            System.out.println(vehiculos.get(i));
        }
    }

    public ArrayList citas = new ArrayList();

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
