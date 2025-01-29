public abstract class Personaggio {
    private String nome;
    private int puntiVita;
    private int puntiAttacco;
    private int puntiDifesa;
    private int puntiStamina;
    private int puntiMovimento;

    public Personaggio(String nome, int puntiVita, int puntiAttacco, int puntiDifesa, int puntiStamina, int potenza,
            int resistenza, int puntiMovimento) {
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
        this.puntiStamina = puntiStamina;
        this.puntiMovimento = puntiMovimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPuntiVita() {
        return this.puntiVita;
    }

    public void setPuntiVita(int puntivita) {
        this.puntiVita = puntivita;
    }

    public int getAttacco() {
        return this.puntiAttacco;
    }

    public void setAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public int getDifesa() {
        return this.puntiDifesa;
    }

    public void setDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }

    public int getStamina() {
        return this.puntiStamina;
    }

    public void setStamina(int puntiStamina) {
        this.puntiStamina = puntiStamina;
    }

    public int getMovimento() {
        return this.puntiMovimento;
    }

    public void setMovimento(int puntiMovimento) {
        this.puntiMovimento = puntiMovimento;
    }

    // Azione attacca, il personaggio attaccare infliggendo il danno

    public abstract void attacco();

    // Azione difesa, il personaggio si difenderà diminuendo il danno inflitto

    public abstract void difendi();

    // Azione movimento, il personaggio si muoverà in base al suo movimento

    public abstract void muovi();

    // Azione cerca, il personaggio cercherà nella sperenza di trovare degli oggetti

    public abstract void cerca();

}
