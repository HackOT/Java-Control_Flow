package ControlFlow;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
    }


    public static int getLargestPrime(int number){
        int result = 0;
        
        if (number < 2){
            return -1;
        }
        for (int i = 1;i <= number; i++){
            boolean isPrime = true;
                for(int j=2; j<=i/2; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                
                if(isPrime && number % i == 0){
                    result = i;
                }
        }
            return result;
    }
        
}
