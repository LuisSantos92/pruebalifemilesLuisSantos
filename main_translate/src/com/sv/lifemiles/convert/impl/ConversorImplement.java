package com.sv.lifemiles.convert.impl;

import com.sv.lifemiles.convert.binary.BinaryParse;
import com.sv.lifemiles.convert.constante.ConstanteApp;
import com.sv.lifemiles.convert.morse.MorseParse;

public class ConversorImplement {

	/**
	 * 
	 * @param text
	 * @param binary
	 * @param morse
	 * @param parse
	 * @return
	 */
	public String formatoOrigen(String text, String binary, String morse, boolean parse) {
		String retornaResultado = "";
		try {
			if (!text.isEmpty()) {
				retornaResultado = formatoDestino(text, binary, morse, parse);
			} else {
				System.out.println("No hay datos para interactuar");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return retornaResultado;
	}

	/**
	 * 
	 * @param text
	 * @param binary
	 * @param morse
	 * @param parse
	 * @return
	 */
	public String formatoDestino(String text, String binary, String morse, boolean parse) {
		String resultado = "";
		try {
			if (binary.equalsIgnoreCase(ConstanteApp.BINARY) && !parse) {
				resultado = BinaryParse.textToBinary(text);
			} else if (morse.equalsIgnoreCase(ConstanteApp.MORSE) && !parse) {
				resultado = MorseParse.codificarMorse(text);
			} else if (binary.equalsIgnoreCase(ConstanteApp.BINARY) && parse) {
				resultado = BinaryParse.binaryToText(text);
			} else if (binary.equalsIgnoreCase(ConstanteApp.MORSE) && parse) {
				resultado=  MorseParse.decodificarMorse(text);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return resultado;
	}

}
