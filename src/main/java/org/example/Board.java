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
}
