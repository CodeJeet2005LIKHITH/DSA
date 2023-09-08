package LECTURES.Recursion;

public class MazeAllPathsWithBackTracking {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},  
            {true,true,true}
        };
        allPaths("",0,0,maze);
    }
    private static void allPaths(String path,int row,int col,boolean[][] maze){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(path);

            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        
        if(row < maze.length-1){
            allPaths(path+'D', ++row, col, maze);
        }
        if(col < maze[0].length-1){
            allPaths(path+'R', row, ++col, maze);
        }
        if(row > 0){
            allPaths(path+'U', --row, col, maze);
        }
        if(col > 0){
            allPaths(path+'L', row, --col, maze);
        }
        maze[row][col] = true;

    }
}
