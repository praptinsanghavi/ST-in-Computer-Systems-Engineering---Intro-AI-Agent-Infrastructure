package tokenizer;

import java.util.ArrayList;
import java.util.List;

/**
 * ==================================================================================
 * [COMPONENT]: Decoder
 * [RESPONSIBILITY]: ID -> Text Reconstruction
 * ==================================================================================
 * 
 * The Decoder reverses the process, turning a sequence of integers back into
 * human-readable text.
 * 
 * CHALLENGE: Detokenization
 * Simply joining tokens with spaces ("hello", ",", "world") results in "hello ,
 * world".
 * This class implements heuristic logic to smart-join tokens, attempting to
 * reconstruction
 * natural spacing around punctuation.
 */
public class Decoder {

    private final Vocabulary vocabulary;

    public Decoder(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    /**
     * Reconstructs text from IDs.
     * 
     * SMART SPACING LOGIC:
     * We iterate through the tokens and decide whether to prepend a space based on
     * the CURRENT token and the PREVIOUS token.
     * 
     * Rules:
     * 1. Don't put space before punctuation (e.g. "word ." -> "word.")
     * 2. Don't put space after opening punctuation (e.g. "(" "word" -> "(word")
     */
    public String decode(List<Integer> ids) {
        StringBuilder sb = new StringBuilder();
        String prevToken = null;

        for (int id : ids) {
            // Filter out PAD tokens completely - they are structural only.
            if (id == Vocabulary.PAD_ID) {
                continue;
            }

            String token = vocabulary.getToken(id);

            // === Spacing Logic ===
            boolean isPunc = isPunctuation(token);
            boolean prevIsPunc = (prevToken != null) && isPunctuation(prevToken);
            boolean prevIsOpenPunc = (prevToken != null) && isOpeningPunctuation(prevToken);

            if (prevToken != null) {
                // Case 1: Standard word following word -> add space
                if (!isPunc && !prevIsPunc) {
                    sb.append(" ");
                }
                // Case 2: Opening punctuation -> NO space (e.g. "(word")
                else if (prevIsOpenPunc) {
                    // no space
                }
                // Case 3: Word following NON-opening punctuation -> add space (e.g. "end.
                // Start")
                else if (!isPunc && prevIsPunc) {
                    sb.append(" ");
                }
                // Else: Punctuation following word -> NO space (e.g. "end.")
            }

            sb.append(token);
            prevToken = token;
        }

        return sb.toString().trim();
    }

    /**
     * Wrapper to handle string input directly (e.g. from CLI).
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
     * Debugging utility showing step-by-step reconstruction.
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

    // Heuristics for simple punctuation
    private boolean isPunctuation(String token) {
        return token.length() == 1 && !Character.isLetterOrDigit(token.charAt(0));
    }

    private boolean isOpeningPunctuation(String token) {
        // Punctuation marks that attach to the NEXT word (no space after)
        return "([{\"'".contains(token);
    }
}
