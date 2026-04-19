import java.io.File;
import java.io.IOException;
import java.util.*;

public class TfIdfLabSkeleton {

    // Normalize text
    private static String normalize(String s) {
        if (s == null)
            return "";
        s = s.toLowerCase().trim();
        s = s.replaceAll("[^a-z\\s]", "");
        s = s.replaceAll("\\s+", " ");
        return s;
    }

    // Read file (each line = one document)
    public static List<String> readFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();

        File file = new File("src/main/resources/" + filename);
        Scanner sc = new Scanner(file, "UTF-8");

        while (sc.hasNextLine()) {
            String line = normalize(sc.nextLine());
            if (!line.isEmpty())
                lines.add(line);
        }
        sc.close();

        return lines;
    }

    private static final Set<String> STOPWORDS = new HashSet<>(Arrays.asList(
            "the", "and", "of", "to", "in", "a", "is", "it", "for", "on", "that", "this"));

    // TODO 1: Tokenize a document into words
    private static List<String> tokenize(String doc) {
        List<String> tokens = new ArrayList<>();
        for (String w : normalize(doc).split("\\s+")) {
            if (!w.isEmpty() && !STOPWORDS.contains(w)) {
                tokens.add(w);
            }
        }
        return tokens;
    }

    // TODO 2: Build TF (term frequency counts) for each document
    // INPUT: A list of raw strings, e.g., ["The cat sat", "The dog barked"]
    private static List<Map<String, Integer>> buildTF(List<String> corpus) {
        // Create a list to hold the results.
        // Each item in this list will be a Map representing one document's word counts.
        List<Map<String, Integer>> tfs = new ArrayList<>();

        // LOOP: Go through every document (string) in the input list one by one
        for (String doc : corpus) {
            // 1. Tokenize: Break the "doc" string into a clean list of words.
            // "The cat sat" --> ["the", "cat", "sat"]
            List<String> tokens = tokenize(doc);

            // 2. Create a fresh HashMap to store counts JUST for this one document
            Map<String, Integer> tf = new HashMap<>();

            // 3. Count: Loop through every word in the token list
            for (String token : tokens) {
                // "getOrDefault(token, 0) + 1" accomplishes the counting logic:
                // - Check if 'token' is already in the map.
                // - If YES, get its current count.
                // - If NO, get 0.
                // - Add 1 to that number.
                // - Put the new total back into the map.
                tf.put(token, tf.getOrDefault(token, 0) + 1);
            }
            // Add the finished map for this document to our master list
            tfs.add(tf);
        }
        // OUTPUT: A list of maps.
        // Index 0: {"the": 1, "cat": 1, "sat": 1}
        // Index 1: {"the": 1, "dog": 1, "barked": 1}
        return tfs;
    }

    // TODO 3: Build DF (document frequency)
    // INPUT: The list of TF maps we just built.
    // Each map represents one document.
    private static Map<String, Integer> buildDF(List<Map<String, Integer>> tfs) {

        // Create a master map to store the global document count for every word.
        // Key = word, Value = number of documents it appears in.
        Map<String, Integer> df = new HashMap<>();

        // LOOP 1: Go through each document's TF map one by one.
        // We don't care about the counts inside (whether it appeared 1 time or 100
        // times).
        // We only care IF it appeared.
        for (Map<String, Integer> tf : tfs) {

            // LOOP 2: Iterate through the "keySet" (the unique words) of the current
            // document.
            // If a document is {"apple": 10, "banana": 1}, the keySet is ["apple",
            // "banana"].
            for (String term : tf.keySet()) {

                // Increment the global counter for this word.
                // "I found this word in one more document, so add 1 to its meaningfulness
                // score."
                df.put(term, df.getOrDefault(term, 0) + 1);
            }
        }
        // OUTPUT: A single map summarizing the whole library.
        // Example: {"apple": 50, "unique_word": 1}
        // "apple" appeared in 50 documents. "unique_word" appeared in only 1.
        return df;
    }

    // TODO 4: Compute IDF
    // INPUT:
    // df: A map says how many docs each word appears in. {"the": 1000, "romeo": 5}
    // N: The total number of documents in our collection (e.g., 1000).
    private static Map<String, Double> computeIDF(Map<String, Integer> df, int N) {

        // Create a map to store the final IDF score for each word.
        Map<String, Double> idf = new HashMap<>();

        // LOOP: Go through every word in our dictionary.
        for (Map.Entry<String, Integer> entry : df.entrySet()) {

            // --- THE FORMULA ---
            // idf = log( (TotalDocs + 1) / (DocsWithTerm + 1) ) + 1

            // 1. (entry.getValue() + 1):
            // We take the number of docs containing the word and add 1.
            // This prevents "Divide by Zero" error.

            // 2. (double)(N + 1) / ... :
            // We take the total number of docs (plus 1) and divide it by result of #1.
            // For "the": 1001 / 1001 = 1.
            // For "romeo": 1001 / 6 = 166.

            // 3. Math.log(...):
            // We take the natural logarithm of that result.
            // log(1) = 0. (Common words get crushed to 0)
            // log(166) = ~5.1. (Rare words keep a high number)

            // 4. ... + 1:
            // We add 1 at the end to ensure the score is never exactly 0.
            // Even common words have *some* tiny value.

            double val = Math.log((double) (N + 1) / (entry.getValue() + 1)) + 1;

            // Store the score.
            idf.put(entry.getKey(), val);
        }

        // OUTPUT: A map of importance weights.
        // {"the": 1.0, "romeo": 6.1}
        return idf;
    }

    // TODO 5: Normalize TF counts
    // INPUT:
    // tf: The raw counts for one document. {"cat": 2, "dog": 1}
    // N: The total number of documents in the library (e.g., 1000).
    private static Map<String, Double> normalizeTF(Map<String, Integer> tf) {

        // Create a map to store the normalized (percentage) scores.
        Map<String, Double> norm = new HashMap<>();

        // 1. Calculate the Denominator (Total Terms)
        // We need to know how many words are in this document.
        double total = 0;
        for (int count : tf.values()) {
            total += count;
        }
        // Example:
        // If tf = {"cat": 2, "dog": 1}, then total = 3.

        // 2. Calculate the Fraction
        // Loop through the map again.
        for (Map.Entry<String, Integer> entry : tf.entrySet()) {

            // Formula: Normalized = Count / Total
            // "cat": 2 / 3 = 0.666
            // "dog": 1 / 3 = 0.333
            norm.put(entry.getKey(), entry.getValue() / total);
        }

        // OUTPUT: A map of percentages.
        // {"cat": 0.666, "dog": 0.333}
        return norm;
    }

    // TODO 6: Build TF-IDF vector
    private static Map<String, Double> buildTfidfVec(Map<String, Integer> tf,
            Map<String, Double> idf) {
        Map<String, Double> vec = new HashMap<>();
        Map<String, Double> tfNorm = normalizeTF(tf);

        for (String term : tfNorm.keySet()) {
            if (idf.containsKey(term)) {
                vec.put(term, tfNorm.get(term) * idf.get(term));
            }
        }
        return vec;
    }

    // TODO 7: Cosine similarity
    private static double cosine(Map<String, Double> a, Map<String, Double> b) {
        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;

        for (String key : a.keySet()) {
            dotProduct += a.get(key) * b.getOrDefault(key, 0.0);
            normA += Math.pow(a.get(key), 2);
        }

        for (double val : b.values()) {
            normB += Math.pow(val, 2);
        }

        if (normA == 0 || normB == 0)
            return 0.0;
        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
    }

    public static void main(String[] args) throws Exception {

        String filename = "book1.txt";

        System.out.println("===== TF-IDF Lab Skeleton =====");

        List<String> corpus = readFile(filename);
        System.out.println("Documents: " + corpus.size());

        // Step 1: Build TF
        List<Map<String, Integer>> tfs = buildTF(corpus);

        // Step 2: Build DF + IDF
        Map<String, Integer> df = buildDF(tfs);
        Map<String, Double> idf = computeIDF(df, corpus.size());

        // Step 3: Build TF-IDF vectors
        List<Map<String, Double>> docVecs = new ArrayList<>();
        for (Map<String, Integer> tf : tfs) {
            docVecs.add(buildTfidfVec(tf, idf));
        }

        System.out.println("Unique terms: " + idf.size());

        // Simple search
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter query (or exit): ");
            String query = sc.nextLine();
            if (query.equalsIgnoreCase("exit"))
                break;

            // Tokenize query
            Map<String, Integer> qtf = new HashMap<>();
            List<String> qTokens = tokenize(query);
            for (String t : qTokens) {
                qtf.put(t, qtf.getOrDefault(t, 0) + 1);
            }

            // Build query TF-IDF
            Map<String, Double> qVec = buildTfidfVec(qtf, idf);

            // Rank documents
            Map<Integer, Double> scores = new HashMap<>();

            for (int i = 0; i < docVecs.size(); i++) {
                double sim = cosine(qVec, docVecs.get(i));
                scores.put(i, sim);
            }

            List<Map.Entry<Integer, Double>> sorted = new ArrayList<>(scores.entrySet());

            sorted.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

            System.out.println("\nTop results:");

            for (int i = 0; i < Math.min(3, sorted.size()); i++) {
                int idx = sorted.get(i).getKey();
                double score = sorted.get(i).getValue();

                String preview = corpus.get(idx);
                if (preview.length() > 100)
                    preview = preview.substring(0, 100) + "...";

                System.out.println("Doc " + (idx + 1) +
                        " | score=" + score +
                        " | " + preview);
            }
        }

        sc.close();
        System.out.println("\nDone.");
    }
}
