import java.util.Scanner;

public class ConverterTempInvertido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f;
		int c;
		
		System.out.println("Digite a temperatura em Farenheit");
		f = sc.nextInt();
		
		c = ((f - 32) * 5) / 9;
		
		System.out.println("O valor em Celsius é " + c);

	}

}
