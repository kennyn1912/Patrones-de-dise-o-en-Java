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
public class Medicare_M_S extends Medicare{
    
    public Medicare_M_S(){
        this.setAceptadoMedicare(true);
        this.Preparando_servicio();
    }
 
    public void Preparando_servicio(){
        System.out.println("El servicio Medicare ha sido aceptado con la empresa Mutual Settlement");
    }
}
