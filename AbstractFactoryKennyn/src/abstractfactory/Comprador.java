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
public class Comprador {

    public Comprador(FabricaVehiculos mifabrica) {
        Motocicleta miMotocicleta = mifabrica.getMotocicleta();
        miMotocicleta.ensamblar();
        
        Automovil miAutomovil = mifabrica.getAutomovil();
        miAutomovil.ensamblar();
        
        Lancha miLancha = mifabrica.getLancha();
        miLancha.ensamblar();
        
    }
    
}
