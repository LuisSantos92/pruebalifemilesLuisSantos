package com.sv.lifemiles.main;

import com.sv.lifemiles.convert.constante.ConstanteApp;
import com.sv.lifemiles.convert.impl.ConversorImplement;

/**
 * 
 * @author Luis Santos
 *
 */
public class EjecutorMainTranslate1 {
	public static void main(String[] args) {
		// Ingresar texto a traducir
		String textoTraducir = "Hola me llamo luis";
		String binaryTraducir = "1001000 1101111 1101100 1100001 100000 1101101 1100101 100000 1101100 1101100 1100001 1101101 1101111 100000 1101100 1110101 1101001 1110011";
		String morseTraducir = ".... --- .-.. .-  -- .  .-.. .-.. .- -- ---  .-.. ..- .. ...";

		ConversorImplement obj1 = new ConversorImplement();
		
		System.out.println(obj1.formatoOrigen("", ConstanteApp.BINARY, "",false));
		
		System.out.println(obj1.formatoOrigen(textoTraducir, ConstanteApp.BINARY, "",false));
		
		System.out.println(obj1.formatoOrigen(textoTraducir,"",  ConstanteApp.MORSE,false));
		
		
        System.out.println(obj1.formatoOrigen(binaryTraducir, ConstanteApp.BINARY, "",true));
		
		System.out.println(obj1.formatoOrigen(morseTraducir,"",  ConstanteApp.MORSE,true));
		
	}
}
