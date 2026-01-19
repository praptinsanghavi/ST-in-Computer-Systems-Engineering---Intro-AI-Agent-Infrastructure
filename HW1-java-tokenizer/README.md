# Java Text Tokenizer with Encoder/Decoder

A Java console application that reads eBooks from Project Gutenberg, tokenizes the text to build a vocabulary, and provides interactive encoding/decoding functionality.

## Features

- **Downloads 3 eBooks** from Project Gutenberg (with local caching)
  - Frankenstein by Mary Shelley
  - Pride and Prejudice by Jane Austen
  - Alice's Adventures in Wonderland by Lewis Carroll
- **Word-level tokenization** with punctuation handling
- **Vocabulary building** from the corpus
- **Interactive encoding**: Convert text to token IDs
- **Interactive decoding**: Convert token IDs back to text

## Project Structure

```
java-tokenizer/
├── src/main/java/tokenizer/
│   ├── Main.java              # Entry point with user interaction
│   ├── EBookDownloader.java   # Downloads/caches eBooks
│   ├── Tokenizer.java         # Word-level tokenization
│   ├── Vocabulary.java        # Token ↔ ID mapping
│   ├── Encoder.java           # Text → Token IDs
│   └── Decoder.java           # Token IDs → Text
├── data/                      # Cached eBooks (auto-created)
└── README.md
```

## Requirements

- Java 8 or higher
- Internet connection (for first-time eBook download)

## How to Compile and Run

### Compile

```bash
cd java-tokenizer
javac -d out src/main/java/tokenizer/*.java
```

### Run

```bash
java -cp out tokenizer.Main
```

## Usage

1. The application will download and process 3 eBooks on first run
2. Choose from the menu:
   - **Option 1**: Enter text to encode → see token IDs
   - **Option 2**: Enter token IDs → see decoded text
   - **Option 3**: Exit

### Example Session

```
╔══════════════════════════════════════════════════════════════╗
║           TEXT TOKENIZER WITH ENCODER/DECODER                ║
╚══════════════════════════════════════════════════════════════╝

📚 Downloading eBooks...
✓ Vocabulary size: 15,234 tokens

┌──────────────────────────────────────────────────────────────┐
│                         MENU                                 │
├──────────────────────────────────────────────────────────────┤
│  1. Encode text to token IDs                                 │
│  2. Decode token IDs to text                                 │
│  3. Exit                                                     │
└──────────────────────────────────────────────────────────────┘

Enter your choice: 1
Enter text to encode: Hello world

Tokens: [hello, world]
IDs:    [42, 156]

Enter your choice: 2
Enter token IDs: 42 156

Decoded text: hello world
```

## Special Tokens

| Token | ID | Description |
|-------|-----|-------------|
| `<PAD>` | 0 | Padding token |
| `<UNK>` | 1 | Unknown/out-of-vocabulary token |

## How It Works

1. **Tokenization**: Text is split into words and punctuation using regex
2. **Vocabulary**: Each unique token gets a unique integer ID
3. **Encoding**: Input text is tokenized, then each token is mapped to its ID
4. **Decoding**: Token IDs are mapped back to tokens and joined with proper spacing
