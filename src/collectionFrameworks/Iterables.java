package collectionFrameworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Iterables {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);

        list2.remove(Integer.valueOf(3));
        System.out.println(list2);

        List<Student> list3 = new ArrayList<>();
        list3.add(new Student("dev", 20));
        list3.add(new Student("Rishi", 22));
        System.out.println(list3);

    }
}
class Student{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
