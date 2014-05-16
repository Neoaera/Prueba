package MavenEjemplo;

import static org.junit.Assert.*;
import org.junit.Test;
import MavenEjemplo.App;

public class TestEjemplo {
	App MavenEjemplo;

	@Test
	public void testSumatoria() {
		App app = MavenEjemplo;
		app = new App();
		int[] var = { 1, 2, 3, 4, 5 };
		int num = app.Sumatoria(var);
		assertTrue(num == 15);
		assertTrue(num == 10);
	}
}