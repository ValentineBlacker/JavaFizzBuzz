import FizzBuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by demicow on 8/17/15.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void canEvaluate(){
        fb.evaluate(1);
    }

    @Test
    public void oneReturnsOne(){
        assertEquals("1", fb.evaluate(1));
    }

    @Test
    public void twoReturnsTwo(){
        assertEquals("2", fb.evaluate(2));
    }

    @Test
    public void threeReturnsFizz() {
        assertEquals("fizz", fb.evaluate(3));
    }

    @Test
    public void fiveReturnsBuzz() {
        assertEquals("buzz", fb.evaluate(5));
    }

    @Test
    public void sixReturnsFizz() {
        assertEquals("fizz", fb.evaluate(6));
    }

    @Test
    public void tenReturnsBuzz() {
        assertEquals("buzz", fb.evaluate(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz() {
        assertEquals("fizzbuzz", fb.evaluate(15));
    }


}
