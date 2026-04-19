package edu.northeastern;

// ====================================================================================================
// IMPORTS
// These are external libraries (tools) we need to build our application.
// ====================================================================================================

// These imports are for the AI model (Deep Java Library - DJL) that converts text into numbers (vectors)
import ai.djl.Application;
import ai.djl.huggingface.translator.TextEmbeddingTranslatorFactory;
import ai.djl.inference.Predictor;
import ai.djl.repository.zoo.Criteria;
import ai.djl.repository.zoo.ZooModel;
import ai.djl.translate.TranslateException;

// These imports are for the Qdrant Vector Database client
import io.qdrant.client.*;
import io.qdrant.client.grpc.Collections.CreateCollection;
import io.qdrant.client.grpc.Collections.Distance;
import io.qdrant.client.grpc.Collections.VectorParams;
import io.qdrant.client.grpc.Collections.VectorsConfig;
import io.qdrant.client.grpc.Points.*;

// Standard Java imports for file handling and lists
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.io.File;

/**
 * ====================================================================================================
 * EBOOK VECTOR SEARCH
 * ====================================================================================================
 * This is the main program class. It is designed to demonstrate how a "Vector
 * Search" engine works.
 * 
 * WHAT IT DOES:
 * 1. Reads a book file (Alice in Wonderland).
 * 2. Breaks the book into small pieces (chunks).
 * 3. Converts those pieces into mathematical vectors (lists of numbers) using
 * an AI model.
 * 4. Stores those vectors in a database called Qdrant.
 * 5. Lets you search the book using natural language (e.g., "Who chased the
 * rabbit?").
 * 
 * "EXECUTE ONCE" RULE:
 * The program is smart enough to know if it has already processed the book.
 * - First run: It does all the heavy lifting (reading, converting, storing).
 * - Next runs: It skips those steps and lets you search immediately.
 * ====================================================================================================
 */
public class EBookVectorSearch {

    /**
     * Helper Class: TextChunk
     * Think of this as a simple container or box that holds information about a
     * single piece of text.
     * When we split the book, we store each piece in one of these objects.
     */
    private static class TextChunk {
        int id; // A unique number for this chunk (1, 2, 3...)
        String text; // The actual text content (e.g., "Alice fell down the hole.")
        int startChar; // Where this chunk starts in the book (character position)
        int endChar; // Where this chunk ends in the book

        // Constructor: This is how we create a new TextChunk
        TextChunk(int id, String text, int startChar, int endChar) {
            this.id = id;
            this.text = text;
            this.startChar = startChar;
            this.endChar = endChar;
        }
    }

    // ================================================================================================
    // CONFIGURATION SETTINGS
    // These are constants (values that don't change) used to configure the
    // application.
    // ================================================================================================

    // Address where the Qdrant database is running (localhost means "this
    // computer")
    private static final String QDRANT_HOST = "localhost";

    // The port number to talk to Qdrant (like a specific door to the building)
    private static final int QDRANT_PORT = 6334;

    // The name of the "folder" inside the database where we store our data
    private static final String COLLECTION_NAME = "ebook_chunks";

    // The size of the vector. Our AI model produces 384 numbers for every piece of
    // text.
    // This MUST match the model we are using.
    private static final int VECTOR_DIMENSION = 384;

    // The file name of the eBook we want to read
    private static final String EBOOK_FILENAME = "alice_in_wonderland.txt";

    // Chunking Settings: How we split the text
    // We grab 500 characters at a time.
    private static final int CHUNK_SIZE = 500;

    // We overlap chunks by 50 characters. This ensures we don't cut a sentence
    // in a weird place and lose the meaning connection between two chunks.
    private static final int CHUNK_OVERLAP = 50;

    // ================================================================================================
    // CLASS TOOLS
    // These are the main tools this class uses to do its job.
    // ================================================================================================

    // The client that handles all communication with the database
    private QdrantClient qdrantClient;

    // The AI tool that converts text into vectors
    private SentenceEmbedder embedder;

