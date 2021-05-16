package com.mycompany.tictactoe;

import java.util.Scanner;

public class Game {
    public Scanner scanner = new Scanner(System.in);
    public Board board;
    public Player player;
    public Logic logic;
    public AI ai;

    public Game(){
        this.player = new Player();
        this.board = new Board();
        this.logic = new Logic();
        this.ai = new AI(false, 0);
    }
    
    public void start(){
        ai.setIsAIOn(false);
        System.out.println("Do you want to play with the AI? (y/n)");
        String command = scanner.next();
        if(command.toLowerCase().equals("y")){
            System.out.println("Choose difficulty \n0-easy, 1-medium, 2-hard");
            int choose = scanner.nextInt();
            this.ai = new AI(true, choose);
        }

        board.initializeBoard();
        player.setPlayer("X");
        System.out.println("Player " + player.getPlayer() + " starts the game");
        
        int counter = 1;
        while(/*!(logic.isDraw()) || (logic.isWin()) */ true){
            board.drawBoard();
            System.out.println();
            
            
            //AI moves
            if(ai.getIsAIOn() && counter%2 == 0){
                if(ai.getDifficulty() == 0){
//                    board.setBoard(ai.randomMoves());
                      board.setBoard(logic.move(ai.moveRandom()));
                      
                      counter++;
                      
                      continue;
                } else if(ai.getDifficulty() == 1){
                    board.setBoard(logic.move(ai.mediumMoves()));
                    
                    counter++;
                    
                    continue;
                }
                
                
            }
            
            
            System.out.print("Choose position (or \"exit\" to end the game): ");
            command = scanner.next();
            if(command.trim().toLowerCase().equals("exit")) break;
            int position = Integer.valueOf(command);
            board.setBoard(logic.move(position-1));
            
            
            //test
            //logic.fillBoard();
            
            
            if(logic.isWin()) break;
            if(logic.isDraw()) break;
            counter++;
        }
        
        board.drawBoard();
        System.out.println();
        player.changePlayer();
        if(logic.isDraw()) System.out.println("Draw!");
        else System.out.println("Player " + player.getPlayer() + " won the game!");
        System.out.println("New game? (y/n)");
        String choose = scanner.next();
        if(choose.toLowerCase().equals("y")) start();
    }
}
