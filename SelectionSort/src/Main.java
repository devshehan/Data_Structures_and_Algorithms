public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int numberArray[] = {12,34,2,123,45,24,56,4,246,78,87,68};

        for(int i = 0; i < numberArray.length; ++i){
            int min = i;
            for(int j = i+1; j< numberArray.length; ++j) {
                if (numberArray[j] <= numberArray[min]) {
                    min = j;
                }
            }
            int temp = numberArray[i];
            numberArray[i] = numberArray[min];
            numberArray[min] = temp;
        }

        System.out.println("Selection sort is done: ");
        for(int i : numberArray){
            System.out.print(i + " ");
        }
    }
}