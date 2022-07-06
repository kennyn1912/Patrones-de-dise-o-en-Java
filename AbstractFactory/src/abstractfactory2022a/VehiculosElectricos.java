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
public class VehiculosElectricos implements FabricaVehiculos
{
    public Motocicleta getMotocicleta()
    {
        return new MotocicletaElectrica();
    }
    
    public Automovil getAutomovil()
    {
        return new AutomovilElectrico();
    }
}
