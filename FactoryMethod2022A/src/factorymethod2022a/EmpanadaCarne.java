/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod2022a;

/**
 *
 * @author carlosandrestaveraromero
 */
public class EmpanadaCarne implements IEmpanada
{
    public EmpanadaCarne()
    {
        
    }
    
    public void armar()
    {
        System.out.println("Armando la empanada de CARNE");
    }
}
