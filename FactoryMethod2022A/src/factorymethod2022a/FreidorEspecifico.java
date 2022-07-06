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
public class FreidorEspecifico
{
    public static final int QUESO = 1;
    public static final int CARNE = 2;
    
    public void FreidorEspecifico()
    {
        
    }
    
    public static IEmpanada armar(int tipo)
    {
        IEmpanada miempanada;
        
        switch(tipo)
        {
            case QUESO:
                miempanada = new EmpanadaQueso();
                break;
            case CARNE:
                miempanada = new EmpanadaCarne();
                break;
            default:
                miempanada = null;
        }
        
        return miempanada;
    }
}
