/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] Array = new String [28];
        String cadena = "";
        Array [0] = "A";
        Array [1] = "B";
        Array [2] = "C";
        Array [3] = "D";
        Array [4] = "E";
        Array [5] = "F";
        Array [6] = "G";
        Array [7] = "H";
        Array [8] = "i";
        Array [9] = "J";
        Array [10] = "K";
        Array [11] = "L";
        Array [12] = "M";
        Array [13] = "N";
        Array [14] = "Ñ";
        Array [15] = "O";
        Array [16] = "P";
        Array [17] = "Q";
        Array [18] = "R";
        Array [19] = "S";
        Array [20] = "T";
        Array [21] = "U";
        Array [22] = "V";
        Array [23] = "W";
        Array [24] = "X";
        Array [25] = "Y";
        Array [26] = "Z";
        Array [27] = " ";
        
        int x =Integer.parseInt(JOptionPane.showInputDialog(null, "introduce numero de caracter del 0 al 26, o -1 para dejar de escribir"));
        while(x !=-1){
               if(x>-1 && x <28)
               {
                    cadena += Array[x];
                    x =Integer.parseInt(JOptionPane.showInputDialog(null, "introduce numero de caracter del 0 al 26 o -1 para dejar de escribir"));
                    
               }
               else
               {
                    x =Integer.parseInt(JOptionPane.showInputDialog(null, "introduce un numero correcto"));
               }
               
        }
        JOptionPane.showInputDialog(null, cadena);
        System.out.println(cadena);
    }
    
}
