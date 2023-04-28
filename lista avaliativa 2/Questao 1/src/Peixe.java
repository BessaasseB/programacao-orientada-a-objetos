public class Peixe extends Animal {
    private String tipoHabitate;
       
    public Peixe(String nome, double peso, String tipoHabitat){
        super(nome, peso);
        this.tipoHabitate = tipoHabitat;
    }
    
    public void setTipoHabitate(String tipoH){
        this.tipoHabitate = tipoH;
    }
    public String getTipoHabitat(){
        return tipoHabitate;
    }
    
    @Override
    public String toString(){
        return "Nome: " + super.getNome() + "\nPeso: " + super.getPeso() + "\nTipo de habitat: " + this.tipoHabitate;
    }
}
