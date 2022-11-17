package caronte;

import java.util.Scanner;

public class _Principal {
	
	public static void main(String[] args) {

		Scanner sc_Num = new Scanner(System.in);

		limparTela();
		
		System.out.println("\u001B[31mCaronte - O Barqueiro do Inferno\u001B[0m");
		System.out.println("================================");
		
		System.out.println("Seja bem-vindo ao jogo Caronte!");
		
		System.out.println("Você está prestes a embarcar em uma jornada pelo Inferno.");
		
		temporizador(3, true);
		
		int caminho = 0, pontos = 0;
		int[] caminhos = new int[4];
		int i = 0;
		boolean existe = false;
		
		do {
			boolean caminhoValido = false;
			temporizador(3, true);
			
			if (i == 4){
				System.out.println("Você já escolheu todos os caminhos!");
				caminho = 5;
			}
			else {
				System.out.println("Escolha o caminho que deseja seguir:");
				
				for (int j = 1; j <= 4 ; j++) {
					for (int k = 0; k < caminhos.length; k++) {
						if (caminhos[k] == j) {
							existe = true;
						}
					}
					if (existe) {
						System.out.println("\u001B[31m " + j  + " - já foi escolhido\u001B[0m");
					}
					else{
						System.out.println(" " + j + " - disponível");
					}
					existe = false;
				}
				
				System.out.print("O caminho: ");
				caminho = sc_Num.nextInt();
			}
			
			if (caminho > 0 && caminho < 5) {
				for (int index = 0; index < i; index++) {
					if (caminho == caminhos[index]) {
						caminhoValido = true;
					}
				}
				if (!caminhoValido) {
					caminhos[i] = caminho;
					i++;
					pontos += menuOCaminho(caminho);
				}
				else{
					System.out.println("Escolha outro caminho");
				}
			}
			else if (caminho == 5) {
				System.out.println("Saindo...");
			}
			else if (caminho > 5 || caminho <= 0){
				System.out.println("Escolha um caminho válido");
			}

		} while (caminho != 5);
		
		System.out.println(" ");
		limparTela();
		caminho05(pontos);
	}

	public static void limparTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void temporizador(int tempoEmSegundos, boolean limpar) {
		try {
			for (int i = 0; i < tempoEmSegundos; i++) {
				System.out.print("\u001B[36m . ");
				Thread.sleep(1000);
			}
			System.out.println("\u001B[0m");
			if (limpar) {
				limparTela();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static int menuOCaminho(int caminho) {
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
		return pontos;
	}

	public static void caminho05(int pontos) {
		System.out.println("Você chegou ao fim do jogo!");
		System.out.println("Você conseguiu " + pontos + " pontos!");
	}
}