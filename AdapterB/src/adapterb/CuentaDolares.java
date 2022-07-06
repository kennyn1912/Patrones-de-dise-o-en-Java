/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterb;

/**
 *
 * @author estudiante
 */
public class CuentaDolares {
    
    private double dolares = 0;
    
    public CuentaDolares(){
        
    }
    
    public double getSaldoDolares(){
        return this.dolares;
    }
    
    public void retirarDolares(double dolares){
       this.dolares -= dolares ;
    }
    
    public void consignarDolares(double dolares){
        this.dolares += dolares;
    }
    
}
