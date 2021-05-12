package com.mycompany.tictactoe;

import java.util.Scanner;

public class Game {
    public Scanner scanner = new Scanner(System.in);
    public Board board;
    public Player player;
    public Logic logic;

    public Game(){
        this.board = new Board();
        this.player = new Player();
        this.logic = new Logic();
    }
    
    public void start(){
        
        board.drawBoard();
        
        System.out.println();
        System.out.print("Choose position: ");
        int position = scanner.nextInt();
        
        board.setBoard(logic.move(position));
        
        System.out.println();
        board.drawBoard();
        
        while(!logic.isWin()){
            //game
        }
    }
}
