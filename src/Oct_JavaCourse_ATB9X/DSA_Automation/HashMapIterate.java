package Oct_JavaCourse_ATB9X.DSA_Automation;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterate {

    public static void main(String[] args)
    {

        Map<String,Integer> map = new HashMap<>();
         map.put("id",1);
         map.put("id2",2);
         map.put("id3",3);
         map.put("id4",null);
         map.put("id5",null);
         map.put(null, 100);

        //System.out.println(map);

        //using iterate

        for(Map.Entry<String, Integer> item : map.entrySet())
        {
            System.out.println(item.getKey() +" ----> " +item.getValue());
        }







    }
}
