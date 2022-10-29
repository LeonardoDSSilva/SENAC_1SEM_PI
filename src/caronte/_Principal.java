package caronte;

import java.util.Scanner;

import javax.script.ScriptContext;

public class _Principal {
	
	public static void main(String[] args) {

		int caminho, moedas = 0;

		Scanner sc_Num = new Scanner(System.in);
		Scanner sc_Str = new Scanner(System.in);

		limparTela();

		System.out.println("Caronte - O Barqueiro do Inferno");
		System.out.println("================================");

		System.out.println("Seja bem-vindo ao jogo Caronte!");
		System.out.println("Você está prestes a embarcar em uma jornada pelo Inferno.");


		System.out.println("Escolha o caminho que deseja seguir:");
		System.out.println("1 - Caminho 01");
		System.out.println("2 - Caminho 02");
		System.out.println("3 - Caminho 03");
		System.out.println("4 - Caminho 04");
		System.out.println("5 - Sair");
	
		System.out.println("O caminho: ");
		caminho = sc_Num.nextInt();

		menuOCaminho(caminho);

		limparTela();
		caminho05(moedas);

	}
	public static void limparTela() {
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}
	public static void menuOCaminho(int caminho) {
		int moedas = 0;
	
		switch (caminho) {
		case 1:
			Caminho01 caminho01 = new Caminho01();
			moedas += caminho01.iniciar();
			break;
		case 2:
			Caminho02 caminho02 = new Caminho02();
			moedas += caminho02.iniciar();
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

	public static void caminho05(int moedas) {

		
		System.out.println("Você chegou ao fim do jogo!");
		System.out.println("Você conseguiu " + moedas + " moedas!");
	}
}
	

