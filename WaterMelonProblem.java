import java.util.Scanner;

public class WaterMelonProblem {
    static void weightDistribution(int W){
        if(W%2!=0){
            System.out.println("The weight " + W + " cannot be divided into 2 even parts");
        }else if(W==2){
            System.out.println("The weight " + W + " can be divided into 1 & 1");
        }else{
            for(int i=2;i<=W/2;i=i+2){
                int diff = W-i;//i=2,diff=10
                if(diff>0 && diff%2==0){
                    System.out.println("Hence the weight can be divided into "+diff+" and "+i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        weightDistribution(W);
    }
}
