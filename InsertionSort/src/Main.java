public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int numberArray[] = {12,2,56,3,45,676,3,764,23};

        for(int i=1; i<numberArray.length; ++i){
            int temp = numberArray[i];
            int j = i-1;

            while(j>=0 && numberArray[j] > temp){
                numberArray[j+1] = numberArray[j];
                j--;
            }
            numberArray[j+1] = temp;
        }

        System.out.println("done: ");
        for(int i : numberArray){
            System.out.print(i + " ");
        }
    }
}