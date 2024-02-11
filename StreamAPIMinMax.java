import java.util.ArrayList;
import java.util.List;

//Given a list of integers, find the maximum and minimum values.
public class StreamAPIMinMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(10);
        list.add(45);
        list.add(90);
        int min = list.stream().sorted().findFirst().get();
        int max = list.stream().max(Integer::compareTo).get();
        System.out.println("Minimum value is:"+min);
        System.out.println("Maximum value is:"+max);
    }
}
