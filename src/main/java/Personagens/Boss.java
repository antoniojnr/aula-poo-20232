package Personagens;

import modelos.Arma;
import modelos.Armadura;
import modelos.Personagem;

public class Boss  {
    private String nome;
    private int vida;
    private Arma arma;
    private int forca;

    public Boss(String nome, Armadura armadura, Arma arma, String nivel) {
        this.nome = nome;
        this.vida = 1000;
        this.arma = arma;
        this.forca = nivel.equals("f")? 3: nivel.equals("m")? 5: 7;
    }

    public String getNome() {
        return this.nome;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        System.out.printf("%s recebeu dano de %d (Vida: %d)%n",
                this.nome, dano, this.vida);
    }

    public void atacar(Personagem outro) {
        if (arma == null) {
            System.out.printf("%s atacou %s com a mão%n",
                    this.nome, outro.getNome());
            outro.receberDano(1 + forca);
            return;
        }

        System.out.printf("%s atacou %s com %s%n",
                this.nome, outro.getNome(), arma.getNome());
        outro.receberDano(arma.getDano() + forca);
    }
}
