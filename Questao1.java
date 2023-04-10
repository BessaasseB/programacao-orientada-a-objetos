import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario, salarioFinal, comissao, total;
        
        System.out.println("Informe quantos veiculos voce vendeu:");
        int quant = sc.nextInt();
        System.out.println("Informe o valor total de suas vendas:");
        total = sc.nextFloat();
        System.out.println("Informe seu salario fixo:");
        salario = sc.nextFloat();
        System.out.println("Informe o valor recebido por veiculo vendido:");
        comissao = sc.nextFloat();
        
        salarioFinal = (float)(salario + (comissao*quant) + (total * (5.0/100.0)));
    
        
        System.out.println("Salario final = " + salarioFinal);
    }
    
}
