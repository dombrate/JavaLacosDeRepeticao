package lacosrepeticao;
import java.util.Scanner;

public class repeticao2 {

	public static void main(String[] args) {
		
		int numpar = 0, numimpar = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			//int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
			System.out.println("Digite o " + i + "º número");
			int num = entrada.nextInt();
			
			if (num % 2 == 0) {
				numpar++;
			}
			
			else if (num % 2 == 1 ) {
				numimpar++;
				
			}
			
			
			System.out.println("O total de numeros impares é " + numimpar + " E o total de pares " + numpar);
			
		}
	}



	}

}
