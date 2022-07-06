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
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        IEmpanada empanada_queso = FreidorEspecifico.armar(FreidorEspecifico.QUESO);
        empanada_queso.armar();
        
        IEmpanada empanada_carne = FreidorEspecifico.armar(FreidorEspecifico.CARNE);
        empanada_carne.armar();
        
        
    }
    
}
