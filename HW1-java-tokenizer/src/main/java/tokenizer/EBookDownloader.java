package tokenizer;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

/**
 * ==================================================================================
 * [COMPONENT]: E-Book Downloader
 * [RESPONSIBILITY]: Data Acquisition & Caching Layer
 * ==================================================================================
 * 
 * This class handles the retrieval of raw text data from the source (Project
 * Gutenberg).
 * It implements a "Check-then-Act" caching strategy to minimize network usage
 * and latency.
 * 
 * CORE LOGIC FLOW:
 * 1. Check if the file exists locally in the 'data/' directory.
 * 2. If YES: Read and return local file (Fast path).
 * 3. If NO: Download from URL, save to 'data/', then return content (Slow
 * path).
 * 
 * DESIGN DECISION - Caching:
 * Network calls are expensive and unreliable. By persisting downloads to the
 * local
 * file system, we ensure the application is robust offline and starts up
 * instantly
 * on subsequent runs.
 */
public class EBookDownloader {

    // Directory where book files will be persisted.
    // Using a relative path ensures portability across different environments.
    private static final String DATA_DIR = "data";

    /**
     * Orchestrates the download-or-load process.
     * 
     * @param urlString The direct URL to the plain text file (UTF-8 encoded).
     * @param filename  The local filename to use for storage (e.g.,
     *                  "frankenstein.txt").
     * @return The complete text content of the book.
     * @throws IOException Propagated to Main to handle graceful shutdown or error
     *                     reporting.
     */
    public String downloadOrCache(String urlString, String filename) throws IOException {
        // Resolve absolute paths for file operations
        Path dataPath = Paths.get(DATA_DIR);
        Path filePath = dataPath.resolve(filename);

        // 1. ENSURE WORKSPACE EXISTS
        // We must create the directory structure before writing files,
        // otherwise a NoSuchFileException would occur.
        if (!Files.exists(dataPath)) {
            Files.createDirectories(dataPath);
        }

        // 2. CHECK CACHE (Fast Return)
        // If the file is already on disk, we skip the network call entirely.
        // This is crucial for performance during development/testing cycles.
        if (Files.exists(filePath)) {
            System.out.println("  [Cache Hit] Loading local file: " + filename);
            return new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
        }

        // 3. NETWORK DOWNLOAD (Slow Fallback)
        System.out.println("  [Network] Downloading from: " + urlString);

        // Use HttpURLConnection for a lightweight, dependency-free HTTP client.
        // We strictly set timeouts to prevent the app from hanging indefinitely.
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(10_000); // 10 seconds to establish connection
        conn.setReadTimeout(30_000); // 30 seconds to read data

        // 4. STREAMING READ
        // We use BufferedReader for efficient line-by-line reading.
        // StringBuilder is used for string concatenation to avoid O(N^2) memory copying
        // overhead
        // that would occur with simple string addition (+ operator) in a loop.
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // We append a newline because readLine() strips it.
                // Preserving structural lines is important for preserving paragraph boundaries.
                content.append(line).append("\n");
            }
        }

        // 5. CACHE WRITE
        // Persist the downloaded content to disk so the next run uses the cache.
        String text = content.toString();
        Files.write(filePath, text.getBytes(StandardCharsets.UTF_8));
        System.out.println("  [Persisted] Saved to: " + filename);

        return text;
    }

    /**
     * Cleans the raw text by removing administrative text added by the publisher.
     * 
     * [PROBLEM]: Project Gutenberg books contain extensive headers (license,
     * credits)
     * and footers that are NOT part of the story. If we tokenize these, our
     * vocabulary
     * will be polluted with words like "License", "Gutenberg", "Terms", etc.
     * 
     * [SOLUTION]: We scan for specific marker strings that define the content
     * boundaries.
     * 
     * @param text The full raw text including boilerplate.
     * @return Cleaned text containing only the actual novel.
     */
    public String stripGutenbergBoilerplate(String text) {
        // Standard markers used in most PG texts.
        // We look for variations because older texts use slightly different formats.
        String startMarker = "*** START OF THE PROJECT GUTENBERG EBOOK";
        String altStartMarker = "*** START OF THIS PROJECT GUTENBERG EBOOK";

        // Find where the book actually begins
        int startIdx = text.indexOf(startMarker);
        if (startIdx == -1) {
            startIdx = text.indexOf(altStartMarker);
        }

        // Logic: specific marker found? Move index to the line AFTER the marker.
        // If not found, default to beginning of file (safe fallback).
        if (startIdx != -1) {
            startIdx = text.indexOf("\n", startIdx) + 1;
        } else {
            startIdx = 0;
        }

        String endMarker = "*** END OF THE PROJECT GUTENBERG EBOOK";
        String altEndMarker = "*** END OF THIS PROJECT GUTENBERG EBOOK";

        // Find where the book ends
        int endIdx = text.indexOf(endMarker);
        if (endIdx == -1) {
            endIdx = text.indexOf(altEndMarker);
        }

        // If no end marker, read until the very end.
        if (endIdx == -1) {
            endIdx = text.length();
        }

        // Return the slice containing only the story logic.
        return text.substring(startIdx, endIdx).trim();
    }
}
