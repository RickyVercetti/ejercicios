package es.ricardo.campos.munoz.ejercicios;


 
public class primero{
	
	private static int[] numeros = {1,6,8,12,9};
	private static int numMaximo;
	
	public static void main (String [] args)
	 {
		numMaximo = comprobarMaximo(numeros);
		 System.out.println("El número mayor es "+ numMaximo);
	 }
	
	private static int comprobarMaximo(int[] num){
		
		int numeroMayor = 0;
		for (int i = 0; i <= num.length-1; i++)
		{
			if (num[i] > numeroMayor)
				numeroMayor = num[i];
		}
		
		return numeroMayor;
	}
}
 
 