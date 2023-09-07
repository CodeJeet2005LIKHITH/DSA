package LECTURES.Recursion;

public class PrintingPaths {
    public static void main(String[] args) {
        printing_paths("",4, 3);
    }
    private static void printing_paths(String path, int row, int col) {
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }
        if(row > 1){
            printing_paths(path+"D", row-1, col);
        }
        if(col > 1){
            printing_paths(path+"R", row, col-1);
        }
    }
}
