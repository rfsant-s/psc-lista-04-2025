package geradornum;

import java.util.Scanner;

public class GeradorNum {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int n2 = scanner.nextInt();
        
        if (n1>n2) {
            while(n2<=n1) {
            System.out.println(n2);
            n2++;
            } 
        }
            
        if (n2>n1) {
            while (n1<=n2) {
            System.out.println(n1);
            n1++;
                }
            }
        
    }  
}
