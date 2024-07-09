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
    public boolean isCellEmpty (int x, int y){
        return cells[x][y] == 0;
    }

    public void place (int x, int y, char pl){
        cells[x][y] = pl;
    }

    public boolean isFull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(cells[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }


    public boolean hasWinner() {
        for (int i = 0; i < 3; i++) {
            if (cells[i][0] == cells[i][1] && cells[i][1] == cells[i][2] && cells[i][0] != 0) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (cells[0][i] == cells[1][i] && cells[1][i] == cells[2][i] && cells[0][i] != 0) {
                return true;
            }
        }
        if (cells[0][0] == cells[1][1] && cells[1][1] == cells[2][2] && cells[0][0] != 0) {
            return true;
        }
        if (cells[0][2] == cells[1][1] && cells[1][1] == cells[2][0] && cells[0][2] != 0) {
            return true;
        }
        return false;
    }
}

