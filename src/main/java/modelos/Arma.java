package modelos;

public class Arma {
    private String nome;
    private int dano;
    private int mana;
    private String tipo;



    public Arma(String nome, int dano, int mana) {
        this.nome = nome;
        this.dano = dano;
        this.mana = mana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
