package core;

import static org.hamcrest.CoreMatchers.is;

import org.junit.*;
import org.junit.experimental.theories.*;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest_08 {

	private static long start, end;
	
	@BeforeClass
	public static void start() {
		start = System.currentTimeMillis();
	}
	
	@AfterClass
	public static void end() {
		end = System.currentTimeMillis();
		System.out.println("Theory took " + (end - start) + " milliseconds");
	}
	
	@DataPoints
	public static String[] chars() {
		return new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
	}
	
	@Theory // 26 X 26 X 26 X 26 X 26 X 26 X 26 X 26 = 208,827,064,576 iterations
	public void theory_08(String a, String b, String c, String d, String e, String f, String g, String h) {
		// System.out.print(a + b + c + d + "\n");
		Assume.assumeThat(a + b + c + d + e + f + g + h, is("zzzzzzzzz"));
	}
	
}