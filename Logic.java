package com.mycompany.tictactoe;

public class Logic {
    private String logicBoard[];
    private Board board;
    private Player player;

    public Logic() {
        this.board = new Board();
        this.player = new Player();
    }
    
    
    public String[] move(int position){
        logicBoard = board.getBoard();
        
        if(!(logicBoard[position-1].equals("X") || logicBoard[position-1].equals("O"))){
            logicBoard[position-1] = player.getPlayer();
            board.setBoard(logicBoard);
            player.changePlayer();
        } else System.out.println("Invalid position");
        
        return logicBoard;
    }
    
    public boolean isWin(){
        logicBoard = board.getBoard();
        
        if((logicBoard[0].equals("X") && logicBoard[1].equals("X") && logicBoard[3].equals("X")) ||
           (logicBoard[3].equals("X") && logicBoard[4].equals("X") && logicBoard[5].equals("X"))  ||
           (logicBoard[6].equals("X") && logicBoard[7].equals("X") && logicBoard[8].equals("X")) ) return true;
        
        if((logicBoard[0].equals("X") && logicBoard[3].equals("X") && logicBoard[6].equals("X")) ||
           (logicBoard[1].equals("X") && logicBoard[4].equals("X") && logicBoard[7].equals("X"))  ||
           (logicBoard[2].equals("X") && logicBoard[5].equals("X") && logicBoard[8].equals("X")) ) return true;
        
        if((logicBoard[0].equals("X") && logicBoard[4].equals("X") && logicBoard[8].equals("X")) ||
           (logicBoard[2].equals("X") && logicBoard[4].equals("X") && logicBoard[6].equals("X"))  ) return true;
        
        
        
        
        if((logicBoard[0].equals("O") && logicBoard[1].equals("O") && logicBoard[2].equals("O")) ||
           (logicBoard[3].equals("O") && logicBoard[4].equals("O") && logicBoard[5].equals("O"))  ||
           (logicBoard[6].equals("O") && logicBoard[7].equals("O") && logicBoard[8].equals("O")) ) return true;
        
        if((logicBoard[0].equals("O") && logicBoard[3].equals("O") && logicBoard[6].equals("O")) ||
           (logicBoard[1].equals("O") && logicBoard[4].equals("O") && logicBoard[7].equals("O"))  ||
           (logicBoard[2].equals("O") && logicBoard[5].equals("O") && logicBoard[8].equals("O")) ) return true;
        
        if((logicBoard[0].equals("O") && logicBoard[4].equals("O") && logicBoard[8].equals("O")) ||
           (logicBoard[2].equals("O") && logicBoard[4].equals("O") && logicBoard[6].equals("O"))  ) return true;
        
        
        return false;
    }
    
    public boolean isBoardFilled(){
        boolean isFilled = true;
        
        logicBoard = board.getBoard();
        
        for(String position: logicBoard){
            if(!(position.equals("X") || position.equals("O"))) isFilled = false;
        }
        return isFilled;
    }
    
    public boolean isDraw(){
        return isBoardFilled() && !(isWin());
    }
    
    //test methods
    public void fillBoard(){
        for(int i = 0; i < logicBoard.length; i++){
            logicBoard[i] = "X";
        }
        board.setBoard(logicBoard);
    }
    
}
