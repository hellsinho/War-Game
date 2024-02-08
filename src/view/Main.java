import java.util.Scanner;

import controller.Game;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] colors = {"1-vermelho","2-azul","3-verde"};
        Game game = Game.getInstance(colors);

        System.out.println("Bem-vindo ao WAR!");

        System.out.println("Cores disponíveis:");
        String[] coresDisponiveis = game.getAvailableColors();

        System.out.print("Escolha sua cor (Digite o número correspondente): ");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= coresDisponiveis.length) {
            String corEscolhida = coresDisponiveis[escolha - 1];
            System.out.println("Você escolheu a cor " + corEscolhida + ". Boa sorte no jogo!");
        } else {
            System.out.println("Escolha inválida. Por favor, escolha um número válido.");
        }

        // Fechando o scanner
        scanner.close();
    }
}