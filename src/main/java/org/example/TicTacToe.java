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

    public void placeX (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player X: wich row? 0, 1 or 2");
        int r = sc.nextInt();
        System.out.println("Player X: wich column? 0, 1 or 2");
        int c = sc.nextInt();
        board.place(r, c, 'X');
        sc.close();
    }
    public void placeO (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player O: wich row? 0, 1 or 2");
        int r = sc.nextInt();
        System.out.println("Player O: wich column? 0, 1 or 2");
        int c = sc.nextInt();
        board.place(r, c, 'O');
        sc.close();
    }
    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        for (boolean s = true; s;) {
            board.clear();
            for (int i = 0; i < 9; i++) {
                if (b) {
                    placeX();
                    b = false;
                } else {
                    placeO();
                    b = true;
                }
                board.print();
                if (board.hasWinner()) {
                    System.out.println("Es gibt einen Gewinner das Spiel ist vorbei!");
                    System.out.println("Neues Spiel starten? 1 = Ja 0 = nein");
                    s = sc.nextInt() == 1;
                    i = 10;
                }
            }
            if (!board.hasWinner()) {
                System.out.println("Es gibt keinen Gewinner! Unentschieden!");
                System.out.println( "Neues Spiel starten? 1 = Ja 0 = nein");
                s = sc.nextInt() == 1;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.start();
    }
}