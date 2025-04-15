package First.Problems;

import java.util.*;
import java.util.stream.Collectors;

public class WordSearch {
    int[][] addInd = {{1,0},{0,1},{-1,0},{0,-1}};
    Set<List<Integer>> prevInds = new HashSet<>();

    public boolean checkWithIndex(char[][] board , String word , List<Integer> curIndex,int iter) {
//        if (word.isEmpty()) {
//            return true ;
//        }
//        int row = board.length;
//        int col = board[0].length ;
//        for ( int i = 0 ; i < 4 ; i++ ) {
//            List<Integer> nextInd = new ArrayList<>();
////            int[] nextInd = new int[2];
//            nextInd.add(curIndex.get(0) + addInd[i][0]);
//            nextInd.add(curIndex.get(1) + addInd[i][1]);
//            if ( nextInd.get(0) > row || nextInd.get(0) < 0 || nextInd.get(1) > col || nextInd.get(1) < 0 ) continue;
//            if (!prevInds.contains(nextInd)) {
//                System.out.println(nextInd + " --- " + prevInds);
//                prevInds.add(nextInd);
//                char ch = ( nextInd.get(0) < 0 || nextInd.get(1) < 0 || nextInd.get(0) >= board.length || nextInd.get(1) >= board[0].length ) ? ' ' : board[nextInd.get(0)][nextInd.get(1)];
//                if ( ch == word.charAt(0) ) {
//                    if (word.length() == 1) {
//                        return true;
//                    }
//                    boolean cond = checkWithIndex(board, word.substring(1), nextInd);
//                    if (cond) return true;
//                }
//            }
//        }
        if ( word.isEmpty() ) {
            return true;
        }
        int boardRow = board.length-1;
        int boardCol = board[0].length-1;
        for ( int i = 0 ; i < 4 ; i++ ) {
            int row = curIndex.get(0)+addInd[i][0];
            int col = curIndex.get(1)+addInd[i][1];
            if ( row > boardRow || row < 0 || col > boardCol || col < 0 ) continue;
            System.out.println("    ".repeat(iter) + " Iteration : " + (iter+1) );
            System.out.println("    ".repeat(iter+1) +" Current char : " + board[row][col] + " [ " + row + " , " + col + " ] " + " , Expected char : " + word.charAt(0));
            if ( board[row][col] == word.charAt(0) ) {
                List<Integer> tempInd = new ArrayList<>();
                tempInd.add(row);
                tempInd.add(col);
                if ( prevInds.contains(tempInd) ) {
                    continue;
                }
                prevInds.add(tempInd);
//                System.out.println( "    ".repeat(iter) + curIndex + "   Next - " + tempInd + "   " + prevInds);
                if ( word.length() == 1 ) {
                    System.out.println("    ".repeat(iter+1)+" The final Index found !!!");
                    return true;
                }
                if (checkWithIndex(board,word.substring(1),tempInd,iter+1)) {
                    return true;
                }
                else {
                    System.out.println("    ".repeat(iter+1)+" Backtracking... to Iteration - " + (iter+1));
                    prevInds.remove(tempInd);
                }
            }
        }
        return false;
    }

    public boolean exist(char[][] board, String word,int iter) {
        for ( int i = 0 ; i < board.length ; i++ ) {
            for ( int j = 0 ; j < board[0].length ; j++ ) {
                if ( board[i][j] == word.charAt(0) ) {
                    List<Integer> current = new ArrayList<>();
                    current.add(i);
                    current.add(j);
                    prevInds.add(current);
                    System.out.println("    ".repeat(iter) + " Iteration : " + (iter+1) );
                    System.out.println("    ".repeat(iter+1) + " Current char : " + board[i][j] + " [ " + i + " , " + j + " ] " + " , Expected char : " + word.charAt(0)+"\n");
                    boolean result = checkWithIndex(board,word.substring(1),current,iter+1);
                    if ( result ) {
                        return true;
                    }
                    else {
                        System.out.println("    ".repeat(iter+1)+" Backtracking... to Iteration - " + (iter+1));
                        prevInds.remove(current);
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] prev = new int[0];
        String word = "hello" ;
        char[][] board = {
//                {'A', 'B', 'C', 'D'},
//                {'S', 'A', 'A', 'T'},
//                {'A', 'C', 'A', 'E'}
//        };
//                {'a','a','a','a'},
//                {'a','a','a','a'},
//                {'a','a','a','a'},
//                {'a','b'},
//                {'c','d'}
                {'C','A','A'}, // { {0,0} , {0,1} , {0,2} } ,
                {'A','A','A'}, // { {1,0} , {1,1} , {1,2} } ,
                {'B','C','D'}  // { {2,0} , {2,1} , {2,2} }
        } ;
        word = "AAB" ;
        System.out.println("Input : ");
        System.out.print("    Board : ");
        System.out.println("{");
        for (char[] tempArr : board) {
            System.out.print("              { " + tempArr[0]);
            for ( int i = 1 ; i < tempArr.length ; i++ ) {
                System.out.print(" , " + tempArr[i]);
            }
            System.out.print(" } ,\n");
        }
        System.out.println("            }");
        System.out.println("\n    Word : " + word);
        WordSearch use = new WordSearch();
        System.out.println("\nOutput : \n");
        System.out.println(use.exist(board,word,0));
    }
}
