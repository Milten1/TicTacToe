package com.mycompany.tictactoe;

import java.util.Scanner;


public class Logic {
    private Board board;
    private Player player;
    Scanner scanner = new Scanner(System.in);

    public Logic() {
        this.board = new Board(3);
        this.player = new Player("X");
    }
    
    public void move(){
        System.out.print("Enter position: ");
        int position = scanner.nextInt();
        
        String logicBoard[] = board.getBoard();
        
        logicBoard[position-1] = player.getPlayer();
        
        board.setBoard(logicBoard);
    }
    
    public boolean isWin(){
        return false;
    }
}
