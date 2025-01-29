public class Ladra extends Personaggio {
    private int puntiScaltrezza;
    private int puntiIntelligenza;

    public Ladra(String nome, int puntiVita, int puntiAttacco, int puntiDifesa, int puntiStamina, int potenza,
            int resistenza, int puntiMovimento, int puntiScaltrezza, int puntiIntelligenza) {
        super(nome, puntiVita, puntiAttacco, puntiDifesa, puntiStamina, potenza, resistenza, puntiMovimento);
        this.puntiScaltrezza = puntiScaltrezza;
        this.puntiIntelligenza = puntiIntelligenza;
    }

    public int getPuntiScaltrezza() {
        return this.puntiScaltrezza;
    }

    public void setPuntiScaltrezza(int puntiScaltrezza) {
        this.puntiScaltrezza = puntiScaltrezza;
    }

    public int getPuntiIntelligenza() {
        return this.puntiIntelligenza;
    }

    public void setPuntiIntelligenza(int puntiIntelligenza) {
        this.puntiIntelligenza = puntiIntelligenza;
    }

    public void ruba() {
        System.out.println("La ladra ruba al nemico adiacente");
    }

    @Override
    public void attacco() {
        System.out.println("La ladra attacca infliggendo danni al nemico pari a " + super.getAttacco());
    }

    @Override
    public void difendi() {
        System.out.println("La ladra difende diminuendo i danni subiti di " + super.getDifesa());

    }

    @Override
    public void muovi() {
        System.out.println("La ladra si muove di " + super.getMovimento() + " spazi");

    }

    @Override
    public void cerca() {
        System.out.println("La ladra cerca nel posto dove si trova");
    }
}
