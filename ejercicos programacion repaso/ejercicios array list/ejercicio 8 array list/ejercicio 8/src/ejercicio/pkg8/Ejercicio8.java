/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer > num = new ArrayList ();
   
        
        
       
              int e =0;
             while(e!=-99)
             {
                 int z=Integer.parseInt(JOptionPane.showInputDialog(null, "introduce numeros  \n"+"O -99 para cerrar"));
                  if(z==-99)
                  {
                      JOptionPane.showMessageDialog(null, "fin de la entrada de numeros");
                      e=-99;
                  }
                  else
                  {
                      num.add(z);
                  }
                    
             }
             int suma=0;
             
              for (int x = 0; x < num.size (); x++)
              {
                    System.out.println(x +") "+num.get(x));
                 
                     
              }
              
               
              for (int x = 0; x < num.size (); x++)
              { 
                  suma = suma + num.get(x);
              }
               System.out.println("la suma es: "+suma);
                
               int media =suma/num.size();
               System.out.println("la media es: "+media);
               
               for (int x = 0; x < num.size (); x++)
               {
                   if (num.get(x)>media)
                   {
                       System.out.println("numero mayor "+"("+x+") "+num.get(x));
                   }
                   else
                   {               
                       
                   }
               }
    }
    
    
}
