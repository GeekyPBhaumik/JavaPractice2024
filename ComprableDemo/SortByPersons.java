package ComprableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person>{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}

class Task{
    String task;
    int priority;

    Task(String task,int priority){
        this.task = task;
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getPriority(){
        return priority;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", priority=" + priority +
                '}';
    }
}
public class SortByPersons {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Pushpan",25));
        personList.add(new Person("Satyaki",24));
        personList.add(new Person("Surjayan",26));

        //Using Comparable, we can provide a particular sorting sequence
        //But we can even change it using Comparator
        //sort method has a comparator parameter but no comparable parameter
        Collections.sort(personList, Comparator.comparing(Person::getAge).reversed());
        for (Person person:personList){
            System.out.println("Name:"+person.getName());
        }
        //We can even use Comparator directly when we are not using Comparable
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(new Task("task1",2));
        taskList.add(new Task("task20",3));
        taskList.add(new Task("task4",1));

        Collections.sort(taskList,Comparator.comparing(Task::getPriority));
        for(Task task:taskList){
            System.out.println(task.toString());
        }

    }
}
