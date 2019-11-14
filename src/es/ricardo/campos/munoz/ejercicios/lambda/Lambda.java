package es.ricardo.campos.munoz.ejercicios.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Lambda {

	public static void main(String... args) {
		
		 

		    List<List<String>> listaPrincipal = new ArrayList<>();

		 

		    final List<String> listaValores = Arrays.asList("valor11", "valor12", "valor13", "valor14", "valor15");
		    final List<String> listaValores2 = Arrays.asList("valor21", "valor22", "valor23", "valor24", "valor25");

		 

		    List<List<String>> listaFinal = new ArrayList<>();

		 

		    for (int i = 0; i < 10; i++) {
		        listaFinal.add(new ArrayList<>());
		    }

		    listaPrincipal.add(listaValores);
		    listaPrincipal.add(listaValores2);

		    AtomicInteger i = new AtomicInteger(0);
		    listaPrincipal.forEach(lista -> {

		 
		        AtomicInteger j = new AtomicInteger(0);
		        listaPrincipal.stream().forEach(e -> {
		        listaFinal.get(i.get()).add(listaValores.get(j.get()));
		        listaFinal.get(i.get()).add(listaValores2.get(j.get()));
		        
		        j.incrementAndGet();
		        });
		    i.incrementAndGet();
		    });
		    

	}

}
