public static boolean isSafe(char[][] board,int row,int col){

        //Check Vertically Up
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q') return false;
        }

        //Check Vertically Down
        for(int i=row;i>board.length;i++){
            if(board[i][col]=='Q') return false;
        }

        //Check Horizontally Left
        for(int i=col;i>=0;i--){
            if(board[row][i]=='Q') return false;
        }

        //Check Horizontally Right
        for(int i=col;i<board.length;i++){
            if(board[row][i]=='Q') return false;
        }

        //Check Upper Left
        int r=row;
        for(int i=col;i>=0 && r>=0;i--,r--){
            if(board[r][i]=='Q') return false;
        }

        //Check Upper Right
        int c=col;
        for(int i=row;i>=0 && c<board.length;i--,c++){
            if (board[i][c]=='Q') return false;
        }

        //Check Lower Left
        c=col;
        for (int i=row;i<board.length && c>=0;i++,c--){
            if (board[i][c]=='Q') return false;
        }

        //Check Lower Right
        c=col;
        for(int i=row;i< board.length && c<board.length;i++,c++){
            if(board[i][c]=='Q') return false;
        }

        return true;
    }


    public static void saveBoard(char[][] board,List<List<String>> allBoards){
        String row="";
        List<String> newBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][] board,List<List<String>> allBoards,int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards=new ArrayList<>();
        char[][] board=new char[n][n];
        helper(board,allBoards,0);
        return allBoards;
    }
