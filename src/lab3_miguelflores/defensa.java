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
public class defensa extends jugador {

    protected double agresividad;
    private double altura;
    private double peso;
    private double velocidad;

    public defensa() {
        super();
    }

    public defensa(double agresividad, double altura, double peso, double velocidad, String nombre, String apellido, String estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, estado, pais, pie, numero, precio, equipo);
        this.agresividad = agresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public double getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(double agresividad) {
        this.agresividad = agresividad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return toString()+"tipo de jugador=defensa{" + "agresividad=" + agresividad + ", altura=" + altura + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }

}
