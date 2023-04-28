public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascim;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }
    
    @Override
    public String toString(){
        return "Nome: " + super.getNome() + "\nIdade: " + super.getIdade() +  "\nSexo: " + super.getSexo() + "\nValor da divida: " + this.valorDivida + "\nAno de nascimento: " + this.anoNascim;
    }
    
}
