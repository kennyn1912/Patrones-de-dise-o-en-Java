/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author kenny
 */
public class ServicioJuego implements ServicioInformatico {
   
    @Override
    public void asignarTrabajo() {
        System.out.println("Nuestros programadores han sido informados del Juego que deben realizar.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Se ha fijado como fecha de entrega el día 08/03/2022.");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El monto a pagar será proporcional a la clasificacion de juego que desse.");
    }

}
    

