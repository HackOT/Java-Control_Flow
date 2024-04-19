package ControlFlow;

import java.util.Scanner;

public class SwitchChallenge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char letter = scan.next().charAt(0);
        
        System.out.println(NATOWord(letter));
        
        scan.close();
    }

    public static String NATOWord(char letter){

        switch(Character.toLowerCase(letter)){
            
            case 'a':
                return "Able";
            
            case 'b':
                return "Baker";
            
            case 'c':
                return "Charlie";
            
            case 'd':
                return "Dog";
            
            case 'e':
                return "Easy";


        }
        return "Please enter between A-Z (Both inclusive)";
    }
}
