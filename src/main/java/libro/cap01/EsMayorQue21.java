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
public class EsMayorQue21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if(edad >= 21){
            System.out.println("Usted es mayor de edad !");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }
    
}