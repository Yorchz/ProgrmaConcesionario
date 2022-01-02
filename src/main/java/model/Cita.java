package model;

import java.util.ArrayList;

public class Cita {

    private String fecha;
    private int hora;
    private UsuarioNoRegistrado usuarioNoRegistrado;
    private ArrayList cita = new ArrayList();

    public Cita(String fecha, int hora, String nombre, String telefono) {

        this.setCita(fecha, hora, nombre, telefono);
    }

    //----------------------------------------------------------------

    public ArrayList getCita(){
        return cita;
    }

    public void setCita(String fecha, int hora,String nombre, String telefono) {
        cita.add( this.fecha = fecha);
        cita.add(this.hora = hora);
        this.usuarioNoRegistrado = new UsuarioNoRegistrado(nombre, telefono);
        cita.add(usuarioNoRegistrado.getNombre());
        cita.add(usuarioNoRegistrado.getTelefono());
    }
}
