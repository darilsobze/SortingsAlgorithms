public class InsertionSorting {

    public static void insertionSort( int[] tab){
        for (int i=1; i<= tab.length-1; i++){
            int key = tab[i];
            int j= i-1;
            while(j>=0 && tab[j]> key){
                tab[j+1] = tab[j];
                j--;
            }
            tab[j+1]=key;
        }
    }
}
