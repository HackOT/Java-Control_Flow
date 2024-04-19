package ControlFlow;

public class whileChallenge {

    public static void main(String[] args) {
        int sumodd = 0;
        int sumeven = 0;
        int counter=0;
        int sayi = 5;
        while(sayi < 21){
            
            if (counter == 5){
                break;
            }
            if(isEvenNumber(sayi)){
                System.out.println(sayi);
                sumeven +=sayi;
                counter++;
            }
            else{
                sumodd +=sayi;
            }

        sayi++;
        }
        System.out.println("total of odds " + sumodd);
        System.out.println("total of evens " + sumeven);
    }
    public static boolean isEvenNumber(int number){

        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}