package verificacaosenha.java;

import java.util.Scanner;

public class VerificacaoSenhaJava {

    public static void main(String[] args) {
       int senha = 0;
        while (senha!=2025) { 
          System.out.println("DIGITE A SENHA CORRETA:");
          Scanner scanner = new Scanner (System.in);
          senha = scanner.nextInt();
          
          if (senha==2025) {
            System.out.println("SENHA CORRETA!");
          } else {
            System.out.println("SENHA INCORRETA!");
          }
        }
    }
}
   
