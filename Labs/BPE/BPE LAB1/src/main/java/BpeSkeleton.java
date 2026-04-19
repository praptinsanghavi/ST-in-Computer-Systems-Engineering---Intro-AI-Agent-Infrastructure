import java.io.File; // Import File class for file operations
import java.io.IOException; // Import IOException for handling file errors
import java.util.*; // Import utility classes like List, Map, Scanner, etc.

public class BpeSkeleton { // Main class for BPE implementation

    // TODO(1): Normalization helper function
    // Requirements: lowercase + trim, remove punctuation, collapse spaces
    private static String normalize(String s) { // Helper method to normalize text strings - TODO(1)
        if (s == null) // Check if the input string is null - TODO(1)
            return ""; // Return empty string if null to avoid errors - TODO(1)
        s = s.toLowerCase().trim(); // Convert to lowercase and trim leading/trailing whitespace - TODO(1)
        s = s.replaceAll("[^a-z\\s]", ""); // Remove all non-alphabetic characters except spaces - TODO(1)
        s = s.replaceAll("\\s+", " "); // Collapse multiple consecutive spaces into a single space - TODO(1)
        return s; // Return the normalized string - TODO(1)
    }

    // Reads the file using Scanner and stores all lines
    public static List<String> readFile(String filename) throws IOException { // Method to read file and return lines -
                                                                              // TODO(2)
        List<String> lines = new ArrayList<>(); // Initialize list to store read lines - TODO(2)

        File file = new File("src/main/resources/" + filename); // Create File object pointing to resource - TODO(2)
        Scanner scanner = new Scanner(file); // Initialize Scanner to read the file - TODO(2)

        while (scanner.hasNextLine()) { // Loop through each line in the file - TODO(2)
            String line = scanner.nextLine(); // Read the next line - TODO(2)
            line = normalize(line); // Normalize the line using the helper function - TODO(2)
            if (!line.isEmpty()) { // Check if the normalized line is not empty - TODO(2)
                lines.add(line); // Add the non-empty normalized line to the list - TODO(2)
            }
        }

        scanner.close(); // Close the scanner to release resources - TODO(2)
        return lines; // Return the list of normalized lines - TODO(2)
    }

    // Count word frequencies in corpus
    private static Map<String, Integer> getWordFrequencies(List<String> corpus) { // Method to count word frequencies -
                                                                                  // TODO(3)
        Map<String, Integer> wordFreq = new HashMap<>(); // Initialize map to store word counts - TODO(3)

        for (String line : corpus) { // Iterate through each line in the corpus - TODO(3)
            for (String word : line.split("\\s+")) { // Split line into words by whitespace - TODO(3)
                if (!word.isEmpty()) { // Ensure the word is not empty - TODO(3)
                    wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1); // Increment count for the word - TODO(3)
                }
            }
        }

