/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author kenny
 */
public class JuegoFactory implements ServicioFactory {

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioJuego();
    }

}
    

