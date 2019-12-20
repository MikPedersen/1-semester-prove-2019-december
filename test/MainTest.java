import junit.framework.TestCase;

public class MainTest extends TestCase {

    //kalder metoderne til test vha assertequals
    public void testHelloAndras() {

        Main m = new Main();

        assertEquals("Hello András!", m.hello("András"));

    }


    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World!", m.hello(""));
    }
}