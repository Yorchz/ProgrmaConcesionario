package model;

import java.util.ArrayList;

public class Vehiculo {

    private int id;
    private int puertas;
    private int asientos;
    private int precio;
    private ExtrasCoche extrasCoche;
    private ModeloDeCoche modeloDeCoche;
    private ArrayList vehiculoVenta = new ArrayList();


    public Vehiculo(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche, int precio) {
       this.setVehiculo(id, puertas, asientos, extrasCoche, modeloDeCoche, precio);
    }

    //y aqui me ter vehiculos cual loco para tener una lista con la que poder trabajar que tenga los atributos que dice la clases

    //-------------------------------------------------------

    public ArrayList getVehiculo(){
        return vehiculoVenta;
    }

    public void setVehiculo(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche, int precio){

        vehiculoVenta.add(this.id = id);
        vehiculoVenta.add(this.puertas = puertas);
        vehiculoVenta.add(this.asientos = asientos);
        vehiculoVenta.add(this.extrasCoche = extrasCoche);
        vehiculoVenta.add(this.modeloDeCoche = modeloDeCoche);
        vehiculoVenta.add(this.precio = precio);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ExtrasCoche getExtrasCoche() {
        return extrasCoche;
    }

    public void setExtrasCoche(ExtrasCoche extrasCoche) {
        this.extrasCoche = extrasCoche;
    }

    public ModeloDeCoche getModeloDeCoche() {
        return modeloDeCoche;
    }

    public void setModeloDeCoche(ModeloDeCoche modeloDeCoche) {
        this.modeloDeCoche = modeloDeCoche;
    }
}
