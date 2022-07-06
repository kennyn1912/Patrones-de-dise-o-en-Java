
package patroncomposite2;

/**
 *
 * @author kenny
 */
public abstract class Vertice {
    
    public static final int PARRAFO = 1;
    public static final int TITULO = 2;
    
   protected String etiqueta = "";
   protected int tipoVertice;
   
   protected Vertice verticePadre;
    
   public String getEtiqueta(){
       return this.etiqueta;
   }
    public void setEtiqueta(String newEtiqueta){
       this.etiqueta = newEtiqueta;
   }
   public int getTipoVertice(){
       return this.tipoVertice;
   }
   public void setTipoVertice(int newTipoVertice){
       this.tipoVertice = newTipoVertice;
   }
   public Vertice getVerticePadre(){
       return this.verticePadre;
   }
   public void setVerticePadre(Vertice newVerticePadre){
       this.verticePadre = newVerticePadre;
   }
   public abstract void presentar();
   }

