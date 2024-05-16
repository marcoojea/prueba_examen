package org.example;

import java.util.ArrayList;

/**
 * Clase Concesionario
 * @author Marco
 * @version 1.0 01/01/2024
 */

public class Concesionario {

    /**
     * Metodo privado tipo ArrayList en el que se guardan los autos
     */

    private ArrayList<Auto> autos;

    /**
     * Constructor de concesionario donde son guardados
     */

    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Constructor donde guardamos los autos que tenemos
     * @param auto
     */

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Metodo que devuelve los coches que tenemos mostrandonoslos
     * @return autos
     */


    public ArrayList<Auto> listarAutos() {
        return autos;
    }


    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}
