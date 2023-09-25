package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        for (int i = 1; i <= n; i++){
            //
            System.out.println(i);
        }
    }
}
