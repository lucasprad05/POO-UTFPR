//Lucas Prado & Erik Noda
package exc4;

import java.util.Scanner;

// Ideia: Alunos da UTFPR ganham pagam: Gratis - 5,0 - 10,00
public class Aluno {
    public int opcao;
    
    public Aluno(int totalMinutos){
    System.out.println("Digite 1 caso o cliente estude na UTFPR!\nCaso nao estude, digite 0");
    Scanner scan = new Scanner(System.in);
    opcao = scan.nextInt();
        if(opcao == 1){
            if(totalMinutos <= 30){
                System.out.println("Valor a pagar: Gratis!");
            } else if(totalMinutos <= 60){
                System.out.println("Valor a pagar: 5,00!");
            } else{
                System.out.println("Valor a pagar: 10,00!");
            }//if
        }else{
            if(totalMinutos <= 30){
                System.out.println("Valor a pagar: Gratis!");
            } else if(totalMinutos <= 60){
                System.out.println("Valor a pagar: 10,00!");
            } else{
                System.out.println("Valor a pagar: 20,00!");
            }//if
        }//else
    }//aluno
    
}//class
