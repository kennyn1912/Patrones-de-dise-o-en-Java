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
public abstract class Automovil
{
    private int puertas;
    
    public int getPuertas()
    {
        return this.puertas;
    }

    public void setPuertas(int num_puertas)
    {
        this.puertas = num_puertas;
    }
    
    public void ensamblar()
    {
        System.out.println("Ensamblando el automovil");
    }
}
