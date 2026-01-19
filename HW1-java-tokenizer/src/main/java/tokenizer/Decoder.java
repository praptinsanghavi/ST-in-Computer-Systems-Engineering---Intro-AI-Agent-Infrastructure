package tokenizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Decoder that converts token IDs back to text.
 */
public class Decoder {

    private final Vocabulary vocabulary;

    /**
     * Creates a decoder with the given vocabulary.
     * 
     * @param vocabulary The vocabulary for token lookup
     */
    public Decoder(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    /**
     * Decodes a list of token IDs back to text.
     * 
     * @param ids List of token IDs
     * @return Decoded text
     */
    public String decode(List<Integer> ids) {
        StringBuilder sb = new StringBuilder();
        String prevToken = null;

        for (int id : ids) {
            // Skip PAD tokens
            if (id == Vocabulary.PAD_ID) {
                continue;
            }

            String token = vocabulary.getToken(id);

            // Add space before word tokens (not punctuation)
            if (prevToken != null && !isPunctuation(token) && !isPunctuation(prevToken)) {
                sb.append(" ");
            } else if (prevToken != null && isOpeningPunctuation(prevToken)) {
                // No space after opening punctuation
            } else if (prevToken != null && !isPunctuation(token)) {
                sb.append(" ");
            }

            sb.append(token);
            prevToken = token;
        }

        return sb.toString().trim();
    }

    /**
     * Decodes a space-separated string of IDs.
     * 
     * @param idsString Space-separated token IDs
     * @return Decoded text
     */
    public String decodeFromString(String idsString) {
        if (idsString == null || idsString.trim().isEmpty()) {
            return "";
        }

        String[] parts = idsString.trim().split("\\s+");
        List<Integer> ids = new ArrayList<>();

        for (String part : parts) {
            try {
                ids.add(Integer.parseInt(part));
            } catch (NumberFormatException e) {
                System.err.println("Warning: Invalid ID '" + part + "' - skipping");
            }
        }

        return decode(ids);
    }

    /**
     * Decodes IDs and returns detailed output showing the mapping.
     * 
     * @param idsString Space-separated token IDs
     * @return Detailed decoding output
     */
    public String decodeWithDetails(String idsString) {
        if (idsString == null || idsString.trim().isEmpty()) {
            return "No IDs provided";
        }

        String[] parts = idsString.trim().split("\\s+");
        List<Integer> ids = new ArrayList<>();
        List<String> tokens = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("ID → Token mapping:\n");

        for (String part : parts) {
            try {
                int id = Integer.parseInt(part);
                ids.add(id);
                String token = vocabulary.getToken(id);
                tokens.add(token);

                String marker = "";
                if (id == Vocabulary.PAD_ID)
                    marker = " [PAD]";
                else if (id == Vocabulary.UNK_ID)
                    marker = " [UNK]";
                else if (!vocabulary.containsId(id))
                    marker = " [INVALID]";

                sb.append(String.format("  %d → '%s'%s\n", id, token, marker));
            } catch (NumberFormatException e) {
                sb.append(String.format("  '%s' → [INVALID - not a number]\n", part));
            }
        }

        sb.append("\nDecoded text: ").append(decode(ids));

        return sb.toString();
    }

    /**
     * Checks if a token is punctuation.
     */
    private boolean isPunctuation(String token) {
        return token.length() == 1 && !Character.isLetterOrDigit(token.charAt(0));
    }

    /**
     * Checks if a token is opening punctuation.
     */
    private boolean isOpeningPunctuation(String token) {
        return "([{\"'".contains(token);
    }
}
