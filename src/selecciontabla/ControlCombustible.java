/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selecciontabla;

/**
 *
 * @author CBN
 */
public class ControlCombustible {
    long idRegistro;
    String fechaRegistro;
    double cantCombustible;
    int valorTanqueo;

    public ControlCombustible(long idRegistro, String fechaRegistro, double cantCombustible, int valorTanqueo) {
        this.idRegistro = idRegistro;
        this.fechaRegistro = fechaRegistro;
        this.cantCombustible = cantCombustible;
        this.valorTanqueo = valorTanqueo;
    }

    public long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getCantCombustible() {
        return cantCombustible;
    }

    public void setCantCombustible(double cantCombustible) {
        this.cantCombustible = cantCombustible;
    }

    public int getValorTanqueo() {
        return valorTanqueo;
    }

    public void setValorTanqueo(int valorTanqueo) {
        this.valorTanqueo = valorTanqueo;
    }
    
     
     
}
