package com.mycompany.tictactoe;

public class Player {
    private String player;

    public Player() {
        this.player = "X";
    }

    public String getPlayer() {
        return player;
    }
    
    public void changePlayer(){
        if(player.equals("X")) player = "O";
        else player = "X";
    }
}
