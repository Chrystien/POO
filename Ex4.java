package he;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		char a;

		System.out.println("Digite um caractere: ");
		a = scan.next().charAt(0);
		scan.close();

		System.out.println("O caracter " + a + " tem codigo " + (int) a);

	}

}