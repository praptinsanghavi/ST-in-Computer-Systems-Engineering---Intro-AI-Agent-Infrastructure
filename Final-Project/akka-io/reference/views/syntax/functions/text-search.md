---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:56Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/text-search.html
title: 'text_search() :: Akka Documentation'
---

# text_search() :: Akka Documentation

## Content

# text\_search()

The `text_search()` function provides advanced text search capabilities, allowing you to search text columns for words or phrases with automatic tokenization and language\-specific normalization.

## Syntax

```
text_search(<column>, <query>, [<configuration>])
```

## Elements

`column`

The text column to search within. This should be a column containing text content.

`query`

The search query, which can be a literal string or a parameter. The query can contain multiple words that will be searched for using an AND logic (all words must be present).

`configuration`

Optional language configuration to use for text search. If not specified, a simple configuration without language\-specific features is used.

## Features

Word Tokenization

Automatically breaks text into tokens (words) based on language\-specific rules.

Text Normalization

Handles stemming, stop words, and other language\-specific normalizations based on the chosen configuration.

Multi\-word Search

When a query contains multiple words, finds entries that contain all of those words (combined with logical AND).

Linguistic Support

Supports multiple language configurations for more accurate matching in different languages.

## Supported Language Configurations

The following language configurations are supported:

- `'danish'`
- `'dutch'`
- `'english'`
- `'finnish'`
- `'french'`
- `'german'`
- `'hungarian'`
- `'italian'`
- `'norwegian'`
- `'portuguese'`
- `'romanian'`
- `'russian'`
- `'simple'` (default)
- `'spanish'`
- `'swedish'`
- `'turkish'`

## Examples

Basic text search with default configuration

```
SELECT * FROM articles
WHERE text_search(content, 'database')
```

Search with a parameter

```
SELECT * FROM articles
WHERE text_search(content, :searchQuery)
```

Search with language configuration

```
SELECT * FROM articles
WHERE text_search(content, 'database system', 'english')
```

Search in multiple languages

```
SELECT * FROM articles
WHERE text_search(content_english, :searchQuery, 'english')
   OR text_search(content_spanish, :searchQuery, 'spanish')
```

Combine text search with other conditions

```
SELECT * FROM articles
WHERE text_search(content, :searchQuery, 'english')
  AND category = 'technology'
  AND published_date > '2022-01-01'
```

## How Text Search Works

The `text_search()` function:

1. Tokenizes the column text into words based on the language configuration
2. Applies language\-specific normalization (stemming, stop words removal)
3. Tokenizes and normalizes the query text in the same way
4. Searches for matches where all query words are present in the column text
5. Returns true for rows where all query words are found, false otherwise

## Notes

- Text search is only available for deployed services and cannot be used in local testing environments
- For optimal performance, the text column should be indexed for text search
- The default `'simple'` configuration provides basic tokenization without language\-specific features
- Language\-specific configurations provide better matching through stemming (e.g., matching "running" with "run") and stop word removal
- Multiple words in the query are combined with AND logic (all words must be present)
- Text search is case\-insensitive by default

## Related Features

- [WHERE clause](../where.html) \- Used with text\_search() for filtering
- [LIKE operator](../operators/like.html) \- Simpler pattern matching alternative

## Code Examples

### Example 1: Syntax

```sql
text_search(<column>, <query>, [<configuration>])
```

### Example 2: Examples

```sql
SELECT * FROM articles
WHERE text_search(content, 'database')
```

### Example 3: Examples

```sql
SELECT * FROM articles
WHERE text_search(content, :searchQuery)
```

### Example 4: Examples

```sql
SELECT * FROM articles
WHERE text_search(content, 'database system', 'english')
```

### Example 5: Examples

```sql
SELECT * FROM articles
WHERE text_search(content_english, :searchQuery, 'english')
   OR text_search(content_spanish, :searchQuery, 'spanish')
```

### Example 6: Examples

```sql
SELECT * FROM articles
WHERE text_search(content, :searchQuery, 'english')
  AND category = 'technology'
  AND published_date > '2022-01-01'
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/syntax/operators/like.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/text-search.html](https://doc.akka.io/reference/views/syntax/functions/text-search.html)*