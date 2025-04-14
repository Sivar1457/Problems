package First.Problems;

public class MergeSort {

    public void arrPrint(int [] arr){
        System.out.print("\n The final output : [ ");
        for ( int num : arr ) {
            System.out.print(num + " , ");
        }
        System.out.print(" ] ");
        System.out.println();
    }

    public void merge(int[] arr,int left , int mid , int right,String callerMethod,int iter) {
        System.out.println("\n"+"    ".repeat(iter)+"(Merging)  [Iteration - " + iter + " ] , Left index : " + left + " , Right index : " + right + " , Middle index : " + mid + " ------- Caller Method Name : " + callerMethod);
        int[] temp = new int[right-left+1] ;
        int i = left , j = mid + 1 , k = 0 ;
        while ( i <= mid && j <= right ) {
            if ( arr[i] < arr[j] ) {
                temp[k++] = arr[i++] ;
            }
            else {
                temp[k++] = arr[j++] ;
            }
        }
        while ( i <= mid ) {
            temp[k++] = arr[i++] ;
        }
        while ( j <= right ) {
            temp[k++] = arr[j++] ;
        }
        for ( i = 0 ; i < temp.length ; i++ ) {
            arr[left+i] = temp[i] ;
        }
    }

    public void separate(int[] arr,int left,int right,String callerMethod,int iter)  {
        System.out.println("\n"+"    ".repeat(iter)+"(Separating)  [Iteration - " + iter + " ] , Left index : " + left + " , Right index : " + right + " ------- Caller Method Name : " + callerMethod);
        if ( left < right ) {
            int mid = (left + right) / 2;
            separate(arr,left,mid,"separate",iter+1);
            separate(arr,mid+1,right,"separate",iter+1);
            merge(arr,left,mid,right,"separate",iter+1);
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int [] arr = {43, 12, 77, 5, 38, 91, 26, 84, 19, 60,
                3, 74, 52, 67, 9, 31, 21, 88, 45, 15};
        ms.separate(arr,0, arr.length-1,"Main",1);
        ms.arrPrint(arr);
    }

}
