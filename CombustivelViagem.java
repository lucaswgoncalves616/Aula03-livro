import java.util.Scanner;

public class CombustivelViagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tempo;
		double velocidade;
		double distancia;
		double litrosUsados;

		System.out.println("Digite o tempo gasto na viagem: ");
		tempo = sc.nextDouble();

		System.out.println("Digite a velocidade media da viagem: ");
		velocidade = sc.nextDouble();

		distancia = tempo * velocidade;
		litrosUsados = distancia / 12;

		System.out.println("Em uma viagem com um tempo " + tempo + " em uma velocidade de " + velocidade
				+ " com uma distancia percorrida de " + distancia + " gastou " + litrosUsados
				+ " litros de combustivel.");
		
		
	}

}
