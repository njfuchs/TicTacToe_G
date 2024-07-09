package test;

import org.example.Player;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestUnitTestPlayer {
    private Player player;
    @Before
    public void testStart(){
        player = new Player('X');
    }

    @Test
    public void getMarkerTestX(){
        assertEquals(player.getMarker(), 'X');
    }
    @Test
    public void getMarkerTestXFalse(){
        player = new Player('O');
        assertFalse(player.getMarker() == 'X');
    }
    @Test
    public void getMarkerTestO(){
        player = new Player('O');
        assertEquals(player.getMarker(), 'O');
    }
    @Test
    public void getMarkerTestOFalse(){
        player = new Player('X');
        assertFalse(player.getMarker()=='O');
    }

}
