import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(smallest(array));
        System.out.println(indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 0));
        System.out.println(indexOfSmallestFrom(array, 1));
        System.out.println(indexOfSmallestFrom(array, 2));
        sort(array);
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] integerArray) {
        int smallest = integerArray[0];
        for (int i : integerArray) {
            if (i < smallest) {
                smallest = i;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] integerArray) {
        int idxSmallest = 0;
        int smallest = integerArray[0];
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] < smallest) {
                smallest = integerArray[i];
                idxSmallest = i;
            }
        }
        
        return idxSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int idxSmallest = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                idxSmallest = i;
            }
        }
        
        return idxSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
