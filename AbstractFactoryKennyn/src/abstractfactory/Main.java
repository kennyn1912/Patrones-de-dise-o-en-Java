/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comprador miComprador = new Comprador(new VehiculosElectricos());
        miComprador = new Comprador(new VehiculosGasolina());
        miComprador = new Comprador(new VehiculosDiesel());
    }
    
}