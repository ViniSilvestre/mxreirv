/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

*/

package br.com.generation.atividadesmatrizvetor;

import java.util.Scanner;

public class AtividadeVetor01 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int[] vetor = new int[5];
		int maiorPontuacao=0;
		
		for(int i=0; i<5; i++){
			System.out.println("Digite os pontos da atividade: ");
			vetor[i] = leitura.nextInt();	
			if(vetor[i] > maiorPontuacao) {
				maiorPontuacao = vetor[i];
			}
		}
		System.out.println("Os pontos da atividade foram: ");
		for(int i=0; i<5; i++) {
			System.out.println(vetor[i]);	
		}
		
		System.out.println("A maior pontuação na Atividade foi: "+maiorPontuacao);
		
	}
}
