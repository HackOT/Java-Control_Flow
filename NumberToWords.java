package ControlFlow;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(150);
    }

    public static void numberToWords(int number){
        
        int revnum = reverse(number);
        int lastdigit = 0;

        if (number < 0){
            System.out.println("Invalid Value");
        }

        else if (number == 0){
            System.out.println("Zero");
    }
    int leadingZeroes = getDigitCount(number)-getDigitCount(revnum);

        while (revnum != 0){
            lastdigit = revnum %10;
            revnum /= 10;
            switch (lastdigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

        }
        for (int i=0; i<leadingZeroes; i++){
            System.out.println("Zero");
        }

}

    public static int reverse (int number){
    
    int reversed = 0;
    while (0 != number){
        reversed *= 10;
        reversed += number % 10;
        number /= 10;
    }
    return reversed;
}

    public static int getDigitCount(int param){

        int counter = 0;
        if (param > 0){
            while(param != 0){
                counter++;
                param /= 10;
            
            }
        return counter;
        }
        else if (param  == 0){
            return 1;
        }

        return -1;
    }
}
