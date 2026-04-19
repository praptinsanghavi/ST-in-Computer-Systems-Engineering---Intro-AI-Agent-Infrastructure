---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:51Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/operators/like.html
title: 'LIKE :: Akka Documentation'
---

# LIKE :: Akka Documentation

## Content

# LIKE

The `LIKE` operator performs pattern matching on text values, allowing you to search for strings that match a specified pattern. It supports wildcards for flexible text matching.

## Syntax

```
<column> LIKE <pattern>
```

## Elements

`column`

The text column or expression to match against the pattern.

`pattern`

A string pattern that can include wildcard characters:

- `%` (percent sign) \- Matches any sequence of zero or more characters
- `_` (underscore) \- Matches any single character

## Features

Pattern Matching

Searches for text values that match a specific pattern with wildcards.

Prefix Matching

Efficiently matches text that begins with a specific prefix using `'prefix%'` patterns.

Suffix Matching

Efficiently matches text that ends with a specific suffix using `'%suffix'` patterns.

## Examples

Match names starting with "Jo"

```
SELECT * FROM customers
WHERE name LIKE 'Jo%'
```

Match email addresses ending with ".com"

```
SELECT * FROM customers
WHERE email LIKE '%.com'
```

Match product codes with specific format (3 characters, then underscore, then 2 digits)

```
SELECT * FROM products
WHERE code LIKE '____%'
```

## Notes

- For index efficiency, the pattern must have a non\-wildcard prefix or suffix
- Patterns like `'%text%'` (containing text anywhere) are not supported due to indexing limitations
- Only literal string patterns are supported; patterns cannot be specified as parameters
- The LIKE operation is case\-sensitive unless the database is configured otherwise
- For more advanced text searching capabilities, consider using the `text_search()` function

## Indexing Requirements

For optimal performance, LIKE operations require specific index structures:

- `column LIKE 'prefix%'` \- Requires a prefix index on the column
- `column LIKE '%suffix'` \- Requires a suffix index on the column

Patterns that don’t have a non\-wildcard prefix or suffix cannot be efficiently indexed and are therefore not supported.

## Limitations

The View query language implementation of LIKE has the following limitations:

- Patterns must include a non\-wildcard prefix or suffix
- Only constant patterns with literal strings are supported
- Patterns cannot be specified using parameters
- Escape characters for literal `%` or `_` are not currently supported
- Case\-insensitive LIKE operations (ILIKE) are not supported

## Related Features

- [text\_search() function](../functions/text-search.html) \- More powerful language\-aware text search
- [WHERE clause](../where.html) \- Used with LIKE for filtering

## Code Examples

### Example 1: Syntax

```sql
<column> LIKE <pattern>
```

### Example 2: Examples

```sql
SELECT * FROM customers
WHERE name LIKE 'Jo%'
```

### Example 3: Examples

```sql
SELECT * FROM customers
WHERE email LIKE '%.com'
```

### Example 4: Examples

```sql
SELECT * FROM products
WHERE code LIKE '____%'
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/syntax/functions/text-search.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/operators/like.html](https://doc.akka.io/reference/views/syntax/operators/like.html)*