package caronte;

import java.util.Scanner;
import java.util.Random;
import caronte._Principal;

public class Caminho02 {
	public int iniciar() {

        int pontos = 0;
        _Principal.limparTela();


		System.out.println("\u001B[31mSeja bem-vindo ao Caminho 02!\u001B[0m");
        _Principal.temporizador(2, true);
        
		System.out.println("O caminho 02 é o caminho da Predra.");
        _Principal.temporizador(2, true);
        _Principal.limparTela();
        
		System.out.println("\u001B[35mAs regras do mundo que você vivia não existem mais.");
        System.out.println("Você está em um mundo onde a magia é real.\u001B[0m");

        _Principal.temporizador(4, true);
        _Principal.limparTela();

        System.out.println("[1] - O primeiro modo é um caminho sem volta.");
        System.out.println("[2] - O segundo modo é você terá chaces de tentar novamente mas porderá se mais cansativo.\n");
        
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Escolha o modo que você deseja seguir: ");
        int modo = iScanner.nextInt();

        _Principal.temporizador(3, true);
        _Principal.limparTela();

        switch (modo){
            case 1:
                pontos = jogo();
            break;
            case 2:
                Random rand = new Random();
                int num_tentativas = rand.nextInt(5);

                for (int i = 0; i < num_tentativas; i++) {
                    pontos += jogo();
                }
                pontos = pontos / num_tentativas;
        }
		return pontos;
	}

	private static int jogo() {
        int ponto = 0;
        
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Escolhe");
        System.out.println("[1] - Pedra");
        System.out.println("[2] - Papel");
        System.out.println("[3] - Tesoura");
        int usuario = iScanner.nextInt();

        _Principal.limparTela();

        escolha(usuario, "Você");
        
        if (usuario >= 1 && usuario <= 3) {
            
            int computador = (int) (Math.random() * 3) + 1;
            escolha(computador, "Computador");
            
            System.out.println();
            if (usuario == computador) {
                // System.out.println("Empate");
                ponto = 0;
            } else if (usuario == 1 && computador == 3) {
                // System.out.println("Você ganhou");
                ponto = 1;
            } else if (usuario == 2 && computador == 1) {
                // System.out.println("Você ganhou");
                ponto = 1;
            } else if (usuario == 3 && computador == 2) {
                // System.out.println("Você ganhou");
                ponto = 1;
            } else {
                // System.out.println("Você perdeu");
                // ponto = -1;
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