    /**
     * MAIN METHOD
     * This is the entry point. When you run the program, Java looks for this method
     * first.
     */
    public static void main(String[] args) {
        // Create an instance of our application
        EBookVectorSearch app = new EBookVectorSearch();

        try {
            // Run the application logic
            app.run();
        } catch (Exception e) {
            // If anything goes wrong (crash), print the error to the screen
            System.err.println("Fatal Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // "finally" block always runs, even if there is an error.
            // We use it to ensure we close our connections properly.
            app.cleanup();
        }
    }

    /**
     * RUN METHOD
     * This orchestrates the flow of the application.
     */
    public void run() throws Exception {
        System.out.println("=== eBook Vector Search Application ===");

        // Step 1: Set up the connections to Database and AI Model
        initialize();

        // Step 2: Check "Execute Once" Logic
        if (collectionExists()) {
            // If the database already has our 'ebook_chunks' collection, we skip ingestion.
            System.out.println("\n✓ Collection '" + COLLECTION_NAME + "' already exists.");
            System.out.println("  Skipping ingestion phase (Execute Once requirement met).");
        } else {
            // If not, we need to do the work: create collection and save the book.
            System.out.println("\n! Collection '" + COLLECTION_NAME + "' not found.");
            System.out.println("  Starting ingestion process...");
            createCollection();
            ingestEBook();
        }

        // Step 3: Start the interactive search mode for the user
        interactiveSearchLoop();
    }

    /**
     * Initialize connections to external services.
     */
    private void initialize() throws Exception {
        System.out.println("Initializing components...");
        // Connect to Qdrant
        qdrantClient = new QdrantClient(QdrantGrpcClient.newBuilder(QDRANT_HOST, QDRANT_PORT, false).build());

        // Load the AI Model (this might take a moment)
        embedder = new SentenceEmbedder();
        System.out.println("✓ Qdrant Client and Embedding Model ready.");
    }

    /**
     * Check if the collection already exists in the database.
     * 
     * @return true if exists, false otherwise.
     */
    private boolean collectionExists() {
        try {
            // Try to ask Qdrant for info about the collection.
            // If it exists, this succeeds.
            qdrantClient.getCollectionInfoAsync(COLLECTION_NAME).get();
            return true;
        } catch (Exception e) {
            // If it throws an error (e.g., "Not Found"), we know it doesn't exist.
            return false;
        }
    }

    /**
     * Create a new empty collection in Qdrant.
     * This is like creating a new table in SQL.
     */
    private void createCollection() throws ExecutionException, InterruptedException {
        System.out.println("Creating collection: " + COLLECTION_NAME);

        // We tell Qdrant: "Make a collection named X, expecting vectors of size 384,
        // using Cosine similarity"
        qdrantClient.createCollectionAsync(
                CreateCollection.newBuilder()
                        .setCollectionName(COLLECTION_NAME)
                        .setVectorsConfig(
                                VectorsConfig.newBuilder()
                                        .setParams(
                                                VectorParams.newBuilder()
                                                        .setSize(VECTOR_DIMENSION)
                                                        // Cosine distance measures the angle between vectors.
                                                        // It is ideal for finding semantic similarity in text.
                                                        .setDistance(Distance.Cosine)
                                                        .build())
                                        .build())
                        .build())
                .get(); // .get() forces the program to wait until this task is finished
        System.out.println("✓ Collection created.");
    }

    /**
     * THE INGESTION PROCESS
     * Reads the book, splits it, and saves it to the database.
     */
    private void ingestEBook() throws Exception {
        System.out.println("\n--- Ingestion Phase ---");

        // --------------------------------------------------------------------------------------------
        // 1. Read the file
        // --------------------------------------------------------------------------------------------
        File bookFile = new File(EBOOK_FILENAME);
        if (!bookFile.exists()) {
            // Fallback: check current directory if specific path failed
            if (!bookFile.exists()) {
                throw new IOException("eBook file not found: " + EBOOK_FILENAME + ". Please download it first.");
            }
        }

        // Read all text from the file into a giant String variable
        String content = new String(Files.readAllBytes(Paths.get(bookFile.getAbsolutePath())));
        System.out.println("Read eBook: " + EBOOK_FILENAME + " (" + content.length() + " characters)");

        // --------------------------------------------------------------------------------------------
        // 2. Chunk the text
        // --------------------------------------------------------------------------------------------
        // We break the giant string into a list of small TextChunk objects
        List<TextChunk> chunks = chunkText(content);
        System.out.println("Split into " + chunks.size() + " chunks.");

        // --------------------------------------------------------------------------------------------
        // 3. Embed and Upload
        // --------------------------------------------------------------------------------------------
        List<PointStruct> points = new ArrayList<>();
        int batchSize = 100; // We send data in batches of 100 to avoid overloading the network

        System.out.print("Uploading chunks");
        for (int i = 0; i < chunks.size(); i++) {
            TextChunk chunk = chunks.get(i);

            // MAGIC HAPPENS HERE: Convert text -> Vector (float array)
            float[] vector = embedder.embed(chunk.text);

            // Create a "Point" (Qdrant's term for a record) containing:
            // - ID: To identify it
            // - Vector: To search it
            // - Payload: The original text (so we can read it later)
            PointStruct point = PointStruct.newBuilder()
                    .setId(PointIdFactory.id(chunk.id))
                    .setVectors(VectorsFactory.vectors(vector))
                    .putAllPayload(Map.of(
                            "text", ValueFactory.value(chunk.text),
                            "source", ValueFactory.value(EBOOK_FILENAME),
                            "chunk_id", ValueFactory.value(chunk.id)))
                    .build();

            points.add(point);

            // When our batch is full (or we are at the end), send it to Qdrant
            if (points.size() >= batchSize || i == chunks.size() - 1) {
                qdrantClient.upsertAsync(
                        UpsertPoints.newBuilder()
                                .setCollectionName(COLLECTION_NAME)
                                .addAllPoints(points)
                                .build())
                        .get(); // Wait for upload to finish

                points.clear(); // Clear list for next batch
                System.out.print("."); // Show progress dot
            }
        }
        System.out.println("\n✓ Ingestion complete!");
    }

    /**
     * INTERACTIVE SEARCH LOOP
     * Keeps the program running so user can ask questions.
     */
    private void interactiveSearchLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Search Mode ---");
        System.out.println("Enter a search query (or 'exit' to quit):");

        // Loop forever until user stops it
        while (true) {
            System.out.print("\n> ");

            // Check if there is actually input waiting (prevents crashes)
            if (scanner.hasNextLine()) {
                String query = scanner.nextLine().trim();

                // Check for exit command
                if (query.equalsIgnoreCase("exit") || query.equalsIgnoreCase("quit")) {
                    break;
                }

                if (query.isEmpty())
                    continue;

                // Perform the search
                try {
                    performSearch(query);
                } catch (Exception e) {
                    System.err.println("Search failed: " + e.getMessage());
                }
            } else {
                // If input stream ends (e.g., Ctrl+C or script end), exit loop
                break;
            }
        }
        System.out.println("Goodbye!");
    }

