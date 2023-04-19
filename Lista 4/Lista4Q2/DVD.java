public class DVD {
    String nome;
    float preco, duracao;
    
    public DVD(){

    }
    public DVD(float duracao, String nome, float preco){
        this.duracao = duracao;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void dadosDVD(){
        System.out.printf("Nome: %s\nDuracao: %.2f\nPreco: %.2f\n", nome, duracao, preco);   
    }
}

