package somamedianum;

import java.util.Scanner;

public class SomaMediaNum {

    public static void main(String[] args) {
    Scanner numero = new Scanner (System.in);
    int num1, num2, num3, num4, num5, soma, media;
    
    System.out.print("Digite o primeiro número:");
        num1 = numero.nextInt();
        
    System.out.print("Digite o segundo número:");
    num2 = numero.nextInt();
        
    System.out.print("Digite o terceiro número:");
    num3 = numero.nextInt();
        
    System.out.print("Digite o quarto número:");
    num4 = numero.nextInt();
        
    System.out.print("Digite o quinto número:");
    num5 = numero.nextInt();
    
    soma = num1+num2+num3+num4+num5;
    media = soma/5;
    
        System.out.println("A soma dos números é " + soma);
        System.out.println("A média dos números é " + media);
    }
    
}
