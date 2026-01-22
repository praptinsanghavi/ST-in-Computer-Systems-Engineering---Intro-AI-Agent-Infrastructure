package tokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==================================================================================
 * [COMPONENT]: Encoder
 * [RESPONSIBILITY]: Text -> ID Transformation
 * ==================================================================================
 * 
 * The Encoder acts as a bridge between human language and machine
 * representation.
 * It coordinates the Tokenizer (splitting text) and the Vocabulary (mapping to
 * IDs).
 * 
 * DESIGN PATTERN: Composition
 * The Encoder doesn't DO the tokenization or storage itself; it composes the
 * Tokenizer and Vocabulary components to achieve the high-level goal.
 */
public class Encoder {

    private final Tokenizer tokenizer;
    private final Vocabulary vocabulary;

    /**
     * Dependency Injection via Constructor.
     * This makes the Encoder testable - we can mock the Tokenizer or Vocabulary in
     * unit tests.
     */
    public Encoder(Tokenizer tokenizer, Vocabulary vocabulary) {
        this.tokenizer = tokenizer;
        this.vocabulary = vocabulary;
    }

    /**
     * The Main Encoding Pipeline.
     * 
     * Process:
     * 1. Raw Text -> Tokenizer -> List<String>
     * 2. List<String> -> Vocabulary -> List<Integer>
     * 
     * @param text Raw input string.
     * @return List of integers representing the text.
     */
    public List<Integer> encode(String text) {
        // Step 1: Break text into atomic parts
        List<String> tokens = tokenizer.tokenize(text);
        List<Integer> ids = new ArrayList<>();

        // Step 2: Map each part to its unique ID
        for (String token : tokens) {
            // Note: vocabulary.getTokenId() handles the <UNK> logic automatically.
            // If the token isn't found, it returns the UNK_ID (1).
            ids.add(vocabulary.getTokenId(token));
        }

        return ids;
    }

    /**
     * Debugging/Educational Utility.
     * Returns a detailed view showing exactly how the text was processed.
     * 
     * @return Formatted multi-line string.
     */
    public String encodeWithDetails(String text) {
        List<String> tokens = tokenizer.tokenize(text);
        List<Integer> ids = encode(text);

        StringBuilder sb = new StringBuilder();
        sb.append("Tokens: ").append(tokens).append("\n");
        sb.append("IDs:    ").append(ids).append("\n");

        // Visualization Loop
        sb.append("\nToken → ID mapping:\n");
        for (int i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);
            int id = ids.get(i);

            // Highlight Unknown tokens so the user knows why they got ID 1
            String marker = (id == Vocabulary.UNK_ID) ? " [UNKNOWN]" : "";
            sb.append(String.format("  '%s' → %d%s\n", token, id, marker));
        }

        return sb.toString();
    }

    /**
     * Helper for easy copy-pasting of IDs.
     */
    public String encodeToString(String text) {
        return encode(text).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
