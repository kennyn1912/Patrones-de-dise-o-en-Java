/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncomposite1;

/**
 *
 * @author kenny
 */
public abstract class Vertice {
    public static final int PARRAFO = 1;
    public static final int TITULO = 2;
    
   protected String etiqueta = "";
   protected int tipoVertice;
    
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
   
   public abstract void presentar();
   }

