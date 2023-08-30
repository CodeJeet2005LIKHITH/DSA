package LECTURES.Recursion;

public class PatternsWithRecursion {
    public static void main(String[] args) {
        Triangle(5,0);
        Triangle2(5,0);
    }
    private static void Triangle(int row,int colum){
        if(row == 0){
            return;
        }
        if(row > colum){
            System.out.print("*");
            Triangle(row, ++colum);
        }
        else{
            System.out.println();
            Triangle(row-1, 0);
        }
    }
    private static void Triangle2(int row, int colum){
        if(row == 0){
            return;
        }
        if(colum < row){
            Triangle2(row, colum+1);
            System.out.print("*");
        }
        else{
            Triangle2(--row, 0);
            System.out.println();
        }
    }
    
}
