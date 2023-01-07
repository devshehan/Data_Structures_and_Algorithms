import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        /**
         *  Stack - LIFO data structure
         *  Last In First Out
         * <p>
         *  usage:
         *      undo/redo process in text editors and computers.
         *      back tracking.
         *      web browser moving forward and backward.
         */

        Stack<String> nameStack = new Stack<>();

//        System.out.println(nameStack.empty());

        nameStack.push("Dinusha");
        nameStack.push("Heshan");
        nameStack.push("Shehan");
        nameStack.push("Avishka");

//        System.out.println(nameStack.empty());
//        nameStack.pop();
//        System.out.println(nameStack.search("Heshan"));
//        System.out.println(nameStack.peek());


        System.out.println(nameStack);


    }
}