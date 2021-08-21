package com.ethereal_carnival.mtech.software_architectures.distributed_app.serviceLayer;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PalindromeService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String PALINDROME_ENGINE_BASE_URL = "http://localhost:8081/palindrome";
    private static final String DATA_LAYER_BASE_URL = "http://localhost:8082/persistence";

    public String checkPalindromeAndGetResponse(String word) {

        String url = PALINDROME_ENGINE_BASE_URL + "/" + word;
        ResponseEntity<Boolean> response = restTemplate.getForEntity(url, Boolean.class);
        boolean result = Boolean.TRUE.equals(response.getBody());

        talkToPersistenceLayer(word);

        return result ? word + " is palindrome" : word + " is not palindrome";
    }

    private void talkToPersistenceLayer(String word) {

        String url = DATA_LAYER_BASE_URL + "/" + word;
        restTemplate.postForEntity(url, word, String.class);
    }
}
