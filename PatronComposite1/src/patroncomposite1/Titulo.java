
package patroncomposite1;

/**
 *
 * @author kenny
 */
import java.util.ArrayList;
import java.util.List;

public class Titulo extends Vertice{
    List<Vertice> vertices = new ArrayList<Vertice>();
    
    public Titulo(String newEtiqueta){
    this.setTipoVertice(Vertice.TITULO);
this.setEtiqueta(newEtiqueta);
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
    public void presentar(){
        System.out.println("Titulos con la etiqueta: "+this.getEtiqueta()+".");
        for(Vertice vertice: vertices){
            vertice.presentar();
        }
    }
}
