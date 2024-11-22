package Oct_JavaCourse_ATB9X.DSA_Automation;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

    public static void main(String[] args)
    {

        Map<String,Integer> map = new HashMap();

        map.put("id",1);
        map.put("id",2); //duplicate key not allowed , its takes the latest value
        map.put("id1",3);
        map.put("id2",4);
        map.put("id3",5);
        map.put("id4",5); //duplicate value is allowed
        map.put("null",null); //null is allowed for kry and value


        System.out.println(map);  //display the key -values in hashmap format (flower braces)
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(5));
        System.out.println(map.containsValue(8));

        System.out.println(map.keySet()); //displays the key in array format(square braces)
        System.out.println(map.values()); //displays the values in array format

        System.out.println(map.get("id3"));








    }
}
