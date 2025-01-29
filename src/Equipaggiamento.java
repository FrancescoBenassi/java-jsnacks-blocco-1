public class Equipaggiamento {
    private String nomeEquipaggiamento;
    private int potenza;
    private int resistenza;
    private boolean magia;

    public Equipaggiamento(String nomeEquipaggiamento, int potenza, int resistenza, boolean magia) {
        this.nomeEquipaggiamento = nomeEquipaggiamento;
        this.potenza = potenza;
        this.resistenza = resistenza;
        this.magia = magia;
    }

    public String getNomeEquipaggiamento(){
        return this.nomeEquipaggiamento;
    }

    public int getPotenza(){
        return this.potenza;
    }

    public int getResistenza(){
        return this.resistenza;
    }

    public boolean getMagia(){
        return this.magia;
    }

    public void cambiareEquipaggiamento(String nomeEquipaggiamento, int potenza, int resistenza, boolean magia){
        this.nomeEquipaggiamento = nomeEquipaggiamento;
        this.potenza = potenza;
        this.resistenza = resistenza;
        this.magia = magia;
    }
}
