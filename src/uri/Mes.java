package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1052
 */

/*
 * Mês
 * Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor,
 * deve ser apresentado como resposta o mês do ano por extenso, em inglês,
 * com a primeira letra maiúscula.
 * ENTRADA: A entrada contém um único valor inteiro.
 * SAIDA: Imprima por extenso o nome do mês correspondente ao número existente
 * na entrada, com a primeira letra em maiúscula - April
 */

import java.util.Scanner;

public class Mes {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int mes = teclado.nextInt();

    switch (mes) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      case 7:
        System.out.println("July");
        break;
      case 0:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
      default:
        System.out.println("Mês inválido");
        break;
    }
    teclado.close();
  }
}
