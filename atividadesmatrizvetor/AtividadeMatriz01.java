/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/

package br.com.generation.atividadesmatrizvetor;

import java.util.Scanner;

public class AtividadeMatriz01 {

	public static void main(String[] args) {
		
		Scanner entradaValores = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int soma=0, somaDiagonal=0;
		
			for(int l=0; l<3; l++) {
				for(int c=0; c<3; c++) {
					System.out.printf("Digite os valores aqui: %d %d ",l,c);
					matriz[l][c] = entradaValores.nextInt();
					soma += matriz[l][c];
				}
			}
			for (int l=0; l<3; l++) {
				for(int c=0; c<3; c++) {
				if(c == l) {
					somaDiagonal += matriz[l][c];
				}
			}	
		}
		System.out.println("A soma dos valores é: "+soma+"\n");
		System.out.println("A soma das diagonais é: "+somaDiagonal);
	}
}
