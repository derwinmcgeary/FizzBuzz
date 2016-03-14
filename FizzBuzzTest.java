import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
	@Test
	public void zeroIsZero(){
	    FizzBuzz f = new FizzBuzz(3,5);
		String result = f.respond(0);
		assertEquals("0", result);
	}
	@Test
	public void oneIsOne(){
	    FizzBuzz f = new FizzBuzz(3,5);
		String result = f.respond(1);
		assertEquals("1", result);
	}
	@Test
	public void sixIsFizz(){
	    FizzBuzz f = new FizzBuzz(3,5);
		String result = f.respond(6);
		assertEquals("Fizz", result);
	}
	@Test
	public void tenIsBuzz(){
	    FizzBuzz f = new FizzBuzz(3,5);
		String result = f.respond(10);
		assertEquals("Buzz", result);
	}
	@Test
	public void fifteenIsFizzBuzz(){
	    FizzBuzz f = new FizzBuzz(3,5);
		String result = f.respond(15);
		assertEquals("FizzBuzz", result);
	}
	@Test
	public void nineteenIsNineteen(){
	    FizzBuzz f = new FizzBuzz(3,5);
		String result = f.respond(19);
		assertEquals("19", result);
	}


    

}
