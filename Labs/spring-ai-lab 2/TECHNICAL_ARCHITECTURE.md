# Technical Architecture: Spring AI Tool-Calling System

## 1. Strategic Approach to Assignment

The core objective was to demonstrate a mastery of **Agentic AI System Design** by building a production-grade tool-calling pipeline on top of a Large Language Model. The approach prioritized "framework-idiomatic correctness" over manual orchestration — letting Spring AI and the OpenAI Function-Calling protocol handle the agentic loop, while focusing engineering effort on the tool implementations themselves.

### A. Architectural Decisions (Code-Grounded)

- **Constructor Injection Over Field Injection:** The `AskController` constructor (`AskController.java:66`) accepts both a `ChatClient.Builder` and a `GutenbergTools` instance as arguments. This guarantees all dependencies are non-null at object creation time and makes the component trivially testable without a Spring context. The same pattern is applied in `GutenbergTools` (`GutenbergTools.java:64`).

- **Immutability of the ChatClient:** The `chatClient` field in `AskController` is declared `private final` (`AskController.java:50`). Once built in the constructor, the reference is frozen for the entire lifecycle of the bean. Because Spring manages `AskController` as a singleton, this makes the HTTP-handling layer stateless and safe under concurrent requests.

- **Tool Registration at Build-Time:** `.defaultTools(tools)` is called once during `AskController` construction (`AskController.java:84`), not on every HTTP request. This means Spring AI inspects the `GutenbergTools` bean, reads each `@Tool` annotation's description, and generates the OpenAI-compatible tool schema *exactly once* at startup — not at runtime — eliminating per-request schema-generation overhead.

- **Lazy-Loading Cache with `volatile`:** `GutenbergBookService` uses a `volatile String cachedText` field (`GutenbergBookService.java:42`). `volatile` ensures the initial write (first file read) is immediately visible to all subsequent threads without requiring a `synchronized` block. This is a deliberate choice: a full `synchronized` lock would serialize every call, while the `volatile` pattern gives thread-safe visibility for a write-once / read-many workload.

---

## 2. Technical Implementation & Core Logic

### A. Bootstrap Layer: Auto-Configuration Lifecycle

**Component: `DemoApplication.java`**

- `@SpringBootApplication` (`DemoApplication.java:28`) is a meta-annotation that activates three behaviors simultaneously: `@Configuration` (bean definitions), `@EnableAutoConfiguration` (classpath-driven infrastructure setup), and `@ComponentScan` (recursive package discovery). Placing this class at the root package `edu.neu.springai` is critical — it ensures that sub-packages (`edu.neu.springai.tools`) are automatically discovered.
- `SpringApplication.run(DemoApplication.class, args)` (`DemoApplication.java:67`) bootstraps the full Spring ApplicationContext, auto-configures an OpenAI-backed `ChatClient` (triggered by the `spring-ai-starter-model-openai` dependency on the classpath), and starts an embedded Tomcat HTTP server on port 8080.

### B. Service Layer: Lazy-Loading Text Cache

**Component: `GutenbergBookService.java`**

- **Problem:** Reading a large text file from disk on every tool invocation would be prohibitively slow under any realistic query load.
- **Implemented Solution:** The `getBookText()` method (`GutenbergBookService.java:51`) implements a lazy-initialization cache. On first call, it reads `gutenberg.txt` from the classpath (`src/main/resources/`) using `ClassPathResource` and stores the decoded content in `cachedText`. On all subsequent calls, the `if (cachedText != null) return cachedText;` guard (`GutenbergBookService.java:58`) short-circuits to an in-memory return with no I/O.
- **Resource Safety:** The `InputStream` is opened inside a `try-with-resources` block (`GutenbergBookService.java:69`), guaranteeing it is closed even if an exception occurs during reading, fully preventing file-handle leaks.
- **Error Handling:** Any checked `IOException` is wrapped in an unchecked `RuntimeException` (`GutenbergBookService.java:97`). This is the standard Spring idiom: it avoids polluting the service method signature with checked exceptions while preserving the original cause for debugging.

### C. Tool Layer: LLM-Invocable Business Logic

**Component: `GutenbergTools.java`**

- **The `@Tool` Annotation Pattern:** Each public method is decorated with `@Tool(description = "...")`. Spring AI reads this description at startup and sends it to the LLM as part of the tool's JSON schema. A clear, intent-driven description (e.g., *"Use this when the user asks to find sentences…"*) directly improves the model's routing accuracy — it is the contract between the LLM's intent-recognition and the Java code.

- **`firstSentencesContaining(String term, int n)` (`GutenbergTools.java:89`):**
  - Uses `BreakIterator.getSentenceInstance(Locale.US)` for linguistically correct sentence segmentation. This handles edge cases a naive `split("\\.")` would fail on: abbreviations ("Mr.", "Dr."), ellipses ("..."), and multi-punctuation ("?!") are all correctly treated.
  - Implements an **early-exit optimization** (`GutenbergTools.java:161`): once `result.size() == n` matching sentences are found, the loop `break`s immediately. For a common term like "the", this avoids scanning hundreds of thousands of remaining characters unnecessarily.
  - Case-insensitive matching is applied by calling `.toLowerCase()` on both the sentence and the term (`GutenbergTools.java:147`), ensuring "Whale", "WHALE", and "whale" all match when `term = "whale"`.

- **`countSentencesContaining(String term)` (`GutenbergTools.java:189`):**
  - Uses the **same** `BreakIterator` approach as `firstSentencesContaining()`, ensuring the definition of "sentence" is consistent across both tool methods. A full scan (no early exit) is required here to produce an accurate total count.
  - The two tools are intentionally **separated at the tool-description level**: the `@Tool` description for `countSentencesContaining` explicitly says *"Use this when the user asks for the total number of matches"*, steering the LLM to choose `countSentencesContaining` for "how many?" queries and `firstSentencesContaining` for "show me" queries.

