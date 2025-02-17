import java.util.Scanner;

public class ConverterTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c;
		int f;
		
		System.out.println("Digite o valor da temperatura em Celsius: ");
		c = sc.nextInt();
		
		f = c * 9 / 5 + 32;
		
		System.out.println("O valor em Farenheit é " + f);

	}

}
