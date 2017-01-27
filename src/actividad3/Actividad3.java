/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner key = new Scanner (System.in);
        double co,ca,hip;
        System.out.println("Ingresa el valor del cateto opuesto: ");
        co = key.nextDouble();
        System.out.println("Ingresa el valor del cateto adyacente: ");
        ca = key.nextDouble();
        hip=Math.pow(co, 2)+Math.pow(ca, 2); //Math.pow para obtener el cuadrado de cada cateto
        hip= Math.sqrt(hip); //Math.sqrt para obtener la raíz de la suma de los cuadrados de los catetos
        System.out.println("La hipotenusa es: "+hip);
    }
    
}
