package Main;
public class Main {
    public static void main(String[] args) {
       Pessoa AlbertEinstein = new Pessoa(14, 3, 1879);
       Pessoa IsaacNewton = new Pessoa(4, 1, 1643);
       
       //AlbertEinstein.ajustaDataDeNascimento(14, 3, 1879); Mudado para construtor
       //IsaacNewton.ajustaDataDeNascimento(4, 1, 1643); Mudado para construtor
       
        AlbertEinstein.calculaIdade(18, 04, 2023);
        IsaacNewton.calculaIdade(18, 04, 2023);
       
        System.out.println(AlbertEinstein.informaIdade());
        System.out.println(IsaacNewton.informaIdade());
        
    }
    
}
