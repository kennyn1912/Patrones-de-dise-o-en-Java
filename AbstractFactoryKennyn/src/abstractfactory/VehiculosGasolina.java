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
public class VehiculosGasolina implements FabricaVehiculos {

    public Motocicleta getMotocicleta() {
        return new MotocicletaGasolina();
    }

    public Automovil getAutomovil() {
        return new AutomovilGasolina();
    }
    
    public Lancha getLancha() {
        return new LanchaGasolina();
    }
}
