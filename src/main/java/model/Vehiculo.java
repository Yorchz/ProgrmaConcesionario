package model;

import java.util.ArrayList;

public class Vehiculo {

    private int id;
    private int puertas;
    private int asientos;
    private ExtrasCoche extrasCoche;
    private ModeloDeCoche modeloDeCoche;

    public Vehiculo(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche) {
        this.id = id;
        this.puertas = puertas;
        this.asientos = asientos;
        this.extrasCoche = extrasCoche;
        this.modeloDeCoche = modeloDeCoche;
    }

    private ArrayList vehiculos = new ArrayList();

    //y aqui me ter vehiculos cual loco para tener una lista con la que poder trabajar que tenga los atributos que dice la clases

    //-------------------------------------------------------

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
}
