package MavenEjemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntentosTest {
	Intentos Zigzy;
	@Test
	public void testTest() {
		//REFACTORING
		Zigzy = new Intentos();
		int[]array = Zigzy.test(3, "0 0 1");
		assertTrue (array[0]== 2);
		assertTrue (array[1]==1);
		
	}

}
