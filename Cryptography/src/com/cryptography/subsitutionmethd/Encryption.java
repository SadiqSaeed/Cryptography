package com.cryptography.subsitutionmethd;

public class Encryption {

	private static final String plainText = "abcdefghijklmnopqrstuvwxyz";

	public static String encrypt(String plaintext, int key) {
		plaintext = plaintext.toLowerCase();
		String cipherText = "";
		for (int i = 0; i < plaintext.length(); i++) {
			int charPos = plainText.indexOf(plaintext.charAt(i));
			int keyVal = (charPos + key) % 26;
			char replaceVal = plainText.charAt(keyVal);
			cipherText += replaceVal;
		}
		return cipherText;
	}

}
