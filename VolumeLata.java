import java.util.Scanner;

public class VolumeLata {

	public static void main(String[] args) {
		double volume;
		double altura;
		double r;
		
		Scanner sc = new Scanner(System.in);		

		System.out.println("Digite o valor da altura da lata: ");
		altura = sc.nextDouble();
		
		System.out.println("Digite o valor do raio da lata: ");
		r = sc.nextDouble();
		
		volume = 3.14159 * (r * r) * altura;
		
		System.out.println("O volume da lata é " + volume);
	}

}
