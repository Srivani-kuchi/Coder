package LC;



public class board2D {
    public void solve(char[][] board) {

        int rows = board.length;
        int columns = board[0].length;

        for(int i = 0; i <rows; i++){ // for column boundary
            if(board[i][0]=='O')
                boundaryDFS(board,i,0);
            if(board[i][columns-1] == 'O')
                boundaryDFS(board,i,columns-1);
        }

        for(int j = 0; j <columns; j++){ // row boundary
            if(board[0][j] == 'O')
                boundaryDFS(board, 0,j);
            if(board[rows-1][j] == 'O')
                boundaryDFS(board,rows-1,j);

        }

        for(int i = 0; i <board.length; i++){ // entire grid
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 'O')
                    board[i][j] ='X';
                else if(board[i][j] == '*'){
                    board[i][j] = 'O';
                }
            }
        }

    }

    public void boundaryDFS(char[][] board, int i, int j){
        if(i > board.length-1 || i < 0 || j > board[0].length || j < 0) return;

        if(board[i][j] == 'O')
            board[i][j] = '*';

        if(i > 0 && board[i-1][j] == 'O'){
            boundaryDFS(board,i-1,j);
        }
        if(i < board.length-1 && board[i+1][j] == 'O'){
            boundaryDFS(board,i+1,j);
        }
        if(j > 0 && board[i][j-1] == 'O'){
            boundaryDFS(board,i,j-1);
        }
        if(i > board[0].length-1 && board[i][j+1] == 'O'){
            boundaryDFS(board,i,j+1);

        }
    }








    }


