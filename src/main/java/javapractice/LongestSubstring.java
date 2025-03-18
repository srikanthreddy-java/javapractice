package javapractice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	
//	public static String findLongestNonRepeatingSequence(String str) {
//	    Map<Character, Integer> charToIndex = new HashMap<>(str.length());
//	    int maxLength = 0;
//	    int start = 0;
//	    
//	    for (int end = 0; end < str.length(); end++) {
//	        char next = str.charAt(end);
//	        if (charToIndex.containsKey(next) && charToIndex.get(next) >= start) {
//	            start = charToIndex.get(next) + 1;
//	        }
//	        charToIndex.put(next, end);
//	        maxLength = Math.max(maxLength,  end - start + 1);
//	    }
//	    
//	    return str.substring(start, start + maxLength);
//	}
	
	public static String findLongestNonRepeatingSequence(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        // Map to store the last index of each character
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int start = 0; // Start of the current sequence
        int maxLength = 0; // Length of the longest sequence
        int maxStart = 0; // Start index of the longest sequence

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map, move the start pointer
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the last index of the current character
            charIndexMap.put(currentChar, end);

            // Update the maximum length and starting index if a longer sequence is found
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        // Return the longest substring without repeating characters
        return s.substring(maxStart, maxStart + maxLength);
    }

	public static void main(String[] args) {
		System.out.println(findLongestNonRepeatingSequence("ababcabacabcd"));

	}

}
