package ControlFlow;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        int total = 0;
        int i = 1;
        
        if (number < 1){
            return false;
        }
        while(i<number){
            if (number % i == 0){
                total +=i;
            }
            i++;
        }
        return total == number;
        
    }
}
