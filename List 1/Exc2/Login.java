//Lucas Prado & Erik Noda
package exc2;

import java.util.Scanner;


// Ideia: Classe para digitar nome para entrada no Menu
public class Login {
    public String nome;
    
    public Login(){
        System.out.println("Digite seu nome: ");
        Scanner scan = new Scanner(System.in);
        nome = scan.nextLine();
        System.out.println("Ola, " + nome);
    }
}
