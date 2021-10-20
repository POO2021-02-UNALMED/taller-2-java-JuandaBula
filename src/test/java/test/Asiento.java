/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author USER
 */
public class Asiento {
    public String color;
    public int precio;
    public int registro;

    public void cambiarColor(String color) {
        if ( color.equals("negro") || color.equals("verde") || color.equals("rojo")  || color.equals("amarillo") || color.equals("blanco")) {
            this.color = color;
        }

    }

}

