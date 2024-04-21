package DefaultStaticJava8;

interface Operation{
    default int subtract(int num1,int num2){
        return num1-num2;
    }
}
public class Default implements Operation{
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 24;

        Default subtract = new Default();
        int subtraction=subtract.subtract(num2,num1);
        System.out.println("Subtraction of "+num2+" and "+num1+" is "+Math.abs(num2-num1));
    }
}
