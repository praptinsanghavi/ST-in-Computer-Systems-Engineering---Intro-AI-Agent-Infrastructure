package tokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Word-level tokenizer that splits text into tokens.
 * Handles punctuation and special characters as separate tokens.
 */
public class Tokenizer {

    // Pattern to match words, numbers, and punctuation as separate tokens
    private static final Pattern TOKEN_PATTERN = Pattern.compile(
            "[a-zA-Z]+|[0-9]+|[.,!?;:\"'()\\[\\]{}\\-]");

    /**
     * Tokenizes the input text into a list of tokens.
     * Converts all text to lowercase for consistency.
     * 
     * @param text The input text to tokenize
     * @return List of tokens
     */
    public List<String> tokenize(String text) {
        List<String> tokens = new ArrayList<>();

        if (text == null || text.isEmpty()) {
            return tokens;
        }

        // Convert to lowercase for consistency
        String lowerText = text.toLowerCase();

        Matcher matcher = TOKEN_PATTERN.matcher(lowerText);
        while (matcher.find()) {
            tokens.add(matcher.group());
        }

        return tokens;
    }

    /**
     * Tokenizes text and returns a string representation for display.
     * 
     * @param text The input text to tokenize
     * @return Formatted string showing tokens
     */
    public String tokenizeAndFormat(String text) {
        List<String> tokens = tokenize(text);
        return String.join(" | ", tokens);
    }
}
