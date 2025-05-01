package informacoes;

import java.util.Scanner;

public class Informacoes {

    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        
     Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        
        while (nome.length() < 3 ){
        System.out.println("Informação incorreta! Digite seu nome (min. 3 letras):");
        nome = scanner.nextLine();    
        }
        
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();
        
        while (idade < 0 || idade > 150){
        System.out.println("Informação incorreta! Digite sua idade:");
        idade = scanner.nextInt();    
   
        }
        
        System.out.println("Digite valor do seu salário:");
        salario = scanner.nextDouble();
        
        while (salario < 0){
        System.out.println("Informação incorreta! Digite o valor do seu salário:");
        salario = scanner.nextDouble();
        }
        
        System.out.println("Digite seu sexo(f/m):");
        sexo = scanner.next();
        
        while (!sexo.equals("f")&& !sexo.equals("m")){
        System.out.println("Informação incorreta! Digite a primeira letra do seu sexo(f - feminino / m - masculino)");
        sexo = scanner.next();
        }
        
        System.out.println("Digite seu estado civil(s/c/v/d):");
        estadoCivil = scanner.next();
        
        while (!estadoCivil.equals("s") && !estadoCivil.equals ("c") && !estadoCivil.equals ("v") && !estadoCivil.equals ("d")){
        System.out.println("Informação incorreta! Digite a primeira letra do seu estado civil: s - Solteiro(a), c - Casado(a), v - Viúvo(a), d - Divorciado(a)");
        estadoCivil = scanner.next();
        }
    }
    
}
