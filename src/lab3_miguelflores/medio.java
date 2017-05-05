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
public class medio extends jugador {

    private double creatividad;
    private double dominio;
    private double asistencias;

    public medio() {
        super();
    }

    public medio(double creatividad, double dominio, double asistencias, String nombre, String apellido, String estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, estado, pais, pie, numero, precio, equipo);
        this.creatividad = creatividad;
        this.dominio = dominio;
        this.asistencias = asistencias;
    }

    public double getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(double creatividad) {
        this.creatividad = creatividad;
    }

    public double getDominio() {
        return dominio;
    }

    public void setDominio(double dominio) {
        this.dominio = dominio;
    }

    public double getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(double asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return toString()+"tipo de jugador=medio{" + "creatividad=" + creatividad + ", dominio=" + dominio + ", asistencias=" + asistencias + '}';
    }

}
