package First.Problems;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    List<List<String>> result = new ArrayList<>();
    public void placeCoin(List<List<String>> board , int n , int row,int iter) {
        System.out.println("    ".repeat(iter)+"Iteration : "+(iter+1));
        System.out.println("    ".repeat(iter)+"--> PlaceCoin() method called by " + ((iter==0)?"solveNQueens" : "recursion of placeCoin method" ));
        for ( int i = 0 ; i < n ; i++ ) {
            if (checkSafe(board,n,row,i)) {
                board.get(row).set(i,"Q");
                showBoard(board,iter);
                if ( row == n-1 ) {
                    result.add(getBoard(board));
                    board.get(row).set(i,".");
                    System.out.println("\n"+"    ".repeat(iter)+"This formation is successfully worked !!!\n");
                    break;
                }
                placeCoin(board,n,row+1,iter+1) ;
                board.get(row).set(i,".");
                System.out.println("    ".repeat(iter+1)+"<-- Backtracking to Iteration " + (iter+1));
            }
        }
    }

    public boolean checkSafe(List<List<String>> board,int n , int row ,int col){
//      Vertical Check
        for ( int i = 0 ; i < n ; i++ ) {
            if ( board.get(i).get(col).equals("Q") ) {
                return false ;
            }
        }
//      Hoeizontal Check
        for ( int i = 0 ; i < n ; i++ ) {
            if ( board.get(row).get(i).equals("Q") ) {
                return false ;
            }
        }
//      Diagonal Check
        int[][] checkLst = new int[][]{{-1,-1},{-1,+1},{+1,-1},{+1,+1}};
        for ( int i = 0 ; i < 4 ; i++ ) {
            int newRow = row ;
            int newCol = col ;
            while ( newRow < n && newRow > -1 && newCol < n && newCol > -1 ) {
                if ( board.get(newRow).get(newCol).equals("Q") ) {
                    return false;
                }
                newRow += checkLst[i][0];
                newCol += checkLst[i][1];
            }
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        System.out.println("\n--> SolveNQueen Method is called by main");
        List<List<String>> board = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++ ) {
            List<String> innerBoard = new ArrayList<>();
            for ( int j = 0 ; j < n ; j++ ) {
                innerBoard.add(".");
            }
            board.add(innerBoard);
        }
        placeCoin(board,n,0,0);
        return board;
    }

    public void showBoard(List<List<String>> board,int iter) {
        for ( List<String> innerBoard : board ) {
            System.out.print("    ".repeat(iter)+" | ");
            for ( String place : innerBoard ) {
                System.out.print(place + " | ");
            }
            System.out.println();
        }
    }

    public List<String> getBoard(List<List<String>> board) {
        List<String> result = new ArrayList<>();
        for ( List<String> innerBoard : board ) {
            String row = "" ;
            for ( String place : innerBoard ) {
                row += place ;
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        NQueens use = new NQueens();
        System.out.println("Input : " + 5);
        List<List<String>> board = use.solveNQueens(5);
        System.out.println("\nOutput");
        for ( List<String> innerBoard : use.result ) {
            System.out.print(" | ");
            for ( String place : innerBoard ) {
                System.out.print(place + " | ");
            }
            System.out.println();
        }
    }

}
