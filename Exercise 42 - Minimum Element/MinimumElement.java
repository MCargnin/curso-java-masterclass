import java.util.Scanner;

public class MinimumElement {
    //private int size;
    private static Scanner scanner;
    private static int[] array;

    private static int readInteger(){
        //reads integer
        int size;
        scanner = new Scanner(System.in);
        size = scanner.nextInt();
        return size;
    }

    private static int[] readElements(int size){
        //reads integer
        array = new int[size];
        scanner = new Scanner(System.in);
        for(int i = 0; i<size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}