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
public class AutomovilElectrico extends Automovil
{
     public AutomovilElectrico()
     {
        this.setPuertas(4);
        this.ensamblar();
     }
 
 public void ensamblar()
 {
     System.out.println("Ensamblando el automovil electrico");
 }
    
}
