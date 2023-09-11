package LECTURES.Rough;


import java.util.ArrayList;

public class path {
    public static void main(String[] args) {
        System.out.println(Path(3,3));
    }

    private static int Path(int row, int col) {
        if(row == 1|| col == 1){
            return 1;
        }
        int left = Path(row-1, col);
        int right = Path(row, col-1);

        return left+right;
    
}
}
