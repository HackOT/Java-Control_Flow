package ControlFlow;

public class dayOfWeek {
      public static void main(String[] args) {
         for(int var = 0; var < 10; ++var) {
            printDayOfWeek(var);
      }
   }

   public static void printDayOfWeek(int var) {
      switch (var) {
         case 0:
            System.out.print("Sunday");
            break;
         case 1:
            System.out.print("Monday");
            break;
         case 2:
            System.out.print("Tuesday");
            break;
         case 3:
            System.out.print("Wednesday");
            break;
         case 4:
            System.out.print("Thursday");
            break;
         case 5:
            System.out.print(var + " is stands for Friday");
            break;
         case 6:
            System.out.print("Saturday");
            break;
         default:
            System.out.print("Invalid Day");
            break;
         
      }
      System.out.println();

   }

}

