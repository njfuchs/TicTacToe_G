package test;

import org.example.TicTacToe;
import org.junit.Before;


public class TestUnitTestTicTacToe {
    private TicTacToe game;
    @Before
    public void testStart(){
        game = new TicTacToe();
        game.start();
    }

}
