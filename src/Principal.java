import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {
	
	public static double divide(double a, double b) {
		
		if ( b == 0 ) {
			throw new RuntimeException("b no puede ser 0"); // Las RuntimeException no fuerzan a ser tratadas
		}
		
		double res = a/b;
		
		return res;
	}
	
	public static void methodB() {
			try {
				methodA();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void methodA() throws IOException {
		File file = new File("algo.txt");
		BufferedReader stdin = new BufferedReader(new FileReader(file));
		String data = stdin.readLine();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num = 0;
		double div = 0;
		boolean correcto = false;
		
		while (!correcto) {
			
			try {
				System.out.println("Introduce un número");
				num = scan.nextDouble();
				System.out.println("Introduce otro número");
				div = scan.nextDouble();
				double res = num / div;
				System.out.println("resultado " + res);

				if (Double.isInfinite(res))
					throw new MiExcepcion("infinito");
				} catch(Exception e) {
					System.out.println(e.getMessage());
				} finally {
					System.out.println("por aquí entra siempre");
				}
			correcto = true;
		}
	}
}