//Given a list of strings, find and print the strings that start with the letter 'a'.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIStartsWith {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("air India","air ","boat","coffee","aeroplane");
        list = list.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        System.out.println(list);
    }
}
