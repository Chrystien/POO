package he;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	int multiplo,numero;
	System.out.println("Informe o primeiro numero");
	multiplo = entrada.nextInt();
	System.out.println("Informe o segundo numero");
	numero = entrada.nextInt();
	if (multiplo%numero==0){
		System.out.println ("Resposta: sim é multiplo\n");
	}
	else{
		System.out.println("Resposta: não é multiplo\n");
	}
	

	}

}