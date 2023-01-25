public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int numberArray[] = {11,23,1,45,242,43,90,22,89};

        for(int i=0; i<numberArray.length-1; ++i){
            for(int j=i+1; j<numberArray.length; ++j){
                if(numberArray[j] < numberArray[i]){
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[i];
                    numberArray[i] = temp;
                }
            }
        }

        System.out.println("sorted number array: ");

        for(int i : numberArray){
            System.out.print(i + " ");
        }

    }
}