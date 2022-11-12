package caronte;

public class Menu {
	
	public static void exibirMenu() {
		
		limparTela();
		temporizador(5);

		int caminho, pontos = 0;

		System.out.println("Caronte - O Barqueiro do Inferno");
		System.out.println("================================");

		System.out.println("Seja bem-vindo ao jogo Caronte!");
		System.out.println("Você está prestes a embarcar em uma jornada pelo Inferno.");
		
		
		do {
			System.out.println("Escolha o caminho que deseja seguir:");
	
				
			System.out.println("1 - Caminho 01");
			System.out.println("2 - Caminho 02");
			System.out.println("3 - Caminho 03");
			System.out.println("4 - Caminho 04");

			System.out.println("5 - Sair");
			
				
				
			limparTela();
			System.out.print("O caminho: ");
			caminho = sc_Num.nextInt();
			
			temporizador(2);
			
			int[] caminhos = new int[4];
			boolean caminhoValido = false;
			
			for (int i = 0; i < caminhos.length; i++) {
				System.out.println("O caminho: ");
				caminho = sc_Num.nextInt();

				for (int j = 0; j < i; j++) {
					if (caminho == caminhos[j]) {
						caminhoValido = true;
					}
				}
				if (caminhoValido) {
					caminhos[i] = caminho;
					i--;
					System.out.printf("O Caminho %d já foi escolhido. Escolha outro caminho.%n", caminho);
				} else {
					caminhos[i] = caminho;
					menuOCaminho(caminho);
				}
			}

	
				// Array 
	
				// Criar uma condição para sair do loop
				
			} while (continuar);
			
			limparTela();
			caminho05(pontos);
		}
	


	public static void menuOCaminho(int caminho) {
		int pontos = 0;
	
		switch (caminho) {
			case 1:
				Caminho01 caminho01 = new Caminho01();
				pontos += caminho01.iniciar();
			break;

			case 2:
				Caminho02 caminho02 = new Caminho02();
				pontos += caminho02.iniciar();
			break;

			case 3:
				Caminho03 caminho03 = new Caminho03();
				pontos += caminho03.iniciar();
			break;

			case 4:
				Caminho04 caminho04 = new Caminho04();
				pontos += caminho04.iniciar();
			break;

		default:
			System.out.println("Saindo...");
			break;
		}
	}
}


