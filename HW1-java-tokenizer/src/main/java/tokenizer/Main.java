package tokenizer;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * ==================================================================================
 * [COMPONENT]: Main Application Controller
 * [RESPONSIBILITY]: Orchestration & User Interface
 * ==================================================================================
 * 
 * This is the entry point of the application. It acts as the "Director" in our
 * design,
 * coordinating the specialized components (Downloader, Tokenizer, Vocabulary,
 * etc.)
 * to fulfill the user's requests.
 * 
 * EXECUTION FLOW:
 * 1. Initialize Components (dependency instantiation).
 * 2. Data Preparation Phase (Download -> Clean -> Tokenize -> Train
 * Vocabulary).
 * 3. Interactive Loop (Wait for user input -> Process -> Display -> Repeat).
 */
public class Main {

    /**
     * Configuration Constant: Books to process.
     * We use a 2D array for simplicity. Struct: {Title, URL, LocalFilename}
     */
    private static final String[][] EBOOKS = {
            { "Frankenstein", "https://www.gutenberg.org/cache/epub/84/pg84.txt", "frankenstein.txt" },
            { "Pride and Prejudice", "https://www.gutenberg.org/cache/epub/1342/pg1342.txt",
                    "pride_and_prejudice.txt" },
            { "Alice's Adventures in Wonderland", "https://www.gutenberg.org/cache/epub/11/pg11.txt",
                    "alice_in_wonderland.txt" }
    };

    // Component dependencies
    private final EBookDownloader downloader;
    private final Tokenizer tokenizer;
    private final Vocabulary vocabulary;

    // These are initialized AFTER vocabulary training because they depend on the
    // full vocabulary state.
    private Encoder encoder;
    private Decoder decoder;

    /**
     * Constructor: Instantiates the foundational components.
     * These components are stateless (Downloader, Tokenizer) or start empty
     * (Vocabulary).
     */
    public Main() {
        this.downloader = new EBookDownloader();
        this.tokenizer = new Tokenizer();
        this.vocabulary = new Vocabulary();
    }

    /**
     * [PHASE 1: INITIALIZATION]
     * This method builds the "Brain" of the application.
     * It iterates through the training corpus to learn all possible words.
     * 
     * FLOW:
     * 1. Download raw text (or load from cache).
     * 2. Clean the text (remove non-story content).
     * 3. Tokenize (split into words).
     * 4. Update Vocabulary (assign IDs to new words).
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

            // 1. Data Acquisition
            String content = downloader.downloadOrCache(url, filename);

            // 2. Data Cleaning
            String cleanContent = downloader.stripGutenbergBoilerplate(content);

            // 3. Tokenization
            List<String> tokens = tokenizer.tokenize(cleanContent);

            // 4. Learning (Vocabulary Upgrade)
            vocabulary.addTokens(tokens);

            System.out.println("  Tokens extracted: " + tokens.size());
            totalTokens += tokens.size();
            System.out.println();
        }

        // Display Statistics
        System.out.println("════════════════════════════════════════════════════════════════");
        System.out.println("✓ Total tokens processed: " + String.format("%,d", totalTokens));
        System.out.println("✓ " + vocabulary.getStats());
        System.out.println("════════════════════════════════════════════════════════════════");
        System.out.println();

        // 5. Dependency Injection
        // Now that vocabulary is full; we can create the Encoder/Decoder.
        this.encoder = new Encoder(tokenizer, vocabulary);
        this.decoder = new Decoder(vocabulary);
    }

    /**
     * [PHASE 2: INTERACTIVE LOOP]
     * This keeps the application running until the user explicitly exits.
     * It handles Input/Output and error recovery.
     */
    public void runInteractiveLoop() {
        // Scanner is used to read from Standard Input (Keyboard)
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("Enter your choice (1-3): ");
            // Explicit flush ensures the prompt appears immediately in all terminals
            System.out.flush();

            String choice;
            try {
                choice = scanner.nextLine().trim();
            } catch (java.util.NoSuchElementException e) {
                // Graceful shutdown on EOF (Ctrl+D / Ctrl+Z)
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
                    scanner.close(); // Resource cleanup
                    return;
                default:
                    System.out.println("\nInvalid choice. Please enter 1, 2, or 3.\n");
            }
        }
    }

    private void printMenu() {
        System.out.println("┌──────────────────────────────────────────────────────────────┐");
        System.out.println("│                         MENU                                 │");
        System.out.println("├──────────────────────────────────────────────────────────────┤");
        System.out.println("│  1. Encode text to token IDs                                 │");
        System.out.println("│  2. Decode token IDs to text                                 │");
        System.out.println("│  3. Exit                                                     │");
        System.out.println("└──────────────────────────────────────────────────────────────┘");
    }

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

        // Delegate to Encoder component
        System.out.println("\n" + encoder.encodeWithDetails(input));
        System.out.println("Encoded IDs (copy for decoding): " + encoder.encodeToString(input));
        System.out.println();

        // UX Improvement: Pause output so user can read it
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

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

        // Delegate to Decoder component
        System.out.println("\n" + decoder.decodeWithDetails(input));
        System.out.println();

        // UX Improvement: Pause output so user can read it
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    /**
     * Bootstrap method.
     */
    public static void main(String[] args) {
        Main app = new Main();

        try {
            // "Fail Fast" architectural pattern:
            // If initialization fails (e.g. no internet), we crash immediately
            // rather than entering an invalid state.
            app.initialize();
            app.runInteractiveLoop();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
