package questao3;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        int idade, contador = 0;
        float salario;
        char sexo, olho, cabelo;
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            do{
                System.out.println("Informe a idade do usuario a ser cadastrado:");
                idade = sc.nextInt();

                if(idade == -1){
                    break;
                }
                else if(idade < 10 || idade > 100){
                    System.out.println("Apenas idades entre 10 e 100 anos aceitas!!!");
                }
                
                
            }while(idade < 10 || idade > 100);
            
            if(idade == -1){
                break;
            }
            
            do{
                System.out.println("Imforme o sexo(f ou m):");
                sexo = sc.next().charAt(0);
                
                if(sexo != 'f' && sexo != 'm'){
                    System.out.println("Informe um sexo valido (f ou m)!!!");
                }
            }while(sexo != 'f' && sexo != 'm');
            
            do{
                System.out.println("Informe a cor do olho:");
                olho = sc.next().charAt(0);
                
                if(olho != 'a' && olho != 'v' && olho != 'c' && olho != 'p'){
                    System.out.println("Informe uma cor valida (a, v, c ou p)!!!");
                }
                
            }while(olho != 'a' && olho != 'v' && olho != 'c' && olho != 'p');
            
            do{
                System.out.println("Informe a cor do cabelo");
                cabelo = sc.next().charAt(0);
                
                if(cabelo != 'l' && cabelo != 'c' && cabelo != 'p' && cabelo != 'r'){
                    System.out.println("Informe uma cor valida (l, c, p ou r)!!!");
                }
            }while(cabelo != 'l' && cabelo != 'c' && cabelo != 'p' && cabelo != 'r');
            
            do{
                System.out.println("Informe o salario:");
                salario = sc.nextFloat();
                
                if(salario < 0){
                    System.out.println("Salario nao pode ser negativo!!!");
                }
            }while(salario < 0);
            
            if(sexo == 'f' && idade > 18 && idade < 35 && olho == 'c' && cabelo == 'c'){
                contador++;
            }
            
        }
        System.out.println("Quantidade de pessoas que atendem as expecificacoes: " + contador);
    }
    
}
