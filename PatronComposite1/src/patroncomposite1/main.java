
package patroncomposite1;

/**
 *
 * @author kenny
 */
public class main {

   
    public static void main(String[] args) {
    //se crea el libro  
    Titulo titulo_1 = new Titulo("1.Titulo");
    titulo_1.agregarVertice(new Parrafo("Parrafo 1.1"));
    titulo_1.agregarVertice(new Parrafo("Parrafo 1.2"));
    titulo_1.agregarVertice(new Parrafo("Parrafo 1.3"));
    
    Titulo titulo_1_1 = new Titulo("1.1 Introduccion");
    titulo_1_1.agregarVertice(new Parrafo("Parrafo 1.1.1"));
    titulo_1_1.agregarVertice(new Parrafo("Parrafo 1.1.2"));
    
    titulo_1.agregarVertice(titulo_1_1);
    
    titulo_1.presentar();
    
        System.out.println("======================================");
        titulo_1.eliminarVertice(titulo_1_1);
        titulo_1.presentar();
    }
    
}
