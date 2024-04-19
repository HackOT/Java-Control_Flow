package ControlFlow;

public class Swithc {

    public static void main(String[] args) {

        System.out.println(man(1));

        System.out.println(getQuarter("january"));
    }
    public static String man(int value) {
        
    
        return switch (value) {
            case 1 -> String.format("The value is  %d ", value);
            case 2 -> "";
            default ->"Invalid Value"; 
        };
    }
    public static String getQuarter(String mounth){

        switch(mounth){

            case "january", "february", "march":
                return "1st";
            case "april", "may", "june" :
                return "2nd";
            case "july", "august", "september":
                return "3rd";
            case "october", "november", "december":
            return "4th";
        }
        return "Invalid Value";
    
}
}