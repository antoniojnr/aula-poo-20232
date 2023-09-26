package Personagens;

import modelos.Personagem;

public class Bardo extends Personagem {

    private int atordoamento;
    public Bardo(String nome) {
        super(nome);
        this.atordoamento = 10;
    }

    @Override
    public void atacar(Personagem outro) {
        System.out.printf("%s atacou %s com %s%n",
                this.getNome(), outro.getNome(), getArma().getNome());
        outro.receberDano(getArma().getDano() + atordoamento);
    }

    @Override
    public void receberDano(int dano) {

         setVida(getVida() - (dano - getArmadura().getProtecao()) - atordoamento);
        System.out.printf("%s recebeu dano de %d (Vida: %d)%n",
                this.getNome(), dano, this.getVida());
    }
}
