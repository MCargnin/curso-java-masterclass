import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array){
        int aux = 0;
        System.out.println("Array = " + Arrays.toString(array));
        for(int i = 0; i<array.length/2; i++){
            aux = array [i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = aux;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}