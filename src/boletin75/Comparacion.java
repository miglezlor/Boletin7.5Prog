
package boletin75;

import javax.swing.JOptionPane;

/**
 *
 * @author miglezlor
 */
public class Comparacion {
    
    public int pedirNumero(){
        int num;
        String res=JOptionPane.showInputDialog("Introduce un número");
        num=Integer.parseInt(res);
        return num;
    }
    public void compararNumeros (int num1, int num2, int num3){
        if (num1>num2 & num1>num3)
            System.out.println("O primeiro número é o maior ("+num1+")");
        else if (num2>num1 & num2>num3)
            System.out.println("O segundo número é o maior ("+num2+")");
        else
            System.out.println("O terceiro número é o maior ("+num3+")");
                
        
          

         
    }
}
