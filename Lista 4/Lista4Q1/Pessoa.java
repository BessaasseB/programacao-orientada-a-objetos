package Main;
public class Pessoa {
    
    int idade, diaNascimento,mesNascimento, anoNascimento;
    String Nome;
    
    public Pessoa(int dia, int mes, int ano){
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }
    
    
    public void ajustaDataDeNascimento(int dia, int mes, int ano){
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }
    public void calculaIdade(int dia, int mes, int ano){
        int diaAtual = dia, mesAtual = mes, anoAtual = ano;
        
        if(mesAtual > this.mesNascimento){
            idade = anoAtual - anoNascimento;
        }
        else{
            idade = (anoAtual - anoNascimento) - 1;
        }
    }
    
    public int informaIdade(){
        return idade;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return "Dia de nascimento: " + diaNascimento + "\nMes de nascimento: " + mesNascimento + "\nAno de nascimento: " + anoNascimento + "\nIdade atual: " + idade;
    }
}
