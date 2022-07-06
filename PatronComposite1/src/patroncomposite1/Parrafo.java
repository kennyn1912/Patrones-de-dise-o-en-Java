/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncomposite1;

/**
 *
 * @author kenny
 */
public class Parrafo extends Vertice {
    
    public Parrafo(String newEtiqueta){
        this.setTipoVertice(Vertice.PARRAFO);
        this.setEtiqueta(newEtiqueta);
        
    }
    public void presentar(){
        System.out.println("Parrafo con la etiqueta: "+this.etiqueta+".");
    }
}