    /**
     * SEARCH LOGIC
     * 1. Converts user query -> Vector
     * 2. Asks Qdrant for vectors that are mathematically "close" to this query
     * vector.
     */
    private void performSearch(String query) throws TranslateException, ExecutionException, InterruptedException {
        // Step 1: Vectorize the query
        float[] queryVector = embedder.embed(query);

        // Step 2: Send search request to Qdrant
        List<ScoredPoint> results = qdrantClient.searchAsync(
                SearchPoints.newBuilder()
                        .setCollectionName(COLLECTION_NAME)
                        .addAllVector(floatArrayToList(queryVector))
                        .setLimit(3) // Ask for top 3 results
                        .setWithPayload(
                                WithPayloadSelector.newBuilder()
                                        .setEnable(true) // Ensure we get the text back, not just the ID
                                        .build())
                        .build())
                .get();

        // Step 3: Print results
        if (results.isEmpty()) {
            System.out.println("No results found.");
        } else {
            System.out.println("Top results:");
            for (int i = 0; i < results.size(); i++) {
                ScoredPoint result = results.get(i);

                // Get the text from the result
                String text = result.getPayloadOrThrow("text").getStringValue();

                // Get the similarity score (0.0 to 1.0)
                // Higher is better. 1.0 = exact match.
                double score = result.getScore();

                System.out.printf("[%d] Score: %.4f\n    \"%s\"\n", i + 1, score, truncate(text, 150));
            }
        }
    }

