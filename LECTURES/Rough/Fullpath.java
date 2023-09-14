package LECTURES.Rough;

import java.util.ArrayList;

public class Fullpath {
    public static void main(String[] args) {
       
        // System.out.println(path(3,3,""));
        // System.out.println(PathWithDiag(3,3,""));
        boolean[][]arr = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        boolean[][]backtrack = {
            // {true,true,true,true,true,true,true,true,true,true,true},
            // {true,true,true,true,true,true,true,true,true,true,true},
            // {true,true,true,true,true,true,true,true,true,true,true},
            // {true,true,true,true,true,true,true,true,true,true,true},
            // {true,true,true,true,true,true,true,true,true,true,true},
            // {true,true,true,true,true,true,true,true,true,true,true},
            // {true,true,true,true,true,true,true,true,true,true,true},  
            // {true,true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true},
            {true,true,true,true,true},
            {true,true,true,true,true},
            {true,true,true,true,true},
            {true,true,true,true,true},


        };
        // System.out.println(Maze(0,0,arr,""));
        MazeBacktrack(0,0,backtrack,"");
    }
    private static ArrayList<String> path(int row, int col,String Path){
        
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(Path+"  ");
            return list;
        }



        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            
             list.addAll(path(row-1, col,Path+"D"));
        }
        if(col > 1){
            
           
            list.addAll(path(row, --col,Path+"R"));
        }
        return list;
        

        
    }
    // with Diagonals

    private static ArrayList<String> PathWithDiag(int row, int col,String Path){
        if(row == 1 && col == 1){
            ArrayList<String> list= new ArrayList<>();
            list.add(Path);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
               list.addAll(PathWithDiag(row-1, col,Path+"D")) ;
        }
        if(col > 1){
            list.addAll(PathWithDiag(row, col-1,Path+"R")) ;
        }
        if(row > 1 && col > 1){
           list.addAll(PathWithDiag(row-1, col-1,Path+"X")) ;
        }

        return list;
    }

    // maze
    private static ArrayList<String> Maze(int row,int colum,boolean[][]maze,String path){
        if(row == maze.length-1 && colum == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row < maze.length-1 && maze[row][colum] == true){
            list.addAll(Maze(row+1, colum, maze, path+"D"));
        }
        if(colum < maze[0].length-1 && maze[row][colum] == true){
            list.addAll(Maze(row, colum+1, maze, path+"R"));
        }
        return list;
    }

    // All Sides with Backtracking  

    private static void MazeBacktrack(int row,int colum,boolean[][]maze,String path){
        if(row == maze.length-1 && colum == maze[0].length-1){
            System.out.println(path);
            return;
        }

        if(!maze[row][colum])return;
        maze[row][colum] = false;
        if(row < maze.length-1){
            MazeBacktrack(row+1, colum, maze, path+"D");
        }
        if(colum < maze[0].length-1 ){
            MazeBacktrack(row, colum+1, maze, path+"R");
        }
        if(row > 0 ){
            MazeBacktrack(row-1, colum, maze, path+"U");
        }
        if(colum > 0 ){
            MazeBacktrack(row, colum-1, maze, path+"L");
        }
        maze[row][colum] = true;
    }
    
}
