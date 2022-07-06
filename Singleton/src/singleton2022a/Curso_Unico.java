/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton2022a;

/**
 *
 * @author carlosandrestaveraromero
 */
public class Curso_Unico
{

    private static Curso_Unico miCurso_Unico;

    private Curso_Unico()
        {
    
        }
    
    public static Curso_Unico getCurso_Unico()
    {
        if (miCurso_Unico == null)
        {
            miCurso_Unico = new Curso_Unico();
            System.out.println("Curso Único ha sido creado");
        }
        else
        {
            System.out.println("La instancia ya existe");
        }
        
        return(miCurso_Unico);
            
    }
    
}
