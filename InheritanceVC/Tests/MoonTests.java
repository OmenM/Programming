

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MoonTests{
    Moon MoonTest;
    Moon MoonTest2;
    Moon MoonTestbad;

    @Before
    public void setup(){
        MoonTest = new Moon(new Planet(60, "Earth"),60,false,"Earth");
        MoonTest2 = new Moon(new Planet(60,"Earth"),60,false,"Earth");
        MoonTestbad = new Moon(new Planet(55,"Earth"),55,false,"Mercury");

    }

    @Test
    public void EqualsTrue(){
        assertTrue(MoonTest.equals(MoonTest2));
    }
    @Test
    public void EqualsFalse(){
        assertFalse(MoonTest.equals(MoonTestbad));
    }
}
