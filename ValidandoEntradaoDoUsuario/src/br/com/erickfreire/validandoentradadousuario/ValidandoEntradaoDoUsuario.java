package br.com.erickfreire.validandoentradadousuario;

import java.util.Scanner;

/**
 * Programa em Java que valida a entrada de um usuario
 * @author Erick Freire
 * @version 1 - Criado em 09-04-2021
 */

public class ValidandoEntradaoDoUsuario {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		int passou = 0;
		int reprovou = 0;
		int contadorEstudante = 1;
		
		while(contadorEstudante <= 10) {
			System.out.print("Informe um resultado 1 - passou ou 2 - reprovou: ");
			int resultado = entrada.nextInt();
			
			while(resultado != 1 & resultado != 2) {
				System.out.print("resposta errada digite 1 para passou ou 2 para reprovou:  ");
				resultado = entrada.nextInt();
			}
			
			if(resultado == 1)
				passou = passou + 1;
			else
				reprovou = reprovou + 1;
			
			contadorEstudante = contadorEstudante + 1;
		}
		
		System.out.printf("Passou: %d%nReprovou: %d%n", passou, reprovou);
		
		if(passou >= 8)
			System.out.println("Bonus para o professor: ");
	}
	

}
