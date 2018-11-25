/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkgfinal;

/**
 *
 * @author JoseMtz
 */
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
public class EjercicioFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int nroGenerado= ThreadLocalRandom.current().nextInt(100,999+1);
         System.out.println(nroGenerado);
         int nro=Integer.parseInt(JOptionPane.showInputDialog("teclea un numero de tres cifras"));
         
    }
    
    
    
}
