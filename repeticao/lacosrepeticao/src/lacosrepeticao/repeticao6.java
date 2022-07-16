package lacosrepeticao;
import java.util.Scanner;

public class repeticao6 {

	public static void main(String[] args) {
		int number;
		double average;
		double sum = 0.0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero inteiro ou zero para sair: ");
			number = input.nextInt();
			if(number % 3 == 0 && number != 0) {
				sum += number;
				count++;
			}
		}while(number != 0);
		
		average = sum/count;
		System.out.println("\nA média dos números mútiplos de 3: " + average);
		
		input.close();
		
	}



	}