    // ====================================================================================================
    // HELPER METHODS
    // These are utility functions to keep the main code clean.
    // ====================================================================================================

    /**
     * Splits a long text into a list of smaller TextChunks.
     */
    private List<TextChunk> chunkText(String text) {
        List<TextChunk> chunks = new ArrayList<>();
        // Replace multiple spaces/newlines with a single space to clean up text
        text = text.replaceAll("\\s+", " ");

        // Simple chunking logic
        return simpleChunking(text);
    }

    /**
     * Breaks text into chunks of CHUNK_SIZE characters, allowing for CHUNK_OVERLAP.
     * Attempts to respect sentence boundaries so we don't split in the middle of a
     * thought.
     */
    private List<TextChunk> simpleChunking(String text) {
        List<TextChunk> chunks = new ArrayList<>();

        // Split text by sentence endings (. ! ?)
        // regex: lookbehind for punctuation followed by whitespace
        String[] sentences = text.split("(?<=[.!?])\\s+");

        StringBuilder currentChunk = new StringBuilder();
        int chunkId = 0;
        int startChar = 0;

        for (String sentence : sentences) {
            // If adding this sentence would make the chunk too big...
            if (currentChunk.length() + sentence.length() > CHUNK_SIZE && currentChunk.length() > 0) {
                // 1. Save the current chunk
                chunks.add(new TextChunk(chunkId++, currentChunk.toString().trim(), startChar,
                        startChar + currentChunk.length()));

                // 2. Create the overlap for the next chunk
                // We take the last CHUNK_OVERLAP characters of the current chunk
                // and make them the START of the new chunk.
                String overlap = "";
                if (currentChunk.length() > CHUNK_OVERLAP) {
                    overlap = currentChunk.substring(currentChunk.length() - CHUNK_OVERLAP);
                    // Try to start overlap at a space to avoid cutting words
                    int space = overlap.indexOf(' ');
                    if (space != -1)
                        overlap = overlap.substring(space + 1);
                }

                startChar += currentChunk.length() - overlap.length();
                currentChunk = new StringBuilder(overlap);
            }
            // Add sentence to current buffer
            currentChunk.append(sentence).append(" ");
        }

        // Add whatever is left in the buffer as the last chunk
        if (currentChunk.length() > 0) {
            chunks.add(new TextChunk(chunkId++, currentChunk.toString().trim(), startChar,
                    startChar + currentChunk.length()));
        }

        return chunks;
    }

    // Shortens a string to maxLen and adds "..." if it was cut off
    private String truncate(String s, int maxLen) {
        return s.length() > maxLen ? s.substring(0, maxLen) + "..." : s;
    }

    // Converts a primitive float[] array to a List<Float> object
    private List<Float> floatArrayToList(float[] array) {
        List<Float> list = new ArrayList<>(array.length);
        for (float f : array) {
            list.add(f);
        }
        return list;
    }

    // Closes connections to free up computer resources
    private void cleanup() {
        if (qdrantClient != null)
            qdrantClient.close();
        if (embedder != null)
            embedder.close();
    }

    // ====================================================================================================
    // EMBEDDER CLASS
    // This wraps the complex AI model login into a simple class.
    // ====================================================================================================
    private static class SentenceEmbedder {
        private final ZooModel<String, float[]> model;
        private final Predictor<String, float[]> predictor;

        SentenceEmbedder() throws Exception {
            // Configure the model we want (all-MiniLM-L6-v2)
            Criteria<String, float[]> criteria = Criteria.builder()
                    .setTypes(String.class, float[].class)
                    .optApplication(Application.NLP.TEXT_EMBEDDING)
                    .optEngine("PyTorch")
                    .optModelUrls("djl://ai.djl.huggingface.pytorch/sentence-transformers/all-MiniLM-L6-v2")
                    .optTranslatorFactory(new TextEmbeddingTranslatorFactory())
                    .build();

            // Download (if needed) and load the model into memory
            model = criteria.loadModel();
            predictor = model.newPredictor();
        }

        // The main function: takes text String, returns float[] vector
        float[] embed(String text) throws TranslateException {
            return predictor.predict(text);
        }

        void close() {
            if (predictor != null)
                predictor.close();
            if (model != null)
                model.close();
        }
    }
}
