import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /**
         *      QUEUE is FIFO data structure
         *      in java,
         *          like Stack, there are no class
         *          has Queue interface extends from the Collection.
         *
         *          offer()
         *          poll()
         *          peek()
         */

        Queue<String> carQueue = new LinkedList<String>();

        carQueue.offer("Lamborghini");
        carQueue.offer("Ferrari");
        carQueue.offer("Maserati");
        carQueue.offer("Porsche");

        System.out.println(carQueue);
        String removedCar = carQueue.poll();

        System.out.println(carQueue);
        System.out.println("peek is: "+carQueue.peek());
        System.out.println("removed car: "+removedCar);

    }
}