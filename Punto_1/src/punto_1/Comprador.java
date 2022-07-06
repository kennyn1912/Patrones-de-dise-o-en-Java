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
public class Comprador {
    public Comprador(Compañias_seguros miFabrica)
    {
        Medicare miMedicare = miFabrica.getMedicare();
        miMedicare.Preparando_servicio();
        
        Seguro_vida miSeguro = miFabrica.getSeguro_Vida();
        miSeguro.Preparando_servicio();
    }
}
