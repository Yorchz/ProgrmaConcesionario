import model.*;

import java.io.IOException;

public class ConcesionarioApp {

    public static void main(String[] args) throws IOException {

        UsuarioNoRegistrado usuarioNoRegistrado = new UsuarioNoRegistrado("Jorge", "626187182");
        UsuarioRegistrado usuarioRegistrado = new UsuarioRegistrado("alvaro@gmail.com", "56787890A", "roberto", "656589475");

        //usuarioNoRegistrado.solicitarCita("martes", 12, "jorge", "626187182");

        //System.out.println(usuarioNoRegistrado.solicitarCita("martes", 12, "alvaro", "689145678"));

        //usuarioNoRegistrado.solicitarCita("martes", 12, "alvaro", "689145678");

        //concesionario.setVehiculosVenta(4444,5,5,  ExtrasCoche.Llantas, ModeloDeCoche.Toyota, 35000);

        System.out.println("-------------------------------");

        usuarioNoRegistrado.verVehiculos();
        System.out.println("-------------------------------");

        //usuarioRegistrado.revision("coche", "lunes", "12.34");
        usuarioRegistrado.historialDeRevisiones();
        System.out.println("-------------------------------");

        //concesionario.setVehiculosEnOferta(4444,5,5,  ExtrasCoche.Llantas, ModeloDeCoche.Toyota, 35000, 10000);
        usuarioNoRegistrado.verOfertas();
        System.out.println("-------------------------------");

        //usuarioNoRegistrado.reservarVehiculo("11-05-5005", "Trimestral", Oficina.Maspalomas);
        usuarioNoRegistrado.verReservas();
        System.out.println("-------------------------------");

    }
}
