public class Gerente extends Empregado {
    private String nomeGerencia;
    
    public String getNomeGerencia(){
        return this.nomeGerencia;
    }
    
    public void setNomeAgencia(String nomeAgencia){
        this.nomeGerencia = nomeAgencia;
    }
    
    @Override public String toString(){
        return "Nome: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nMatricula: " + super.getMatricula() + "\nNome da gerencia: " 
                + this.getNomeGerencia() + "\nValor do INSS: " + super.valorInss(super.getSalario());
    }
}
