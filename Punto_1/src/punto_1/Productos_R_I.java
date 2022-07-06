/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_1;

/**
 *
 * @author estudiante
 */
public class Productos_R_I implements Compañias_seguros{

    
    public Seguro_vida getSeguro_Vida() {
        return new Seguro_vida_R_I();
    }

    
    public Medicare getMedicare() {
        return new Medicare_R_I();
    }
    
    /*public Seguro_vida getSeguro_vida()
    {
        return new Seguro_vida_R_I();
    }
    
    public Medicare getMedicare()
    {
        return new Medicare_R_I();
    }*/
    
    

    

   

    
}
