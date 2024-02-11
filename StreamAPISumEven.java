//Given a list of integers, find the sum of all the even numbers in the list.

import java.util.Arrays;
import java.util.List;

public class StreamAPISumEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,1,5,54,20);
        int sumOfEven = list.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        int sumOfEven2 = list.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfEven);
        System.out.println(sumOfEven2);
    }
}
