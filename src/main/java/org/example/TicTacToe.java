package org.example;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        for (int i = 0; i < 9; i++){
            if (b){
                System.out.println("Player X: wich row? 0, 1 or 2");
                int r = sc.nextInt();
                System.out.println("Player X: wich column? 0, 1 or 2");
                int c = sc.nextInt();
                board.place(r, c, 'X');
                b = false;
                board.print();
            } else {
                System.out.println("Player O: wich row? 0, 1 or 2");
                int r = sc.nextInt();
                System.out.println("Player O: wich column? 0, 1 or 2");
                int c = sc.nextInt();
                board.place(r, c, 'O');
                b = true;
                board.print();
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.start();
    }
}