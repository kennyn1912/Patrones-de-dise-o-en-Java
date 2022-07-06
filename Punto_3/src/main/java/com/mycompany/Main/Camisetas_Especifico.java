/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author kenny
 */
public class Camisetas_Especifico {
   
    /**
     *
     */
    public static final int Adidas = 1;
    public static final int  Nike = 2;
    public static final int Puma = 3;
    
    
    public void Camiseta_Especifico()
    {
        
    }
    
    public static Camisetas Fabricar(int tipo)
    {
        Camisetas micamiseta;
        
        micamiseta = switch (tipo) {
            case Adidas -> new Adidas_climacool();
            case Nike -> new Nike_drifit();
            case Puma -> new Puma_dricel();
            default -> null;
        };
        
        return micamiseta;
    }
}


    

