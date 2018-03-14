package he;
import java.util.Scanner;
public class Ex6 {

	public static void menossecu(char[][] matriz, int lin, int col) {
    int i, j;
   System.out.println("Matriz sem a diagonal secundária.");
	for (i = 0; i < lin; i++) {
		for (j = 0; j < col; j++) {
	if (i + j != lin - 1) {
		System.out.print("[" + matriz[i][j] + "]");
		} 
	else {
	System.out.print("[ ]");
	}
		}
		System.out.println();
		}
}
public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int i, j;
   char[][] matriz = new char[10][10];
   int linha = matriz.length;
	int coluna = matriz[0].length;

		for (i = 0; i < linha; i++) {
			for (j = 0; j < coluna; j++) {
				System.out.println("Insira o elemento [" + i + "][" + j + "]");
				matriz[i][j] = scan.next().charAt(0);
			}
		}
		scan.close();

		menossecu(matriz, linha, coluna);
}
}
		