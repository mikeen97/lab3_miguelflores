/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelflores;

/**
 *
 * @author Miguel Flores
 */
public class equipo {
    ///atributos

    protected String nombre;
    protected int palmares;
    protected String ciudad;
    protected double presupuesto;
    protected int cantera;

    public equipo() {
    }

    public equipo(String nombre, int palmares, String ciudad, double presupuesto, int cantera) {
        this.nombre = nombre;
        this.palmares = palmares;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
        this.cantera = cantera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPalmares() {
        return palmares;
    }

    public void setPalmares(int palmares) {
        this.palmares = palmares;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCantera() {
        return cantera;
    }

    public void setCantera(int cantera) {
        this.cantera = cantera;
    }

    @Override
    public String toString() {
        return "equipo{" + "nombre=" + nombre + ", palmares=" + palmares + ", ciudad=" + ciudad + ", presupuesto=" + presupuesto + ", cantera=" + cantera + '}';
    }

}
