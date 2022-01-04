package model;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Configurar  {

    private String motor;
    private String color;
    private String llantas;
    private String marchas;
    private Vehiculo vehiculo;

    ArrayList vehiculoConfigurado = new ArrayList();


    Path path = Paths.get("");
    private String rutaConfigurado = path.toAbsolutePath().toString() + "/VehiculosConfigurados.txt";


    public Configurar(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche, int precio, String motor, String color, String llantas, String marchas) {
        this.setVehiculoConfigurado(id, puertas, asientos, extrasCoche, modeloDeCoche, precio, motor, color, llantas, marchas);
    }

    //-----------------------------------------------

    public void setVehiculoConfigurado(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche, int precio, String motor, String color, String llantas, String marchas){

        vehiculo = new Vehiculo(id, puertas, asientos, extrasCoche, modeloDeCoche, precio);

        vehiculoConfigurado.add(vehiculo.getId());
        vehiculoConfigurado.add(vehiculo.getPuertas());
        vehiculoConfigurado.add(vehiculo.getAsientos());
        vehiculoConfigurado.add(vehiculo.getExtrasCoche());
        vehiculoConfigurado.add(vehiculo.getModeloDeCoche());
        vehiculoConfigurado.add(vehiculo.getPrecio());
        vehiculoConfigurado.add(motor);
        vehiculoConfigurado.add(color);
        vehiculoConfigurado.add(llantas);
        vehiculoConfigurado.add(marchas);

    }

    public ArrayList getVehiculoConfigurado(){
        return vehiculoConfigurado;
    }

    //-----------------------------------------------

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getCambios() {
        return marchas;
    }

    public void setCambios(String marchas) {
        this.marchas = marchas;
    }
}
