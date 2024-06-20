public class MergeSorting {
    public static void mergeSort( int[] tab, int start, int end){
        if (start< end){
            int middle = (start+end)/2;
            mergeSort(tab,start,middle);
            mergeSort(tab,middle+1,end);
            merge(tab,start,middle,end);
        }
    }

    public static void merge(int[] tab,int start,int middle, int end){
        // define the length of both Arrays
        int n1 = middle-start+1;
        int n2 = end-middle;
        // create the both Arrays left and right
        int[] tabLeft = new int[n1+1];
        int[] tabRight = new int[n2+1];
        //Arrays ausfüllen
        for (int i=0; i<n1;i++){
            tabLeft[i] = tab[start+i];
        }
        for (int j=0; j<n2; j++){
            tabRight[j]= tab[middle+j+1];
        }
        tabLeft[n1]=Integer.MAX_VALUE;
        tabRight[n2]=Integer.MAX_VALUE;
        //merge the both Arrays
        int i=0;
        int j=0;
        for (int k=start; k<=end; k++){
            if (tabLeft[i]<tabRight[j]){
                tab[k]= tabLeft[i];
                i++;
            }
            else{
                tab[k]= tabRight[j];
                j++;
            }
        }


    }
}
