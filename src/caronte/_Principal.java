package caronte;

import java.util.Scanner;

public class _Principal {
	
	public static void main(String[] args) {

		boolean continuar = true;
		Scanner sc_Num = new Scanner(System.in);
		Scanner sc_Str = new Scanner(System.in);

		limparTela();

		temporizador(1);

		System.out.println("Caronte - O Barqueiro do Inferno");
		System.out.println("================================");

		System.out.println("Seja bem-vindo ao jogo Caronte!");

		System.out.println("Você está prestes a embarcar em uma jornada pelo Inferno.");

		int caminho = 0, pontos = 0;
		int[] caminhos = new int[4];
		int i = 0;
		
		do {
			boolean caminhoValido = false;
			temporizador(3);
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
			
			System.out.println("O caminho: ");
			caminho = sc_Num.nextInt();
			
			if (i > 4){
				System.out.println("Você já escolheu todos os caminhos!");
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
					pontos += menuOCaminho(caminho);
				}
				else{
					System.out.println("Escolha outro caminho");
				}
			}
			else if (caminho == 5) {
				System.out.println("Saindo...");
				continuar = false;
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

	public static void temporizador(int tempoEmSegundos) {
		try {
			Thread.sleep(tempoEmSegundos * 1000);
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