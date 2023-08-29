package LECTURES.Recursion;

public class PatternsWithRecursion {
    public static void main(String[] args) {
        Triangle(5,0);
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
            Triangle(row-1, ++colum);
        }
    }
    
}
