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
public class delantero extends jugador {

    private double definicion;
    private double altura;
    private double velocidad;
    private double prom_goles;

    public delantero() {
        super();
    }

    public delantero(double definicion, double altura, double velocidad, double prom_goles, String nombre, String apellido, String estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, estado, pais, pie, numero, precio, equipo);
        this.definicion = definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.prom_goles = prom_goles;
    }

    public double getDefinicion() {
        return definicion;
    }

    public void setDefinicion(double definicion) {
        this.definicion = definicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getProm_goles() {
        return prom_goles;
    }

    public void setProm_goles(double prom_goles) {
        this.prom_goles = prom_goles;
    }

    @Override
    public String toString() {
        return super.toString()+"tipo de jugador=delantero{" + "definicion=" + definicion + ", altura=" + altura + ", velocidad=" + velocidad + ", prom_goles=" + prom_goles + '}';
    }

    
}
