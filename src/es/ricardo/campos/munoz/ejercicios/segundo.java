package es.ricardo.campos.munoz.ejercicios;

import java.util.Scanner;

public class segundo{
	
	private static int numero;
	private static String texto;
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hola Paloma, mete un número:");
		numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Genial! ahora escribe el texto que te de la gana:");
		texto = sc.nextLine();
		
		System.out.println("Vale, ya lo tengo todo");
		
		
		texto = modificacionTexto(numero,texto);
		
		System.out.println("Bueno.... aquí lo tienes:");
		System.out.println(texto);
		System.out.println("Ciao ;)");
		
	}

	private static String modificacionTexto(int opcion, String texto) {
		if (opcion%2 != 0)
		{
			texto = texto.toLowerCase();
		}else 
		{
			texto = texto.toUpperCase();
		}
		return texto;
	}
	
	
}