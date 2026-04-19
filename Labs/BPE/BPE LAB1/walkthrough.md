# Technical Architecture: Byte Pair Encoding (BPE) System

## 1. Strategic Approach to Assignment
The core objective was to implement a robust, statistically grounded tokenizer that demonstrates how modern LLMs handle vocabulary construction. The approach prioritized "algorithmic clarity" and "observability" to allow deep analysis of the BPE compression mechanism across different values of K.

### A. Architectural Decisions (Code-Grounded)
-   **In-Memory Processing**: The system loads the corpus into a `List<String>` (BpeSkeleton.java:23). For the scope of "book1.txt" (Project Gutenberg), this trades O(N) memory for O(1) access speed during the iterative pair counting phase, avoiding expensive disk I/O in the inner loop.
-   **Iterative State Mutation**: The `tokenized` map (BpeSkeleton.java:57) is mutable. In each iteration of `trainBPE`, we directly modify the list of symbols for each word. This design mirrors the actual BPE merge operation (replacing `(A, B)` with `AB`) in a way that is intuitively verifiable.
-   **Configurable Hyperparameters**: The `Ks` array in `main` (BpeSkeleton.java:193) allows batch experimentation. This ensures that the system doesn't just "work" but provides comparative data point (K=50 vs K=1000) for analysis.

## 2. Technical Implementation & Core Logic

### A. Data Layer: The "Normalization" Pipeline
**Component**: `BpeSkeleton.java` (`normalize`, `readFile`)
-   **Problem**: Raw text contains inconsistent casing, punctuation attached to words, and variable whitespace, all of which dilute statistical signal.
-   **Implemented Solution**: The `normalize` method (lines 12-19) enforces a strict canonical form:
    -   `toLowerCase()`: Unifies "The" and "the".
    -   `[^a-z\\s]`: Aggressive cleaning to retain only semantic alpha characters.
    -   `trim()` and `\\s+`: Ensures strictly single-space separation.

### B. Logic Layer: Frequency-Driven Tokenization
**Component**: `BpeSkeleton.java` (`trainBPE`, `countPairs`, `mergePair`)
-   **The Algorithm**: Iterative Greedy Merging.
-   **Why this pattern?**
    -   **Initialization**: We start with character-level tokens + `</w>` (line 64). This ensures the vocabulary can represent *any* unseen word sequence, eliminating `<UNK>` tokens for the supported character set.
    -   **Pair Counting**: `countPairs` (lines 72-88) weights pair counts by word frequency. A pair appearing in a frequent word (like "th" in "the") is prioritized over pairs in rare words, optimizing for global compression.
    -   **Selection**: `Collections.max` (line 94) provides a deterministic selection of the best pair to merge.

### C. Transformation Layer: Rule Application
**Component**: `BpeSkeleton.java` (`encode`, `encodeSentence`)
-   **The Problem**: Learning merges is useless without an inference engine to apply them to new text.
-   **Implemented Solution**: The `encode` method (lines 151-174) applies the *learned* list of merges sequentially.
    -   **Strict Ordering**: It iterates through the `merges` list in the exact order they were learned. This is critical; applying "er" -> "s" before "e" -> "r" would yield incorrect tokenization if the training order was different.

## 3. Engineering Retrospective (Learnings)

### What worked well?
1.  **Observability**: Adding the detailed logging in `trainBPE` (lines 134-145) to print the "Corpus Sample" and "Vocabulary Size" at each iteration was crucial. It allowed immediate visual verification that "t" and "h" were merging to "th" early on, validating the logic without step-through debugging.
2.  **Helper Decomposition**: extracting `countPairs`, `getMostFrequentPair`, and `mergePair` into distinct helper methods made the `trainBPE` loop (lines 116-148) read like high-level pseudocode, significantly improving maintainability.

### Trade-offs & Constraints
1.  **Computational Complexity**: The current implementation rescans the entire vocabulary to count pairs in every iteration ($O(K \cdot V \cdot L)$ where V is tokens and L is length). For `K=1000`, this is acceptable (~seconds). For `K=50,000` (GPT-scale), a more advanced data structure (like a linked list with index updates) would be required to avoid re-scanning unchanged pairs.
2.  **Destructive Normalization**: We assume `[^a-z\\s]` is noise. In a real-world scenario, numbers and punctuation carry meaning (e.g., "Win32", "$100"). A "Level 5" production system would use a reversible tokenizer (like GPT-2's byte-level BPE) to preserve all information.

## 4. Execution Evidence

The following data demonstrates the application successfully training on `book1.txt` and differentiating between different levels of compression (K).

### A. Training & Comparisons
The system executed training for K=50, 100, and 1000.

**Corpus Statistics**
![Corpus Statistics - Initial Read and Frequencies](corpus_stats.png)

**K=50 (Character-Heavy)**
-   **Tokens**: Mostly single characters and very high-frequency pairs (`th`, `an`, `in`).
-   **Encoding**: `"I now understand..."` -> `[i</w>, n, ow</w>, u, n, d, er, st, and</w>, ...]`
-   **Observation**: The model is still "spelling out" most words.

![K=50 Training Iterations](training_k50.png)

**K=1000 (Semantically Rich)**
-   **Tokens**: Includes complete frequent words (`the</w>`, `and</w>`) and common stems (`ing</w>`, `ed</w>`).
-   **Encoding**: `"I now understand..."` -> `[i</w>, now</w>, under, stand</w>, byte</w>, pair</w>, en, co, ding</w>]`
-   **Observation**: "understand" is represented by two meaningful chunks (`under`, `stand`), showing the model has learned the structure of English.

![K=1000 Results and Sentence Encoding](k1000_results.png)

### Conclusion
This implementation demonstrates the power of BPE to transition from a character-based representation to a subword-based representation, optimizing the trade-off between vocabulary size and sequence length. The code is structured for readability, correctness, and ease of experimentation.
