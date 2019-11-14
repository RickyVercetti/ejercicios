package es.ricardo.campos.munoz.ejercicios.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class fechas {

	private static final Logger LOGGER = Logger.getLogger(fechas.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		darfecha();
		darhora();
		darfechayhora();
		
		List<String> lista1 = new ArrayList<String>();
		String [] nombres = {"Eduardo","Jauanan","Vicente","Christian","Ricardo"};
		for (int i = 0; i<= nombres.length-1; i++)
			lista1.add(nombres[i]);
		
		Iterator mostrador = lista1.iterator();
//		
//		while (mostrador.hasNext())
//		{
//			System.out.println(mostrador);
//		}

		lista1.stream()
		.filter(s -> s.contains("i"))
		.forEach(System.out::println);

	}

	private static void darfechayhora() {
		// TODO Auto-generated method stub

		LocalDateTime fecha = LocalDateTime.now();
		LOGGER.info("La fecha actual es: " + fecha);

	}

	private static void darhora() {
		// TODO Auto-generated method stub

		LocalTime hora = LocalTime.now();
		System.out.println(hora);

	}

	private static void darfecha() {

		LocalDate ayer = LocalDate.now().minus(1L, ChronoUnit.DAYS);
		LocalDate hoy = LocalDate.now();
		boolean posterior = hoy.isAfter(ayer);
		System.out.println(posterior);

	}

}
