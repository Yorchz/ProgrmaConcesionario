package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioRegistrado extends UsuarioNoRegistrado{

    private String correo;
    private String dni;

    Path path = Paths.get("");
    private String rutaRead = path.toAbsolutePath().toString() + "/Revisiones.txt";

    public UsuarioRegistrado(String correo, String dni, String nombre, String telefono) {
        super(nombre, telefono);
        this.correo = correo;
        this.dni = dni;

    }

    //-----------------------------------------------------------------

    public String revision(String coche, String dia, String hora){

        String cita = "Su cita para el vehículo "+coche+" está programada para el "+dia+" a las "+hora;
        String fileName = "Revisiones.txt";

        try{

            FileWriter fw = new FileWriter(fileName, true);
            fw.write(cita + "\n");
            fw.close();
        }
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return cita;
    }

    public ArrayList vheiculosEnPropiedad(){

        Concesionario concesionario = new Concesionario("Fernando", "8976");
        return concesionario.getVehiculosPropietario();


    }

    public void historialDeRevisiones() throws FileNotFoundException {

        ArrayList reservas = new ArrayList();

        File doc = new File(rutaRead);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i++){
            reservas.add(obj.nextLine());
        }
    // return reservas;
        //LO PRINTEAMOS LEYENDO DIRECTAMENTE EN LA INTERFAZ GRÁFICA VIDEO GUI_5

        for(int i = 0;i< reservas.size();i++) {
            System.out.println(reservas.get(i));


        /*File doc = new File("desktop/revisiones.txt");
        Scanner obj = new Scanner(doc);

        while (obj.hasNextLine())
            return obj.nextLine();*/
        }
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
