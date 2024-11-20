package Oct_JavaCourse_ATB9X.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterateRemove {

    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>(); //Generic Integer to specify type of elements

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        System.out.println("Original List: "+num);

        //use an iterator to remove elements

        Iterator<Integer> iterator= num.iterator();

        while(iterator.hasNext())
        {
           if(iterator.next() >20)
           {
               iterator.remove();
           }
        }

        System.out.println("List after removal: "+num);






    }
}
