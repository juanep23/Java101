import java.util.*;
class Main {
  public static void main(String[] args) {

  // Exercício 1: Verificar se é par ou ímpar

    /*
    Scanner scan = new Scanner(System.in);

    int n;
    
    System.out.println("Digite um número: ");
      n = scan.nextInt();

    if((n%2)==0){
      System.out.println("O número é par.");
    } else {
      System.out.println("O número é ímpar.");
    };
    */


  // Exercício 2: Verificar se é maior de idade

    /*
     Scanner scan = new Scanner(System.in);

     int idade;

     System.out.println("Digite sua idade: ");
       idade = scan.nextInt();

    if(idade >= 18){
      System.out.println("Você é maior de idade.");
    } else {
      System.out.println("Você é menor de idade.");
    };
    */

  // Exercício 3: Cálculo de bônus salarial

    Scanner scan = new Scanner(System.in);

     double salario;

     System.out.println("Digite seu salário: ");
       salario = scan.nextDouble();

    if(salario <= 1000){
        salario = salario*1.1;
    } else if( salario > 1000 && salario < 2000){
        salario = salario*1.05;
    } else {
        salario = salario*1.02;
    } ;

     System.out.println("Seu salário com bônus é: "+salario);
  }
}  