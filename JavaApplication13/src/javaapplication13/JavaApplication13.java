/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author JoseMtz
 */
import javax.swing.JOptionPane;
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c=0;
        String frase;
        frase = JOptionPane.showInputDialog("introduce una palabra");
        for (int x=0; x < frase.length(); x++) {
        if ((frase.charAt(x) == 'a') || (frase.charAt(x) == 'e') || (frase.charAt(x) == 'i') || (frase.charAt(x) == 'o') || (frase.charAt(x) == 'u')) {
            c++;
        }
    }
    JOptionPane.showMessageDialog(null, c + "vocales");
}
}