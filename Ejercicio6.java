/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.until.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio6 {

   
    public static void main(String[] args) {
       int[] dia =new int[5];
       int[] codigo =new int[5];
       int[] faltas =new int[5];
       
       for(int i = 0; i<dia.length; i++ ){
       String codigo = JOptionPane.showInputDialog(null,"teclea  un codigo de alummno");
       
       
       }
      
       String valor =  menu(dia, codigo, faltas);
       JOptionPane.showMessageDialog(null, valor);
    }
    
}
