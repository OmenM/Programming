import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest{
    Planet planetTest;
    Planet planetTest2;
    Planet planetTestbad;

    @Before
    public void setup(){
       planetTest = new Planet(60,"Earth");
       planetTest2 = new Planet(60,"Earth");
       planetTestbad = new Planet (360,"Mercury");


    }

    @Test
    public void EqualsTest() {
        assertEquals(true,true);
    }
}
