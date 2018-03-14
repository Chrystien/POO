package he;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] ent = new int[12];
		float a = 0;
		float b = 0;
		int i = 0;

		for (i = 0; i < 12; i++) {
			System.out.println("Informe os numeros: \n");
			ent[i] = entrada.nextInt();
			if (ent[i] < 8) {
				a++;

			} else if (ent[i] > 10) {
				b++;
			}

		}
		float pora = ((a * 100) / 12);
		float porb = ((b * 100) / 12);

		System.out.println("porcentagem de menores que 8 " + pora + "%\nporcentagem de maiores que 10 " + porb + "%");

	}
}