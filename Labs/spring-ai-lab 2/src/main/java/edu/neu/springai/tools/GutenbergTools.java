// Declares this class as part of the 'tools' sub-package within the Spring AI lab project.
// Keeping tool classes in a dedicated 'tools' package cleanly separates AI tool definitions
// from controllers, services, and configuration in the overall project structure.
package edu.neu.springai.tools;

// Imports the @Tool annotation from Spring AI.
// This annotation marks a method as an invocable AI tool — the Spring AI framework
// reads the 'description' attribute and exposes it to the LLM so the model can decide
// when and how to call this method during a conversation (function-calling / tool-use).
import org.springframework.ai.tool.annotation.Tool;

// Imports the @Component stereotype annotation from Spring Framework.
// @Component registers this class as a Spring-managed bean, allowing it to be
// auto-detected during classpath scanning and injected into other beans (e.g., a chat client
// that registers tools from the application context).
import org.springframework.stereotype.Component;

// Imports BreakIterator from the java.text package.
// BreakIterator is Java's locale-aware text boundary analysis engine. It can split text
// into characters, words, lines, or sentences according to Unicode and locale rules.
// Here it is used for linguistically correct sentence segmentation of the book text.
import java.text.BreakIterator;

// Imports ArrayList, a resizable-array implementation of the List interface.
// Used to accumulate matching sentences into a dynamically growing collection
// before returning the result to the caller.
import java.util.ArrayList;

// Imports the List interface from java.util.
// Declared as the return type for firstSentencesContaining() so the API is
// programming-to-interface (flexibility to swap the underlying implementation if needed).
import java.util.List;

// Imports the Locale class, which represents a specific geographical, political, or cultural region.
// Locale.US is passed to BreakIterator to ensure sentence-boundary detection follows
// American English linguistic rules (e.g., how periods, abbreviations, and whitespace are treated).
import java.util.Locale;

// Marks this class as a Spring-managed component bean.
// During application startup, Spring's component scan discovers this class and registers
// it as a singleton bean in the application context. Other beans (e.g., an AI ChatClient
// configuration) can then retrieve it and register its @Tool methods with the LLM.
@Component
public class GutenbergTools {

    // Declares a private, immutable dependency on GutenbergBookService.
    // 'final' enforces that this reference is set once (in the constructor) and
    // never changed,
    // which is a best practice for Spring beans — it makes the dependency explicit,
    // supports immutability, and enables easier unit testing via constructor
    // injection.
    private final GutenbergBookService bookService;

    // Constructor used by Spring to inject the GutenbergBookService dependency.
    // Spring AI / Spring Framework prefer constructor injection over field
    // injection because:
    // 1. Dependencies are guaranteed to be non-null when the object is created.
    // 2. It makes the class easier to test (no reflection/mocking frameworks
    // required).
    // 3. It clearly communicates what a class needs to function.
    // Since there is only one constructor, Spring automatically uses it for
    // injection
    // without requiring an explicit @Autowired annotation (as of Spring 4.3+).
    public GutenbergTools(GutenbergBookService bookService) {
        // Assigns the injected GutenbergBookService instance to the final field,
        // making the book-loading service available to all methods in this class.
        this.bookService = bookService;
    }

    // Declares this method as a Spring AI tool using a text-block description.
    // The 'description' string is sent to the LLM as part of the tool's schema,
    // telling the model what this function does and when it should invoke it. A
    // clear,
    // specific description improves the model's ability to correctly decide to call
    // this
    // tool (e.g., when the user says "find sentences mentioning the word 'whale'").
    @Tool(description = """
            Return the first N sentences from the book that contain the given word or phrase.
            Use this when the user asks to find sentences containing a specific term.
            """)
    // Defines the tool method that searches for and returns up to 'n' sentences
    // from the Gutenberg book text that contain the specified 'term'.
    // Parameters:
    // term - the word or phrase to search for (case-insensitive matching is
    // applied)
    // n - the maximum number of matching sentences to return
    // Returns a List<String> of matching sentences, preserving order of appearance
    // in the book.
    public List<String> firstSentencesContaining(String term, int n) {

        // Retrieves the full text of the Gutenberg book from the service.
        // Because GutenbergBookService uses a lazy-loading cache (volatile field),
        // this call reads from disk only on the very first invocation; subsequent calls
        // return the in-memory cached value instantly, keeping this method fast.
        String text = bookService.getBookText();

        // Creates a locale-aware sentence-boundary BreakIterator for US English.
        // BreakIterator.getSentenceInstance(Locale.US) correctly handles nuances like:
        // - Abbreviations ("Mr.", "Dr.") not being treated as sentence endings.
        // - Multiple punctuation marks ("?!" or "...") being identified as one
        // boundary.
        // - Unicode whitespace and line breaks.
        // This is far more accurate than a naive split on periods.
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);

        // Binds the BreakIterator to the book text string.
        // After this call, the iterator is positioned at the very beginning of 'text'
        // and is ready to traverse sentence boundaries within it.
        iterator.setText(text);

