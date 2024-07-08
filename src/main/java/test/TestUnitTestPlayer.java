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
    public void getMarkerTest (){
        assertEquals(player.getMarker(), 'X');
    }
}
