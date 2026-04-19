package com.example.demo;

import org.springframework.ai.embedding.EmbeddingModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmbeddingModelExample {

    private final EmbeddingModel embeddingModel;

    public EmbeddingModelExample(EmbeddingModel embeddingModel) {
        this.embeddingModel = embeddingModel;
    }

    @GetMapping("/embedding")
    public Map<String, Object> embed(@RequestParam(defaultValue = "Hello World") String text) {
        float[] embedding = embeddingModel.embed(text);
        return Map.of("text", text, "embeddingLength", embedding.length, "embeddingPreview",
                List.of(embedding[0], embedding[1], embedding[2]));
    }
}
