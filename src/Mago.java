public class Mago extends Personaggio {
    private int puntiMagia;
    private String animaleAddestrato;

    public Mago(String nome, int puntiVita, int puntiAttacco, int puntiDifesa, int puntiStamina, int potenza,
    int resistenza, int puntiMovimento, int puntiMagia, String animaleAddestrato){
        super(nome, puntiVita, puntiAttacco, puntiDifesa, puntiStamina, potenza, resistenza, puntiMovimento);
        this.puntiMagia = puntiMagia;
        this.animaleAddestrato = animaleAddestrato;
    }

    public int getPuntiMagia(){
        return this.puntiMagia;
    }

    public void setPuntiMagia(int puntiMagia){
        this.puntiMagia = puntiMagia;
    }

    public String getAnimaleAddestrato(){
        return this.animaleAddestrato;
    }

    public void setAnimaleAddestrato(String animaleAddestrato){
        this.animaleAddestrato = animaleAddestrato;
    }

    public void lanciaIncentesimo(){
        System.out.println("Il mago attacca lanciando un incantesimo contro il nemico");
    }

    @Override
    public void attacco() {
        System.out.println("Il mago attacca infliggendo danni al nemico pari a " + super.getAttacco());
    }

    @Override
    public void difendi() {
        System.out.println("Il mago difende diminuendo i danni subiti di " + super.getDifesa());

    }

    @Override
    public void muovi() {
        System.out.println("Il mago si muove di " + super.getMovimento() + " spazi");

    }

    @Override
    public void cerca() {
        System.out.println("Il mago cerca nel posto dove si trova");
    }
}
