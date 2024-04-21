package StreamAPIDemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIPracticesLevel2 {
    public static void main(String[] args) {
        //Create a list of strings where each string contains multiple words separated by spaces.
        //Use flatMap to create a stream of individual words.
        List<String> arrList = Arrays.asList("Hello World","Print Hello","Think Construct");
        arrList.stream().flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(str-> System.out.print(str+" "));

        System.out.println();

        //Create two streams of integers and merge them into a single stream.
        List<Integer> listEven = Arrays.asList(2,4,6,10);
        List<Integer> listOdd = Arrays.asList(11,13,7,5);
        Stream<Integer> stream = Stream.concat(listEven.stream(),listOdd.stream());
        List<Integer> totalList = stream.collect(Collectors.toList());
        for(Integer e:totalList){
            System.out.println("Element:"+e);
        }

        System.out.println();

        //Create a stream of integers with duplicate elements and obtain a stream with distinct elements only.
        List<Integer> listInt = Arrays.asList(12,12,12,13);
        listInt.stream().distinct().forEach(y-> System.out.print(y+" "));

        System.out.println();

        //Parallel Streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredParallel = numbers.parallelStream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println("Parallel stream result: " + squaredParallel);

        //Calculating the Max
        List<Integer> list = Arrays.asList(23,12,4,56,10);
        int max = Collections.max(list);
        System.out.println(max);

        //Another way of calculating the max
        int maxE = list.stream().sorted(Collections.reverseOrder())
                                .findFirst()
                                .get();
        System.out.println(maxE);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        Iterator<String> itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
