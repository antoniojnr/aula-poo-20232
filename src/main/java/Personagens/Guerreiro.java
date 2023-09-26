package Personagens;

import modelos.Arma;
import modelos.Armadura;
import modelos.Personagem;

public class Guerreiro extends Personagem {

    private int forca;

    public int getForca() {
        return forca;
    }

    public Guerreiro(String nome) {
        super(nome);
        this.forca = 10;
    }

    @Override
    public void setArma(Arma arma) {
        if(arma.getTipo() == 'corpo'){
            arma.setDano(arma.getDano() + 5);
        }
        super.setArma(arma);
    }

    public void pedirBardoTocar() {
        this.forca += 5;
        setVida(getVida() + 10);
    }

    public void bardoPara() {
        this.forca -= 5;
        setVida(getVida() - 5);
    }

    @Override
    public void atacar(Personagem outro) {
        if (getArma() == null) {
            System.out.printf("%s atacou %s com a mão%n",
                    this.getNome(), outro.getNome());
            outro.receberDano(1 + getForca());
            return;
        }

        System.out.printf("%s atacou %s com %s%n",
                this.getNome(), outro.getNome(), getArma().getNome());
        outro.receberDano(getArma().getDano() + getForca());
    }
}
