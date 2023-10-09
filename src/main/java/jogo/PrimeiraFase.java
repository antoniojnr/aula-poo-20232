package jogo;

import Personagens.Guerreiro;
import modelos.Arma;
import modelos.Armadura;

import java.util.Scanner;

public class PrimeiraFase {
    Scanner teclado = new Scanner(System.in);
    public void preparacao(){
        // Abertura do jogo
        System.out.println("Aqui começa a sua jornada como jogador de RPG.\n Um mundo de possibilidades se expandem para você fugir da sua realidade\n" +
                "E poder lutar contra os terriveis monstros dessa aventura. Então boa sorte e aproveite!\n\n" +
                "Agora informe o tipo do seu personagem: (1 - Guerreiro | 2 - Mago)  ");
        String tipoGuerreiro = teclado.next();

        // Inserção do nome, arma e armadura
        switch (tipoGuerreiro){
            case "1":
                System.out.println("Informe o nome do seu guerreiro: ");
                Guerreiro guerreiro = new Guerreiro(teclado.next());
                System.out.println("Informe a arma do seu guerreiro: ");
                guerreiro.setArma(new Arma(teclado.next(), 30, 0));
                guerreiro.setArmadura(new Armadura(15));
                break;
            case "2":
                System.out.println("Ainda está em produção esse personagem");
        }
    }
}
