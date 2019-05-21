/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
     ArrayList<String> numeros = new ArrayList<String>();
     int z =1;
     while(z==1){
     int x =Integer.parseInt(JOptionPane.showInputDialog(null, " pulsa 1 para  agregar un número \n" + "pulsa 2 para buscar un numero \n" + "pulsa 3 para modificar un numero \n"+ " pulsa 4 para eliminar un numero \n" + "pulsa 5 para insertar un numero en una posicion dada \n"+"pulsa 6 para mostrar el menu \n" + "pulsa 7 para cerrar el menu"));
     switch(x){
        case 1:
            int n=Integer.parseInt(JOptionPane.showInputDialog(null,"introduce la cantidad de números a insertar"));
            for (int i=0; i<n; i++){
            String y=JOptionPane.showInputDialog(null,"introduce el número a insertar");
            numeros.add(y);
            JOptionPane.showMessageDialog(null, "numero añadido " +y);
            }
            
        break;
        case 2:
            String j = JOptionPane.showInputDialog(null,"introduce el numero");
            if(numeros.contains(j)==true){
                JOptionPane.showMessageDialog(null, "numero encontrado");
            }
            else{
                JOptionPane.showMessageDialog(null, "numero no encontrado");
            };
        break;
        case 3:
           String q =JOptionPane.showInputDialog(null,"introduce el numero a modificar");
           int a = Integer.parseInt(JOptionPane.showInputDialog(null,"introduce posicion del numero"));
           numeros.set(a,q);
            JOptionPane.showMessageDialog(null,"numero: "+q+" insertado");
            
        break;
        case 4:
            String o = JOptionPane.showInputDialog(null,"introduce el numero");
            numeros.remove("o");
            JOptionPane.showMessageDialog(null,"numero eliminado "+ o);

        break;
        case 5:
            int n = Integer.parseInt(JOptionPane.showInputDialog(null,"introduce posicion del numero"));
            String h = JOptionPane.showInputDialog(null,"introduce el numero");
            
            numeros.add(n, h);
            JOptionPane.showMessageDialog(null,"numero añadido " + h+ "en la posicion " +n);
        break;
        case 6:
            int f;
            f=numeros.size();
            for (int i=0; i<f; i++){
                
                System.out.print(i+"| " + numeros.get(i) +"\n");

            }
        break;
        case 7:
            System.exit(0);
        break;
        
    }
     /*z =Integer.parseInt(JOptionPane.showInputDialog(null,"¿quieres seguir en el menu?\n" + "pulsa 1 para si \n"+ "pulsa 0 para no"));*/
       }
    }
    
}
