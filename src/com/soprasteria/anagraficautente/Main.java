package com.soprasteria.anagraficautente;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, cognome, luogoNascita, patente = "", genere = "";
		int eta;
		double altezza;
		boolean hasPatente;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserisci il nome: ");
		nome = s.nextLine();
		System.out.print("Inserisci il cognome: ");
		cognome = s.nextLine();
		System.out.print("Inserisci il luogo di nascita: ");
		luogoNascita = s.nextLine();
		System.out.print("Inserisci l'età: ");
		eta = s.nextInt();
		System.out.print("Inserisci l'altezza: ");
		altezza = s.nextDouble();
		System.out.print("Hai la patente? (true/false): ");
		hasPatente = s.nextBoolean();
		System.out.print("Inserisci il genere: ");
		genere = s.nextLine();
	}

}
