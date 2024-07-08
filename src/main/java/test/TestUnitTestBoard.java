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
    public void cellEmptyTest(){
        assertTrue(board.isCellEmpty(0,0));
        board.place(0,0,'O');
        assertFalse(board.isCellEmpty(0,0));
    }

    @Test
    public void placeTest(){
        board.place(0,0,'X');
        assertFalse(board.isCellEmpty(0,0));
    }

    @Test
    public void isfullTest(){
        board = new Board();
        assertFalse(board.isFull());
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
    public void clearTest(){
        board.clear();
        assertTrue(board.isFull());
    }
}
