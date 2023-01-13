package list_collection;

import java.util.LinkedList;
import java.util.Queue;

public class queue_sample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Grape");

        queue.poll();

        System.out.println(queue.peek());
    }
}
