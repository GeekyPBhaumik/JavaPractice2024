package StreamAPIDemo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StreamAPIPractices {

    public static void main(String[] args) {
        //Filtering : Create a stream of integers from 1 to 10 and filter out odd numbers.
        List<Integer> list = Arrays.asList(10,12,3,40,17,21);
        list.stream().filter(num->num%2!=0).forEach(y->System.out.print(y+" "));

        System.out.println();

        //Create a list of strings and convert each string to uppercase using a stream.
        List<String> arrList = Arrays.asList("java","Spring Boot","c");
        arrList.stream().map(str->str.toUpperCase()).forEach(y-> System.out.print(y+" "));

        System.out.println();

        //Create a stream of integers and calculate the sum of all elements.
        List<Integer> numbers = Arrays.asList(12,1,10,5,23);
        int sum = numbers.stream().reduce(0,(ans,i)->ans+i);
        System.out.println("Sum:"+sum);

        //Create a stream of strings and sort them in natural order.
        List<String> listStr = Arrays.asList("String1","String0","String2","String3");
        listStr.stream().sorted(Comparator.reverseOrder()).forEach(y-> System.out.print(y+" "));

        System.out.println();

        //Create a list of integers, filter out even numbers, square each number, and then calculate the sum of squared numbers.
        List<Integer> evenList = Arrays.asList(2,10,3,4,11,88);
        int filteredSum = evenList.stream().filter(num->num%2==0)
                         .map(num->num*num)
                         .reduce(0,(ans,i)->ans+i);
        System.out.println(filteredSum);

        //Create a list of Person objects with name and age properties.
        // Group the persons by age into a Map<Integer, List<Person>>.
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Person1",43));
        personsList.add(new Person("Person2",12));
        personsList.add(new Person("Person9",34));
        personsList.add(new Person("Person4",45));
        Map<Integer,List<Person>> map = personsList.stream()
                                        .collect(Collectors.groupingBy(Person::getAge));
        for(Integer key:map.keySet()){
            List<Person> persons = map.get(key);
            for(Person person:persons){
                System.out.println(person.getName()+":"+person.getAge());
            }
        }
    }
}
