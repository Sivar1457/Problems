package First;
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

    public int binarySearch(int[] arr , int num , int startInd , int endInd) {
        System.out.println();
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
        return binarySearch(arr,num,startInd,endInd);
    }

    public static void main(String[] args) {
        BinarySearch use = new BinarySearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        use.binarySearch(arr,8);
        System.out.println(use.binarySearch(arr,8,0,arr.length-1));
    }
}
