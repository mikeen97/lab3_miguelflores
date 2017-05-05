/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Flores
 */
public class Lab3_miguelflores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<jugador> jugador = new ArrayList();//agregar 
        ArrayList<equipo> lista_equipo = new ArrayList();//agregar

        String opcion = " ";
        while (!opcion.equalsIgnoreCase("c")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Jugador\n"
                    + "b- Equipo\n"
                    + "c- Salir\n");
            if (opcion.equals("a")) {
                opcion = " ";
                while (!opcion.equalsIgnoreCase("e")) {
                    opcion = JOptionPane.showInputDialog("Menu\n"
                            + "a- Agregar Jugador\n"
                            + "b- Listar Jugador\n"
                            + "c- eliminar Jugadores\n"
                            + "d- Modificar Jugador\n"
                            + "e- Salir\n");
                    if (opcion.equals("a")) {
                        String creacion;
                        String nombre;
                        String apellido;
                        String estado = "libre";
                        String pais;
                        String pie;
                        int numero = 0;
                        double precio;
                        String equipo = "ninguno";
                        creacion = (JOptionPane.showInputDialog("Ingrese tipo de jugador a crear jugador: [delantero,medio,defensa,portero]"));
                        nombre = (JOptionPane.showInputDialog("Ingrese nombre del jugador: "));
                        apellido = (JOptionPane.showInputDialog("Ingrese apellido del jugador: "));
                        pais = (JOptionPane.showInputDialog("Ingrese pais de origen del jugador: "));
                        pie = (JOptionPane.showInputDialog("Ingrese pie preferido del jugador: "));
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del jugador: "));
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del jugador: [mayor que 1]"));
                        if (creacion.equalsIgnoreCase("delantero")) {
                            double definicion;
                            double altura;
                            double velocidad;
                            double prom_goles;
                            definicion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de definicion del jugador: "));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del jugador: "));
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad del jugador: "));
                            prom_goles = Double.parseDouble(JOptionPane.showInputDialog("Ingrese promedio de goles del jugador: "));
                            jugador.add(new delantero(definicion, altura, velocidad, prom_goles, nombre, apellido, estado, pais, pie, numero, precio, equipo));
                        } else if (creacion.equalsIgnoreCase("medio")) {
                            double creatividad;
                            double dominio;
                            double asistencias;

                            creatividad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de creatividad del jugador: "));
                            dominio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de dominio del jugador: "));
                            asistencias = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de asistencias del jugador: "));
                            jugador.add(new medio(creatividad, dominio, asistencias, nombre, apellido, estado, pais, pie, numero, precio, equipo));
                        } else if (creacion.equalsIgnoreCase("defensa")) {
                            double agresividad;
                            double altura;
                            double peso;
                            double velocidad;
                            agresividad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de agresividad del jugador: "));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del jugador: "));
                            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso del jugador: "));
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad del jugador: "));
                            jugador.add(new defensa(agresividad, altura, peso, velocidad, nombre, apellido, estado, pais, pie, numero, precio, equipo));

                        } else if (creacion.equalsIgnoreCase("portero")) {
                            double juego_aereo;
                            double juego_pies;
                            juego_aereo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de juego aereo del jugador: "));
                            juego_pies = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de juego con los pies del jugador: "));
                            jugador.add(new portero(juego_aereo, juego_pies, nombre, apellido, estado, pais, pie, numero, precio, equipo));
                        } else {
                            JOptionPane.showMessageDialog(null, "NO SE CREO EL JUGADOR");
                        }
                    } // a menu 2
                    if (opcion.equals("b")) {
                        String p1 = "";
                        for (Object t1 : jugador) {
                            if (t1 instanceof jugador) {
                                p1 += jugador.indexOf(t1) + " " + ((jugador) t1) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, p1);
                    }// b menu 2
                    if (opcion.equals("c")) {
                        int p = Integer.parseInt(
                                JOptionPane.showInputDialog("Posicion de Jugador a Eliminar"));
                        jugador.remove(p);
                    }//// c menu #2 
                    if (opcion.equals("d")) {
                        int pos = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese la Posicion del Soldado a modificar: "));

                        String creacion;
                        String nombre;
                        String apellido;
                        String estado = "libre";
                        String pais;
                        String pie;
                        int numero = 0;
                        double precio;
                        String equipo = "ninguno";
                        creacion = (JOptionPane.showInputDialog("Ingrese tipo de jugador a crear jugador: [delantero,medio,defensa,portero]"));
                        nombre = (JOptionPane.showInputDialog("Ingrese nombre del jugador: "));
                        apellido = (JOptionPane.showInputDialog("Ingrese apellido del jugador: "));
                        pais = (JOptionPane.showInputDialog("Ingrese pais de origen del jugador: "));
                        pie = (JOptionPane.showInputDialog("Ingrese pie preferido del jugador: "));
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero del jugador: "));
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del jugador: [mayor que 1]"));
                        if (creacion.equalsIgnoreCase("delantero")) {
                            double definicion;
                            double altura;
                            double velocidad;
                            double prom_goles;
                            definicion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de definicion del jugador: "));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del jugador: "));
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad del jugador: "));
                            prom_goles = Double.parseDouble(JOptionPane.showInputDialog("Ingrese promedio de goles del jugador: "));
                            jugador remplazo_delantero = new jugador(nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            remplazo_delantero = new delantero(definicion, altura, velocidad, prom_goles, nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            jugador.set(pos, remplazo_delantero);
                        } else if (creacion.equalsIgnoreCase("medio")) {
                            double creatividad;
                            double dominio;
                            double asistencias;
                            creatividad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de creatividad del jugador: "));
                            dominio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de dominio del jugador: "));
                            asistencias = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de asistencias del jugador: "));
                            jugador remplazo_medio = new jugador(nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            remplazo_medio = new medio(creatividad, dominio, asistencias, nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            jugador.set(pos, remplazo_medio);
                        } else if (creacion.equalsIgnoreCase("defensa")) {
                            double agresividad;
                            double altura;
                            double peso;
                            double velocidad;
                            agresividad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de agresividad del jugador: "));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del jugador: "));
                            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso del jugador: "));
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad del jugador: "));
                            jugador remplazo_defensa = new jugador(nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            remplazo_defensa = new defensa(agresividad, altura, peso, velocidad, nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            jugador.set(pos, remplazo_defensa);
                        } else if (creacion.equalsIgnoreCase("portero")) {
                            double juego_aereo;
                            double juego_pies;
                            juego_aereo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de juego aereo del jugador: "));
                            juego_pies = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de juego con los pies del jugador: "));
                            jugador remplazo_portero = new jugador(nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            remplazo_portero = new portero(juego_aereo, juego_pies, nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            jugador.set(pos, remplazo_portero);
                        } else {
                            JOptionPane.showMessageDialog(null, "NO SE CREO EL JUGADOR");
                        }
                    }//// d menu #2

                }/// fin del menu #2
            }//// a menu #1 

            if (opcion.equals("b")) {
                opcion = " ";
                while (!opcion.equalsIgnoreCase("E")) {
                    opcion = JOptionPane.showInputDialog("Menu\n"
                            + "a- Agregar Equipo\n"
                            + "b- Listar Equipo\n"
                            + "c- eliminar Equipo\n"
                            + "d- Modificar Equipo\n"
                            + "e- Salir\n");
                    if (opcion.equals("a")) {
                        String nombre;
                        int palmares;
                        String ciudad;
                        double presupuesto;
                        int cantera;
                    }

                    if (opcion.equals("b")) {

                    }
                    if (opcion.equals("c")) {

                    }
                    if (opcion.equals("d")) {

                    }
                }
            }//// b menu #1 

        }// fin menu #1
    }
}
