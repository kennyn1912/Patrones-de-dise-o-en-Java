/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncomposite2;

/**
 *
 * @author kenny
 */
import java.util.ArrayList;
import java.util.List;

public class Titulo extends Vertice{
    List<Vertice> vertices = new ArrayList<Vertice>();
    
    public Titulo(String newEtiqueta, Vertice newVerticePadre){
    this.setTipoVertice(Vertice.TITULO);
this.setEtiqueta(newEtiqueta);

this.setVerticePadre(newVerticePadre);
    }
    public void agregarVertice(Vertice newVertice){
        vertices.add(newVertice);
    }
    public void eliminarVertice(Vertice oldVertice){
        vertices.remove(oldVertice);
    }
    public List<Vertice> getVertices(){
        return vertices;
    }
    public Vertice getVertice(int posicion){
        return vertices.get(posicion);
    }
    public void presentarPadres(){
    for(Vertice vertice: vertices){
        System.out.println("El vertice Padre de:"+vertice.getEtiqueta()+"es:"+vertice.getVerticePadre().getEtiqueta()+".");
        if(vertice.getTipoVertice()==Vertice.TITULO){
            ((Titulo)vertice).presentarPadres();
        }
    }    
    }
    
    public void presentar(){
        System.out.println("Titulos con la etiqueta:"+this.getEtiqueta()+".");
        for(Vertice vertice: vertices){
            vertice.presentar();
        }
    }
}