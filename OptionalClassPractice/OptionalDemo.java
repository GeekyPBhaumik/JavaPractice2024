package OptionalClassPractice;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //of method throws a Null Pointer Exception in such case
        //But ofNullable method throws null in such case
        Optional<String> optional = Optional.ofNullable(null);
        if(optional.isPresent()){
            System.out.print(optional.get());
        }
        //Printing a Default Value using OrElse
        String value = optional.orElse("It's Empty");
        System.out.println(value);
    }
}
