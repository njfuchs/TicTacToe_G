package org.example;

public class Board {
    private char[][] cells;

    public Board() {
        cells = new char[3][3];
    }

    public void clear() {
        cells = new char[3][3];
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }
}
