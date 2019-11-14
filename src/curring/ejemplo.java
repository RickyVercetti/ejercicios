package curring;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ejemplo {

	public static void main(String[] args) {
		int numero = 5;
		Consumer<BiConsumer<Integer, Integer>> tablaMultiplicar = tablaMultiplicarCurrying(numero);
		tablaMultiplicar.accept((n, i) -> System.out.format("%d x %d=%d \n", n, i, n * i));
		tablaMultiplicar.accept((n, i) -> System.out.format("%d * %d=%d \n", n, i, n * i));
		numero = 7;
		tablaMultiplicar = tablaMultiplicarCurrying(numero);
		tablaMultiplicar.accept((n, i) -> System.out.format("%d multiplica por %d=%d \n", n, i, n * i));
		tablaMultiplicar.accept((n, i) -> System.out.format("%d multiplicado por  %d  es igual a %d \n", n, i, n * i));
	}

	static Consumer<BiConsumer<Integer, Integer>> tablaMultiplicarCurrying(int numero) {
		return (formateador) -> {
			for (int i = 0; i < 10; i++) {
				formateador.accept(numero, i);
			}
			;
		};

	}
}
