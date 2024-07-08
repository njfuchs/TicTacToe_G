package test;

import org.example.TicTacToe;
import org.junit.Before;
import org.junit.Test;

public class TestUnitTestTicTacToe {
    private TicTacToe game;
    @Before
    public void testStart(){
        game = new TicTacToe();
        game.start();
    }

}
