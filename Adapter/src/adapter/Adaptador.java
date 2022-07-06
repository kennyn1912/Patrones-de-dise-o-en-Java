/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author estudiante
 */
public class Adaptador implements IAdapter {

    CuentaDolares miCuentaDolares = new CuentaDolares();

    public Adaptador() {

    }

    public double getSaldo() {
        return this.miCuentaDolares.getSaldoDolares();
    }

    public void retirarPesos(double pesos) {
        double dolares = pesos / 3817;
        miCuentaDolares.retirarDolares(dolares);
    }

    public void consignarPesos(double pesos) {
        double dolares = pesos / 3817;
        miCuentaDolares.consignarDolares(dolares);
    }

}
