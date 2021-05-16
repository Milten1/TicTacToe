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
    
    //another version of easy difficulty
    public int moveRandom(){
        while(true){
            int position = (int) ((Math.random() * (9)));
            AIBoard = board.getBoard();
            if(!(AIBoard[position].equals("X") || AIBoard[position].equals("O"))) {
                System.out.println("AI choose: " + (position+1));
                return position;
            }
        }
    }
    
    
    //method for medium difficulty
    public int mediumMoves(){
        while(true){
            int[] positions = {0, 2, 4, 6, 7};
            int pos = (int) ((Math.random() * (5)));
            int position = positions[pos];
            AIBoard = board.getBoard();
            if(!(AIBoard[position].equals("X") || AIBoard[position].equals("O"))) {
                System.out.println("AI choose: " + (position+1));
                return position;
            }
        }
    }
    
    
    //method for hard difficulty
    public int bestMoves(){
        return 0;
    }
}
