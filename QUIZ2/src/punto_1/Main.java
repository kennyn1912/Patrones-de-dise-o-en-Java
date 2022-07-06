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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Adaptador miAdaptador = new Adaptador();
        System.out.println("La temperatura inicial es de: " + miAdaptador.getTemperatura()+" grados fahrenheit\n\n");
        
        System.out.println("INICIO SECUENCIA PARA AUMENTAR LA TEMPERATURA\n");
        for(int i = 0 ; i < 20 ; i++){
            
            miAdaptador.SubirKelvin(10);

            System.out.println("La temperatura actual del reactor es de: " + Math.round(miAdaptador.getTemperatura())+" grados fahrenheit");
        }
        System.out.println("---------------------------------------------------------------\n\n\n");
        
        System.out.println("INICIO SECUENCIA PARA BAJAR LA TEMPERATURA\n");
        for(int i = 0 ; i < 20 ; i++){
            
            miAdaptador.BajarKelvin(10);

            System.out.println("La temperatura actual del reactor es de: " + Math.round(miAdaptador.getTemperatura())+" grados fahrenheit");
        }
        
    }
    
}
