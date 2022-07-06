/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory2022a;

/**
 *
 * @author carlosandrestaveraromero
 */
public class Comprador
{
    public Comprador(FabricaVehiculos miFabrica)
    {
        Motocicleta miMotocicleta = miFabrica.getMotocicleta();
        miMotocicleta.ensamblar();
        
        Automovil miAutomovil = miFabrica.getAutomovil();
        miAutomovil.ensamblar();
    }
}
