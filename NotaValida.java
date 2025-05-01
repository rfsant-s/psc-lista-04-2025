
package numerovalido;
import java.util.Scanner;

public class NotaValida {
  
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     int nota;
        
     System.out.println("Digite o valor da nota: ");
     nota = scanner.nextInt();
         
     while (nota < 0 || nota > 10) {
     System.out.println("Nota inválida. Digite uma nota válida de 0 à 10:");
     nota = scanner.nextInt();
     }
     
     if (nota > 0 || nota < 10) {
             System.out.println("Nota salva no sistema!");
    }
    
}
}