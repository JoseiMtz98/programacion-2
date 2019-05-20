/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       int v;
       v =Integer.parseInt(JOptionPane.showInputDialog(null, "introduce cantidad de alummnos que vas a insertar"));
       int[] numeros = new int [v];
       String [] nota = new String [v];
       String [] cadena = new String [v];
       for(int i=0;i<v;i++){
            String n; 
            n= JOptionPane.showInputDialog(null, "introduce nombre de alummno");
            cadena[i]=n;
            int x;
            int z;
            z=0;
            
            while (z==0){
            x =Integer.parseInt(JOptionPane.showInputDialog(null, "introduce la nota del alumno"));
            if (x>=0 || x<=10)
             {       
                numeros [i]= x; 
                z=1;
                if(x<5 || x>=0 ){    
                   nota [i] = "suspenso";
                   z=1;
                }
                else if(x<6 || x>=5){
                    nota [i]= "suficiente";
                    z=1;
            
                    }
                else if(x<7 || x>6)
                    {
                    nota [i]= "bien";
                    z=1;
            
                    }
                else if(x<9 || x>7)
                    {
                    nota [i]= "notable";
                    z=1;
            
                    }
                else if(x<=10 || x>9){
                    nota [i]= "sobresaliente";
                    z=1;
            
                    }
                else{
                    
                    
                    
                }
             }
       
            else
            {
                JOptionPane.showInputDialog(null,"introduce nota correcta"); 
             }
            }
            
            }
            
        
       
       for(int g = 0; g < numeros.length; g++){
            System.out.print("nombre: " + cadena[g] + " " + "nota: " +numeros[g] + " " + nota [g]);
            System.out.println ();

        }
    }
    
}
