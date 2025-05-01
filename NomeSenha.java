
package nomesenha.java;

import java.util.Scanner;

public class NomeSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o nome de usuário:");
        String nomeUsuario = scanner.nextLine();
        String senhaUsuario;
        
        System.out.println("Digite a senha:");
        senhaUsuario = scanner.nextLine();

        while (senhaUsuario.equals(nomeUsuario)) {
        System.out.println("Senha incorreta. Digite novamente:");
        senhaUsuario = scanner.nextLine();
    }
        if (!senhaUsuario.equals(nomeUsuario)) {
            System.out.println("Dados salvos no sistema!");
        }        
    }   
}
