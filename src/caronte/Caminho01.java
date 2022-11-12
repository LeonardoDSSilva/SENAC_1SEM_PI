package caronte;
import caronte._Principal;
import java.util.Scanner;

public class Caminho01 {

	public int iniciar() {
		
		_Principal.limparTela();
		Scanner sc = new Scanner(System.in);

		String escolha= "";

		System.out.println("Ao navegar pelo caminho voce encontra um jovem rapaz");
		System.out.println("Ajudar o rapaz? [S/SN");
		System.out.println("================================");
		escolha = sc.nextLine();

		if(escolha.toUpperCase().equals("S")){
			System.out.println("teste");
			
		
		
		
		
		
		}else if(escolha.toUpperCase().equals("N")){
			System.out.println("Voce ignora o homem pedindo ajuda, e segue sua navegacao");
			System.out.println(". \n. \n. \n");
			_Principal.temporizador(3);
		}
		

		

		System.out.println();

		return 0;
	}

	
	
}
