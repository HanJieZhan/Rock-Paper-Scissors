import static org.junit.Assert.assertEquals;

import org.junit.*;

public class junitTest {
	private RockPaperScissors test;
	
	@Before
	public void setup() throws Exception{
		test = new RockPaperScissors();

	}
	
	@Test
	public void checwkArray1(){
		System.out.println("Checking the length in the systemMoves array");
		test.cpuWin.increment();
		test.totalGames.increment();
		assertEquals(test.cpuWin.getCount(), 1);
		assertEquals(test.totalGames.getCount(), 1);
	}
	
}
