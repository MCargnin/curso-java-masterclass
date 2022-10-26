import java.util.Scanner;

public class SortedArray {
    private static int[] array = new int[5];
    private static Scanner scanner; // = new Scanner(System.in);

    public static int[] getIntegers(int size){
        array = new int[size];
        scanner = new Scanner(System.in);
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array){
        int aux = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                if(array[i] > array[j]){
                    aux = array [i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public static void printArray (int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}