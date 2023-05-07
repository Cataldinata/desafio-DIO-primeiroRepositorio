import java.util.*;
import java.lang.Math;

	public class UsandoIf {
		private static Scanner s = new Scanner(System.in);
		public static void main (String[] args) {

		System.out.println("Olá! Sou seu assitente de agendamento de exame.");
		System.out.println("É importante que você saiba que enumeramos os dias da semana da seguinte forma: ");
		
		System.out.println("");
		
		System.out.println("1. Domingo");

		System.out.println("2. Segunda-feira");


		System.out.println("3. Terça-feira");

		
		System.out.println("4. Quarta-feira");


		System.out.println("5. Quinta-feira");


		System.out.println("6. Sexta-feira");


		System.out.println("7. Sábado");

		System.out.println("");

		System.out.println("Escolha o dia que você deseja realizar o seu exame: ");
		int DiaEscolhido;
		DiaEscolhido = s.nextInt();

		if (DiaEscolhido == 1) {
			System.out.println("O dia esolhido foi o Domingo. ");
		}	else if (DiaEscolhido == 2) {
			System.out.println("O dia escolhido foi um dia útil: Segunda-feira.");
		}	else if (DiaEscolhido == 3) {
			System.out.println("O dia escolhido foi um dia útil: Terça-feira.");
		}	else if (DiaEscolhido == 4) {
			System.out.println("O dia escolhido foi um dia útil: Quarta-feira.");
		}	else if (DiaEscolhido == 5) {
			System.out.println("O dia escolhido foi um dia útil: Quinta-feira.");
		}   else if (DiaEscolhido == 6) {
			System.out.println("O dia escolhido foi um dia útil: Sexta-feira.");
		}   else if (DiaEscolhido == 7) {
		    System.out.println("O dia escolhido foi o Sábado.");
		} else {
			System.out.println("Você não selecionou um dia para o seu exame.");
		}

		

}
	
}
