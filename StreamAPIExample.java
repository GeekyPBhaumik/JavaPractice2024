import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {

        //map:Map method returns a new STREAM of elements
        List<String> list = Arrays.asList("Hello","Hi","Good Morning!");
        //list.stream().map(str->str.length()).forEach(System.out::println);

        //filter
        List<Integer> oddList = Arrays.asList(11,2,30,43,72,541);
        oddList.stream().filter(num->num%2!=0).forEach(System.out::println);

        //sorted
        List<Integer> list2 = oddList.stream().sorted().collect(Collectors.toList());
        for(int i:list2){
            System.out.print(i+" ");
        }
        //distinct
        List<Integer> l = Arrays.asList(100,1,33,100,77,45,1);
        l.stream().distinct().forEach(System.out::println);

        //Terminal Operations
        List<Integer> intList = Arrays.asList(2,4,6,8,10);
        Optional<Integer> sum = intList.stream().reduce((num1,num2)->num1+num2);
        if(sum.isPresent())
            System.out.println("Sum is:"+sum.get());
    }
}
