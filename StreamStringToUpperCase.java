//Given a list of strings, convert all the strings to uppercase.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","pineapple","grapes");
        list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        //converting Stream object to List
        list = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);
    }
}
