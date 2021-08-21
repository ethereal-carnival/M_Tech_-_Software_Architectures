package com.bits.layered.serviceLayer;

import com.bits.layered.businessLayer.PalindromeEngine;
import com.bits.layered.persitenceLayer.WordStore;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    private final PalindromeEngine palindromeEngine;
    private final WordStore wordStore;

    public PalindromeService(PalindromeEngine palindromeEngine, WordStore wordStore) {
        this.palindromeEngine = palindromeEngine;
        this.wordStore = wordStore;
    }

    public String checkPalindromeAndGetResponse(String word) {
        boolean result = palindromeEngine.isPalindrome(word);

        wordStore.storeWordInFile(word);

        return result ? word + " is palindrome" : word + " is not palindrome";
    }
}
