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
public class MotocicletaGasolina extends Motocicleta {

    public MotocicletaGasolina() {
        this.setCasco(true);
        this.ensamblar();
    }

    public void ensamblar() {
        System.out.println("Ensamblando la Motocicleta Gasolina");
    }
}
