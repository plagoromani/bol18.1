/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín18;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static java.lang.Math.random;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Boletín18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            double random = Math.random() * 50 + 1;//para que no coja el 0, máximo de 50
            int valor = (int) random;// facemos o cast
            numeros[i] = valor;
            JOptionPane.showMessageDialog(null,"Número " + (i + 1) +" "+ "es"+ " " + numeros[i]);
        }
   

       
 JOptionPane.showMessageDialog(null,"Numeros al revés");
   

      for (int i = numeros.length - 1; i >= 0; i--) {
            JOptionPane.showMessageDialog(null,"Número " + (i + 1)  +" "+"es"+" " + numeros[i]);
    
        
    }
    }
}

