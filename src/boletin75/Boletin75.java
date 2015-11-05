
package boletin75;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Boletin75 {


    public static void main(String[] args) {

        int num1, num2, num3;
        Comparacion obx=new Comparacion();
        num1=obx.pedirNumero();
        num2=obx.pedirNumero();
        num3=obx.pedirNumero();
        
        obx.compararNumeros(num1, num2, num3);
        
    }
    
}
