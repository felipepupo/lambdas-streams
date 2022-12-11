package list_collection;

import java.util.LinkedList;

public class linkedlist_sample {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("C");
        myList.add("A");
        myList.add("Z");
        myList.addFirst("I");

        // removes the head (first element) of this list.
        myList.remove();

        for (String s : myList)
            System.out.println(s);
    }
}
