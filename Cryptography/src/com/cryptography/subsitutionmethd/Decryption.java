package com.cryptography.subsitutionmethd;

public class Decryption {

	private static final String plainText = "abcdefghijklmnopqrstuvwxyz";

	public static String decrypt(String cipherText, int key) {
		cipherText = cipherText.toLowerCase();
		String plaintext = "";
		for (int i = 0; i < cipherText.length(); i++) {
			int charPos = plainText.indexOf(cipherText.charAt(i));
			int keyVal = (charPos - key) % 26;
			if (keyVal < 0) {
				keyVal = plainText.length() + keyVal;
			}
			char replaceVal = plainText.charAt(keyVal);
			plaintext += replaceVal;
		}
		return plaintext;
	}

}
