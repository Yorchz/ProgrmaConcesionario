package model;

public class Revision {

    private String dia;
    private String hora;
    private String concesionario;
    private UsuarioRegistrado usuarioRegistrado;
    private String revision;


    public Revision(String dia, String hora, String concesionario, String nombre, String correo, String contrasena){

        this.setRevision(dia, hora, concesionario, nombre, correo, contrasena);

    }



    public String getRevision(){
        return this.revision;
    }



    public void setRevision(String dia, String hora, String concesionario, String nombre, String correo, String contrasena) {

        usuarioRegistrado = new UsuarioRegistrado(nombre, correo, contrasena);
        this.dia=dia;
        this.hora=hora;
        this.concesionario=concesionario;

        revision = " esta programada para el "+this.dia+
                " a las "+this.hora+" en "+this.concesionario+ " a nombre de " + usuarioRegistrado.getNombre();
    }




}
