package com.example.demo;

import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageModelExample {

    private final ImageModel imageModel;

    public ImageModelExample(ImageModel imageModel) {
        this.imageModel = imageModel;
    }

    @GetMapping(value = "/image", produces = "text/html")
    public String generateImage(@RequestParam(defaultValue = "A cute cat playing chess") String message) {
        ImageResponse response = imageModel.call(new ImagePrompt(message));
        String imageUrl = response.getResult().getOutput().getUrl();
        return "<html><body><h1>Generated Image</h1><img src=\"" + imageUrl
                + "\" alt=\"Generated Image\" style=\"max-width:500px;\"><br><a href=\"" + imageUrl
                + "\">Direct Link</a></body></html>";
    }
}
