package com.example.demo;

import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.DocumentEmbeddingModel;
import org.springframework.ai.embedding.EmbeddingResponse;
import org.springframework.ai.embedding.DocumentEmbeddingRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentEmbeddingModelExample {

    private final DocumentEmbeddingModel documentEmbeddingModel;
    private final org.springframework.ai.embedding.EmbeddingModel embeddingModel;

    public DocumentEmbeddingModelExample(
            @org.springframework.beans.factory.annotation.Autowired(required = false) DocumentEmbeddingModel documentEmbeddingModel,
            org.springframework.ai.embedding.EmbeddingModel embeddingModel) {
        this.documentEmbeddingModel = documentEmbeddingModel;
        this.embeddingModel = embeddingModel;
    }

    @GetMapping("/document-embedding")
    public String embedDocument(@RequestParam(defaultValue = "Hello World Document") String text) {
        if (documentEmbeddingModel != null) {
            Document doc = new Document(text);
            DocumentEmbeddingRequest request = new DocumentEmbeddingRequest(List.of(doc));
            EmbeddingResponse response = documentEmbeddingModel.call(request);
            return "Used DocumentEmbeddingModel. Dimensions: " + response.getResult().getOutput().length;
        } else {
            // Fallback to EmbeddingModel which supports documents
            Document doc = new Document(text);
            float[] embedding = embeddingModel.embed(doc);
            return "DocumentEmbeddingModel not available (fallback to EmbeddingModel). Dimensions: " + embedding.length;
        }
    }
}
