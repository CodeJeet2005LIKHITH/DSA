package LECTURES.Rough;

public class Triangle1 {
    public static void main(String[] args) {
//        Triangle(5,0);
        Triangle2(3,0);
    }
    static void Triangle(int row,int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*");
            Triangle(row, ++col);
        }
        else{
            System.out.println();
            Triangle(row-1, 0);
        }
    }
    static void Triangle2(int row,int col){
        if(row == 0){
            return;
        }
        if(col < row){
            Triangle2(row,++col);
            System.out.print("*");
        }
        else{
            Triangle2(row-1,0);
            System.out.println();
        }
    }
}
