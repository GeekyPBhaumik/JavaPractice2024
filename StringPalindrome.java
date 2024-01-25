import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr+= str.charAt(i);
        }
        System.out.println(revStr);
        if(str.equalsIgnoreCase(revStr)){
            System.out.println("Yes, it is palindrome");
        }else{
            System.out.println("No, it not a palindrome");
        }
    }
}
