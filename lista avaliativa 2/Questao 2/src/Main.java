public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        Gerente g = new Gerente();
        Vendedor v = new Vendedor();
        Empregado e = new Empregado();
        
        c.setNome("Joao");
        c.setIdade(21);
        c.setSexo("Masculino");
        c.setValorDivida(120);
        c.setAnoNascim(2002);
        
        g.setNome("Amanda");
        g.setIdade(20);
        g.setMatricula("11222333");
        g.setNomeAgencia("Paulo Otavio");
        g.setSalario(10000);
        
        v.setNome("Andre");
        v.setSalario(5000);
        v.setValorVendas(100);
        v.setQntVendas(25);
        
        
        System.out.println(c.toString());
        System.out.println("\n");
        System.out.println(g.toString());
        System.out.println("\n");
        System.out.println(v.toString());
    }
}
