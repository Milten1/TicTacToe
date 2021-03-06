package com.mycompany.tictactoe;


public class Board {
    private String board[];
    private int size;
    
    public Board(){
        this.size = 3;
        this.board = new String[size*size];
        initializeBoard();
    }

    public String[] getBoard() {
        return board;
    }

    public int getSize() {
        return size;
    }

    public void setBoard(String[] board) {
        this.board = board;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void initializeBoard(){
        int number = 1;
        String zero = "";
        for(int i = 0; i < board.length; i++){
            if(i < 9 && size > 3) zero = "0";
            board[i] = zero + String.valueOf(number);
            zero = "";
            number++;
        }
    }
    
    public void drawBoard(){
        for(int i = 0; i < board.length; i++){
            if(i % size == 0) System.out.println();
            System.out.print("[" + board[i] + "]");
        }
    }
    
}