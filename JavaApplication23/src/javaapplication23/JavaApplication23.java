/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import javax.swing.JOptionPane;

/**
 *
 * @author JoseMtz
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float[]elementos;
        elementos = new float[10];
    float max,min;
        min=max=elementos[0];
        for(int x=0 ;x < elementos.length ;x++)
        {
            elementos[x]=Float.parseFloat(JOptionPane.showInputDialog("introduce un numero"));
        }   
     
    }
    
}
