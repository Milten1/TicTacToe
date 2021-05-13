package com.mycompany.tictactoe;

import java.util.Scanner;

public class Game {
    public Scanner scanner = new Scanner(System.in);
    public Board board;
    public Player player;
    public Logic logic;

    public Game(){
        this.player = new Player();
        this.board = new Board();
        this.logic = new Logic();
    }
    
    public void start(){
        board.initializeBoard();
        
        System.out.println("Player " + player.getPlayer() + " starts the game");
        
        while(/*!(logic.isDraw()) || (logic.isWin()) */ true){
            board.drawBoard();
            System.out.println();
            System.out.print("Choose position: ");
            int position = scanner.nextInt();
            board.setBoard(logic.move(position));
            
            
            //test
//            logic.fillBoard();
            
            
            if(logic.isWin()) break;
            if(logic.isDraw()) break;
        }
        
        board.drawBoard();
        System.out.println();
        
        if(logic.isDraw()) System.out.println("Draw!");
        else System.out.println("Player " + player.getPlayer() + " won the game!");
        System.out.println("New game? (y/n)");
        String choose = scanner.next();
        if(choose.toLowerCase().equals("y")) start();
    }
}
