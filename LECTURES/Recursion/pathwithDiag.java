package LECTURES.Recursion;

import java.util.ArrayList;

public class pathwithDiag {
    public static void main(String[] args) {
        pathwithdiag(3, 3, 3, "");
        
        System.out.println(pathwithdiaglist(3, 3, 3, ""));
    }
    private static void pathwithdiag(int row,int col,int diag,String Path){
        if(row == 1 && col == 1){
            System.out.print(" "+Path);
            return;
        }
        if(row > 1){
            pathwithdiag(row-1, col,diag, Path+"V");
        }
        if(col > 1){
            pathwithdiag(row, col-1,diag, Path+"H");
        }
        if(col > 1 && row > 1){
            pathwithdiag(row-1, col-1,diag, Path+"D");
        }
    }
    // using ArrayList
    private static ArrayList<String> pathwithdiaglist(int row,int col,int diag,String Path){
        
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(Path);
            return list;
    }
        ArrayList<String> list = new ArrayList<>();
        if(col > 1){
            list.addAll(pathwithdiaglist(row, col-1,diag, Path+"H"));
        }
        if(row > 1){
            list.addAll(pathwithdiaglist(row-1, col,diag, Path+"V"));
        }
        if(row > 1 && col > 1){
            list.addAll(pathwithdiaglist(row-1, col-1,diag, Path+"D"));
        }
        return list;

    
}
}
