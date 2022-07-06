/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncomposite2;

/**
 *
 * @author kenny
 */
public class Parrafo extends Vertice {
    
    public Parrafo(String newEtiqueta, Vertice newVerticePadre){
        this.setTipoVertice(Vertice.PARRAFO);
        this.setEtiqueta(newEtiqueta);
        
        this.setVerticePadre(newVerticePadre);
                
        
    }
    public void presentar(){
        System.out.println("Parrafo con la etiqueta:"+this.etiqueta+".");
    }
}
