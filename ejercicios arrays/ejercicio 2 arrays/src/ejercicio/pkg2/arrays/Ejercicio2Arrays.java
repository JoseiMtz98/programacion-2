/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.arrays;

import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10
 */
public class Ejercicio2Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x =Integer.parseInt(JOptionPane.showInputDialog(null, "teclea el número de arrays que quieras"));
        Integer [] numeros = new Integer[x];
        int [] numeros2 = new int[x];
        
        for(int i=0;i<x;i++){
        int n;
        n = (int) (Math.random() * 300) + 1;
        numeros [i] = n;
        }
        
        char w =JOptionPane.showInputDialog(null, "teclea el ultimo numero para comparar").charAt(0);
        for(int z = 0; z < numeros.length; z++){
             String num =numeros[z].toString();
         
        
             if (num.charAt(num.length()-1)== w){
                int num2 = Integer.parseInt(num);
                numeros2 [z]= num2;
        
              }
            else{
                
             numeros2[z]=0;
        }
        }
        
        for(int g = 0; g < numeros2.length; g++){
            
            System.out.print(numeros2[g] + " ");
            System.out.println ();

        }
    }
    
}
