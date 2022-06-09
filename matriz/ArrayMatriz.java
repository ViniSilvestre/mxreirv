package br.com.generation.matriz;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaração da matriz				[l][c];
		double[][] notasAlunos = new double [2][4];
		
		System.out.println("----> Notas dos Alunos <----");
		
		//adicionando valores na matriz
		for(int l=0; l<notasAlunos.length; l++){
			for( int c=0; c<notasAlunos[l].length; c++) {
				System.out.printf("Digite as notas na posição da matriz: %d %d: ", (l+1),(c+1));
				notasAlunos[l][c] = entrada.nextDouble();
			}
			System.out.println();
		}
		//mostrando os valores da matriz
		for(int l=0; l<notasAlunos.length; l++){
			for( int c=0; c<notasAlunos[l].length; c++) {
				System.out.printf(notasAlunos[l][c]+" | ");
			}
			System.out.println();
		}
			
		
	}
}
