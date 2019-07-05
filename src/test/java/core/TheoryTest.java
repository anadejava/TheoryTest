package core;

import static org.hamcrest.CoreMatchers.is;

import org.junit.*;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {

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

	@Theory // 26 X 26 = 676 iterations
	public void theory_02(String a, String b) {
		// System.out.print(a + b + "\n");
		Assume.assumeThat(a + b, is("zz"));
	}

	@Theory // 26 X 26 X 26 = 17,576 iterations
	public void theory_03(String a, String b, String c) {
		// System.out.print(a + b + c + "\n");
		Assume.assumeThat(a + b + c, is("zzz"));
	}

	@Theory // 26 X 26 X 26 X 26 = 456,976 iterations
	public void theory_04(String a, String b, String c, String d) {
		// System.out.print(a + b + c + d + "\n");
		Assume.assumeThat(a + b + c + d, is("zzzz"));
	}
}
