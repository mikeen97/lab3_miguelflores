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
public class portero extends jugador {

    private double juego_aereo;
    private double juego_pies;

    public portero() {
        super();
    }

    public portero(double juego_aereo, double juego_pies, String nombre, String apellido, String estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, estado, pais, pie, numero, precio, equipo);
        this.juego_aereo = juego_aereo;
        this.juego_pies = juego_pies;
    }



    public double getJuego_aereo() {
        return juego_aereo;
    }

    public void setJuego_aereo(double juego_aereo) {
        this.juego_aereo = juego_aereo;
    }

    public double getJuego_pies() {
        return juego_pies;
    }

    public void setJuego_pies(double juego_pies) {
        this.juego_pies = juego_pies;
    }

    @Override
    public String toString() {
        return toString()+"tipo de jugador=portero{" + "juego_aereo=" + juego_aereo + ", juego_pies=" + juego_pies + '}';
    }

}
