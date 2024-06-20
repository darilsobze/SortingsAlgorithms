import java.util.Arrays;

public class Main {

    public static void main( String[] args){
        System.out.println("Hello World !!!");
        System.out.println("There are a lot of Sorting's Algorithms");
        int[] array = new int[]{30,12,20,9,15};
        SelectionSorting.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
