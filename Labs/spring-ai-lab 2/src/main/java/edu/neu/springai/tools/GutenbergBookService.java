// Declares this class as part of the 'tools' sub-package within the Spring AI lab project.
// Grouping service classes under a 'tools' package is a common convention to separate
// utility/service concerns from controllers, models, and configuration layers.
package edu.neu.springai.tools;

// Imports Spring's ClassPathResource, which provides a convenient way to access files
// located on the Java classpath (e.g., files placed under src/main/resources/).
// This avoids hardcoding absolute file system paths, making the application more portable.
import org.springframework.core.io.ClassPathResource;

// Imports the @Service stereotype annotation from Spring Framework.
// Annotating a class with @Service registers it as a Spring-managed bean in the
// application context, enabling it to be injected into other components via @Autowired
// or constructor injection. It also signals the class's role as a business-logic/service layer.
import org.springframework.stereotype.Service;

// Imports InputStream from java.io, which is the standard Java abstraction for reading
// a stream of raw bytes. Used here to read the raw bytes from the classpath resource file.
import java.io.InputStream;

// Imports StandardCharsets, which provides a set of standard Java character encodings
// (like UTF-8, UTF-16, etc.) as named constants. Using StandardCharsets.UTF_8 guarantees
// correct text decoding regardless of the JVM's default platform encoding.
import java.nio.charset.StandardCharsets;

// Registers this class as a Spring-managed Service bean.
// Spring will automatically detect this class during component scanning (since it lives
// in a package covered by @SpringBootApplication's basePackages) and instantiate it
// as a singleton bean in the application context.
@Service
public class GutenbergBookService {

  // Declares a private instance variable to cache the full text content of the
  // Gutenberg book.
  // 'volatile' ensures that reads and writes to this field are always done
  // directly from/to
  // main memory, making the cached value visible across threads in a
  // multi-threaded environment
  // (e.g., concurrent HTTP requests in a Spring web application). This is a
  // lightweight
  // thread-safety mechanism for a simple lazy-initialization cache.
  private volatile String cachedText;

  // Public method that returns the full text content of the Gutenberg book as a
  // String.
  // Implements a lazy-loading (load-on-first-access) caching pattern: the file is
  // only
  // read from disk once. Subsequent calls return the in-memory cached value
  // immediately,
  // avoiding expensive repeated I/O operations.
  public String getBookText() {

    // Checks if the book text has already been loaded and cached in memory.
    // If 'cachedText' is non-null, it means the file was already read in a previous
    // call,
    // so we short-circuit and return the cached value immediately, skipping file
    // I/O entirely.
    if (cachedText != null)
      return cachedText;

    // Opens the file "gutenberg.txt" from the application's classpath using a
    // try-with-resources
    // block. 'ClassPathResource("gutenberg.txt")' locates the file under
    // src/main/resources/.
    // The try-with-resources construct guarantees that the InputStream is
    // automatically closed
    // when the block exits (whether normally or due to an exception), preventing
    // resource leaks.
    try (InputStream is = new ClassPathResource("gutenberg.txt").getInputStream()) {

      // Reads all bytes from the InputStream at once using readAllBytes() (available
      // since Java 9),
      // then constructs a String by decoding those bytes using the UTF-8 character
      // set.
      // UTF-8 is specified explicitly (via StandardCharsets.UTF_8) to ensure correct
      // handling
      // of any non-ASCII characters (accented letters, special symbols, etc.) in the
      // book text.
      // The decoded String is assigned to 'cachedText', storing it for future calls.
      cachedText = new String(is.readAllBytes(), StandardCharsets.UTF_8);

      // Returns the freshly loaded and cached text to the caller.
      return cachedText;

    } catch (Exception e) {
      // Catches any exception that may occur during file loading — such as
      // IOException
      // (file not found on classpath, read error) or other unexpected runtime errors.
      // Wraps into an unchecked RuntimeException with a descriptive message so that:
      // 1. The exception propagates up to the caller without requiring checked
      // exception handling.
      // 2. The original cause ('e') is preserved for debugging via the exception
      // chain.
      // This is a standard Spring idiom for converting checked infrastructure
      // exceptions into
      // unchecked exceptions at the service layer.
      throw new RuntimeException("Failed to read gutenberg.txt from classpath", e);
    }
  }
}