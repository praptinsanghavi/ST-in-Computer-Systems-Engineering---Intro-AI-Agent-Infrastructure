package tokenizer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Vocabulary class that maintains bidirectional mapping between tokens and IDs.
 * Special tokens: <PAD> (0), <UNK> (1)
 */
public class Vocabulary {

    // Special tokens
    public static final String PAD_TOKEN = "<PAD>";
    public static final String UNK_TOKEN = "<UNK>";
    public static final int PAD_ID = 0;
    public static final int UNK_ID = 1;

    // Bidirectional mappings
    private final Map<String, Integer> tokenToId;
    private final Map<Integer, String> idToToken;
    private int nextId;

    /**
     * Creates a new vocabulary with special tokens.
     */
    public Vocabulary() {
        tokenToId = new HashMap<>();
        idToToken = new HashMap<>();

        // Add special tokens
        addToken(PAD_TOKEN); // ID 0
        addToken(UNK_TOKEN); // ID 1
    }

    /**
     * Adds a token to the vocabulary if not already present.
     * 
     * @param token The token to add
     * @return The ID of the token (existing or new)
     */
    public int addToken(String token) {
        if (tokenToId.containsKey(token)) {
            return tokenToId.get(token);
        }

        int id = nextId++;
        tokenToId.put(token, id);
        idToToken.put(id, token);
        return id;
    }

    /**
     * Adds all tokens from a list to the vocabulary.
     * 
     * @param tokens List of tokens to add
     */
    public void addTokens(List<String> tokens) {
        for (String token : tokens) {
            addToken(token);
        }
    }

    /**
     * Gets the ID for a token. Returns UNK_ID if not found.
     * 
     * @param token The token to look up
     * @return The token's ID or UNK_ID
     */
    public int getTokenId(String token) {
        return tokenToId.getOrDefault(token, UNK_ID);
    }

    /**
     * Gets the token for an ID. Returns UNK_TOKEN if not found.
     * 
     * @param id The ID to look up
     * @return The token or UNK_TOKEN
     */
    public String getToken(int id) {
        return idToToken.getOrDefault(id, UNK_TOKEN);
    }

    /**
     * Checks if a token exists in the vocabulary.
     * 
     * @param token The token to check
     * @return True if the token exists
     */
    public boolean containsToken(String token) {
        return tokenToId.containsKey(token);
    }

    /**
     * Checks if an ID exists in the vocabulary.
     * 
     * @param id The ID to check
     * @return True if the ID exists
     */
    public boolean containsId(int id) {
        return idToToken.containsKey(id);
    }

    /**
     * Returns the size of the vocabulary.
     * 
     * @return Number of tokens in vocabulary
     */
    public int size() {
        return tokenToId.size();
    }

    /**
     * Returns vocabulary statistics as a string.
     * 
     * @return Formatted statistics
     */
    public String getStats() {
        return String.format("Vocabulary size: %d tokens (including %s and %s)",
                size(), PAD_TOKEN, UNK_TOKEN);
    }
}
