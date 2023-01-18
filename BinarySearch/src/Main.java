import java.util.Scanner;
import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {

        /**
         *  There is java inbuilt binary search function and also im going to implement my-own.
         */

        int[] numberArray = new int[75];

        for(int i=0; i<numberArray.length; ++i){
            numberArray[i] = i;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number that you want to find: ");
        int value = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        // there are two types of binary search in Collection and Array, in here i imported array binary search
        //int index = binarySearch(numberArray, value);
        int index = BinarySearch(numberArray, value); // hard coded binary search function
        if(index == -1){
            System.out.println("target value is not found");
        }else{
            System.out.println("target value is found in index : " + index);
        }

    }

    private static int BinarySearch(int[] array, int target){

        int low = 0;
        int high = array.length-1;

        while(low <= high){
            int middle = low + (high-low) / 2;
            int value = array[middle];

            if(target < value){
                high = middle-1;
            }else if(target > value){
                low = middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}