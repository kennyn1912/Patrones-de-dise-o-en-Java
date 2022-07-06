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
public interface FabricaVehiculos {
    public abstract Motocicleta getMotocicleta();
    public abstract Automovil getAutomovil();
    public abstract Lancha getLancha();
    
}
