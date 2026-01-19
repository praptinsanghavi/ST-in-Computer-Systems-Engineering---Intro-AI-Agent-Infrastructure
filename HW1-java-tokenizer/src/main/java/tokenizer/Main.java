package tokenizer;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Main application class for the Text Tokenizer with Encoder/Decoder.
 * 
 * This application:
 * 1. Downloads 3 eBooks from Project Gutenberg
 * 2. Tokenizes the text and builds a vocabulary
 * 3. Provides interactive encoding/decoding
 */
public class Main {

    // Project Gutenberg eBook URLs
    private static final String[][] EBOOKS = {
            { "Frankenstein", "https://www.gutenberg.org/cache/epub/84/pg84.txt", "frankenstein.txt" },
            { "Pride and Prejudice", "https://www.gutenberg.org/cache/epub/1342/pg1342.txt",
                    "pride_and_prejudice.txt" },
            { "Alice's Adventures in Wonderland", "https://www.gutenberg.org/cache/epub/11/pg11.txt",
                    "alice_in_wonderland.txt" }
    };

    private final EBookDownloader downloader;
    private final Tokenizer tokenizer;
    private final Vocabulary vocabulary;
    private Encoder encoder;
    private Decoder decoder;

    public Main() {
        this.downloader = new EBookDownloader();
        this.tokenizer = new Tokenizer();
        this.vocabulary = new Vocabulary();
    }

    /**
     * Downloads and processes all eBooks to build the vocabulary.
     */
    public void initialize() throws IOException {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║           TEXT TOKENIZER WITH ENCODER/DECODER                ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("Downloading and processing eBooks from Project Gutenberg...");
        System.out.println();

        int totalTokens = 0;

        for (String[] book : EBOOKS) {
            String title = book[0];
            String url = book[1];
            String filename = book[2];

            System.out.println("📚 " + title);

            // Download or load from cache
            String content = downloader.downloadOrCache(url, filename);

            // Strip Gutenberg boilerplate
            String cleanContent = downloader.stripGutenbergBoilerplate(content);

            // Tokenize and add to vocabulary
            List<String> tokens = tokenizer.tokenize(cleanContent);
            vocabulary.addTokens(tokens);

            System.out.println("  Tokens extracted: " + tokens.size());
            totalTokens += tokens.size();
            System.out.println();
        }

        System.out.println("════════════════════════════════════════════════════════════════");
        System.out.println("✓ Total tokens processed: " + String.format("%,d", totalTokens));
        System.out.println("✓ " + vocabulary.getStats());
        System.out.println("════════════════════════════════════════════════════════════════");
        System.out.println();

        // Initialize encoder and decoder
        this.encoder = new Encoder(tokenizer, vocabulary);
        this.decoder = new Decoder(vocabulary);
    }

    /**
     * Runs the interactive loop for encoding and decoding.
     */
    public void runInteractiveLoop() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("Enter your choice (1-3): ");
            System.out.flush();

            String choice;
            try {
                choice = scanner.nextLine().trim();
            } catch (java.util.NoSuchElementException e) {
                System.out.println("\nInput stream closed. Goodbye!");
                return;
            }

            switch (choice) {
                case "1":
                    handleEncode(scanner);
                    break;
                case "2":
                    handleDecode(scanner);
                    break;
                case "3":
                    System.out.println("\nGoodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please enter 1, 2, or 3.\n");
            }
        }
    }

    /**
     * Prints the menu options.
     */
    private void printMenu() {
        System.out.println("┌──────────────────────────────────────────────────────────────┐");
        System.out.println("│                         MENU                                 │");
        System.out.println("├──────────────────────────────────────────────────────────────┤");
        System.out.println("│  1. Encode text to token IDs                                 │");
        System.out.println("│  2. Decode token IDs to text                                 │");
        System.out.println("│  3. Exit                                                     │");
        System.out.println("└──────────────────────────────────────────────────────────────┘");
    }

    /**
     * Handles the encode operation.
     */
    private void handleEncode(Scanner scanner) {
        System.out.println("\n=== ENCODE TEXT ===");
        System.out.print("Enter text to encode: ");
        System.out.flush();

        String input;
        try {
            input = scanner.nextLine();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("\nInput error.");
            return;
        }

        if (input.trim().isEmpty()) {
            System.out.println("\nNo input provided.\n");
            return;
        }

        System.out.println("\n" + encoder.encodeWithDetails(input));
        System.out.println("Encoded IDs (copy for decoding): " + encoder.encodeToString(input));
        System.out.println();

        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Handles the decode operation.
     */
    private void handleDecode(Scanner scanner) {
        System.out.println("\n=== DECODE IDs ===");
        System.out.print("Enter space-separated token IDs: ");
        System.out.flush();

        String input;
        try {
            input = scanner.nextLine();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("\nInput error.");
            return;
        }

        if (input.trim().isEmpty()) {
            System.out.println("\nNo input provided.\n");
            return;
        }

        System.out.println("\n" + decoder.decodeWithDetails(input));
        System.out.println();

        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Main entry point.
     */
    public static void main(String[] args) {
        Main app = new Main();

        try {
            app.initialize();
            app.runInteractiveLoop();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
