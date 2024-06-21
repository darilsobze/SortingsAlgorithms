public class BubbleSorting {
    public static void bubbleSort( int[] tab){
        for (int i=0; i<= tab.length-1; i++){
            for (int j=tab.length-1; j>=i+1; j--){
                if (tab[j]< tab[j-1]){
                    Sorting.swap(tab,j,j-1);
                }
            }
        }
    }
}
