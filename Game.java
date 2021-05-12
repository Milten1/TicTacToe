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
        
        System.out.println("Player " + player.getPlayer() + " starts the game");
        
        while((!logic.isWin()) || logic.isDraw()){
            board.drawBoard();
            System.out.println();
            System.out.print("Choose position: ");
            int position = scanner.nextInt();
            board.setBoard(logic.move(position));
        }
        
        player.changePlayer();
        
        if(logic.isDraw()) System.out.println("Draw!");
        else System.out.println("Player " + player.getPlayer() + " won the game!");
        System.out.println("New game? (y/n)");
        String choose = scanner.next();
        if(choose.toLowerCase().equals("y")) start();
    }
}
