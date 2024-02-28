import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     int testArray[] = randomGen(4);
     sortIntegers(testArray);
    }

    private static int[] sortIntegers(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){ //porownanie biezacego elementu z 2 elementem
                    temp = sortedArray[i]; //zapamietanie biezacego elementu
                    sortedArray[i] = sortedArray[i+1]; //wartość następnego elementu jest przypisywana do bieżącego elementu.
                    sortedArray[i+1] = temp; //Wartość bieżącego elementu  jest przypisywana do następnego elementu
                    System.out.println("-->" + Arrays.toString(sortedArray));
                    flag = true;
                }
            }

        }
        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }

    public static int[] randomGen(int numbers){
        Random random = new Random();
        int[] randomNumbers = new int[numbers];

        for(int i=0; i<numbers; i++){
            randomNumbers[i] = random.nextInt(100);
        }

        return randomNumbers;
    }
}