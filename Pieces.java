package com.mycompany.tictactoe;


public class Pieces {
    private String piece;
    
    public Pieces(String piece){
        this.piece = piece;
    }

    @Override
    public String toString() {
        return piece;
    }
    
}
