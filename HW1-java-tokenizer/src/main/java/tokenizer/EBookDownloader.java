package tokenizer;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

/**
 * Downloads eBooks from Project Gutenberg and caches them locally.
 */
public class EBookDownloader {
    
    private static final String DATA_DIR = "data";
    
    /**
     * Downloads an eBook from the given URL or returns cached content.
     * 
     * @param urlString The URL to download from
     * @param filename The local filename to cache as
     * @return The text content of the eBook
     * @throws IOException If download or file operations fail
     */
    public String downloadOrCache(String urlString, String filename) throws IOException {
        Path dataPath = Paths.get(DATA_DIR);
        Path filePath = dataPath.resolve(filename);
        
        // Create data directory if it doesn't exist
        if (!Files.exists(dataPath)) {
            Files.createDirectories(dataPath);
        }
        
        // Return cached version if available
        if (Files.exists(filePath)) {
            System.out.println("  [Cached] " + filename);
            return new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
        }
        
        // Download from URL
        System.out.println("  [Downloading] " + urlString);
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(30000);
        
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        
        // Cache the content
        String text = content.toString();
        Files.write(filePath, text.getBytes(StandardCharsets.UTF_8));
        System.out.println("  [Saved] " + filename);
        
        return text;
    }
    
    /**
     * Strips Project Gutenberg header and footer boilerplate from text.
     * 
     * @param text The raw eBook text
     * @return The cleaned text with only book content
     */
    public String stripGutenbergBoilerplate(String text) {
        // Find start marker
        String startMarker = "*** START OF THE PROJECT GUTENBERG EBOOK";
        String altStartMarker = "*** START OF THIS PROJECT GUTENBERG EBOOK";
        int startIdx = text.indexOf(startMarker);
        if (startIdx == -1) {
            startIdx = text.indexOf(altStartMarker);
        }
        if (startIdx != -1) {
            startIdx = text.indexOf("\n", startIdx) + 1;
        } else {
            startIdx = 0;
        }
        
        // Find end marker
        String endMarker = "*** END OF THE PROJECT GUTENBERG EBOOK";
        String altEndMarker = "*** END OF THIS PROJECT GUTENBERG EBOOK";
        int endIdx = text.indexOf(endMarker);
        if (endIdx == -1) {
            endIdx = text.indexOf(altEndMarker);
        }
        if (endIdx == -1) {
            endIdx = text.length();
        }
        
        return text.substring(startIdx, endIdx).trim();
    }
}
