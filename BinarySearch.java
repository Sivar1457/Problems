package First.Problems;

public class BinarySearch {
    public int binarySearch(int[] arr , int num) {
        int right = arr.length-1;
        int left = 0;
        int mid = (left+right)/2;
        while ( arr[mid] != num ) {
            if ( right < left ) {
                mid = -1;
                break;
            }
            if ( arr[mid] > num ) {
                right = mid-1 ;
            }
            else {
                left = mid+1;
            }
            mid=(right+left)/2;
        }
        System.out.println(mid);
        return -1;
    }

    public int binarySearch(int[] arr , int num , int startInd , int endInd,int iter , String callerName) {
        System.out.println( "    ".repeat(iter-1) + "Iteration " + iter + " : Start Index - " + startInd + " , End Index - " + endInd + " ------ Caller Method : " + callerName);
        if ( endInd < startInd ) {
            return -1;
        }
        int mid = ( startInd + endInd ) / 2 ;
        if ( arr[mid] == num ) {
            return mid ;
        }
        else if ( arr[mid] > num ) {
            endInd = mid - 1 ;
        }
        else {
            startInd = mid + 1 ;
        }
        iter ++;
        return binarySearch(arr,num,startInd,endInd,iter,"Binary Search");
    }

    public void arrPrint(int [] arr,String type){
        System.out.print("\n The "+type+" : [ ");
        for ( int num : arr ) {
            System.out.print(num + " , ");
        }
        System.out.print(" ] ");
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearch use = new BinarySearch();
        int[] arr = {5, 8, 12, 16, 23, 25, 30, 34, 39, 42, 49, 57, 61, 68, 73, 77, 86, 89, 95, 99} ;
        use.arrPrint(arr,"input");
//        use.binarySearch(arr,8);
        System.out.println();
        System.out.println("\nThe final index or output : " + use.binarySearch(arr,16,0,arr.length-1,1,"Main"));
    }
}
