package org.example;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Board board;
    private Scanner sc = new Scanner(System.in);
    public TicTacToe() {
        player1 = new Player('X');
        player2 = new Player('O');
        board = new Board();
    }

    public void place (char player){
        for (boolean changed = false; changed==false;) {
            System.out.println("Player" + player + ": wich row? 0, 1 or 2");
            int r = sc.nextInt();
            System.out.println("Player" + player + ": wich column? 0, 1 or 2");
            int c = sc.nextInt();
            if (r<0||c<0||r>2||c>2||!board.isCellEmpty(r, c)) {
                System.out.println(player+" Dieses Feld ist ungültig bitte neues Wählen!");
            }else {
                board.place(r, c, player);
                changed = true;
            }
        }

    }

    public void start() {
        boolean b = true;
        for (boolean s = true; s;) {
            board.clear();
            for (int i = 0; i < 9; i++) {
                if (b) {
                    place(player1.getMarker());
                    b = false;
                } else {
                    place(player2.getMarker());
                    b = true;
                }
                board.print();
                if (board.hasWinner()) {
                    System.out.println("Es gibt einen Gewinner das Spiel ist vorbei!");
                    System.out.println("Neues Spiel starten? 1 = Ja 0 = nein");
                    s = sc.nextInt() == 1;
                }
                System.out.println(i);
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