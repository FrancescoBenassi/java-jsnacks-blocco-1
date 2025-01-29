public class Guerriera extends Personaggio {
    private int puntiDestrezza;
    private int puntiStrategia;

    public Guerriera(String nome, int puntiVita, int puntiAttacco, int puntiDifesa, int puntiStamina, int potenza,
            int resistenza, int puntiMovimento, int puntiDestrezza, int puntiStrategia) {
        super(nome, puntiVita, puntiAttacco, puntiDifesa, puntiStamina, potenza, resistenza, puntiMovimento);
        this.puntiDestrezza = puntiDestrezza;
        this.puntiStrategia = puntiStrategia;
    }

    public int getPuntiDestrezza() {
        return this.puntiDestrezza;
    }

    public void setPuntiDestrezza(int puntiDestrezza) {
        this.puntiDestrezza = puntiDestrezza;
    }

    public int getPuntiStrategia() {
        return this.puntiStrategia;
    }

    public void setPuntiStrategia(int puntiStrategia) {
        this.puntiStrategia = puntiStrategia;
    }

    @Override
    public void attacco() {
        System.out.println("La guerriera attacca infliggendo danni al nemico pari a " + super.getAttacco());
    }

    @Override
    public void difendi() {
        System.out.println("La guerriera difende diminuendo i danni subiti di " + super.getDifesa());

    }

    @Override
    public void muovi() {
        System.out.println("La guerriera si muove di " + super.getMovimento() + " spazi");

    }

    @Override
    public void cerca() {
        System.out.println("La guerriera cerca nel posto dove si trova");
    }

}
