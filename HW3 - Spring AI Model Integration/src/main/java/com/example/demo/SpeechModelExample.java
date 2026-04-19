package com.example.demo;

import org.springframework.ai.openai.audio.speech.SpeechModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeechModelExample {

    private final SpeechModel speechModel;

    public SpeechModelExample(SpeechModel speechModel) {
        this.speechModel = speechModel;
    }

    @GetMapping("/speech")
    public String generateSpeech(
            @RequestParam(defaultValue = "Hello, this is a test of text to speech.") String message) {
        byte[] audio = speechModel.call(message);
        try {
            java.nio.file.Path path = java.nio.file.Paths.get("speech.mp3");
            java.nio.file.Files.write(path, audio);
            return "Speech generated and saved to: " + path.toAbsolutePath();
        } catch (java.io.IOException e) {
            return "Error saving speech file: " + e.getMessage();
        }
    }
}
