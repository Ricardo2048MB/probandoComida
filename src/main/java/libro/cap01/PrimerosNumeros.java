package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= n);
    }
}
