package caronte;

import java.util.Scanner;



public class _Principal {
	
	public static void main(String[] args) {
		//sysout

		// Test
		boolean continuar = true;
		Scanner sc_Num = new Scanner(System.in);
		Scanner sc_Str = new Scanner(System.in);

		limparTela();

		temporizador(1);

		System.out.println("Caronte - O Barqueiro do Inferno");
		System.out.println("================================");

		System.out.println("Seja bem-vindo ao jogo Caronte!");
		System.out.println("Você está prestes a embarcar em uma jornada pelo Inferno.");

		boolean caminhoValido = false;
		int caminho = 0, pontos = 0;
		int[] caminhos = new int[4];
		int i = 0;

		do {
			limparTela();
			System.out.println("Escolha o caminho que deseja seguir:");

			int cont = 1;
			for (int j = 0; j < caminhos.length ; j++) {
				if (cont == caminhos[j]) {
					System.out.println(" " + cont  + " - já foi escolhido");
				}
				else{
					System.out.println(" " + cont + " - disponível");
				}
				cont ++;
			}
			
			temporizador(2);

			System.out.println("O caminho: ");
			caminho = sc_Num.nextInt();

			if (i == 5){
				caminho = 5;
			}
			else if (caminho > 0 && caminho < 5) {

				for (int index = 0; index < i; index++) {
					if (caminho == caminhos[index]) {
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
					System.out.println("Escolha outro caminho");
				}
			}
			// Criar uma condição para sair do loop
		} while (caminho != 5);
		
		System.out.println("Escolha out4o caminho");
		// 	limparTela();
		// 	caminho05(pontos);
	}

	public static void limparTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void temporizador(int tempoEmSegundos) {
		try {
			Thread.sleep(tempoEmSegundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
		// 	caminho03.iniciar();
		// 	break;
		// case 4:
		// 	Caminho04 caminho04 = new Caminho04();
		// 	caminho04.iniciar();
		// 	break;
		default:
			System.out.println("Saindo...");
			break;
		}
	}

	public static void caminho05(int pontos) {
		System.out.println("Você chegou ao fim do jogo!");
		System.out.println("Você conseguiu " + pontos + " pontos!");
	}
}
	

