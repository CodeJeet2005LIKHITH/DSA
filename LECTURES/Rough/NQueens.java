//package LECTURES.Rough;
//
//public class NQueens {
//    public static void main(String[] args) {
//
//    }
//    private static int Nqueens(boolean[][]board,int row){
//        if(row == board.length){
//            display(board);
//
//        }
//        int count=0;
////        placing the queen and checking for every row and colum
//        for(int col=0; col < board.length;col++){
//
//            if(isSafe(board , row, col)){
//                board[row][col] = true;
//                count += Nqueens(board,row+1);
//                board[row][col] = false;
//            }
//        }
//        return count;
//    }
//
//    private static boolean isSafe(boolean[][] board, int row, int col) {
//        /*check vertical row*/
//        for(int i=0;  i < row; i++){
//
//        }
//    }
//
//    private static void display(boolean[][]board){
//        for(boolean[]row : board){
//            for(boolean element: row){
//                if(element){
//                    System.out.print("Q");
//                }
//                else{
//                    System.out.print("X");
//                }
//            }
//        }
//    }
//}
