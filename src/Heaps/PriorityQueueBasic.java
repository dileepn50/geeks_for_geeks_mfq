package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueBasic {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new MyComparator());

        queue.add(new Student("dileep", 5));
        queue.add(new Student("pradeep", 3));
        queue.add(new Student("lohith", 4));

        while (queue.size() != 0)
            System.out.println(queue.poll().name);
    }

}

class MyComparator implements Comparator<Student>
{
    @Override
    public int compare(Student x, Student y) {
        return y.priority - x.priority;
    }
}

class Student {
    String name;
    int priority;

    Student(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}