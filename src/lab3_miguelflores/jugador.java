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
public class jugador {

    private String nombre;
    private String apellido;
    private String estado;
    private String pais;
    private String pie;
    private int numero;
    private double precio;
    private String equipo;

    public jugador() {
    }

    public jugador(String nombre, String apellido, String estado, String pais, String pie, int numero, double precio, String equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.pais = pais;
        this.pie = pie;
        this.numero = numero;
        this.precio = precio;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getPie() {
        return pie;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + ", pais=" + pais + ", pie=" + pie + ", numero=" + numero + ", precio=" + precio + ", equipo=" + equipo + '}';
    }

}
