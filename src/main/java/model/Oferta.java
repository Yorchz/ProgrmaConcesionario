package model;

import java.util.ArrayList;

public class Oferta extends Vehiculo {

    private int descuento;
    private ArrayList vehiculosDescuento = new ArrayList();

    public Oferta(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche, int precio, int descuento) {
        super(id, puertas, asientos, extrasCoche, modeloDeCoche, precio);
        this.setVheiculoOferta(id, puertas, asientos, extrasCoche, modeloDeCoche, precio, descuento);
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public ArrayList getVehiculosDescuento(){
        return vehiculosDescuento;
    }

    public void setVheiculoOferta(int id, int puertas, int asientos, ExtrasCoche extrasCoche, ModeloDeCoche modeloDeCoche, int precio, int descuento){

        vehiculosDescuento.add(super.getId());
        vehiculosDescuento.add(super.getPuertas());
        vehiculosDescuento.add(super.getAsientos());
        vehiculosDescuento.add(super.getExtrasCoche());
        vehiculosDescuento.add(super.getModeloDeCoche());
        vehiculosDescuento.add(super.getPrecio());
        vehiculosDescuento.add(descuento);

    }

}
