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
public abstract class Medicare {
    
    private boolean aceptadoMedicare;
    
    public boolean getAceptadoMedicare()
    {
        return this.aceptadoMedicare;
    }

    public void setAceptadoMedicare(boolean Aceptado1)
    {
        this.aceptadoMedicare = Aceptado1;
    }
    public void Preparando_servicio()
    {
        System.out.println("preparando servicio Medicare");
    }
}
