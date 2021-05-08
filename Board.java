package com.mycompany.tictactoe;


public class Board {
    private int size;
    private char[] board;
    private Pieces piece;
    
    public Board(int size){
        this.size = size;
        this.board = new char[size*size];
        this.piece = new Pieces(" ");
    }
    
    public void drawBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
            System.out.print("[" + piece + "]");
            }
            System.out.println();
        }
    }
}