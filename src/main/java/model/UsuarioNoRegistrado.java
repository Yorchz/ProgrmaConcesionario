package model;

import java.util.ArrayList;

public class UsuarioNoRegistrado {

    private String nombre;
    private String telefono;


    public UsuarioNoRegistrado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //-----------------------------------------------------

    public void reservarVehiculo(){

    }

    public void verVehiculos(){

    }

    public void verOfertas(){

    }

    public ArrayList citas = new ArrayList();

    public void solicitarAsesoramiento(String fecha, int hora, String nombre, String telefono) {

        Cita cita = new Cita(fecha, hora, nombre, telefono);
        System.out.println(cita.getCita());
        citas.add(cita);
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
