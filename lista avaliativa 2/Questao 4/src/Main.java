public class Main {
    public static void main(String[] args) {
        Mago m = new Mago();
        Guerreiro g = new Guerreiro();
        Assassino a = new Assassino();
        
        m.setNome("Jorge");
        m.setVida(200);
        
        g.setNome("Maria");
        g.setForca(50);
        
        a.setNome("Joao");
        a.setDestreza(10);
        
        System.out.println(m.getNome());
        System.out.println(m.getVida());
        
        System.out.println(g.getNome());
        System.out.println(g.getForca());
        
        System.out.println(a.getNome());
        System.out.println(a.getDestreza());
        
    }
}
