package aplicacao;

import java.util.Scanner;

import service.PrintService;



public class Programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();	//Instanciando um printservice do tipo Interger. Agora ele n�o � mais gen�rico e sim espcifico

		System.out.print("Quantos valores ser�o informados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("Primeiro n�mero informado: " + x);

		sc.close();
	}

}
