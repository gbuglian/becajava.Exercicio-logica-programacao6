package ExercicioMDC;
import java.util.Scanner;

public class M�ximoDivisorComum {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		 
		System.out.println("Vamos calcular o M�ximo Divisor Comum !!");
		System.out.println("Digite o primeiro n�mero: ");
		int a = leitor.nextInt();	
		System.out.println("Digite o Segundo n�mero: ");
		int b = leitor.nextInt();
		
		int resto;
		
		while (b != 0) {
			resto = a % b;
			a = b;
			b = resto;		
		}
		
		int mdc = a;
		
		System.out.println("O m�ximo divisor Comum �: " + mdc);
		

	}

}
