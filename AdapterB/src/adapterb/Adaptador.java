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
public class Adaptador extends CuentaDolares implements IAdapter{

    public Adaptador(){
        
    }
    
    public void retirarPesos(double pesos) {
        double dolares = pesos / 3817;
        this.retirarDolares(dolares);
    }

    public void consignarPesos(double pesos) {
        double dolares = pesos / 3817;
        this.consignarDolares(dolares);
    }
    
    
}
