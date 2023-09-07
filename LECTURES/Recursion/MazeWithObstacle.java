package LECTURES.Recursion;

import java.util.ArrayList;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean [][] maze={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
       
        System.out.println( mazeWithObstacle("",0, 0,maze));
    }
    private static ArrayList<String> mazeWithObstacle(String path,int row,int col,boolean[][] maze){
        if(row == maze.length-1 && col == maze[0].length-1){
            ArrayList <String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(maze[row][col] == false){
            return ans;
        }
        if(row < maze.length-1){
           ans.addAll(mazeWithObstacle(path+"H",row+1,col,maze));
        }
        if(col < maze[0].length-1){
            ans.addAll(mazeWithObstacle(path+"V",row,col+1,maze));
        }
        if(row < maze.length-1 && col < maze[0].length-1){
            ans.addAll(mazeWithObstacle(path+"D", ++row, ++col, maze));
        }
        return ans;
    }
    
}
