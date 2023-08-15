import java.util.*;

class Main {
  public static void main(String[] args) {

    /*
    //Exercício 1
    
    Scanner scan = new Scanner(System.in);
    
      int diasemana;

      System.out.println("Digite o dia");
       diasemana = scan.nextInt();

      switch(diasemana){
        case 1:
          System.out.println("Domingo");
          break;
        case 2:
          System.out.println("Segunda");
          break;
        case 3:
          System.out.println("Terça");
          break;
        case 4:
          System.out.println("Quarta");
          break;
        case 5:
          System.out.println("Quinta");
          break;
        case 6:
          System.out.println("Sexta");
          break;
        case 7:
          System.out.println("Sábado");
          break;
        default:
          System.out.println("Dia inválido");
          break;
      };
    */
    //Exercício 2
    /*
    Scanner scan = new Scanner(System.in);
    
      double valor;
      int id;

      System.out.println("Digite o valor do produto:");
       valor = scan.nextDouble();

      System.out.println("Digite o id do desconto aplicado:");
       id = scan.nextInt();

      switch(id){
        case 1:
          if(valor>30){
            valor = valor*0.7;  
          };
            System.out.println("Novo valor: "+valor);
            break;
          
        case 2:
          valor = valor*0.8;
          System.out.println("Novo valor: "+valor);
          break;
          
        case 3:
          if(valor>100){
            valor = valor*0.9;
          }else{
            valor = valor*0.95;
          }
            System.out.println("Novo valor: "+valor);
            break;
        default: 
          System.out.println("Invalid");
          break;
      }*/

    //outra forma de fazer

    Scanner scan = new Scanner(System.in);
    
      double valor;
      int id;

      System.out.println("Digite o valor do produto:");
       valor = scan.nextDouble();

      System.out.println("Digite o id do desconto aplicado:");
       id = scan.nextInt();

      switch(id){
        case 1:
          if(valor>30){
            valor = valor*0.7;  
          };
          break;
          
        case 2:
          valor = valor*0.8;
          break;
          
        case 3:
          if(valor>100){
            valor = valor*0.9;
          }else{
            valor = valor*0.95;
          }
          break;
        default: 
          System.out.println("Invalid");
          break;
      }
      System.out.println("Valor final: "+valor);
  }
}