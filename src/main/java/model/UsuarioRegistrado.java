package model;

import java.util.ArrayList;

public class UsuarioRegistrado extends UsuarioNoRegistrado{

    private String correo;
    private String dni;


    public UsuarioRegistrado(String correo, String dni, String nombre, String telefono) {
        super(nombre, telefono);
        this.correo = correo;
        this.dni = dni;

    }

    //-----------------------------------------------------------------

    public void revision(){

    }

    public void vheiculosEnPropiedad(){

        Concesionario concesionario = new Concesionario("Fernando", "8976");
        System.out.println(concesionario.getVehiculosPropietario());

    }

    public void historialDeVehiculos(){

    }

    //-----------------------------------------------------------------

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
