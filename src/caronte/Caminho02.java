package caronte;

import java.util.Scanner;

import caronte._Principal;

public class Caminho02 {
	public int iniciar() {
        _Principal.limparTela();


		System.out.println("Seja bem-vindo ao Caminho 02!");
		System.out.println("O caminho 02 é o caminho da Predra.");
		System.out.println("As regras do mundo que você vivia não existem mais.");

        _Principal.temporizador(3);
        _Principal.limparTela();
		int pontos = jogo();

		return 0;
	}
	private static int jogo() {
        int ponto = 0;
        
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Escolha sua usuario");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        int usuario = iScanner.nextInt();

        _Principal.limparTela();

        escolha(usuario, "Você");
        
        if (usuario >= 1 && usuario <= 3) {
            
            int computador = (int) (Math.random() * 3) + 1;
            escolha(computador, "Computador");
            
            System.out.println();
            if (usuario == computador) {
                System.out.println("Empate");
                ponto = 0;
            } else if (usuario == 1 && computador == 3) {
                System.out.println("Você ganhou");
                ponto = 1;
            } else if (usuario == 2 && computador == 1) {
                System.out.println("Você ganhou");
                ponto = 1;
            } else if (usuario == 3 && computador == 2) {
                System.out.println("Você ganhou");
                ponto = 1;
            } else {
                System.out.println("Você perdeu");
                ponto = -1;
            }
        }
        return ponto;
    }

    private static void escolha(int computador, String usuario) {
        switch (computador) {
            case 1:
            System.out.println(usuario + " escolheu Pedra");
            break;
            case 2:
            System.out.println(usuario + " escolheu Papel");
            break;
            case 3: 
            System.out.println(usuario + " escolheu Tesoura");
            break;
            default:
            System.out.println("Opção inválida");
            break;
        }
    }
}
