import java.io.File;
import java.io.IOException;
import java.util.*;

public class TfIdfLab {


    // Normalize text
    private static String normalize(String s) {
        if (s == null) return "";
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
            if (!line.isEmpty()) lines.add(line);
        }
        sc.close();
        return lines;
    }

    // Tokenize
    private static List<String> tokenize(String doc) {
        List<String> tokens = new ArrayList<>();
        for (String w : normalize(doc).split("\\s+")) {
            if (!w.isEmpty()) {
                tokens.add(w);
            }
        }
        return tokens;
    }

    // Build TF counts
    private static List<Map<String, Integer>> buildTF(List<String> corpus) {
        List<Map<String, Integer>> tfs = new ArrayList<>();

        for (String doc : corpus) {
            Map<String, Integer> tf = new HashMap<>();
            for (String token : tokenize(doc)) {
                tf.put(token, tf.getOrDefault(token, 0) + 1);
            }
            tfs.add(tf);
        }
        return tfs;
    }

    // Build DF
    private static Map<String, Integer> buildDF(List<Map<String, Integer>> tfs) {
        Map<String, Integer> df = new HashMap<>();

        for (Map<String, Integer> tf : tfs) {
            for (String term : tf.keySet()) {
                df.put(term, df.getOrDefault(term, 0) + 1);
            }
        }
        return df;
    }

    // Compute IDF
    private static Map<String, Double> computeIDF(Map<String, Integer> df, int N) {
        Map<String, Double> idf = new HashMap<>();

        for (String term : df.keySet()) {
            double val = Math.log((N + 1.0) / (df.get(term) + 1.0)) + 1.0;
            idf.put(term, val);
        }
        return idf;
    }

    // Convert TF counts to normalized TF
    private static Map<String, Double> normalizeTF(Map<String, Integer> tf) {
        Map<String, Double> norm = new HashMap<>();
        int total = 0;

        for (int c : tf.values()) total += c;

        if (total == 0) return norm;

        for (String term : tf.keySet()) {
            norm.put(term, tf.get(term) / (double) total);
        }
        return norm;
    }

    // Build TF-IDF vector
    private static Map<String, Double> buildTfidfVec(Map<String, Integer> tf, Map<String, Double> idf) {

        Map<String, Double> tfNorm = normalizeTF(tf);
        Map<String, Double> vec = new HashMap<>();

        for (String term : tfNorm.keySet()) {
            if (!idf.containsKey(term)) continue;
            double weight = tfNorm.get(term) * idf.get(term);
            vec.put(term, weight);
        }
        return vec;
    }

    // Cosine similarity
    private static double cosine(Map<String, Double> a, Map<String, Double> b) {
        if (a.isEmpty() || b.isEmpty()) return 0.0;

        double dot = 0.0;
        for (String term : a.keySet()) {
            if (b.containsKey(term)) {
                dot += a.get(term) * b.get(term);
            }
        }

        double normA = 0.0, normB = 0.0;
        for (double v : a.values()) normA += v * v;
        for (double v : b.values()) normB += v * v;

        return dot / (Math.sqrt(normA) * Math.sqrt(normB));
    }

    public static void main(String[] args) throws Exception {

        String filename = "book1.txt";

        System.out.println("===== TF-IDF Lab =====");

        List<String> corpus = readFile(filename);
        System.out.println("Documents: " + corpus.size());

        // 1. Build TF
        List<Map<String, Integer>> tfs = buildTF(corpus);

        // 2. Build DF + IDF
        Map<String, Integer> df = buildDF(tfs);
        Map<String, Double> idf = computeIDF(df, corpus.size());

        // 3. Build TF-IDF vectors
        List<Map<String, Double>> docVecs = new ArrayList<>();
        for (Map<String, Integer> tf : tfs) {
            docVecs.add(buildTfidfVec(tf, idf));
        }

        System.out.println("Unique terms: " + idf.size());

        // 4. Simple search loop
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter query (or exit): ");
            String query = sc.nextLine();
            if (query.equalsIgnoreCase("exit")) break;

            // Query TF
            Map<String, Integer> qtf = new HashMap<>();
            for (String t : tokenize(query)) {
                qtf.put(t, qtf.getOrDefault(t, 0) + 1);
            }

            // Query TF-IDF
            Map<String, Double> qVec = buildTfidfVec(qtf, idf);

            // Rank docs using HashMap
            Map<Integer, Double> scores = new HashMap<>();

            for (int i = 0; i < docVecs.size(); i++) {
                double sim = cosine(qVec, docVecs.get(i));
                scores.put(i, sim);
            }

            // Sort
            List<Map.Entry<Integer, Double>> sorted =
                    new ArrayList<>(scores.entrySet());

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
