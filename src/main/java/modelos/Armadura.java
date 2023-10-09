package modelos;

public class Armadura {

    private int protecao;
    private int mana;

    public Armadura(int protecao){
        this.protecao = protecao;
    }

    public Armadura(int protecao, int mana){
        this.protecao = protecao;
        this.mana = mana;
    }

    public int getProtecao() {
        return protecao;
    }

    public void setProtecao(int protecao) {
        this.protecao = protecao;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

}
