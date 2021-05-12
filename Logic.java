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
        return false;
    }
    
    public boolean isDraw(){
        boolean boardIsFilled = true;
        
        for(String position: logicBoard){
            if(!(position.equals("X") || position.equals("O"))) boardIsFilled = false;
        }
        
        
        return boardIsFilled;
    }
    
    
    
}
