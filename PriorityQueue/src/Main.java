import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(2.88);
        queue.offer(2.111);
        queue.offer(3.1);
        queue.offer(3.899);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}