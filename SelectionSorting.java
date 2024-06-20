public class SelectionSorting {

    public static void selectionSort(int[] tab){
        for (int i=0; i<tab.length-1; i++){
            int iMin =i;
            for (int j=i+1; j<=tab.length-1; j++){
                if (tab[j]< tab[iMin])
                    iMin=j;
            }
            Sorting.swap( tab,iMin,i);
        }
    }
}
