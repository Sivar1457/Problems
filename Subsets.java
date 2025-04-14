package First.Problems;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public void separate(int[] arr,List<Integer> current , List<List<Integer>> result , int index , int iter ) {
        System.out.print("    ".repeat(iter) + "Iteration : " + (iter+1) + " -- ");
        arrPrint(current);
        if ( index == arr.length ) {
            result.add(current) ;
            return;
        }
        List<Integer> nextCurrent = new ArrayList<>(current);
        current.add(arr[index]);
        separate(arr,current,result,index+1,iter+1);
        separate(arr,nextCurrent,result,index+1,iter+1);
    }

    public static void main(String[] args) {
        Solution use = new Solution();
        int[] arr = {1,2,3,4};
        List<List<Integer>> result = new ArrayList<>();
        use.separate(arr,new ArrayList<>(),result,0,0);
        System.out.println("\n\nResult Array : ");
        System.out.println("[");
        for ( List<Integer> lst : result ) {
            use.arrPrint(lst);
        }
        System.out.println("]");
    }

    public void arrPrint(List<Integer> arr) {
        System.out.print("  [ ");
        for ( int i = 0 ; i < arr.size()-1 ; i++ ) {
            System.out.print(arr.get(i) + " , ");
        }
        System.out.print((!arr.isEmpty()) ? arr.getLast() : "");
        System.out.print("  ]\n");
    }
}

