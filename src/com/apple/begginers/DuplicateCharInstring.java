package com.apple.begginers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInstring {

	public void countDuplicate(String inputString) {
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();

		char[] charArry = inputString.toCharArray();
		for (Character ch : charArry) {

			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}
		Set<Character> keySets = hashMap.keySet();

		for (Character character : keySets) {
			if (hashMap.get(character) > 1) {
				System.out.println("Char " + character + " " + hashMap.get(character));
			}
		}

	}

	public static void main(String[] args) {
		DuplicateCharInstring charInstring = new DuplicateCharInstring();
		charInstring.countDuplicate("ShivaS");
	}
}
