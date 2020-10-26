package ExercicioMDC;
import java.util.Scanner;

public class MáximoDivisorComum {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		 
		System.out.println("Vamos calcular o Máximo Divisor Comum !!");
		System.out.println("Digite o primeiro número: ");
		int a = leitor.nextInt();	
		System.out.println("Digite o Segundo número: ");
		int b = leitor.nextInt();
		
		int resto;
		
		while (b != 0) {
			resto = a % b;
			a = b;
			b = resto;		
		}
		
		int mdc = a;
		
		System.out.println("O máximo divisor Comum é: " + mdc);
		

	}

}
