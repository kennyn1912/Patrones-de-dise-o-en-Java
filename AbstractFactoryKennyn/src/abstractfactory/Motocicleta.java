/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author estudiante
 */
public abstract class Motocicleta {

    private boolean casco;

    public boolean getCasco() {
        return this.casco;
    }

    public void setCasco(boolean bandera) {
        this.casco = bandera;
    }

    public void ensamblar() {
        System.out.println("Se está ensamblando la motocicleta");
    }
}
