/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_1;

/**
 *
 * @author estudiante
 */
public class ConsultarTemperatura {
    private double fahrenheit = 0;
    
    public ConsultarTemperatura(){
        
    }
    
    public double getTemperaturaFahrenheit(){
        return this.fahrenheit;
    } 
    public void BajarTemperaturaFahrenheit(double fahrenheit){
        this.fahrenheit -= fahrenheit; 
    }
    
    public void SubirTemperaturaFahrenheit(double fahrenheit){
        this.fahrenheit += fahrenheit;
    }
}
