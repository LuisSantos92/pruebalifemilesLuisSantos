package com.sv.lifemiles.main;

import java.util.Scanner;

import com.sv.lifemiles.convert.morse.MorseParse;

/**
 * 
 * @author Luis Santos
 *
 */
public class ConversorMorse {
	public static void main(String[] args) {
		String original = "Hola me llamo luis";
        System.out.println(MorseParse.codificarMorse(original));
        String codificado = ".... --- .-.. .-  -- .  .-.. .-.. .- -- ---  .-.. ..- .. ...";
        System.out.println(MorseParse.decodificarMorse(codificado));
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un texto y lo convertiré a Morse: ");
        String textoDeUsuario = sc.nextLine();
        codificado = MorseParse.codificarMorse(textoDeUsuario);
        System.out.println("El texto convertido es: ");
        System.out.println(codificado);
	}
}
