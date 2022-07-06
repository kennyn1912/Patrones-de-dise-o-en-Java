/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_1;

/**
 *
 * @author estudiante
 */
public class Seguro_vida_M_S extends Seguro_vida{
    public Seguro_vida_M_S(){
        this.setAceptadoSeguro(true);
        this.Preparando_servicio();
    }
 
    public void Preparando_servicio(){
        System.out.println("El servicio Seguro de vida ha sido aceptado con la empresa Mutual Settlement");
    }
}
