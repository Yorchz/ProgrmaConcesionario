import model.*;

import java.io.IOException;

public class ConcesionarioApp {

    public static void main(String[] args) throws IOException {

        UsuarioNoRegistrado usuarioNoRegistrado = new UsuarioNoRegistrado("Jorge", "626187182");
        Concesionario concesionario = new Concesionario("Fernando", "8976");
        UsuarioRegistrado usuarioRegistrado = new UsuarioRegistrado("alvaro@gmail.com", "56787890A", "roberto", "656589475");

        usuarioNoRegistrado.solicitarCita("martes", 12, "jorge", "626187182");

        System.out.println(usuarioNoRegistrado.solicitarCita("martes", 12, "alvaro", "689145678"));


        concesionario.setVehiculosPropietario("RANGE");
        concesionario.setVehiculosPropietario("RANGE ROVER VELAR");

        usuarioRegistrado.vheiculosEnPropiedad();

        concesionario.setVehiculosPropietario("RANGE ROVER VELAR");
        System.out.println(usuarioRegistrado.vheiculosEnPropiedad());

        System.out.println("-------------------------------");

        usuarioNoRegistrado.solicitarCita("martes", 12, "alvaro", "689145678");

        concesionario.setVehiculosVenta(4444,5,5,  ExtrasCoche.Llantas, ModeloDeCoche.Toyota, 35000);

        concesionario.getVehiculosVenta();
        usuarioNoRegistrado.verVehiculos();
        usuarioRegistrado.revision("coche", "lunes", "12.34");
        usuarioRegistrado.historialDeRevisiones();

        concesionario.setVehiculosEnOferta(4444,5,5,  ExtrasCoche.Llantas, ModeloDeCoche.Toyota, 35000, 10000);
        usuarioNoRegistrado.verOfertas();








    }
}
