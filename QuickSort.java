package First.Problems;

public class QuickSort {

    public void arrange(int [] arr,int pivotInd) {
        int k = -1 ;
        int pivot = arr[pivotInd] ;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( arr[i] < pivot ) {
                if ( i == 0 ){
                }
                else {
                    k++;
                    int value = arr[k];
                    arr[k] = arr[i];
                    arr[i] = value ;
                }
            }
        }
        k++;
        int value = arr[k];
        arr[k] = arr[pivotInd];
        arr[pivotInd] = value ;
        System.out.println(k);
    }

    public void arrange( int[] arr , int start , int end,int iter ) {
        System.out.print("    ".repeat(iter));
        arrPrint(arr,"current");
        System.out.println("    ".repeat(iter) + "Iteration : " + (iter+1) + " , start - " + start + " end - " + end);
        int k = start ;
        int pivot = arr[end];
        for ( int i = start ; i < end; i++ ) {
            if ( arr[i] < pivot ) {
                int temp = arr[k] ;
                arr[k] = arr[i] ;
                arr[i] = temp ;
                k++ ;
            }
        }
        int value = arr[k];
        arr[k] = arr[end];
        arr[end] = value ;

        if ( start == end ) return;
        if ( start+1 == end ) return;

        arrange(arr,start,(k-1>start) ? k -1 : k,iter+1);
        arrange( arr , (k+1 < arr.length-1 && k+1 < end) ? k+1 : k , end,iter+1 );
    }

    public void arrPrint(int [] arr,String type){
        System.out.print("The "+type+" : [ ");
        for ( int num : arr ) {
            System.out.print(num + " , ");
        }
        System.out.print(" ] ");
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {43, 12, 77, 5, 38, 91, 26, 84, 19, 60,
                3, 74, 52, 67, 9, 31, 21, 88, 45, 15};
        QuickSort use = new QuickSort();
        System.out.println();
        use.arrPrint(arr,"input");
        System.out.println();
//        arr = new int[] {6, 3, 9, 5, 2, 8};
//        use.arrPrint(arr);
//        use.arrange(arr,arr.length-1);
//        use.arrPrint(arr);
//        use.arrange(arr,3);
//        use.arrPrint(arr);
        use.arrange(arr,0,arr.length-1,0);
        use.arrPrint(arr,"output");
    }

}
