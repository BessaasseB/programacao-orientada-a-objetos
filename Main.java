import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CADASTRO DE USUARIO");
        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();
        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();
        System.out.println("Informe sua altura:");
        float altura = sc.nextFloat();
        
        System.out.println("\nDADOS CADASTRADOS"
                           +"\nNome: "+nome
                           +"\nIdade: "+idade
                           +"\nAltura: "+altura);
        
        
    }
    
}
