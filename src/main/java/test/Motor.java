/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author USER
 */
public class Motor {

    int numeroCilindros;
    int registro;
    String tipo;

    void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    void asignarTipo(String tipo) {
        if (tipo.equals("electrico" )|| tipo.equals("gasolina")) {
            this.tipo = tipo;
        }
    }
}