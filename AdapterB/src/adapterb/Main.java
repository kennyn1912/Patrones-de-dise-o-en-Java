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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adaptador miAdaptador = new Adaptador();
        System.out.println("Saldo de la cuenta: " + (int) miAdaptador.getSaldoDolares() + " Dólares");
        miAdaptador.consignarPesos(8000000);
        System.out.println("Saldo de la cuenta: " + (int) miAdaptador.getSaldoDolares() + " Dólares");

        miAdaptador.retirarPesos(4000000);

        System.out.println("Saldo de la cuenta: " + (int) miAdaptador.getSaldoDolares() + " Dólares");

    }

}
