package Oct_JavaCourse_ATB9X.DSA_Automation;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args)
    {

        //create a Hashmap -hashmap is a key value pair

        HashMap<Integer, String> map = new HashMap<>();

        //add key - value pairs

        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");

        //Display the Hashmap

        System.out.println("Display HashMap : " +map);

        //Access the value of its key

        System.out.println("Value of key 2 : "+map.get(2));

        //Remove an entry of its key

        System.out.println("Remove the key 3: "+map.remove(3));
        System.out.println("After removing the key 3: "+map);

        //Iterate through the HaspMap

        System.out.println("Iterating Through HasMap: ");

        for(Integer key : map.keySet())
        {
            System.out.println("Key: "+key + " , " + "Value: "+map.get(key));
        }



















    }
}
