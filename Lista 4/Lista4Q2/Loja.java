public class Loja {
    public static void main(String[] args) {
        CD cd1 = new CD(3, "Calipso", 10);
        DVD dvd = new DVD(10, "musicas", 100);
        Livro livro1 = new Livro("Tolken", "O senhor dos aneis", 100);
        Livro livro2 = new Livro("J. K. Rowling", "Harry potter", 100);
        CD cd2 = new CD(4, "Sla", 9);
        
        livro1.dadosLivro();
        livro2.dadosLivro();
        cd1.dadosCD();
        cd2.dadosCD();
        dvd.dadosDVD();
    }
    
}
