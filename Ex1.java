package he;
 import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	int n1,n2,n3,p, m;
	System.out.println("Informe o primeiro numero:\n");
	n1 = entrada.nextInt();
	System.out.println("Informe o segundo numero:\n");
	n2 = entrada.nextInt();
	System.out.println("Informe o terceiro numero:\n");
	n3 = entrada.nextInt();
	//maior
	if(n1>n2 && n1>n3) {
	System.out.println("n1 é o maior: " + n1);
	}if(n2>n1&& n2>n3) {
		System.out.println("n2 é o maior: " + n2);
		}
	if(n3>n2 && n3>n1) {
		System.out.println("n3 é o maior: " + n3);
		}
	//menor
	if(n1<n2 && n1<n3) {
		System.out.println("n1 é o menor: " + n1);
		}if(n2<n1&& n2<n3) {
			System.out.println("n2 é o menor: " + n2);
			}
		if(n3<n2 && n3<n1) {
			System.out.println("n3 é o menor: " + n3);
			}
		//produto
		p= n1*n2*n3;
		System.out.println("O produto é: " +p);
		//a média
		m= (n1+n2+n3)/3;
		System.out.println("a média é: " + m);
		
	}		

	}