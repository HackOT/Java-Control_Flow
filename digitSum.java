package ControlFlow;

public class digitSum {
    
    public static void main(String[] args) {
        System.out.println(sumDigit(-125));
    }
    

    public static int sumDigit(int number){
        int sum = 0;
        if (number<0){
            return -1;
        }
        while(number > 9){
            sum +=(number%10);
            number = number /10;
        }
        sum +=number;
        return sum;
    
        //my solution
    /* if(number >= 0){
        if (number >= 10){
            int total = 0;
            int n = 10;
            int temp = 0;
            while(n<=number*10){
                
                temp += (number %n);
                number -=temp;
                total +=temp/(n/10);
                temp =0;
                n=10*n;
            }
            return total;
        }
        else{
            return number;
        }
    }
    else{
        return -1;
    }
     */
    }
}
