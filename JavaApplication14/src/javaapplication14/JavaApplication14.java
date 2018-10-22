/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author JoseMtz
 */
import javax.swing.JOptionPane;
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int c=0;
        String frase;String letra;
        frase = JOptionPane.showInputDialog("introduce una palabra");
        letra = JOptionPane.showInputDialog("introduce una letra");
        char y = letra.charAt(0);
        for (int x=0; x <frase.length();x++){
            if (frase.charAt(x)== y)
            {
                c++; }
               
        }
        JOptionPane.showMessageDialog(null,"la letra "+y+" sale "+c+" veces en la cadena "+frase);
            }
    }
    
