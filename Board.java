package com.mycompany.tictactoe;


public class Board {
    private int size;
    private String[] board;
    private Player player;
    
    public Board(int size){
        this.size = size;
        this.board = new String[size*size];
        this.player = new Player("");
    }

    public void setBoard(String[] board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public String[] getBoard() {
        return board;
    }
    
    public void drawBoard(){
        int x = 1;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
            System.out.print("[" + x + "]");
            x++;
            }
            System.out.println();
        }
    }
}