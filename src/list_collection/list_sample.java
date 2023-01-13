package list_collection;

import java.util.ArrayList;
import java.util.Collections;

public class list_sample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add(1, "Grape");

        Collections.sort(myList);

        for(String fruit :myList)
            System.out.println(fruit);
    }
}
