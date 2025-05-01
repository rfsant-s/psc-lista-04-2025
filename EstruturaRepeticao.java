package estruturarepeticao;

import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {
        int n;
        int soma = 0;
        String resp;
        
        Scanner scanner = new Scanner(System.in);
     
        do {
            System.out.println("Digite um número:");
            n = scanner.nextInt();
            soma += n;
            
            System.out.println("Quer continuar? [S/N]");
            resp = scanner.next();

        } while (resp.equals("S"));

        System.out.println("A soma dos números é: " + soma);

    }
}
