package com.ethereal_carnival.mtech.software_architectures.layered_app.presentationLayer;

import com.ethereal_carnival.mtech.software_architectures.layered_app.serviceLayer.PalindromeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    private final PalindromeService palindromeService;

    public WordController(PalindromeService palindromeService) {
        this.palindromeService = palindromeService;
    }

    @PostMapping("/processword")
    public String processWord(@RequestParam String word) {
        return palindromeService.checkPalindromeAndGetResponse(word);
    }
}
