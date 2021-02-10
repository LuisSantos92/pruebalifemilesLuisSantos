package com.sv.lifemiles.convert.binary;

/**
 * 
 * @author Luis Santos
 *
 */
public class BinaryParse {

	public static String textToBinary(String originalText) {
		String binaryText = "";
		for (int i = 0; i < originalText.length(); i++) {
			// Primero obtenemos la letra o car�cter actual
			char currentChar = originalText.charAt(i);
			// Necesitamos obtener su representaci�n entera ASCII
			int ascii = (int) currentChar;
			// Una vez que ya tenemos el entero, lo convertimos a binario
			String binary = decimalToBinary(ascii);
			// Lo agregamos a la cadena resultante agregando adem�s un espacio
			binaryText += binary + " ";
		}
		// Finalmente regresamos el texto
		return binaryText;
	}

	public static int binaryToDecimal(String binary) {
		// A este n�mero le vamos a sumar cada valor binario
		int decimal = 0;
		int position = 0;
		// Recorrer la cadena...
		for (int x = binary.length() - 1; x >= 0; x--) {
			// Saber si es 1 o 0; primero asumimos que es 1 y abajo comprobamos
			short digit = 1;
			if (binary.charAt(x) == '0') {
				digit = 0;
			}

			/*
			 * Se multiplica el d�gito por 2 elevado a la potencia seg�n la posici�n;
			 * comenzando en 0, luego 1 y as� sucesivamente
			 */
			double multiplier = Math.pow(2, position);
			decimal += digit * multiplier;
			position++;
		}
		return decimal;
	}

	public static String decimalToBinary(int decimal) {
		if (decimal <= 0) {
			return "0";
		}
		String binary = "";
		while (decimal > 0) {
			short remainder = (short) (decimal % 2);
			decimal = decimal / 2;
			// Insertar el d�gito al inicio de la cadena
			binary = String.valueOf(remainder) + binary;
		}
		return binary;
	}
	
	public static String binaryToText(String binaryText) {
	    // Necesitamos separar cada n�mero binario por espacio. Usamos split
	    String[] binaryNumbers = binaryText.split(" ");
	    String text = "";

	    // Los recorremos. En cada paso tenemos al n�mero binario
	    for (String currentBinary : binaryNumbers) {
	        // Ahora convertimos ese binario a decimal
	        int decimal = binaryToDecimal(currentBinary);
	        // Obtenemos la letra que le corresponde a ese valor ASCII
	        char letra = (char) decimal;
	        text += letra;
	    }
	    return text;
	}
}
