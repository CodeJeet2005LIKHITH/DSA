package LECTURES.Recursion;

public class CountPath {
    public static void main(String[] args) {
        System.out.println(Coun_Path(50,10));
       
    }
    private static int Coun_Path(int Right,int Down){
        if(Right == 1 || Down == 1){
            return 1;
        }
        int right = Coun_Path(Right-1, Down);
        int down = Coun_Path(right, Down-1);
        return right+down;
    }
    
}
