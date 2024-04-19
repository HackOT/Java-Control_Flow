package ControlFlow;

public class numberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome (int number){
        
        int reverse = 0;
        int original = number;
        while (0 != original){
            reverse *= 10;
            reverse += (original%10);
            original /= 10;
        }
        return reverse == number;
        
        
        /*
        if (number<10 && number >= 0){
            return true;
        }
        else{
            int reverse = 0;
            int lastDigit = 0;
            int temp =number;
            while ((10 <= temp)  || (temp < 0) ){
                lastDigit = temp % 10;
                temp = temp / 10 ;
                reverse += lastDigit;
                reverse = reverse *10;
            }
            reverse += temp;
            return reverse == number;
        }
        */
        
    }
}
