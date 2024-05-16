import java.util.ArrayList;

/**
 * Clase auto tenemos dos atributos
 * @author Marco
 * @version 1.0 01/01/2024
 */

public class Auto {
    /**
     * Atributo marca
     * Atributo modelo
     */

    private String marca;


    private String modelo;

    /**
     * Constructor de auto
     * @param marca
     * @param modelo
     */

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    /**
     * Getter de marca
     * @return la marca del auto
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Setter de marca
     * @param marca del coche actualizada
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo que define el modelo del auto
     * @return modelo del auto
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo que devuelve el modelo actualizado
     * @param modelo
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    /**
     * Override que nos transforma un objeto en un tipo String
     * @return cadena que representa los atributos del auto
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}

