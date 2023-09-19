/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro.cap01;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int v = scanner.nextInt();
        //obtenemos el resto de dividir v por dos (eso se hace para ver si es un múltiplo de dos duh)
        int resto = v % 2;
        //if in-line
        String mssg = (resto == 0) ? " es par" : " es impar";
        
        //muestro resultado
        System.out.println(v + " " + mssg);
    }
    
}
