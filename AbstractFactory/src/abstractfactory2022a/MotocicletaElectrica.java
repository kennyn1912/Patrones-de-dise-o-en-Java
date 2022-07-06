/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory2022a;

/**
 *
 * @author carlosandrestaveraromero
 */
public class MotocicletaElectrica extends Motocicleta
{
 public MotocicletaElectrica()
 {
     this.setCasco(true);
     this.ensamblar();
 }
 
 public void ensamblar()
 {
     System.out.println("Ensamblando la motocicleta electrica");
 }
}
