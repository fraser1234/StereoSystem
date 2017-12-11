import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfacesTest {
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Samsung", "2.0");
        radio = new Radio("JVC", "5");
    }

    @Test
    public void canGetSong(){
        assertEquals("Teardrops", radio.play("Teardrops"));
    }

    @Test
    public void canGetStation(){
        assertEquals("909", radio.tune("909"));
    }

    @Test
    public void canGetModel(){
        assertEquals("2.0", cdPlayer.getModel());
    }

    @Test
    public void canGetMake(){
        assertEquals("Samsung", cdPlayer.getMake());
    }
}
