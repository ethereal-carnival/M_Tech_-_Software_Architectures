package com.ethereal_carnival.mtech.software_architectures.layered_app.businessLayer;

import org.springframework.stereotype.Component;

@Component
public class PalindromeEngine {
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return word.equals(sb.reverse().toString());
    }
}
