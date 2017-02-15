package com.cryptography.subsitutionmethd;

import java.util.Scanner;

/**
 * Cryptography program using Simple Substitution Method 
 * Program Tested by giving 
 * Text = congratulationsyouhavebrokentheencryption 
 * Key = 11
 */

public class Cryptography {

	private static Scanner input;

	public static void main(String[] args) {
		String text;
		int key;
		String cipherText;

		input = new Scanner(System.in);

		System.out.print("Enter the Text to be Encrypted: ");
		text = input.nextLine();

		System.out.print("Enter the encryption Key: ");
		key = input.nextInt();

		cipherText = Encryption.encrypt(text, key);
		System.out.println("Text after Encryption is: " + cipherText);

		System.out.println("Text after Decryption is: " + Decryption.decrypt(cipherText, key));

	}

}