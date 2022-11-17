package caronte;

import java.util.Random;
import java.util.Scanner;

public class Caminho03 {

	public int iniciar() {
		//JOGO DE PAR OU IMPAR
		_Principal.limparTela();
		boolean loop = true;
		Scanner lenin = new Scanner(System.in);
		Boolean jogo2 = false;
		int escolhaM = 0;
		int jogo = 0;
		String[] ParImpar = {"par", "impar"};
		Random rand = new Random();
		int jogadaPC =0;
		int jogadaPL=0;
		boolean vitoria = false;
			
		Scanner lolo = new Scanner(System.in);
		
		do{
		System.out.println(" '-Voce navega pelas aguas calmas do rio, em uma das margens, voce avista uma mulher. Determinada olhando para voce.-' ");
		System.out.println("=====IR ATÉ A MARGEM?===== \n[1] - SIM                  [2] - NÃO");
		escolhaM = lenin.nextInt();


		switch (escolhaM) {
			case 1:
				System.out.println("MULHER: Por favor me ajude! Nao posso ficar aqui pra sempre, meus filhos tem de me encontrar no outro mundo...");
				System.out.println("VOCE: Voce sabe que as coisas não funcionam desse jeito... Sinto muito.");
				System.out.println("Tem de haver outra forma! Eu lhe imploro, meu corpo nunca foi encontrado, não pude receber uma moeda...");
				System.out.println(" -' Voce pensa nas possibilidades'");
				_Principal.temporizador(5, false);
				System.out.println("[1] - Propor um jogo.        [2] - Ir embora.");
				jogo = lenin.nextInt();
				break;
			case 2:
				System.out.println("Voce ignora a mulher e segue viagem com seu barco.");
				loop = false;
				_Principal.temporizador(3, false);
				break;
			default:
			
				break;
		}


		if(jogo == 1){
			jogo2 =true;
			}else if(jogo == 2){
				System.out.println("Regras são regras... Adeus.");
			System.out.println("Voce ignora a mulher pedindo ajuda, e segue sua navegacao");
			System.out.println(" -'Ao fundo voce escuta o choro da mulher'- ");
			_Principal.temporizador(3, false);
			loop = false;
			}

		if (jogo2 = true) {
			System.out.println("Te darei uma chance. Me desafie para um jogo, se voce ganhar, te darei a moeda necessaria para a viagem. Mas voce só tera uma chance.");
			System.out.println("MULHER: Obrigada! Obrigada!");
			System.out.println(" -'A mulher pensa com seus botoes'- ");
			_Principal.temporizador(3, false);
			System.out.println("O unico jogo em que sei jogar é par ou impar... Pode ser?");
			System.out.println("Claro... nesse caso eu escolho:");
			System.out.println("eu escolho... [1] - PAR [2]- IMPAR");
			jogadaPL = lolo.nextInt();
			//1= par 2= impar
			if(jogadaPL == 1){
				jogadaPC =2;
			}else if(jogadaPL ==2){
				jogadaPC = 1;
			}

			System.out.println("Certo!");
			int dedos = rand.nextInt(20);
			
			System.out.println("==Quantos dedos voce ira mostrar?==");
			dedos += lenin.nextInt();
			System.out.println("_____________________________________________________________________________________");
			_Principal.temporizador(5, false);
			if(dedos %2 == 0 && jogadaPC == 2){
				System.out.println("Nesse caso eu ganhei... uma pena...");
				vitoria = true;
			}else if(dedos %2 == 0 && jogadaPC == 1){
				System.out.println("Neste caso voce ganhou, parabens.");
				vitoria = false;
				
			}
		}
		
			if(vitoria){
				System.out.println("Tenho que me despedir... Adeus...");
				System.out.println("NAO POR FAVOR!!!");
				System.out.println(" -'Enquanto voce vai embora com seu barco, voce escuta o choro da mulher cada vez mais distante'- ");
				_Principal.temporizador(5, false);
				loop = false;
				break;

			}else if(vitoria == false){
				System.out.println("Serio?? Vou poder ver minha familia novamente! Faz tanto tempo...");
				System.out.println(" '-Voce entrega uma moeda para ela, e ela lentamente desaparece perante voce-' ");
				loop = false;
				System.out.println("E voce retorna com o seu barco para o seu caminho...");
				_Principal.temporizador(5, false);
				break;
			
			}
		}while(loop);





		return 0;
	}
	
}
