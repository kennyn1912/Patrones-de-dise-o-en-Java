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
public class Adaptador implements IAdapter {
    
    ConsultarTemperatura miConsultarTemperatura = new ConsultarTemperatura();

    public Adaptador() {

    }

    public double getTemperatura() {
        return this.miConsultarTemperatura.getTemperaturaFahrenheit();
    }

    public void BajarKelvin(double kelvin) {
        double fahrenheit = (1.8*(kelvin - 273)) + 32; 
        fahrenheit = fahrenheit*(-1);
        miConsultarTemperatura.BajarTemperaturaFahrenheit(fahrenheit);
    }

    public void SubirKelvin(double kelvin) {
        double fahrenheit = (1.8*(kelvin - 273)) + 32;
        fahrenheit = fahrenheit*(-1);
        miConsultarTemperatura.SubirTemperaturaFahrenheit(fahrenheit);
    }
}
