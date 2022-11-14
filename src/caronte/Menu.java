package caronte;

import java.util.Scanner;

import caronte._Principal;

public class Menu {

	
	
	public static void exibirMenu() {

		Scanner sc_Num = new Scanner(System.in);
		
		
		_Principal.limparTela();
		_Principal.temporizador(5);
		
		int caminho, pontos = 0;
		int[] caminhos = new int[4];
		int i = 0;

		do {
			System.out.println("Escolha o caminho que deseja seguir:");
	
				
			System.out.println("1 - Caminho 01");
			System.out.println("2 - Caminho 02");
			System.out.println("3 - Caminho 03");
			System.out.println("4 - Caminho 04");

			System.out.println("5 - Sair");
			
			_Principal.temporizador(2);
			
			boolean caminhoValido = false;
			
			
			System.out.println("O caminho: ");
				caminho = sc_Num.nextInt();

			// Array -> Verificar se o caminho já foi escolhido

			if (i == 5){
				caminho = 5;
			}
			else if (caminho > 0 && caminho < 5) {

				for (int j = 0; j < i; j++) {
					if (caminho == caminhos[j]) {
						caminhoValido = true;
					}
				}
				if (!caminhoValido) {
					caminhos[i] = caminho;
					i++;
					menuOCaminho(caminho);
				}
				else{
					// Exibir todos os caminhos já escolhidos
					for (int j = 0; j < i; j++) {
						System.out.println("Caminho " + caminhos[j] + " já foi escolhido");
					}
					System.out.println("Escolha outro caminho");
				}
			}
				// Criar uma condição para sair do loop
				
			} while (caminho != 5);
			
				// _Principal.limparTela();
				// caminho05(pontos);
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

			// case 3:
			// 	Caminho03 caminho03 = new Caminho03();
			// 	pontos += caminho03.iniciar();
			// break;

			// case 4:
			// 	Caminho04 caminho04 = new Caminho04();
			// 	pontos += caminho04.iniciar();
			// break;

		default:
			System.out.println("Saindo...");
			break;
		}
	}
}


