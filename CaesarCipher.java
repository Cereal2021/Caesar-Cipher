package Project;

import java.util.*;
/**
 *
 * @author Zach
 */
public class CaesarCipher {
    
    
    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public String cipher(String text, int shift) {
		text = text.toLowerCase();
		text = text.replaceAll("\\s+", "");
		//Converting the text to lowercase
		String cipherT = "";
		//Initializing empty string to add alphabets iteratively.
		for(int i = 0; i < text.length(); i++) {
			int mappingV = alphabet.indexOf(text.charAt(i));
			int enVal = (shift + mappingV) % 26;
			char Val = alphabet.charAt(enVal);
			cipherT = cipherT + Val;
		}
		return cipherT.concat(Integer.toString(shift));
	}
}
