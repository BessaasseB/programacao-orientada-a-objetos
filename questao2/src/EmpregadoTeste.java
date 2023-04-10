public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Joao", "Silva", 2500.00);
        Empregado empregado2 = new Empregado("Maria", "Santos", 3500.00);

        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + " - salario anual = " + empregado1.salarioAnual());
              
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + " - salario anual = " + empregado2.salarioAnual());
        
        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + " - salario anual apos aumento de 10% = " + empregado1.salarioAnual());
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + " - salario anual apos aumento de 10% = " + empregado2.salarioAnual());
        
    }
}