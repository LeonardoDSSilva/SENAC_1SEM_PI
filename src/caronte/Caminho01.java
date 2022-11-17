package caronte;
import caronte._Principal;
import java.util.Scanner;

public class Caminho01 {

	public int iniciar() {
		
		_Principal.limparTela();
		Scanner sc = new Scanner(System.in);
		Scanner lolo = new Scanner(System.in);
		int escolha = 0;
		int subEscolha =0;
		boolean charada = false;
		boolean loop = true;
		do{
			System.out.println("Ao navegar pelo caminho voce encontra um jovem rapaz");
		System.out.println("Ajudar o rapaz?\n[1] - Sim\n[2] - Nao");
		System.out.println("================================");
		escolha = sc.nextInt();

		if(escolha == 1){
			System.out.println("Ofegante, o homem se aproxima de seu barco...");
			System.out.println("HOMEM: 'Por favor! Minha familia e pobre, eu nao tinha dinheiro para ser enterrado, tenha misericordia!' ");
			System.out.println("VOCE: As regras do meu oficio são claras, tenho que ser justo com todos os que vem aqui.");
			System.out.println("HOMEM: Nao ha nenhuma forma?");
			System.out.println(" -'VOCE PENSA NAS POSSIBILIDADES'- ");
			_Principal.temporizador(3, false);
			
			
			System.out.println("\n[1] - Ignorar o homem e seguir sua viagem.");
			System.out.println("[2] - Propor um jogo.");
				subEscolha = lolo.nextInt();
				switch (subEscolha) {
					case 1:
						System.out.println("Voce ignora o homem pedindo ajuda, e segue sua navegacao");
						System.out.println(" -'Ao fundo voce escuta o choro do homem'- ");
						loop = false;
						_Principal.temporizador(3, false);
						escolha = 2;
						loop = false;
						break;
					case 2:
						charada =true;
						break;
					default:
						System.out.println("Escolha invalida!");
						break;
				}

		
		}else if(escolha == 2){
			System.out.println("Voce ignora o homem pedindo ajuda, e segue sua navegacao");
			System.out.println(" -'Ao fundo voce escuta o choro do homem'- ");
			loop = false;
			_Principal.temporizador(3, true);
			}else if(escolha > 2){
				System.out.println("escolha invalida!");
				break;
			}
		
			if(charada){
					int resposta = 0;
					System.out.println("VOCE: Te darei uma unica chance... Se voce ganhar de mim em um jogo, eu te darei uma moeda.");
					System.out.println("HOMEM: Obrigado, muito obrigado!");
					System.out.println("VOCE: Tens uma chance apenas...");
					System.out.println("O homem comeca a pensar");
					_Principal.temporizador(3, false);

					System.out.println("O homem finalmente lhe diz: \nTenho uma charada para voce! Se voce acertar, voce ganhou. Caso erre, voce me da uma moeda!");
					System.out.println("\nÉ mais poderoso que os deuses, mais maligno que os demônios. É algo que os pobres tem e os ricos precisam. Se você comê-lo, você morre. O que é isto?\n");	
					System.out.println("[1] - Nada.                    [2] -Dinheiro.\n[3] - Sonho.                   [4] - Trabalho.");
					System.out.println("Sua resposta: "); resposta = sc.nextInt(); 
							if(resposta > 1){
								System.out.println("HOMEM: Voce errou! Isso quer dizer, quer dizer ...");
								System.out.println("VOCE: Sim... tome, voce mereceu.");
								//moeda+1
								System.out.println(" -'Voce escuta o homem agradecendo enquanto voce guia seu barco de volta'- ");
								for (int i = 0; i < 3; i++) {
									System.out.println(" . ");
									_Principal.temporizador(1, false);
								}
								loop = false;
								break;
							}else if(resposta == 1){
								System.out.println("HOMEM: Voce... Voce acertou...");
								System.out.println("VOCE: Sim... Adeus.");
								System.out.println(" -'Voce escuta o homem chorando cada vez mais baixo...'- ");

								_Principal.temporizador(3, false);
								loop = false;

								break;
							}

						}
		
	}while(loop == true);
		

		System.out.println();

		return 0;
	}

	
	
}
