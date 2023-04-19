public class Livro {
    float preco;
    String autor, nome;
    
    public Livro(){

    }
    public Livro(String autor, String nome, float preco){
        this.autor = autor;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void dadosLivro(){
        System.out.printf("Nome: %s\nAutor: %s\nPreco: %.2f\n", nome, autor, preco);   
    }
}
