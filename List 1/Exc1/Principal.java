//Lucas Prado & Erik Noda
package exc1;

import static java.lang.Math.*;
import java.util.Scanner;

public class Principal {
    public static Integer opcao;
    public static Float num1;
    public static Float num2;
    
    public Principal(){
        System.out.println("MENU");
        System.out.println("1-Abs");
        System.out.println("2-Ceil");
        System.out.println("3-Cos");
        System.out.println("4-Exp");
        System.out.println("5-Floor");
        System.out.println("6-Log");
        System.out.println("7-Max");
        System.out.println("8-Min");
        System.out.println("9-Pow");
        System.out.println("10-Sqrt");
        
        Scanner scan = new Scanner(System.in);
        opcao = scan.nextInt();
        scan.nextLine();
        
        switch(opcao){
            case 1 -> Abs();
            case 2 -> Ceil();
            case 3 -> Cos();
            case 4 -> Exp();
            case 5 -> Floor();
            case 6 -> Log();
            case 7 -> Max();
            case 8 -> Min();
            case 9 -> Pow();
            case 10 -> Sqrt();
        }//switch
    }

    public static void main(String[] args) {
        new Principal();
    }//main
    
    public static void Abs(){
        System.out.print("Digite um numero):\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println(num1+" em módulo é: " + abs(num1));
    }
    //--------------------------------------------------------------------------
    public static void Ceil(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O maior número inteiro ao arredondar " + num1 + " eh "+ ceil(num1));
    }
    //--------------------------------------------------------------------------
    public static void Cos(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O cosseno de " + num1 + " em radianos eh " + cos(num1));
    }
    //--------------------------------------------------------------------------
    public static void Exp(){
        System.out.print("digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O numero de euler elevado a " + num1 + " eh "+ exp(num1));
    }
    //--------------------------------------------------------------------------
    public static void Floor(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O menor número inteiro ao arredondar " + num1 + " eh "+ floor(num1));
    }
    //--------------------------------------------------------------------------
    public static void Log(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O logaritmo natural de " + num1 + " eh "+ log(num1));
    }
    //--------------------------------------------------------------------------
    public static void Max(){
        System.out.print("Digite o primeiro numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        scan.nextLine();
        System.out.print("Digite o segundo numero:\n");
        num2 = scan.nextFloat();
        System.out.println("O maior numero entre " + num1 +" e "+num2+ " eh "+ max(num1,num2));
    }
    //--------------------------------------------------------------------------
    public static void Min(){
        System.out.print("Digite o primeiro numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        scan.nextLine();
        System.out.print("Digite o segundo numero:\n");
        num2 = scan.nextFloat();
        System.out.println("O menor numero entre " + num1 +" e "+num2+ " eh "+ min(num1,num2));
    }
    //--------------------------------------------------------------------------
    public static void Pow(){
        System.out.print("Digite o numero que sera a base:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        scan.nextLine();
        System.out.print("digite o numero do expoente(caso float, usar vírgula ','):\n");
        num2 = scan.nextFloat();
        System.out.println(num1+" elevado a "+ num2 + " eh "+ pow(num1,num2));
    }
    //--------------------------------------------------------------------------
    public static void Sqrt(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("A raiz quadrada de " + num1 + " eh "+ sqrt(num1));
    }
    
}//class
