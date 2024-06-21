import java.util.Arrays;
import java.util.Queue;

public class Main {

    public static void main( String[] args){
        System.out.println("Hello World !!!");
        System.out.println("There are a lot of Sorting's Algorithms");
        int[] array = new int[]{30,12,20,9,15,17,58,47,77,1,3};
        //SelectionSorting.selectionSort(array);
        //MergeSorting.mergeSort(array,0,10);
        QuickSorting.quickSort(array,0,10);
        System.out.println(Arrays.toString(array));
    }
}
