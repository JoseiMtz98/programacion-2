/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6.array.list;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10
 */
public class Ejercicio6ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> textos = new ArrayList ();
        int v;
        v=Integer.parseInt(JOptionPane.showInputDialog(null,"introduce la cantidad de texto a añadir"));
        for(int i=0;i<v;i++){
        String x;
        x=JOptionPane.showInputDialog(null,"introduce el texto");
        textos.add(x);
        }
        
        Collections.reverse(textos);
        int y;
        int w;
        w=0;
        y=textos.size();
        for(int i=0;i<y;i++){
            
            
            System.out.println(textos.get(w));
            w++;
        }
    }
    
}
