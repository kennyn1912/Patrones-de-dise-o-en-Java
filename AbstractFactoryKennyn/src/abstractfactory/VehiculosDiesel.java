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
public class VehiculosDiesel implements FabricaVehiculos {

    public Motocicleta getMotocicleta() {
        return new MotocicletaDiesel();
    }

    public Automovil getAutomovil() {
        return new AutomovilDiesel();
    }

    public Lancha getLancha() {
        return new LanchaDiesel();
    }

}
