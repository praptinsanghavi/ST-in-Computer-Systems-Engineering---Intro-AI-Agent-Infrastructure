# Spring AI Model Examples

This project demonstrates the usage of 6 core Spring AI interfaces using OpenAI models:
1. `ChatModel`
2. `DocumentEmbeddingModel`
3. `EmbeddingModel`
4. `ImageModel`
5. `ModerationModel`
6. `SpeechModel`

## Prerequisites
- Java 17 or higher
- Maven

## Configuration
The application is pre-configured with the OpenAI API key in `src/main/resources/application.properties`.

## Running the Application
You can run the application using Maven:
```bash
mvn spring-boot:run
```

## Testing the Endpoints
Once the application is running, you can access the following endpoints:

### 1. Chat Model
Demonstrates `ChatModel.call(String)`.
- URL: `http://localhost:8080/chat?message=Tell+me+a+joke`

### 2. Embedding Model
Demonstrates `EmbeddingModel.embed(String)`.
- URL: `http://localhost:8080/embedding?text=Hello+World`

### 3. Document Embedding Model
Demonstrates `DocumentEmbeddingModel.call(DocumentEmbeddingRequest)`.
- URL: `http://localhost:8080/document-embedding?text=Hello+World+Document`
- *Note: This endpoint is defensive and will report if the model is not available.*

### 4. Image Model
Demonstrates `ImageModel.call(ImagePrompt)`.
- URL: `http://localhost:8080/image?message=A+cute+cat`

### 5. Moderation Model
Demonstrates `ModerationModel.call(ModerationPrompt)`.
- URL: `http://localhost:8080/moderation?message=Some+text+to+moderate`

### 6. Speech Model
Demonstrates `SpeechModel.call(String)`.
- URL: `http://localhost:8080/speech?message=Hello+this+is+a+test`
- Returns raw audio bytes.

## Project Structure
The source code is located in `src/main/java/com/example/demo`.
Each model has a corresponding controller demonstrating its usage.
