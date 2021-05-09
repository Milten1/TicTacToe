package com.mycompany.tictactoe;


public class Player {
    private String player;
    
    public Player(String player){
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }
    
    public void changePlayer(){
        if(player.equals("X")) player = "O";
        else player = "X";
    }

    @Override
    public String toString() {
        return player;
    }
    
}