### D. API Layer: Single-Endpoint Agentic Controller

**Component: `AskController.java`**

- **The `/ask` Endpoint (`AskController.java:97`):** A single `GET /ask?q=<question>` endpoint is the entire user-facing API. The question string is bound from the query parameter `q` via `@RequestParam`.
- **The Agentic Loop (Opaque to the Controller):** The `chatClient.prompt().user(q).call().content()` chain (`AskController.java:112–131`) is deceptively simple. Internally, Spring AI handles an entire multi-turn tool-execution loop: the LLM receives the question plus tool schemas → decides to call a tool → Spring AI invokes the Java method → the result is fed back to the LLM → the LLM produces a final natural-language answer. The controller sees none of this complexity; it just receives the final `String`.
- **Fluent Builder Chain:** Each method in the chain (`.prompt()`, `.user()`, `.call()`, `.content()`) is a distinct step in the Spring AI DSL, keeping the controller readable and linear despite orchestrating a potentially multi-turn LLM conversation.

---

## 3. Engineering Retrospective (Learnings)

### What Worked Well?

1. **Spring AI's Tool-Calling Abstraction:** Annotating a plain method with `@Tool` was sufficient to integrate it into the OpenAI function-calling protocol. There was no manual JSON schema writing, no HTTP client code, and no round-trip management. The framework handled all serialization, deserialization, and re-prompting transparently.

2. **`BreakIterator` for Sentence Segmentation:** Using Java's built-in `BreakIterator` instead of a regex-based split produced significantly more accurate sentence boundaries. This was directly observable: the tool returns clean, complete sentences rather than fragments split at abbreviation periods.

3. **Separation of Concerns (Service vs. Tools):** Decoupling the book-loading concern (`GutenbergBookService`) from the search logic (`GutenbergTools`) made each class independently testable. `GutenbergBookService` can be unit-tested in isolation by verifying it reads correctly from the classpath. `GutenbergTools` can be unit-tested by injecting a mock service with known text.

### Trade-offs & Constraints

1. **In-Memory Text Storage:** `GutenbergBookService` loads the entire book into a single `String` in JVM heap memory. For `gutenberg.txt` (a single book), this is acceptable (~1–2 MB). For a production system serving a large corpus of thousands of books, this approach would cause `OutOfMemoryError`. A production-grade solution would use a vector database (e.g., Qdrant, Pinecone) with pre-computed embeddings and ANN (Approximate Nearest Neighbor) search.

2. **Linear Sentence Scan — O(n) Per Query:** Both tool methods perform a full linear scan of the book text on every invocation. The `volatile`-field cache eliminates I/O cost, but the CPU cost of `BreakIterator` traversal is incurred for every tool call. For a production system, a pre-indexed inverted index (e.g., Apache Lucene) over the sentence corpus would reduce per-query complexity from O(n) to O(log n + k).

3. **Single-Tool-Call per User Turn:** The current implementation relies on the LLM choosing exactly one tool per user question. If a user asks "find sentences about the sea AND count them," the model would need to call two tools sequentially. Spring AI supports multi-turn tool execution, but this behavior depends on the model (GPT-4 class models handle it; older models may not).

4. **No Streaming:** The `.call().content()` method blocks until the LLM returns its complete response. For long LLM responses or slow networks, this creates latency. A production-grade improvement would use `.stream().content()` with Spring's `Flux<String>` to enable Server-Sent Events (SSE), delivering tokens to the client as they are generated.

---

## 4. Execution Evidence

The following demonstrations show the application initializing, registering tools with the OpenAI model, and executing a natural-language tool-calling query.

### A. Initialization & Startup

The application starts on port **8080**, auto-configures the OpenAI `ChatClient`, discovers the `GutenbergTools` bean via `@ComponentScan`, and registers the two tool schemas (`firstSentencesContaining`, `countSentencesContaining`) with the model. The embedded Tomcat server becomes ready to serve the `/ask` endpoint.

> **Figure 1** — Terminal output showing Spring Boot startup: ApplicationContext initialized, `GutenbergTools` bean registered, and Tomcat started on port 8080.

### B. Sentence Retrieval Tool Call

**Query:** `GET /ask?q=Find me the first 2 sentences that contain the word "creature"`

The LLM receives the question, matches it to the `firstSentencesContaining` tool description, invokes the Java method with `term="creature"` and `n=2`. Spring AI feeds the result back and the LLM produces a natural-language answer embedding the retrieved sentences.

> **Figure 2** — Browser/cURL output showing the LLM's response containing the first two sentences from the Gutenberg text that include the word "creature".

### C. Sentence Count Tool Call

**Query:** `GET /ask?q=How many sentences in the book mention the word "love"?`

The LLM identifies the counting intent, selects `countSentencesContaining`, and passes `term="love"`. The full book is scanned and the integer count is returned to the model, which formats it as a natural-language sentence.

> **Figure 3** — Browser/cURL output showing the LLM's response with the exact count of sentences containing the word "love".

---

## Conclusion

This implementation demonstrates a **"Framework-Idiomatic Agentic MVP"** mindset. It prioritizes leveraging the Spring AI abstraction layer to its fullest (tool registration, round-trip orchestration, ChatClient DSL) and investing engineering depth where it matters: accurate text segmentation with `BreakIterator`, I/O-efficient caching with `volatile` lazy loading, and clearly described tool annotations that function as the LLM routing contract. The result is a system that is both immediately functional and architecturally honest about its production-grade limitations.
