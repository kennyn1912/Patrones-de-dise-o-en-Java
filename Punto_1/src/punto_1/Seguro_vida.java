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
public abstract class Seguro_vida {
   
   private boolean aceptadoSeguro;
    
    public boolean getAceptadoSeguro()
    {
        return this.aceptadoSeguro;
    }

    public void setAceptadoSeguro(boolean Aceptado2)
    {
        this.aceptadoSeguro = Aceptado2;
    }
    
    public void Preparando_servicio()
    {
        System.out.println("preparando servicio seguro de vida");
    }
}
