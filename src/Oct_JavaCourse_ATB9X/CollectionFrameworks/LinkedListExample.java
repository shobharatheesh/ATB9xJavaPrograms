package Oct_JavaCourse_ATB9X.CollectionFrameworks;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Horse");

        System.out.println("LinkedList: "+list);

        //add at first and last positions

        list.addFirst("Elephant");
        list.addLast("Tiger");
        list.remove(1);

        System.out.println("After adding First and Last: "+list);

    }
}
