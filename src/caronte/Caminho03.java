package caronte;

import java.util.Scanner;

public class Caminho03 {

	public int iniciar() {
		//JOGO DE PAR OU IMPAR
		Scanner lenin = new Scanner(System.in);
		Boolean margin = false;
		int escolhaM = 0;
		System.out.println(" '-Voce navega pelas aguas calmas do rio, em uma das margens, voce avista uma mulher. Determinada olhando para voce.-' ");
		System.out.println("=====IR ATÉ A MARGEM?===== \n[1] - SIM                  [2] - NÃO");
		escolhaM = lenin.nextInt();

		if(escolhaM == 1){
			margin =true;
			}else if(escolhaM == 2){
				System.out.println("diga tchau");
				}else if(escolhaM > 2){
					System.out.println("opção invalida!");
					}





		return 0;
	}
	
}
