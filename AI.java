package com.mycompany.tictactoe;

public class AI {
    private boolean isAIOn;
    private int difficulty;
    private Logic logic;
    private Board board;
    private Player player = new Player();
    private String[] AIBoard;

    public AI(boolean isAIOn, int difficulty) {
        this.isAIOn = isAIOn;
        this.difficulty = difficulty;
        this.logic = new Logic();
        this.board = new Board();
    }

    public void setIsAIOn(boolean isAIOn) {
        this.isAIOn = isAIOn;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    
    public boolean getIsAIOn() {
        return isAIOn;
    }

    public int getDifficulty() {
        return difficulty;
    }
    
    
    //method for easy difficulty
    public String[] randomMoves(){
        while(true){
            int position = (int) ((Math.random() * (9)));
            
            AIBoard = board.getBoard();
            
            if(!(AIBoard[position].equals("X") || AIBoard[position].equals("O"))) {
                AIBoard[position] = player.getPlayer();
                board.setBoard(AIBoard);
                player.changePlayer();
                
                //test
                System.out.println(position);
                //test
                
                
                return AIBoard;
            }
        }
        
        
    }
    
    //inner version of easy difficulty
    public int moveRandom(){
        while(true){
            int position = (int) ((Math.random() * (9)));
            AIBoard = board.getBoard();
            if(!(AIBoard[position].equals("X") || AIBoard[position].equals("O"))) return position;
        }
    }
    
    
    //method for medium difficulty
    public int moves(){
        return 0;
    }
    
    
    //method for hard difficulty
    public int bestMoves(){
        return 0;
    }
}
