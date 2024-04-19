package ControlFlow;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int result = 1;
        if (first < 10 || second < 10){
            return -1;
        }
        int min = second;
        if (first < second){
            min = first;
        }
        for(int i = 1; i <= min; i++){
            
            if (first % i == 0 && second % i == 0){
                result = i;
            }
        }
        return result;
        
    }
}
