package ControlFlow;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 20));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        
        if(bigCount >= 0 && smallCount >= 0 && goal >= 0){
            
            if((5*bigCount) + smallCount >= goal){
                if (bigCount == 0){
                    return smallCount >= goal;
                }
                else if(smallCount == 0){
                    return (goal % 5 == 0) && (bigCount >= 0);
                }
                else{
                    for (int i =1; i <= bigCount; i++){
                        for(int j=1; j<= smallCount; j++){
                            if (5*i+j == goal){
                                return true;
                            }
                        }
                    }
                    return false;
                }
        }
            return false;
    }
        return false;
}
}
