package tokenizer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ==================================================================================
 * [COMPONENT]: Vocabulary
 * [RESPONSIBILITY]: State Management (Bidirectional Mapping)
 * ==================================================================================
 * 
 * The Vocabulary serves as the "Brain" or "Memory" of the tokenizer.
 * It persists the relationship between human-readable strings (Tokens) and
 * machine-readable integers (IDs).
 * 
 * DATA STRUCTURE CHOICE: HashMap
 * We use HashMaps for both lookups (Token->ID and ID->Token).
 * 
 * Why HashMap?
 * - Search Complexity: O(1) constant time on average.
 * - If we used ArrayList.indexOf(), lookups would be O(N).
 * For a vocabulary of 50,000 words, encoding a book would be exponentially
 * slower.
 */
public class Vocabulary {

    // === SPECIAL TOKENS ===
    // These are reserved IDs standard in NLP pipelines (like BERT/GPT).

    // <PAD>: Padding token. Used when batching sentences of different lengths.
    // We reserve ID 0 for this.
    public static final String PAD_TOKEN = "<PAD>";
    public static final int PAD_ID = 0;

    // <UNK>: Unknown token. Used when we encounter a word during deployment
    // that wasn't in our training data.
    public static final String UNK_TOKEN = "<UNK>";
    public static final int UNK_ID = 1;

    // === MAPPINGS ===
    // We maintain two maps to support O(1) lookup in BOTH directions.

    // Forward mapping: String -> Int (Used by Encoder)
    private final Map<String, Integer> tokenToId;

    // Reverse mapping: Int -> String (Used by Decoder)
    private final Map<Integer, String> idToToken;

    // Auto-incrementing counter for assigning new IDs.
    // Starts at 2 because 0 and 1 are reserved.
    private int nextId;

    /**
     * Initializes the vocabulary with the fundamental special tokens.
     */
    public Vocabulary() {
        tokenToId = new HashMap<>();
        idToToken = new HashMap<>();

        // Initialize the counter *after* reserving 0 and 1.
        nextId = 0;

        // Add special tokens explicitly so they exist from the start
        addToken(PAD_TOKEN); // Will get ID 0
        addToken(UNK_TOKEN); // Will get ID 1
    }

    /**
     * Core Logic: Adds a token to the vocabulary.
     * 
     * IDEMPOTENCY:
     * If the token already exists, we do NOTHING and return the existing ID.
     * We don't want duplicate entries for the same word.
     * 
     * @param token The string to add (e.g., "apple").
     * @return The ID assigned to the token.
     */
    public int addToken(String token) {
        // 1. CHECK EXISTENCE
        if (tokenToId.containsKey(token)) {
            return tokenToId.get(token);
        }

        // 2. ASSIGN NEW ID
        int id = nextId++;

        // 3. UPDATE BOTH MAPS
        tokenToId.put(token, id);
        idToToken.put(id, token);

        return id;
    }

    /**
     * Bulk addition helper.
     * Optimizes code readability in Main.
     */
    public void addTokens(List<String> tokens) {
        for (String token : tokens) {
            addToken(token);
        }
    }

    /**
     * [ENCODER LOOKUP]
     * Retrieves the ID for a given token.
     * 
     * HANDLING UNKNOWNS:
     * If a user types a word that we haven't seen before, we CANNOT return a random
     * number.
     * We must return the UNK_ID (1) to signify "I don't know this word".
     * 
     * @param token string word
     * @return ID or 1 (<UNK>)
     */
    public int getTokenId(String token) {
        return tokenToId.getOrDefault(token, UNK_ID);
    }

    /**
     * [DECODER LOOKUP]
     * Retrieves the Token for a given ID.
     * 
     * @param id integer ID
     * @return String token, or <UNK> if invalid ID
     */
    public String getToken(int id) {
        return idToToken.getOrDefault(id, UNK_TOKEN);
    }

    public boolean containsToken(String token) {
        return tokenToId.containsKey(token);
    }

    public boolean containsId(int id) {
        return idToToken.containsKey(id);
    }

    public int size() {
        return tokenToId.size();
    }

    public String getStats() {
        return String.format("Vocabulary size: %d tokens (including %s and %s)",
                size(), PAD_TOKEN, UNK_TOKEN);
    }
}
