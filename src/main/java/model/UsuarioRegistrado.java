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

    private String contrasena;

    Path path = Paths.get("");
    private String rutaRead = path.toAbsolutePath().toString() + "/Revisiones.txt";

    public UsuarioRegistrado(String nombre, String correo, String contrasena) {
        super(nombre, correo);

        this.contrasena = contrasena;

    }

    //-----------------------------------------------------------------

    public String revision(String coche, String dia, String hora, String concesionario, String nombre, String correo, String contrasena){

        Vehiculo vehiculo = new Vehiculo(coche);
        String car = vehiculo.getVehiculo();
        Revision revision = new Revision(dia,hora,concesionario, nombre, correo, contrasena);
        
        String cita = "Su cita para el vehiculo "+ car + revision.getRevision();
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

    public String[] vheiculosEnPropiedad() throws FileNotFoundException {

        Concesionario concesionario = new Concesionario();
        ArrayList vehiculosPropiedad = concesionario.getVehiculosPropietario();
        String[] coche = (String[]) vehiculosPropiedad.toArray(new String[0]);

        return coche;
    }

    public String[] historialDeRevisiones() throws FileNotFoundException {

        ArrayList reservas = new ArrayList();

        File doc = new File(rutaRead);
        Scanner obj = new Scanner(doc);

        for(int i = 0;obj.hasNextLine();i++){
            reservas.add(obj.nextLine());
        }
        String[] revision = (String[]) reservas.toArray(new String[0]);

        return revision;

        
    }
    
    
    
    public void modificarPerfil(String nombre, String correo, String contrasena) throws IOException {
        
        String fileName = "Usuario.txt";
        
        String nombreNuevo = nombre;
        String correoNuevo = correo;
        String contrasenaNueva = contrasena;
        
        
        try {
            
        FileWriter myWriter = new FileWriter(fileName);
        myWriter.write(nombre);
        myWriter.write("\n");
        myWriter.write(correo);
        myWriter.write("\n");
        myWriter.write(contrasena);
        
        myWriter.close();
        
        } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
        
    }
    
    
    
    

    //-----------------------------------------------------------------

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
