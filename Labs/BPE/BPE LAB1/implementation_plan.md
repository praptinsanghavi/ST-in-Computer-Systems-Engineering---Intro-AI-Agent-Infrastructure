# BPE Implementation Plan

## Goal Description
Implement the Byte Pair Encoding (BPE) algorithm in `BpeSkeleton.java` to tokenize text by iteratively merging the most frequent adjacent character pairs. This involves completing 10 TODO items ranging from basic string normalization to the core BPE training loop and inference logic.

## User Review Required
> [!IMPORTANT]
> The implementation relies on `book1.txt` being present in `src/main/resources/`. If it's missing, I'll need to create a sample file for testing.

## Proposed Changes

### Java Source Code

#### [MODIFY] [BpeSkeleton.java](file:///c:/Users/prapt/Downloads/BPE%20LAB1/BPE%20LAB1/src/main/java/BpeSkeleton.java)
- **Implement `normalize(String s)`**:
    - Convert to lowercase.
    - Trim whitespace.
    - Remove all non-alphabetic characters (keep `a-z` and spaces).
    - Collapse multiple spaces into a single space.
- **Implement `readFile(String filename)`**:
    - Use `Scanner` to read lines.
    - Normalize each line.
    - Add non-empty lines to the list.
- **Implement `getWordFrequencies(List<String> corpus)`**:
    - Split lines by whitespace `\\s+`.
    - Count occurrences of each word using a `HashMap`.
- **Implement `initializeTokenizedWords(Map<String, Integer> wordFreq)`**:
    - For each word, create a `List<String>` of its characters.
    - Append `</w>` as the last token for each word to mark the end of word.
- **Implement `countPairs(...)`**:
    - Iterate through all tokenized words.
    - For each adjacent pair of tokens, increment its count by the word's frequency.
- **Implement `getMostFrequentPair(...)`**:
    - Find the pair with the maximum count in the map.
- **Implement `mergePair(...)`**:
    - Create a merged symbol by concatenating the pair (without space).
    - Scan all tokenized words and replace occurrences of the pair `[A, B]` with `[AB]`.
- **Implement `trainBPE(...)`**:
    - Initialize vocab and tokenized words.
    - Loop `numMerges` times:
        - Count pairs.
        - Find best pair.
        - Add to merges list.
        - Apply merge.
- **Implement `encode(...)`**:
    - Normalize word.
    - Initialize tokens as characters + `</w>`.
    - Apply learned merges in order.
- **Implement `encodeSentence(...)`**:
    - Normalize sentence.
    - Split into words.
    - Encode each word and aggregate tokens.

## Verification Plan

### Automated Tests
- The `BpeSkeleton.java` file contains a `main` method that acts as a driver/test.
- **Command**: Run the `main` method.
    - `javac src/main/java/BpeSkeleton.java` (might need to adjust classpath if package structure is complex, but looks like default package or simple structure).
    - Actually, since it's a gradle/maven project structure (`src/main/java`), I should check if there's a build tool or just run with `java`.
    - **Step 1**: Compile: `javac -sourcepath src/main/java src/main/java/BpeSkeleton.java -d out`
    - **Step 2**: Run: `java -cp out BpeSkeleton`
- **Expected Output**:
    - Prints corpus stats.
    - Prints top 10 words.
    - Runs training for K=50, 100, 500.
    - Shows merges learned.
    - Encodes a demo sentence "I now understand Byte Pair Encoding".

### Manual Verification
- Check the output of the `main` method to ensure:
    - Normalization works (no punctuation, lowercase).
    - Frequencies look reasonable.
    - Merges are happening (e.g., `t h` -> `th`).
    - Sentence encoding combines tokens correctly (e.g., `understand` might become `under stand </w>` or similar depending on K).
