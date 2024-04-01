
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		testarVerificarPar(7);
		testarVerificarPar(10);
		testarVerificarPar(0);
		testarVerificarPar(-5);
		testarVerificarPar(-4);
		imprimeSeqFibonacci(5);
		multiplicaAi(2);
		piramideDeNumeros(5);
		duplicadosNao();
		imprimeFeriados("21-04-2024");
	}

	public static boolean verificarPar(int num) {
		return num % 2 == 0;
	}

	public static void testarVerificarPar(int numero) {
		if (verificarPar(numero) && numero < 0) {
			System.out.println(numero + " é par e negativo");
		} else if (verificarPar(numero) && numero >= 0) {
			System.out.println(numero + " é par e positivo");
		} else if (!verificarPar(numero) && numero < 0) {
			System.out.println(numero + " é ímpar e negativo");
		} else {
			System.out.println(numero + " é ímpar e positivo");
		}
	}

	public static void imprimeSeqFibonacci(int numero) {
		List<Integer> seqFib = new ArrayList<>();
		seqFib.add(0);
		seqFib.add(1);

		for (int i = 2; i < numero; i++) {
			// Para acessar o elemento de uma lista é necessário utilizar o get
			int elemento = seqFib.get(i - 2) + seqFib.get(i - 1);
			seqFib.add(elemento);
		}

		System.out.println(seqFib);
	}

	public static void multiplicaAi(int numero) {
		System.out.println("Tabela de multiplicação por " + numero);

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
	}

	public static void piramideDeNumeros(int numero) {
		for (int i = 1; i <= numero; i++) {
			String linha = "";

			// Não é possível criar uma repetição multiplicando a string por um valor
			for (int j = 0; j < i; j++) {
				linha += String.valueOf(i);
			}

			System.out.println(linha);
		}
	}

	public static void duplicadosNao() {
		List<String> array1 = Arrays.asList("Morango", "Banana", "Maçã", "Uva", "Caqui");
		List<String> array2 = Arrays.asList("Manga", "Caqui", "Morango", "Amora");
		List<String> resultado = new ArrayList<>();

		for (int i = 0; i < array1.size(); i++) {
			String elemento = array1.get(i);
			for (int j = 0; j < array2.size(); j++) {
				if (elemento.equals(array2.get(j))) { // Use equals para comparar strings
					resultado.add(elemento);
				}
			}
		}

		// O método não aceita múltiplos argumentos separados por vírgula
		System.out.println("Array 1: " + array1);
		System.out.println("Array 2: " + array2);
		System.out.println("Resultado: " + resultado);
	}

	public static void imprimeFeriados(String data) {
		//Cria um HashMap vazio
		Map<String, String> eventos = new HashMap<>();

		//Associa pares chave-valor
		//O método put serve para adicionar elementos 
		eventos.put("01-01-2024", "Confraternização Mundial");
		eventos.put("12-02-2024", "Carnaval");
		eventos.put("13-02-2024", "Carnaval");
		eventos.put("29-03-2024", "Sexta-feira Santa");
		eventos.put("21-04-2024", "Tiradentes");
		eventos.put("01-05-2024", "Dia do Trabalho");
		eventos.put("30-05-2024", "Corpus Christi");
		eventos.put("07-09-2024", "Independência do Brasil");
		eventos.put("12-10-2024", "Nossa Senhora Aparecida");
		eventos.put("02-11-2024", "Finados");
		eventos.put("15-11-2024", "Proclamação da República");
		eventos.put("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra");
		eventos.put("25-12-2024", "Natal");

		// Imprime todos os eventos
		for (Map.Entry<String, String> evento : eventos.entrySet()) {
			//O método get serve para acessar a chave ou o valor
			System.out.println(evento.getKey() + " => " + evento.getValue());
		}

		String evento = eventos.get(data);
		if (evento != null) {
			System.out.println("Dia " + data + " é " + evento);
		    } else {
			System.out.println("Dia " + data + " não é feriado");
		    }
	}
}
