package com.mycompany.tictactoe;

public class Logic {
    private String logicBoard[];
    private Board board = new Board();
    
    
    public String[] move(int position){
        logicBoard = board.getBoard();
        
        logicBoard[position-1] = "X";
        
        board.setBoard(logicBoard);
        
        return logicBoard;
    }
    
    public boolean isWin(){
        return false;
    }
}
