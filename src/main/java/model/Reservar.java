package model;

public class Reservar {

    private String fecha;
    private String planDePago;
    private String oficina;

    public Reservar(String fecha, String planDePago, String oficina) {
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

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }
}
