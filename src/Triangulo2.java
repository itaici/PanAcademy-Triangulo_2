import java.util.Scanner;

public class Triangulo2 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int angulo1=0, angulo2=0, angulo3=0;
		for (int numLados = 1; numLados < 4; ++numLados) {
			System.out.println("Digite o lado " + numLados);
			if (numLados < 2) {	
				angulo1 = tc.nextInt();
			} else if (numLados < 4) {
				angulo2 = tc.nextInt();
			} else {
				angulo3 = tc.nextInt();
			}
		}
		
		if (angulo1 == angulo2 && angulo1 == angulo3) {
			System.out.println("Triangulo Equilátero");
		} else if (angulo1 == angulo2 || angulo2 == angulo3) {
			System.out.println("Triangulo Isóceles"); 
		} else {
			System.out.println("Triangulo Escaleno"); 
		}
		
		tc.close();
	}

}
