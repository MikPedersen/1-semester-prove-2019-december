import junit.framework.TestCase;

public class QuickmathsTest extends TestCase {

    public void testgennemsnit() {
       int resultat = Quickmaths.gennemsnit(5,19);
       assertEquals(12, resultat);
    }

    public void testsum() {
        int resultat = Quickmaths.sum(5,7);
        assertEquals(12, resultat);
    }
}