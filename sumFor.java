package ControlFlow;

public class sumFor {

    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i=1; counter<6 && i<1001; i++){
            if (i % 3 == 0 && i % 5 == 0){
                sum +=i;
            System.out.print(i + " ");
            counter++;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
    
}
