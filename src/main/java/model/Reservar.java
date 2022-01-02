package model;

public class Reservar {

    private String fecha;
    private String planDePago;
    private Oficina oficina;

    public Reservar(String fecha, int precioAproximado, String planDePago, Oficina oficina) {
        this.fecha = fecha;
        this.planDePago = planDePago;
        this.oficina = oficina;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPlanDePago() {
        return planDePago;
    }

    public void setPlanDePago(String planDePago) {
        this.planDePago = planDePago;
    }
}
