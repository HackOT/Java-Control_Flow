package ControlFlow;

import java.util.Scanner;

import method_challenge.LeapYear;
public class NumberOfDaysInMonth {
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int input = scan.nextInt();
        int input1 = scan1.nextInt();
        System.out.println(getDaysInMonth(input, input1));
        
        scan.close();
        scan1.close();
    }

    public static int getDaysInMonth(int month, int year){
        
        if ((month >= 1 && month <= 12) && (year >= 1 && year <=9999)){
        
            switch(month){
                case 1:
                    return 31;
                case 2:
                    if (LeapYear.isLeapYear(year)){
                        return 29;
                    }
                    else{
                        return 28;
                    }
                    
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;
            }
        }
        else{
            
            return -1;
        }
        
    }
}