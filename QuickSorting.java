public class QuickSorting {

    public static void quickSort( int[] tab, int left, int right){
        if (left<right){
            int q = partition(tab, left, right);
            quickSort(tab, left,q);
            quickSort(tab,q+1, right);
        }
    }

    public static int partition( int[] tab, int left, int right){
        int pivot = tab[left];
        int p = left -1;
        int q = right+1;
        while (p<q){
           do {
               p++;
           }
           while (tab[p]< pivot);
           do {
               q--;
           }
           while (tab[q]> pivot);
            if (p<q)
                Sorting.swap(tab,p,q);
        }
        return q;
    }
}
