package tokenizer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ==================================================================================
 * [COMPONENT]: Tokenizer
 * [RESPONSIBILITY]: Lexical Analysis (String -> List<String>)
 * ==================================================================================
 * 
 * The Tokenizer converts a stream of characters into a stream of meaningful
 * atomic units (tokens).
 * 
 * APPROACH:
 * Instead of simple whitespace splitting (text.split(" ")), which fails
 * on punctuation (e.g., "word," would become one token "word,"),
 * we use REGULAR EXPRESSIONS (Regex) to precisely define what constitutes a
 * token.
 * 
 * This allows us to separate words from punctuation, treating "hello!" as
 * ["hello", "!"]
 * rather than ["hello!"]. This is critical for downstream NLP tasks where
 * punctuation
 * carries semantic meaning.
 */
public class Tokenizer {

    /**
     * REGEX BREAKDOWN:
     * 
     * 1. [a-zA-Z]+ : Matches one or more letters (Standard words).
     * Does NOT match numbers or symbols.
     * 
     * 2. | (OR) : Logical disjunction.
     * 
     * 3. [0-9]+ : Matches one or more digits (Numbers).
     * Keeps numbers as single tokens ("2023", not "2", "0", "2", "3").
     * 
     * 4. | (OR)
     * 
     * 5. [.,!?;:...] : Matches ANY SINGLE character from this set.
     * These are punctuation marks.
     * Note that we escape brackets \[ \] to treat them as literals.
     * 
     * EFFECT: This consumes the string by finding matches of ANY of these three
     * patterns.
     * Anything NOT matched (like standard whitespace " ") is implicitly skipped.
     */
    private static final Pattern TOKEN_PATTERN = Pattern.compile(
            "[a-zA-Z]+|[0-9]+|[.,!?;:\"'()\\[\\]{}\\-]");

    /**
     * Core processing function.
     * 
     * @param text Raw input string (e.g., "Hello, world!").
     * @return Ordered list of token strings (e.g., ["hello", ",", "world", "!"]).
     */
    public List<String> tokenize(String text) {
        List<String> tokens = new ArrayList<>();

        // 1. INPUT VALIDATION
        // Guard clause to prevent NullPointerExceptions or unnecessary processing.
        if (text == null || text.isEmpty()) {
            return tokens;
        }

        // 2. NORMALIZATION
        // We convert to lowercase to reduce vocabulary size.
        // "The" and "the" become the same token. This improves generalizations
        // but loses Case information (e.g., proper nouns vs common nouns).
        String lowerText = text.toLowerCase();

        // 3. REGEX MATCHING
        // We create a Matcher that iterates through the string finding substrings
        // that match our defined patterns.
        Matcher matcher = TOKEN_PATTERN.matcher(lowerText);
        while (matcher.find()) {
            // matcher.group() returns the substring that satisfied the regex.
            // Because whitespace isn't in our regex, it is effectively skipped/ignored.
            tokens.add(matcher.group());
        }

        return tokens;
    }

    /**
     * Utility for visualization/debugging.
     * 
     * @param text Input string.
     * @return Pipe-separated string showing token boundaries (e.g. "hello | , |
     *         world").
     */
    public String tokenizeAndFormat(String text) {
        List<String> tokens = tokenize(text);
        return String.join(" | ", tokens);
    }
}
