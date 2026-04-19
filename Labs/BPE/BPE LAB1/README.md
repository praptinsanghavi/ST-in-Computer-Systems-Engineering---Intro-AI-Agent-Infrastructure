# Byte Pair Encoding (BPE) Implementation

A robust, Java-based implementation of the **Byte Pair Encoding (BPE)** algorithm for subword tokenization. This project demonstrates the core mechanics of BPE, a critical component in modern Large Language Models (LLMs) like GPT and BERT, allowing them to handle rare words and manage vocabulary size efficiently.

## 🚀 Features

- **Text Normalization**: Robust preprocessing pipeline (lowercasing, punctuation removal, whitespace collapsing) to ensure clean training data.
- **Iterative Training**: Implements the full BPE training loop:
    - Token initialization (character-level).
    - Frequency-weighted pair counting.
    - Greedy merging of most frequent pairs.
- **Configurable Merges (K)**: Supports training with varying vocabulary sizes (e.g., K = 50, 100, 1000) to observe tokenization granularity.
- **Detailed Analytics**: Reports corpus statistics, vocabulary growth, and merge history at every iteration.
- **Inference Engine**: Includes a tokenizer (`encode`) to apply learned merge rules to new sentences.

---

## 🧠 Algorithm Overview

Byte Pair Encoding works by iteratively merging the most frequent adjacent pair of characters (or character sequences) in a text corpus.

1.  **Initialization**: The vocabulary starts with individual characters and a special end-of-word token (`</w>`).
2.  **Frequency Analysis**: The algorithm scans the corpus to count all adjacent pairs of tokens (e.g., `("e", "r")` might appear most often).
3.  **Merge**: The most frequent pair is merged into a new symbol (e.g., `er`).
4.  **Update**: All occurrences of the pair in the corpus are replaced by the new symbol.
5.  **Repeat**: Steps 2-4 are repeated `K` times (where `K` is a hyperparameter).

**Result**: A mix of whole words (for common terms) and subword units (for rarer terms), promoting efficient text representation.

---

## 🛠️ Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher.
- A text corpus file (default: `src/main/resources/book1.txt`).

### Installation & Build

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/bpe-lab1.git
    cd bpe-lab1
    ```

2.  **Compile the code**:
    ```bash
    # Ensuring compatibility with Java 8+
    javac --release 8 src/main/java/BpeSkeleton.java
    ```

### Running the Application

Execute the compiled class properly setting the classpath:

```bash
java -cp src/main/java BpeSkeleton
```

---

## 📊 Usage & Configuration

The application is configured via the `main` method in `BpeSkeleton.java`.

### Default Configuration
- **Input Corpus**: Reads from `book1.txt`.
- **Merge Counts (K)**: Runs experiments for `K = {50, 100, 1000}`.
- **Demo Sentence**: "I now understand Byte Pair Encoding"

### modifying the Workflow
To change the corpus or experiment parameters, edit `src/main/java/BpeSkeleton.java`:

```java
public static void main(String[] args) {
    String filename = "my_custom_corpus.txt"; // Update filename
    int[] Ks = { 200, 2000, 5000 };          // Update K values
    // ...
}
```

---

## 🔬 Experimental Findings

The effect of increasing `K` (number of merges) is clearly observable in the tokenization of the sentence:
> _"I now understand Byte Pair Encoding"_

| K Value | Tokenization Characteristics | Example Tokens |
| :--- | :--- | :--- |
| **K = 50** | **Character-heavy**: The model has learned very few patterns. Most words are broken into single letters or common bigrams. | `[u, n, d, er, st, and</w>]` |
| **K = 100** | **Subword-focused**: Common syllables and prefixes/suffixes start to emerge. | `[und, er, stand</w>]` |
| **K = 1000** | **Word-level**: Frequent words are represented as single tokens. The encoding becomes much more compact. | `[understand</w>]` |

**Conclusion**: Higher `K` values lead to a larger vocabulary size but significantly shorter sequence lengths for encoded text, capturing more semantic meaning in each token.

---

## 📂 Project Structure

```
BPE LAB1/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── BpeSkeleton.java       # Core Implementation
│   │   └── resources/
│   │       └── book1.txt              # Training Corpus
├── README.md                          # Project Documentation
└── .vscode/                           # IDE Settings
```

---

## 👨‍💻 Author

Implementation of `BpeSkeleton` for Part 4 - Programming Assignment.
