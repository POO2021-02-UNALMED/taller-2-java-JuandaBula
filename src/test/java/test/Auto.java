/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author USER
 */
public class Auto {
    public String modelo;
    public int precio;
    public Asiento asientos[];
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;
    
    public int cantidadAsientos() {
        int cantidad = 0;
        for (Asiento asiento : this.asientos) {
            if (asiento instanceof Asiento) {
                cantidad ++;
            }        
        }
        return cantidad;
    }
    
    public String verificarIntegridad() {
        String mensaje = "Auto original";
        
        if (this.motor.registro == this.registro) {
            
            for (Asiento asiento : this.asientos) {
                if (asiento instanceof Asiento) {
                    if (asiento.registro != registro) {
                        mensaje = "Las piezas no son originales";
                    }
                }
            }
        }
        
        else
            mensaje = "las piezas no son originales";
        
        return mensaje;
    }    }
                
            
        
    
