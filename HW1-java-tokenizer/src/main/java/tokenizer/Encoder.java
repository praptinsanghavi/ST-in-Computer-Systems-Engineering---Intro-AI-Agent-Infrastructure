package tokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Encoder that converts text to a list of token IDs.
 */
public class Encoder {

    private final Tokenizer tokenizer;
    private final Vocabulary vocabulary;

    /**
     * Creates an encoder with the given tokenizer and vocabulary.
     * 
     * @param tokenizer  The tokenizer to use
     * @param vocabulary The vocabulary for ID lookup
     */
    public Encoder(Tokenizer tokenizer, Vocabulary vocabulary) {
        this.tokenizer = tokenizer;
        this.vocabulary = vocabulary;
    }

    /**
     * Encodes text into a list of token IDs.
     * 
     * @param text The input text
     * @return List of token IDs
     */
    public List<Integer> encode(String text) {
        List<String> tokens = tokenizer.tokenize(text);
        List<Integer> ids = new ArrayList<>();

        for (String token : tokens) {
            ids.add(vocabulary.getTokenId(token));
        }

        return ids;
    }

    /**
     * Encodes text and returns a formatted string representation.
     * 
     * @param text The input text
     * @return Formatted string showing tokens and their IDs
     */
    public String encodeWithDetails(String text) {
        List<String> tokens = tokenizer.tokenize(text);
        List<Integer> ids = encode(text);

        StringBuilder sb = new StringBuilder();
        sb.append("Tokens: ").append(tokens).append("\n");
        sb.append("IDs:    ").append(ids).append("\n");

        // Show mapping
        sb.append("\nToken → ID mapping:\n");
        for (int i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);
            int id = ids.get(i);
            String marker = (id == Vocabulary.UNK_ID) ? " [UNKNOWN]" : "";
            sb.append(String.format("  '%s' → %d%s\n", token, id, marker));
        }

        return sb.toString();
    }

    /**
     * Returns the encoded IDs as a space-separated string.
     * 
     * @param text The input text
     * @return Space-separated IDs
     */
    public String encodeToString(String text) {
        return encode(text).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
