public class CD {
    String nome;
    float preco;
    int numFaixas;
    
    public CD(){

    }
    public CD(int numFaixas, String nome, float preco){
        this.numFaixas = numFaixas;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void dadosCD(){
        System.out.printf("Nome: %s\nNumero de faixas: %d\nPreco: %.2f\n", nome, numFaixas, preco);   
    }
}

