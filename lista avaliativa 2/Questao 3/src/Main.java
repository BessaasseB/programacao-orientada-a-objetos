import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fornecedor f = new Fornecedor();
        Empregado e = new Empregado();
        Administrador a = new Administrador();
        Operario o = new Operario();
        Vendedor v = new Vendedor();
        //Scanner sc = new Scanner(System.in);
        
        //Testando a classe Fornecedor
        f.setNome("Roberto");
        f.setEndereco("Qs 213 conj B Casa 1");
        f.setTelefone("1231234");
        f.setValorCredito(1000);
        f.setValorDivida(250);
        System.out.println(f.obterSaldo());
           
        //Testando a classe Empregado
        e.setNome("João");
        e.setCodigoSetor(123);
        e.setEndereco("Endereco teste");
        e.setTelefone("111111111");
        e.setSalarioBase(1000);
        e.setImposto(0.1);
        System.out.println(e.calcularSalario());
        
        //Testando a classe Administrador
        a.setNome("Carla");
        a.setEndereco("NM 213 conj 12 Casa A");
        a.setTelefone("123123123");
        a.setSalarioBase(1000);
        a.setAjudaDeCusto(1000);
        System.out.println(a.calcularSalario());
        
        //Testando a classe Operario
        o.setNome("Amanda");
        o.setEndereco("Qs 213 conj B Casa 1");
        o.setTelefone("1231234");
        o.setSalarioBase(1000);
        o.setValorProducao(400);
        o.setComissao(0.1);
        System.out.println(o.calcularSalario());
        
        //Testando a classe Vendedor
        v.setNome("Bessa");
        v.setEndereco("Qs 213 conj B Casa 1");
        v.setTelefone("12121212");
        v.setSalarioBase(1000);
        v.setValorVendas(2000);
        v.setComissao(0.1);
        System.out.println(v.calcularSalario());
        
    }
    
}
