/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author kenny
 */
public class Main {
    public static void main(String[] args){
         Camisetas Adidas_climacool = Camisetas_Especifico.Fabricar(Camisetas_Especifico.Adidas);
        Adidas_climacool.Fabricar();
        
        Camisetas Nike_drifit= Camisetas_Especifico.Fabricar(Camisetas_Especifico.Nike);
        Nike_drifit.Fabricar();
        
        Camisetas Puma_dricel = Camisetas_Especifico.Fabricar(Camisetas_Especifico.Puma);
        Puma_dricel.Fabricar();
        
    }
    
}
