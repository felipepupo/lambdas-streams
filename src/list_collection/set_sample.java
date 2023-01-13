package list_collection;

import java.util.HashSet;

public class set_sample {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Grape");
        mySet.add("Orange");
        mySet.add("Grape");

        HashSet<String> newSet = new HashSet<>(mySet);
        newSet.add("Watermelon");

        for (String fruit : newSet)
            System.out.println(fruit);
    }
}
