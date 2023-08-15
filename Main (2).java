import java.util.*;

class Main {
  public static void main(String[] args) {

  // Exercício 1
    /*
    float n1, n2, n3;

    Scanner scan = new Scanner(System.in);

    System.out.println("EXERCÍCIO 1");
    System.out.println("Digite a primeira nota:");
      n1 = scan.nextFloat();
    System.out.println("Digite a segunda nota:");
      n2 = scan.nextFloat();
    System.out.println("Digite a terceira nota:");
      n3 = scan.nextFloat();

    System.out.println("A média é "+(n3+n2+n3)/3);
    */
    
  // Exercício 2

    /*
    float C, F;

    Scanner scan = new Scanner(System.in);

    System.out.println("EXERCÍCIO 2");
    System.out.println("Digite a temperatura em ºC:");
      C = scan.nextFloat();

      F = (C*9/5)+32;
    
     System.out.println(C+" ºC é "+(C*9/5)+32+" ºF");
     System.out.printf("%.1f ºC é %.1f ºF", C, F);

     */
    
  // Exercício 3

    /*
    String nome, sobrenome;

    Scanner scan = new Scanner(System.in);

    System.out.println("EXERCÍCIO 3");
    System.out.println("Digite seu nome: ");
      nome = scan.nextLine();
    System.out.println("Digite seu sobrenome: ");
      sobrenome = scan.nextLine();

    System.out.println("Seu nome completo é "+nome+" "+sobrenome);
    System.out.printf("Seu nome completo é %s %s", nome, sobrenome);
    */
    
  // Exercício 4
  /*
    String frase;

    Scanner scan = new Scanner(System.in); 

    System.out.println("EXERCÍCIO 4");
    System.out.println("Digite qualquer frase: ");
      frase = scan.nextLine();

    System.out.println("O número de caracteres nesta frase é: "+frase.length());
  */

    
  // Exercício 5

    float r;
    double pi;

    Scanner scan = new Scanner(System.in); 

    System.out.println("EXERCÍCIO 5");
    System.out.println("Digite o raio do círculo em centímetro: ");
      r = scan.nextFloat();

      pi = 3.14;

    System.out.println("A área do círculo, em centímetro, é "+pi*(r*r));
  }
}