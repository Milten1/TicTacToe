package com.mycompany.tictactoe;
import java.util.Scanner;


public class Game {
    Scanner scanner = new Scanner(System.in);
    private Board board;
    private Logic logic = new Logic();
    
    public void start(){
        System.out.print("Please enter board size: ");
        int size = scanner.nextInt();
        board = new Board(size);
        
        System.out.println("Choose first player (X or O): ");
        String piece = scanner.next();
        Player player = new Player(piece);
        
        board.drawBoard();

        
        while(!(logic.isWin())){
            logic.move();
            player.changePlayer();
            board.drawBoard();
            
        }
    }
}
