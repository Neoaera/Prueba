package MavenEjemplo;


public class App {
	/**
	 * 
	 * 
	 * 
	 */
	public int Sumatoria(int secuencia[]) {
		int Suma = 0;
		for (int i = 0; i < secuencia.length; i++) {
			Suma += secuencia[i];
		}
		return Suma;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