        // Initializes an empty ArrayList to accumulate the sentences that match the
        // search term.
        // ArrayList is chosen for its O(1) amortized add() performance, which is
        // appropriate
        // when appending items in a sequential scan like this loop.
        List<String> result = new ArrayList<>();

        // Positions the iterator at the very first boundary (index 0, i.e., the start
        // of the text).
        // 'start' will track the beginning character index of each sentence as we
        // iterate.
        int start = iterator.first();

        // Iterates through each sentence boundary in the text.
        // iterator.next() advances to the next sentence-end boundary and returns its
        // index.
        // The loop continues until iterator.next() returns BreakIterator.DONE (-1),
        // which signals that we have reached the end of the text.
        // After each iteration, 'start' is updated to the previous 'end' to slide the
        // window forward.
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {

            // Extracts the current sentence from the full text using the [start, end)
            // character range.
            // text.substring(start, end) is O(end - start) and returns a new String
            // containing
            // exactly the characters of one sentence (including trailing
            // whitespace/newlines).
            String sentence = text.substring(start, end);

            // Checks whether the current sentence contains the search term, using
            // case-insensitive
            // comparison by converting both the sentence and the term to lowercase before
            // comparing.
            // This ensures matches like "Whale", "WHALE", and "whale" are all found when
            // term is "whale".
            if (sentence.toLowerCase().contains(term.toLowerCase())) {

                // Adds the matched sentence to the results list after trimming leading/trailing
                // whitespace. Trimming cleans up any sentence-boundary artifacts (e.g.,
                // newlines
                // or extra spaces that BreakIterator includes at the start/end of a boundary).
                result.add(sentence.trim());
            }

            // Early-exit optimization: once we have collected the requested number of
            // sentences (n),
            // there's no need to continue scanning the rest of the book. Breaking here
            // avoids
            // processing potentially thousands of remaining sentences unnecessarily.
            if (result.size() == n)
                break;
        }

        // Returns the list of up to 'n' matching sentences to the Spring AI framework,
        // which serializes it and passes the result back to the LLM as the tool's
        // output.
        return result;
    }

    // Declares this method as a Spring AI tool with a descriptive annotation.
    // The description tells the LLM to invoke this specific tool when the user's
    // intent
    // is to know the total count of sentences containing a term, rather than to
    // retrieve
    // the actual sentence content (which would use firstSentencesContaining
    // instead).
    @Tool(description = """
            Count how many sentences in the book contain the given word or phrase.
            Use this when the user asks for the total number of matches.
            """)
    // Defines the tool method that counts all sentences in the book containing the
    // given term.
    // Parameters:
    // term - the word or phrase to search for (case-insensitive matching is
    // applied)
    // Returns an int representing the total number of sentences in the book that
    // contain 'term'.
    public int countSentencesContaining(String term) {

        // Retrieves the full text of the Gutenberg book from the caching service.
        // Same lazy-loading cache behavior as in firstSentencesContaining — fast after
        // the first call.
        String text = bookService.getBookText();

        // Creates a US-English sentence-boundary BreakIterator for linguistically
        // correct
        // sentence segmentation, identical to the approach in
        // firstSentencesContaining().
        // A consistent use of BreakIterator across both methods ensures the definition
        // of
        // "sentence" is the same for both counting and retrieval operations.
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);

        // Binds the BreakIterator to the full book text, readying it to traverse
        // sentence boundaries.
        iterator.setText(text);

        // Initializes the match counter to zero.
        // This variable is incremented each time a sentence containing the term is
        // found,
        // and is returned as the final count after the full text has been scanned.
        int count = 0;

        // Positions the iterator at the very beginning of the text (index 0).
        // 'start' tracks the start boundary of each sentence during the iteration.
        int start = iterator.first();

        // Iterates through every sentence in the book from first to last.
        // The loop structure is identical to firstSentencesContaining(), with the same
        // boundary-sliding logic (start = end, end = iterator.next()), but without
        // an early-exit condition — this method must scan the entire book to produce
        // an accurate total count of all matching sentences.
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {

            // Extracts the current sentence from the text using the [start, end) character
            // range.
            // Each call to text.substring(start, end) isolates exactly one sentence for
            // inspection.
            String sentence = text.substring(start, end);

            // Performs a case-insensitive check to see if the sentence contains the search
            // term.
            // By converting both strings to lowercase before calling contains(), the
            // comparison
            // is case-insensitive, matching "Ocean", "ocean", and "OCEAN" equally when term
            // = "ocean".
            if (sentence.toLowerCase().contains(term.toLowerCase())) {

                // Increments the counter when a matching sentence is found.
                // The post-increment (count++) evaluates to the current value before adding 1,
                // though the expression value is unused here — only the side effect
                // (incrementing) matters.
                count++;
            }
        }

        // Returns the final count of all sentences in the book that contain the search
        // term.
        // The Spring AI framework serializes this integer and passes it back to the
        // LLM,
        // which incorporates it into its response to the user.
        return count;
    }
}