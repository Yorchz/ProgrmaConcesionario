import model.Cita;
import model.Concesionario;
import model.UsuarioNoRegistrado;
import model.UsuarioRegistrado;

import java.util.ArrayList;

public class ConcesionarioApp {

    public static void main(String[] args){

        UsuarioNoRegistrado usuarioNoRegistrado = new UsuarioNoRegistrado("Jorge", "626187182");
        Concesionario concesionario = new Concesionario("Fernando", "8976");
        UsuarioRegistrado usuarioRegistrado = new UsuarioRegistrado("alvaro@gmail.com", "56787890A", "roberto", "656589475");


        usuarioNoRegistrado.solicitarAsesoramiento("martes", 12, "jorge", "626187182");
        usuarioNoRegistrado.solicitarAsesoramiento("martes", 12, "alvaro", "689145678");


        concesionario.setVehiculosPropietario("RANGE");
        concesionario.setVehiculosPropietario("RANGE ROVER VELAR");

        usuarioRegistrado.vheiculosEnPropiedad();

        concesionario.setVehiculosPropietario("RANGE ROVER VELAR");
        usuarioRegistrado.vheiculosEnPropiedad();

        usuarioNoRegistrado.solicitarAsesoramiento("martes", 12, "alvaro", "689145678");


    }
}
