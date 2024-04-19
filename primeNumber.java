package ControlFlow;

import java.util.*;
public class primeNumber {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter the dividor <= 1000");
        int inputDividor = scan1.nextInt();

        System.err.println ( inputDividor +" is a " + (isPrime(inputDividor )?  " " : "not ") +"prime number");

        int counter=0;
        for (int i=47; counter<4 && i<61; i++){
            if (isPrime(i)){
                System.err.println ( i +" is a " + (isPrime(i)?  " " : "not ") +"prime number");
                counter++;
            }
        /*  if (counter==3){
                break;
            }
            */
        }
        
        
        scan1.close();
    }
    public static boolean isPrime(int dividor ) {
        if (dividor<=2){
            return dividor == 2;
        }
        for (int divisor = 2; divisor< dividor/2 ; divisor++){
            if (dividor % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
