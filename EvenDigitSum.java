package ControlFlow;

public class EvenDigitSum {
    
    
    public static int getEvenDigitSum (int number){
        
        if (number >= 0){
            int digit = 0;
            int total = 0;
            while (number != 0){
                
                digit = number % 10;
                number /=10;
                if (digit % 2 == 0){
                    total += digit;
                }
                
            }
            return total;
            
        }
        return -1;
    }
}
