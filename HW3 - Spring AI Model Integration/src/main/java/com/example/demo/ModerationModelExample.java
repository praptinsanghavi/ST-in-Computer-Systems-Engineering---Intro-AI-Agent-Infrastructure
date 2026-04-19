package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModerationModelExample {

    private final org.springframework.web.client.RestClient restClient;

    public ModerationModelExample(
            @org.springframework.beans.factory.annotation.Value("${spring.ai.openai.api-key}") String apiKey) {
        this.restClient = org.springframework.web.client.RestClient.builder()
                .baseUrl("https://api.openai.com/v1")
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .defaultHeader("Content-Type", "application/json")
                .build();
    }

    @GetMapping("/moderation")
    public String moderate(@RequestParam(defaultValue = "I want to kill them all") String message) {
        // Manual validation using RestClient because Spring AI 1.0.0-M6 ModerationModel
        // has compatibility issues
        String requestBody = "{\"input\": \"" + message + "\", \"model\": \"omni-moderation-latest\"}";

        try {
            return restClient.post()
                    .uri("/moderations")
                    .body(requestBody)
                    .retrieve()
                    .body(String.class);
        } catch (Exception e) {
            return "Error calling OpenAI Moderation API: " + e.getMessage();
        }
    }
}
