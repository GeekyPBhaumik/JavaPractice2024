package AnonymousClass;

interface Helper{
    void walk();
}

public class AnonymousClassPractice {
    public static void main(String[] args) {
        Helper help = new Helper(){
            @Override
            public void walk(){
                System.out.println("Walking is Good");
            }
        };
        help.walk();
    }
}
