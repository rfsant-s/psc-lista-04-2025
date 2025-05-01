package maiornumero;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
    Scanner numero = new Scanner (System.in);
    int num1, num2, num3, num4, num5, maiorNum;
    
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
        
        maiorNum = num1;
        
        if (num2>maiorNum){
        maiorNum = num2;
    }
        if (num3>maiorNum){
        maiorNum = num3;
    }
        if (num4>maiorNum){
        maiorNum = num4;
    }
        if (num5>maiorNum){
        maiorNum = num5;
    }  
            System.out.print("O maior número é " + maiorNum);
            
}
}