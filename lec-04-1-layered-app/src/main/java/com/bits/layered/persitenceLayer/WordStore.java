package com.bits.layered.persitenceLayer;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

@Component
public class WordStore {
    public void storeWordInFile(String word) {
        String time = LocalDateTime.now().toString();
//        time = time.replaceAll(" ", "_").replaceAll("\\.", "_");
        String fileName = "./" + time + ".txt";

        try {
            Files.write(Paths.get(fileName), word.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
