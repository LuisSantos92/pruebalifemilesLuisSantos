package com.sv.lifemiles.main;

import com.sv.lifemiles.convert.binary.BinaryParse;
/**
 * 
 * @author Luis Santos
 *
 */
public class ConversorBinary {
	public static void main(String[] args) {
		System.out.println(BinaryParse.textToBinary("Hola me llamo luis"));
		
		System.out.println(BinaryParse.binaryToText("1001000 1101111 1101100 1100001 100000 1101101 1100101 100000 1101100 1101100 1100001 1101101 1101111 100000 1101100 1110101 1101001 1110011"));
	}
}
