import org.junit.Before;
import org.junit.Test;

public class PlanetTest{
    Planet planetTest;
    Planet planetTest2;
    Planet planetTestbad;

    @Before
    public void setup(){
       planetTest = new Planet(60,"");
       planetTest = new Planet(60,);
       planetTestbad = new Planet (360,);


    }


}
