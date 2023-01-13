package list_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashMap_sample {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("CN", "China");
        myMap.put("US", "Unite States");
        myMap.put("BR", "Brazil");

        for (Map.Entry<String, String> map : myMap.entrySet())
            System.out.println(map.getKey() + " : " + map.getValue());

    }
}
