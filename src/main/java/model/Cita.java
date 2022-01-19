package model;

public class Cita {

    private String fecha;
    private String hora;
    private UsuarioNoRegistrado usuarioNoRegistrado;
    private String cita;
    private String concesionario;

    public Cita(String fecha, String hora, String nombre, String correo, String concesionario) {
       this.setCita(fecha, hora, nombre, correo, concesionario);
    }

    //----------------------------------------------------------------

    public String getCita(){
        return cita;
    }

    public void setCita(String fecha, String hora,String nombre, String correo, String concesionario) {
        
        usuarioNoRegistrado = new UsuarioNoRegistrado(nombre, correo);
        this.fecha = fecha;
        this.hora = hora;
        cita = "Fecha: " + fecha + ", hora: " + hora + ", nombre: "+ usuarioNoRegistrado.getNombre() + ", correo: " + usuarioNoRegistrado.getCorreo()+", concesionario: "+concesionario;
        

    }
}
