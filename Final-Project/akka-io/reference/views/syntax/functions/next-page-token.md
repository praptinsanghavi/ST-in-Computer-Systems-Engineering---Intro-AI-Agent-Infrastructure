---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:10Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/next-page-token.html
title: 'next_page_token() :: Akka Documentation'
---

# next_page_token() :: Akka Documentation

## Content

# next\_page\_token()

The `next_page_token()` function generates an opaque token representing the position after the last returned row in a query result. This token can be used in a subsequent query with `page_token_offset()` to continue retrieving results from that position.

## Syntax

```
next_page_token() AS alias
```

## Elements

`AS alias`

Required aliasing for the token in the query result. The alias determines the field name in the response object.

## Features

Token Generation

Creates an encoded string representing the position in the result set for continuation in a subsequent query.

Pagination State

Encapsulates information about sorting, filtering, and position within the result set without exposing implementation details.

Last Page Detection

Returns an empty string when there are no more results, indicating the last page has been reached.

## Examples

Basic usage with required alias

```
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

With sorting

```
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
ORDER BY price DESC
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

With filtering and has\_more indicator

```
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMoreProducts
FROM products
WHERE category = :category
ORDER BY name ASC
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

## Usage Flow

1. **Include in Query**: Add the function to your SELECT clause with an alias:

```
SELECT * AS products, next_page_token() AS nextPageToken
```
2. **First Page Request**: For the first page, use an empty string as the input token:

```
public record PageRequest(String pageToken) {}

// First request uses empty string
PageRequest request = new PageRequest("");
```
3. **Response Structure**: The query response includes the token:

```
public record PageResponse(List<Product> products, String nextPageToken) {}
```
4. **Next Page Request**: Use the received token for subsequent requests:

```
// Next request uses token from previous response
PageRequest nextRequest = new PageRequest(previousResponse.nextPageToken());
```
5. **Last Page Detection**: Check for an empty token to detect the last page:

```
if (response.nextPageToken().isEmpty()) {
    // Last page reached
}
```

## Notes

- The `next_page_token()` function must have an alias specified with `AS`
- The token is an opaque string that should not be parsed, modified, or stored long\-term
- An empty string token indicates there are no more results
- Tokens are specific to a query structure \- they cannot be used with different queries
- Tokens may expire after some time \- they are intended for immediate use in pagination
- The function can be used with or without `page_token_offset()`, but they are typically used together

## Related Features

- [page\_token\_offset() function](page-token-offset.html) \- Uses the token to determine offset position
- [has\_more() function](has-more.html) \- Alternative way to check for more results
- [Pagination](../../concepts/pagination.html) \- Complete guide to pagination approaches
- [OFFSET clause](../offset.html) \- Works with page\_token\_offset()
- [LIMIT clause](../limit.html) \- Controls page size

## Code Examples

### Example 1: Syntax

```sql
next_page_token() AS alias
```

### Example 2: Examples

```sql
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 3: Examples

```sql
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
ORDER BY price DESC
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 4: Examples

```sql
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMoreProducts
FROM products
WHERE category = :category
ORDER BY name ASC
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 5: Usage Flow

```sql
SELECT * AS products, next_page_token() AS nextPageToken
```

### Example 6: Usage Flow

```java
public record PageRequest(String pageToken) {}

// First request uses empty string
PageRequest request = new PageRequest("");
```

### Example 7: Usage Flow

```java
public record PageResponse(List<Product> products, String nextPageToken) {}
```

### Example 8: Usage Flow

```java
// Next request uses token from previous response
PageRequest nextRequest = new PageRequest(previousResponse.nextPageToken());
```

### Example 9: Usage Flow

```java
if (response.nextPageToken().isEmpty()) {
    // Last page reached
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/syntax/functions/has-more.html
- https://doc.akka.io/reference/views/syntax/functions/page-token-offset.html
- https://doc.akka.io/reference/views/syntax/limit.html
- https://doc.akka.io/reference/views/syntax/offset.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/next-page-token.html](https://doc.akka.io/reference/views/syntax/functions/next-page-token.html)*