package caronte;

import java.util.Scanner;

public class _Principal {

  public static void main(String[] args) {
    Scanner sc_Num = new Scanner(System.in);
    Scanner enter = new Scanner(System.in);
    String temp = " ";
    limparTela();
    _Principal.temporizador(1, false);
    System.out.println(
      "============================================================================================================================"
    );
    System.out.println(
      "============================================:\u001B[31m          CARONTE\u001B[0m             :================================================"
    );
    System.out.println(
      "============================================================================================================================"
    );

    System.out.println(
      "	Na mitologia grega, Caronte é o barqueiro de Hades, que carrega as almas dos recém-mortos sobre as águas do rio Estige e Aqueronte, que dividiam o mundo dos vivos do mundo dos mortos.\nEra necessario uma moeda para pagar pela viagem de transicao, moeda esta que era colocada dentro ou sobre a boca dos mortos.\nAqueles que nao possuiam condicoes para pagar a quantia eram destinados a vagar pelos rios pela eternidade...\n"
    );

    System.out.println(
      "	Você é o Caronte... Voce ira demonstrar misericordia, ou ira cumprir sua missao?"
    );
    System.out.println(
      "#################################################################################################################################################\n"
    );
    System.out.println(
      "\u001B[35m\nAperte qualquer coisa e de enter para continuar...\u001B[0m"
    );
    temp = enter.nextLine();
    int caminho = 0, pontos = 0;
    int[] caminhos = new int[3];
    int i = 0;
    boolean existe = false;

    do {
      boolean caminhoValido = false;
      temporizador(3, true);

      if (i == 3) {
        System.out.println("Você já escolheu todos os caminhos!");
        temporizador(4, true);
        caminho = 4;
      } else {
        System.out.println("Escolha o caminho que deseja seguir:");

        for (int j = 1; j <= 3; j++) {
          for (int k = 0; k < caminhos.length; k++) {
            if (caminhos[k] == j) {
              existe = true;
            }
          }
          if (existe) {
            System.out.println(
              "\u001B[31m " + j + " - já foi escolhido\u001B[0m"
            );
          } else {
            System.out.println(" " + j + " - disponível");
          }
          existe = false;
        }

        System.out.print("O caminho: ");
        caminho = sc_Num.nextInt();
      }

      if (caminho > 0 && caminho < 4) {
        for (int index = 0; index < i; index++) {
          if (caminho == caminhos[index]) {
            caminhoValido = true;
          }
        }
        if (!caminhoValido) {
          caminhos[i] = caminho;
          i++;
          pontos += menuOCaminho(caminho);
        } else {
          System.out.println("Escolha outro caminho");
        }
      } else if (caminho == 4) {
        System.out.println("Saindo...");
      } else if (caminho > 4 || caminho <= 0) {
        System.out.println("Escolha um caminho válido");
      }
    } while (caminho != 4);

    System.out.println(" ");
    caminho04(pontos);
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
      default:
        System.out.println("Saindo...");
        break;
    }
    return pontos;
  }

  public static void caminho04(int pontos) {
    if (pontos > 0) {
      System.out.println(
        "Você foi misericordioso e conseguiu salvar " +
        pontos +
        " almas!"
      );
    } else {
      System.out.println("Você não conseguiu salvar ninguém... Quem sabe da proxima?");
    }
  }
}
