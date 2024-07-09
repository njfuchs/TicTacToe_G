package test;

import org.example.Board;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class TestUnitTestBoard {
    private Board board;
    @Before
    public void testStart (){
        board = new Board();
    }

    @Test
    public void cellEmptyTestEmpty(){
        board = new Board();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertTrue(board.isCellEmpty(i,j));
            }
        }
    }

    @Test
    public void cellEmptyTestFull(){
        board.place(0,0,'X');
        board.place(0,1,'X');
        board.place(0,2,'X');
        board.place(1,0,'X');
        board.place(1,1,'X');
        board.place(1,2,'X');
        board.place(2,0,'X');
        board.place(2,1,'X');
        board.place(2,2,'X');

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertFalse(board.isCellEmpty(i,j));
            }
        }
    }

    @Test
    public void placeTestX(){
        assertFalse(board.isCellEmpty(0,0));
    }
    @Test
    public void placeTestO(){
       assertFalse(board.isCellEmpty(0,0));
    }

    @Test
    public void isfullTestFull(){
        board = new Board();
        board.place(0,0,'X');
        board.place(0,1,'X');
        board.place(0,2,'X');
        board.place(1,0,'X');
        board.place(1,1,'X');
        board.place(1,2,'X');
        board.place(2,0,'X');
        board.place(2,1,'X');
        board.place(2,2,'X');
        assertTrue(board.isFull());
    }

    @Test
    public void isFullTestNotFull(){
        board.clear();
        board.place(0,1,'X');
        board.place(0,2,'O');
        board.place(1,0,'X');
        board.place(1,1,'O');
        board.place(1,2,'X');
        board.place(2,0,'O');
        board.place(2,1,'X');
        assertFalse(board.isFull());
    }

    @Test
    public void clearTestFromFull(){
        board = new Board();
        board.place(0,0,'X');
        board.place(0,1,'X');
        board.place(0,2,'X');
        board.place(1,0,'X');
        board.place(1,1,'X');
        board.place(1,2,'X');
        board.place(2,0,'X');
        board.place(2,1,'X');
        board.place(2,2,'X');
        assertFalse(board.isFull());
        board.clear();
        assertFalse(board.isFull());
    }
    @Test
    public void clearTestFromNotFull(){
        board = new Board();
        board.place(0,0,'X');
        board.place(0,1,'X');
        board.place(0,2,'X');
        board.place(1,0,'X');
        board.place(1,1,'X');
        board.place(1,2,'X');
        board.place(2,0,'X');
        board.clear();
        assertFalse(board.isFull());
    }
    @Test
    public void winnerTestStraightRows(){
        board = new Board();
        assertFalse(board.hasWinner());
        board.place(0,0,'X');
        board.place(1,0,'X');
        board.place(2,0,'X');
        assertTrue(board.hasWinner());
        board = new Board();
        assertFalse(board.hasWinner());
        board.place(0,1,'X');
        board.place(1,1,'X');
        board.place(2,1,'X');
        assertTrue(board.hasWinner());
        board = new Board();
        assertFalse(board.hasWinner());
        board.place(0,2,'X');
        board.place(1,2,'X');
        board.place(2,2,'X');
        assertTrue(board.hasWinner());
    }

    @Test
    public void winnerTestStraightColumns(){
        board = new Board();
        assertFalse(board.hasWinner());
        board.place(0,0,'X');
        board.place(0,1,'X');
        board.place(0,2,'X');
        assertTrue(board.hasWinner());
        board = new Board();
        assertFalse(board.hasWinner());
        board.place(1,0,'X');
        board.place(1,1,'X');
        board.place(1,2,'X');
        assertTrue(board.hasWinner());
        board = new Board();
        assertFalse(board.hasWinner());
        board.place(2,0,'X');
        board.place(2,1,'X');
        board.place(2,2,'X');
        assertTrue(board.hasWinner());
    }
    @Test
    public void winnerTestNoWinner(){
        board = new Board();
        board.place(0,0,'X');
        assertFalse(board.hasWinner());
        board.place(1,2,'O');
        assertFalse(board.hasWinner());
        board.place(0,2,'X');
        assertFalse(board.hasWinner());
        board.place(0,1,'O');
        assertFalse(board.hasWinner());
        board.place(2,0,'X');
        assertFalse(board.hasWinner());
        board.place(1,0,'O');
        assertFalse(board.hasWinner());
        board.place(1,1,'X');
        assertFalse(board.hasWinner());
        board.place(2,2,'O');
        assertFalse(board.hasWinner());
        board.place(2,1,'0');
        assertFalse(board.hasWinner());
    }
    @Test
    public void winnerTestDiagonals(){
        board = new Board();
        board.place(0,0,'X');
        board.place(1,1,'X');
        board.place(2,2,'X');
        assertTrue(board.hasWinner());
        board = new Board();
        board.place(0,2,'X');
        board.place(1,1,'X');
        board.place(2,0,'X');
        assertTrue(board.hasWinner());
    }


}