        return wordFreq; // Return the map of word frequencies - TODO(3)
    }

    // Initialize tokenized representation (character-level + </w>)
    private static Map<String, List<String>> initializeTokenizedWords(Map<String, Integer> wordFreq) { // Method to init
                                                                                                       // tokens -
                                                                                                       // TODO(4)
        Map<String, List<String>> tokenized = new HashMap<>(); // Map to store tokenized version of each word - TODO(4)

        for (String word : wordFreq.keySet()) { // Iterate through each unique word - TODO(4)
            List<String> symbols = new ArrayList<>(); // List to hold characters/tokens of the word - TODO(4)
            for (char c : word.toCharArray()) { // Iterate through characters of the word - TODO(4)
                symbols.add(String.valueOf(c)); // Add character as a string to symbols list - TODO(4)
            }
            symbols.add("</w>"); // Add end-of-word token - TODO(4)
            tokenized.put(word, symbols); // Map the word to its initial token list - TODO(4)
        }

        return tokenized; // Return the initialized token map - TODO(4)
    }

    // Count all adjacent pairs weighted by word frequency
    private static Map<String, Integer> countPairs(Map<String, List<String>> tokenized,
            Map<String, Integer> wordFreq) { // Method to count adjacent pairs - TODO(5)
        Map<String, Integer> pairFreq = new HashMap<>(); // Map to store frequency of pairs - TODO(5)

        for (Map.Entry<String, List<String>> entry : tokenized.entrySet()) { // Iterate over tokenized words - TODO(5)
            String word = entry.getKey(); // Get the original word string - TODO(5)
            List<String> symbols = entry.getValue(); // Get the current list of tokens - TODO(5)
            int count = wordFreq.get(word); // Get the frequency of this word in corpus - TODO(5)

            for (int i = 0; i < symbols.size() - 1; i++) { // Iterate through adjacent pairs in token list - TODO(5)
                String pair = symbols.get(i) + " " + symbols.get(i + 1); // Create pair string (e.g., "a b") - TODO(5)
                pairFreq.put(pair, pairFreq.getOrDefault(pair, 0) + count); // Add word's frequency to pair's count -
                                                                            // TODO(5)
            }
        }

        return pairFreq; // Return the map of pair frequencies - TODO(5)
    }

    // Find the most frequent pair (prof-style Collections)
    private static String getMostFrequentPair(Map<String, Integer> pairFreq) { // Method to find max freq pair - TODO(6)
        if (pairFreq.isEmpty()) // Check if pair map is empty - TODO(6)
            return null; // Return null if no pairs found - TODO(6)
        return Collections.max(pairFreq.entrySet(), Map.Entry.comparingByValue()).getKey(); // Find and return key with
                                                                                            // max value - TODO(6)
    }

    // Merge a specific pair across all tokenized words
    private static void mergePair(Map<String, List<String>> tokenized, String bestPair) { // Method to apply merge -
                                                                                          // TODO(7)
        String mergedSymbol = bestPair.replace(" ", ""); // Create merged symbol by removing space - TODO(7)
        String[] parts = bestPair.split(" "); // Split the pair into its two components - TODO(7)
        String first = parts[0]; // First token of the pair - TODO(7)
        String second = parts[1]; // Second token of the pair - TODO(7)

        for (List<String> symbols : tokenized.values()) { // Iterate through all token lists - TODO(7)
            for (int i = 0; i < symbols.size() - 1; i++) { // Iterate through tokens in the word - TODO(7)
                if (symbols.get(i).equals(first) && symbols.get(i + 1).equals(second)) { // Check for match - TODO(7)
                    symbols.set(i, mergedSymbol); // Replace first token with merged symbol - TODO(7)
                    symbols.remove(i + 1); // Remove the second token - TODO(7)
                    i--; // Decrement index to handle potential overlapping merges (safety) - TODO(7)
                }
            }
        }
    }

    // Train BPE with given number of merges
    public static List<String> trainBPE(List<String> corpus, int numMerges) { // Method to train BPE model - TODO(8)
        Map<String, Integer> wordFreq = getWordFrequencies(corpus); // Get word counts from corpus - TODO(8)
        Map<String, List<String>> tokenized = initializeTokenizedWords(wordFreq); // Initialize tokens - TODO(8)
        List<String> merges = new ArrayList<>(); // List to store learned merges in order - TODO(8)

        System.out.println("Initial Vocabulary Size: " + tokenized.size()); // Approx base vocab - TODO(8)

        for (int i = 0; i < numMerges; i++) { // Loop for the specified number of merges - TODO(8)
            Map<String, Integer> pairFreq = countPairs(tokenized, wordFreq); // Count pairs in current state - TODO(8)
            if (pairFreq.isEmpty()) // If no pairs left, break loop - TODO(8)
                break; // Break - TODO(8)

            String bestPair = getMostFrequentPair(pairFreq); // Find the most frequent pair - TODO(8)
            merges.add(bestPair); // Record this merge - TODO(8)
            mergePair(tokenized, bestPair); // Apply the merge to all words - TODO(8)

            // "Print_the_Corpus_and_Vocabulary_at_the_end_of_each_iteration"
            // Printing entire corpus is too large, printing a sample and stats instead.
            System.out.println("Iter " + (i + 1) + ": Merged '" + bestPair + "'"); // Log iteration info - TODO(8)
            System.out.println("  -> Vocabulary Size (Merges): " + merges.size()); // Log vocab size - TODO(8)

            // Print a sample of the corpus (first 3 unique tokenized words as proxy)
            System.out.print("  -> Corpus Sample (first 3 words): "); // Log corpus sample header - TODO(8)
            int limit = 0; // Counter for sample limit - TODO(8)
            for (Map.Entry<String, List<String>> entry : tokenized.entrySet()) { // Iterate tokenized words - TODO(8)
                if (limit++ >= 3)
                    break; // Stop after 3 entries - TODO(8)
                System.out.print(entry.getKey() + "->" + entry.getValue() + "  "); // Print word sample - TODO(8)
            }
            System.out.println(); // Newline - TODO(8)
        }
        return merges; // Return the list of learned merges - TODO(8)
    }

    // Encode a word using learned BPE merges
    public static List<String> encode(String word, List<String> merges) { // Method to encode a word - TODO(9)
        word = normalize(word); // Normalize the word - TODO(9)
        List<String> tokens = new ArrayList<>(); // Initialize token list - TODO(9)
        for (char c : word.toCharArray()) { // Iterate through word characters - TODO(9)
            tokens.add(String.valueOf(c)); // Add character to tokens - TODO(9)
        }
        tokens.add("</w>"); // Add end-of-word token - TODO(9)

        for (String merge : merges) { // Iterate through all learned merges in order - TODO(9)
            String mergedSymbol = merge.replace(" ", ""); // Create merged symbol - TODO(9)
            String[] parts = merge.split(" "); // Split merge rule - TODO(9)
            String first = parts[0]; // First part - TODO(9)
            String second = parts[1]; // Second part - TODO(9)

            for (int i = 0; i < tokens.size() - 1; i++) { // Scan current tokens - TODO(9)
                if (tokens.get(i).equals(first) && tokens.get(i + 1).equals(second)) { // Check for match - TODO(9)
                    tokens.set(i, mergedSymbol); // Apply merge - TODO(9)
                    tokens.remove(i + 1); // Remove second token - TODO(9)
                    i--; // Decrement index - TODO(9)
                }
            }
        }
        return tokens; // Return final token list - TODO(9)
    }

    // Encode a full sentence
    public static List<String> encodeSentence(String sentence, List<String> merges) { // Method to encode sentence -
                                                                                      // TODO(10)
        sentence = normalize(sentence); // Normalize the sentence - TODO(10)
        List<String> result = new ArrayList<>(); // Initialize result list - TODO(10)
        for (String word : sentence.split("\\s+")) { // Split sentence into words - TODO(10)
            if (!word.isEmpty()) { // Check for non-empty word - TODO(10)
                result.addAll(encode(word, merges)); // Encode word and add to result - TODO(10)
            }
        }
        return result; // Return encoded sentence tokens - TODO(10)
    }

    public static void main(String[] args) throws Exception { // Main method - Entry point

        // === Session setup ===
        String filename = "book1.txt"; // Define corpus filename
        String demoSentence = "I now understand Byte Pair Encoding"; // Define demo sentence

        System.out.println("===== Reading Corpus ====="); // Print header
        List<String> corpus = readFile(filename); // Read and normalize corpus - TODO(2)
        System.out.println("Lines read: " + corpus.size()); // Print line count

        // === Corpus stats (once TODO(3) is done) ===
        Map<String, Integer> wordFreq = getWordFrequencies(corpus); // Get word frequencies - TODO(3)
        System.out.println("Unique words in corpus: " + wordFreq.size()); // Print unique word count
        System.out.println("Total words: " + wordFreq.values().stream() // Calculate total words
                .mapToInt(Integer::intValue).sum()); // Sum frequencies

        // Show top 10 most frequent words
        System.out.println("\nTop 10 words:"); // Print header
        wordFreq.entrySet().stream() // Stream the frequency map
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue())) // Sort by frequency descending
                .limit(10) // Limit to top 10
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue())); // Print each entry

        // === Interactive K input ===
        Scanner scanner = new Scanner(System.in); // Initialize scanner for user input
        System.out.print("\nEnter K (number of merges) to train: "); // Prompt user
        int K = scanner.nextInt(); // Read integer K

        // === Train with manual K ===
        System.out.println("\n===== Training BPE with K = " + K + " merges =====\n"); // Print training header
        List<String> merges = trainBPE(corpus, K); // Train BPE with manual K - TODO(8)

        System.out.println("\nMerges learned: " + merges.size()); // Print merge count
        System.out.println("First 5 merges learned: " + // Print first 5 merges
                merges.subList(0, Math.min(5, merges.size()))); // Get sublist safely

        // Encode sentence to show how tokenization changes with K
        System.out.println("\n===== Sentence Encoding ====="); // Print encoding header
        List<String> encodedSentence = encodeSentence(demoSentence, merges); // Encode demo sentence - TODO(10)
        System.out.println("\"" + demoSentence + "\""); // Print original
        System.out.println("Tokens (" + encodedSentence.size() + "): " + encodedSentence); // Print tokens

        System.out.println("\n" + String.join("", Collections.nCopies(60, "="))); // Print separator
        // scanner.close(); // Keep standard in open
    }
}
