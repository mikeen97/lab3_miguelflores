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
        equipo eq = new equipo();
        ArrayList<jugador> ListJugador = new ArrayList();//agregar 
        ArrayList<equipo> equipo1 = new ArrayList();//agregar
        ArrayList<equipo> jugador_final = new ArrayList();//agregar

        String opcion = " ";
        while (!opcion.equalsIgnoreCase("d")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Jugador\n"
                    + "b- Equipo\n"
                    + "c- hacer comprar\n"
                    + "d- lista de cada equipo\n"
                    + "d- Salir\n");
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
                            ListJugador.add(new delantero(definicion, altura, velocidad, prom_goles, nombre, apellido, estado, pais, pie, numero, precio, equipo));
                        } else if (creacion.equalsIgnoreCase("medio")) {
                            double creatividad;
                            double dominio;
                            double asistencias;

                            creatividad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de creatividad del jugador: "));
                            dominio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de dominio del jugador: "));
                            asistencias = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de asistencias del jugador: "));
                            ListJugador.add(new medio(creatividad, dominio, asistencias, nombre, apellido, estado, pais, pie, numero, precio, equipo));
                        } else if (creacion.equalsIgnoreCase("defensa")) {
                            double agresividad;
                            double altura;
                            double peso;
                            double velocidad;
                            agresividad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de agresividad del jugador: "));
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura del jugador: "));
                            peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso del jugador: "));
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese velocidad del jugador: "));
                            ListJugador.add(new defensa(agresividad, altura, peso, velocidad, nombre, apellido, estado, pais, pie, numero, precio, equipo));

                        } else if (creacion.equalsIgnoreCase("portero")) {
                            double juego_aereo;
                            double juego_pies;
                            juego_aereo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de juego aereo del jugador: "));
                            juego_pies = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de juego con los pies del jugador: "));
                            ListJugador.add(new portero(juego_aereo, juego_pies, nombre, apellido, estado, pais, pie, numero, precio, equipo));
                        } else {
                            JOptionPane.showMessageDialog(null, "NO SE CREO EL JUGADOR");
                        }
                    } // a menu 2
                    if (opcion.equals("b")) {
                        String p1 = "";
                        for (Object t1 : ListJugador) {
                            if (t1 instanceof jugador) {
                                p1 += ListJugador.indexOf(t1) + " " + ((jugador) t1) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, p1);
                    }// b menu 2
                    if (opcion.equals("c")) {
                        int p = Integer.parseInt(
                                JOptionPane.showInputDialog("Posicion de Jugador a Eliminar"));
                        ListJugador.remove(p);
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
                            ListJugador.set(pos, remplazo_delantero);
                        } else if (creacion.equalsIgnoreCase("medio")) {
                            double creatividad;
                            double dominio;
                            double asistencias;
                            creatividad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de creatividad del jugador: "));
                            dominio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de dominio del jugador: "));
                            asistencias = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de asistencias del jugador: "));
                            jugador remplazo_medio = new jugador(nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            remplazo_medio = new medio(creatividad, dominio, asistencias, nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            ListJugador.set(pos, remplazo_medio);
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
                            ListJugador.set(pos, remplazo_defensa);
                        } else if (creacion.equalsIgnoreCase("portero")) {
                            double juego_aereo;
                            double juego_pies;
                            juego_aereo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de juego aereo del jugador: "));
                            juego_pies = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nivel de juego con los pies del jugador: "));
                            jugador remplazo_portero = new jugador(nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            remplazo_portero = new portero(juego_aereo, juego_pies, nombre, apellido, estado, pais, pie, numero, precio, equipo);
                            ListJugador.set(pos, remplazo_portero);
                        } else {
                            JOptionPane.showMessageDialog(null, "NO SE CREO EL JUGADOR");
                        }
                    }//// d menu #2

                }/// fin del menu #2
            }//// a menu #1 

            if (opcion.equals("b")) {
                opcion = " ";
                while (!opcion.equalsIgnoreCase("e")) {
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
                        nombre = (JOptionPane.showInputDialog("Ingrese nombre del equipo"));
                        palmares = Integer.parseInt(JOptionPane.showInputDialog("cantidad de palmares del equipo: "));
                        ciudad = (JOptionPane.showInputDialog("Ingrese ciudad del equipo: "));
                        presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del jugador: [mayor que 1]"));
                        cantera = 0;
                        equipo1.add(new equipo(nombre, palmares, ciudad, presupuesto, cantera));
                    }
                    if (opcion.equals("b")) {
                        String p1 = "";
                        for (Object t1 : equipo1) {
                            if (t1 instanceof equipo) {
                                p1 += equipo1.indexOf(t1) + " " + ((equipo) t1) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, p1);
                    }

                    if (opcion.equals("c")) {
                        int p = Integer.parseInt(
                                JOptionPane.showInputDialog("Posicion de equipo a Eliminar"));
                        equipo1.remove(p);
                    }

                    if (opcion.equals("d")) {
                        int pos = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese la Posicion del Soldado a modificar: "));
                        String nombre;
                        int palmares;
                        String ciudad;
                        double presupuesto;
                        int cantera;
                        nombre = (JOptionPane.showInputDialog("Ingrese nombre del equipo"));
                        palmares = Integer.parseInt(JOptionPane.showInputDialog("cantidad de palmares del equipo: "));
                        ciudad = (JOptionPane.showInputDialog("Ingrese ciudad del equipo: "));
                        presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio del jugador: [mayor que 1]"));
                        cantera = 0;
                        equipo j = new equipo(nombre, palmares, ciudad, presupuesto, cantera);
                        equipo1.set(pos, j);
                    }
                }
            }//// b menu #3
            if (opcion.equals("c")) {
                String equipo = "";
                String nombre = "";
                String apellido = "";
                double monto_equipo = 0;
                nombre = (JOptionPane.showInputDialog("Ingrese nombre del jugador"));
                apellido = (JOptionPane.showInputDialog("Ingrese apellido del jugador"));
                equipo = (JOptionPane.showInputDialog("Ingrese nombre del equipo al que lo comprara"));
                for (equipo t2 : equipo1) {
                    if (t2.getNombre() == equipo) {
                        monto_equipo = t2.getPresupuesto();
                    }
                }
                for (jugador t1 : ListJugador) {
                    if (t1.getPrecio() <= monto_equipo) {
                        if (t1 instanceof jugador) {
                            if (t1.getNombre() == nombre && t1.getApellido() == apellido) {
                                ListJugador.remove(t1);
                                t1.setEquipo(equipo);
                                eq.setLista_colectiva(t1);
                            }
                        }
                    }
                }
            }
            if (opcion.equals("d")) {
                String equipo = "";
                String p1 = "";
                equipo = (JOptionPane.showInputDialog("Ingrese nombre del equipo de desea ver: "));
                jugador_final = eq.getLista_colectiva();
                
                
                for (int i = 0; i < jugador_final.size(); i++) {
                    for (int j = 0; j < 10; j++) {
                        
                    }
                }
            }
        }// fin menu #1
    }
}

