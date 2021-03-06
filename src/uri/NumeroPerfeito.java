package uri;

/*
 * @author Andréa Meinhart
 * @category NExT - Imersão Java
 * @Exercicios URI Judge 
 * @class Fundamentos1164
 */

/*
 * Número Perfeito
 * Na matemática, um número perfeito é um número inteiro para o qual a
 * soma de todos os seus divisores positivos próprios (excluindo ele mesmo)
 * é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3
 * é igual a 6. Sua tarefa é escrever um programa que imprima se um
 * determinado número é perfeito ou não.
 * 
 * ENTRADA: A entrada contém vários casos de teste. A primeira linha da
 * entrada contém um inteiro N (1 ≤ N ≤ 20), indicando o número de casos
 * de teste da entrada. Cada uma das N linhas seguintes contém um valor
 * inteiro X (1 ≤ X ≤ 108), que pode ser ou não, um número perfeito.
 * 
 * SAÍDA: Para cada caso de teste de entrada, imprima a mensagem “X eh
 * perfeito” ou “X nao eh perfeito”, de acordo com a especificação fornecida.
 */

import java.util.Scanner;

public class NumeroPerfeito {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int qtdNumeros = teclado.nextInt();
    //quantidade de vezes que roda a aplicacao

    for (int i = 0; i < qtdNumeros; i++) {
      int soma = 0;
      //insere o numero que sera verificado
      int n = teclado.nextInt();

        //Para encontrar os divisores
        for (int j = 1; j < n; j++) {
          if (n % j == 0) {
            soma += j;
          }
        }
        //Compara a soma com o numero
        if (soma == n){
          System.out.println(n + " eh perfeito");
        } else {
          System.out.println(n + " nao eh perfeito");
        }
    }

    teclado.close();
  }
}
