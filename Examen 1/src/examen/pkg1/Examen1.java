/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseMtz
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu=Integer.parseInt(JOptionPane.showInputDialog("1.-Sumar notas\n2.-tabla multiplicar\n3.-fechas\n4.-Finalizar"));
        switch(menu)
        {
            case 1:
                //sumaNotas();
                break;
            case 2:
                //multi();
                break;
            case 3:
                fechas();
                break;
            case 4:
                cerrar();
                break;
                
            
        }
    }
    public static void fechas()
    {
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha=JOptionPane.showInputDialog("fecha dd/MM/yyyy");
        LocalDate fechaUno=LocalDate.parse(fecha, format);
        LocalDate fechaHoy=LocalDate.now();
        JOptionPane.showMessageDialog(null, fechaHoy);
    }
    public static void cerrar()
    {
        JOptionPane.showMessageDialog(null,"FIN");
        System.exit(0);
    }
}
