package com.ethereal_carnival.mtech.software_architectures.layered_app.serviceLayer;

import com.ethereal_carnival.mtech.software_architectures.layered_app.businessLayer.PalindromeEngine;
import com.ethereal_carnival.mtech.software_architectures.layered_app.persitenceLayer.WordStore;
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
