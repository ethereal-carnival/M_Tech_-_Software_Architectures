package com.bits.layered.businessLayer;

import org.springframework.stereotype.Component;

@Component
public class PalindromeEngine {
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return word.equals(sb.reverse().toString());
    }
}
