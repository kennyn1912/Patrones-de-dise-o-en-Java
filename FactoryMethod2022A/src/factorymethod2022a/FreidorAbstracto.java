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
public abstract class FreidorAbstracto 
{
    public static final int QUESO = 1;
    public static final int CARNE = 2;
    
    public abstract IEmpanada armar(int tipo);
}
