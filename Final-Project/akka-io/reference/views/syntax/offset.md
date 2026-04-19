---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:44Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/offset.html
title: 'OFFSET :: Akka Documentation'
---

# OFFSET :: Akka Documentation

## Content

# OFFSET

The `OFFSET` clause specifies the number of rows to skip before starting to return rows from the query. It’s primarily used for implementing pagination or skipping initial results.

## Syntax

```
OFFSET <offset_value>
```

## Elements

`offset_value`

The number of rows to skip. This can be:

- A literal number (e.g., `10`)
- A parameter (e.g., `:startFrom`)
- A page token offset (e.g., `page_token_offset(:pageToken)`)

## Features

Count\-based offset

Skips a fixed number of rows based on a numeric value, used for simple pagination.

Token\-based offset

Uses a token from a previous query to determine the offset position, providing more stable pagination when data changes between requests.

## Examples

### Basic usage

Skip 10 rows with a literal value

```
SELECT * FROM products
OFFSET 10
```

Skip rows using a parameter

```
SELECT * FROM products
OFFSET :startFrom
```

### Count\-based pagination

Basic count\-based pagination

```
SELECT * FROM products
OFFSET 20 LIMIT 10
```

Count\-based pagination with sorting

```
SELECT * FROM products
ORDER BY price DESC
OFFSET 20 LIMIT 10
```

Count\-based pagination with total count

```
SELECT * AS products,
       total_count() AS totalCount
FROM products
ORDER BY name
OFFSET :startFrom LIMIT :pageSize
```

### Token\-based pagination

Basic token\-based pagination

```
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

Token\-based pagination with more indicators

```
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMoreProducts
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

Complete token\-based pagination example

```
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMore,
       total_count() AS totalCount
FROM products
WHERE category = :category
OFFSET page_token_offset(:pageToken)
LIMIT :pageSize
```

## Implementation in Java

### Count\-based pagination

Parameter class for count\-based pagination

```
public record PageRequest(String category, int offset, int pageSize) {}
```

Query method for count\-based pagination

```
@Query("""
    SELECT * AS products,
           total_count() AS totalCount
    FROM products
    WHERE category = :category
    ORDER BY name
    OFFSET :offset LIMIT :pageSize
    """)
public QueryEffect<ProductsPage> getProductsPage(PageRequest request) {
  return queryResult();
}
```

Response type for count\-based pagination

```
public record ProductsPage(
  List<Product> products,
  int totalCount
) {}
```

### Token\-based pagination

Parameter class for token\-based pagination

```
public record TokenPageRequest(String category, String pageToken, int pageSize) {}
```

Query method for token\-based pagination

```
@Query("""
    SELECT * AS products,
           next_page_token() AS nextPageToken,
           has_more() AS hasMore
    FROM products
    WHERE category = :category
    OFFSET page_token_offset(:pageToken)
    LIMIT :pageSize
    """)
public QueryEffect<TokenProductsPage> getProductsWithToken(TokenPageRequest request) {
  return queryResult();
}
```

Response type for token\-based pagination

```
public record TokenProductsPage(
  List<Product> products,
  String nextPageToken,
  boolean hasMore
) {}
```

Client usage for token\-based pagination

```
// First page request uses empty token
TokenPageRequest request = new TokenPageRequest("Electronics", "", 10);
TokenProductsPage response = client.forView()
  .method(ProductView::getProductsWithToken)
  .invoke(request);

// Next page uses token from previous response
if (!response.nextPageToken().isEmpty()) {
  TokenPageRequest nextRequest = new TokenPageRequest(
    "Electronics",
    response.nextPageToken(),
    10
  );
}
```

## Notes

- The `offset_value` must be non\-negative
- Count\-based offsets (numeric literals or parameters) can lead to inconsistent results if data changes between queries
- Count\-based offsets work together with `ORDER BY` to provide consistent ordering
- Token\-based pagination is more resilient to data changes but does not support `ORDER BY`
- For token\-based pagination, use an empty string as the token for the first page request
- With token\-based pagination, the last page is reached when an empty token is returned
- Token\-based pagination is generally preferred for production applications dealing with frequently changing data

## Performance considerations

- Token\-based pagination typically provides better performance for deep pagination (many pages into the result set)
- Consider using token\-based pagination for mobile applications and APIs where data consistency between requests is important
- For user interfaces that need to show specific page numbers, count\-based offsets may still be necessary
- If showing total counts, be aware that computing the count may be expensive for large result sets

## Related features

- [LIMIT clause](limit.html) \- Limits the maximum number of returned rows
- [ORDER BY clause](order-by.html) \- Sorts results before applying the offset (count\-based pagination only)
- [Pagination](../concepts/pagination.html) \- Complete guide to pagination approaches
- [page\_token\_offset() function](functions/page-token-offset.html) \- Implements token\-based pagination
- [next\_page\_token() function](functions/next-page-token.html) \- Generates tokens for pagination
- [has\_more() function](functions/has-more.html) \- Checks if more results exist

## Code Examples

### Example 1: Syntax

```sql
OFFSET <offset_value>
```

### Example 2: Basic usage

```sql
SELECT * FROM products
OFFSET 10
```

### Example 3: Basic usage

```sql
SELECT * FROM products
OFFSET :startFrom
```

### Example 4: Count-based pagination

```sql
SELECT * FROM products
OFFSET 20 LIMIT 10
```

### Example 5: Count-based pagination

```sql
SELECT * FROM products
ORDER BY price DESC
OFFSET 20 LIMIT 10
```

### Example 6: Count-based pagination

```sql
SELECT * AS products,
       total_count() AS totalCount
FROM products
ORDER BY name
OFFSET :startFrom LIMIT :pageSize
```

### Example 7: Token-based pagination

```sql
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 8: Token-based pagination

```sql
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMoreProducts
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 9: Token-based pagination

```sql
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMore,
       total_count() AS totalCount
FROM products
WHERE category = :category
OFFSET page_token_offset(:pageToken)
LIMIT :pageSize
```

### Example 10: Count-based pagination

```java
public record PageRequest(String category, int offset, int pageSize) {}
```

### Example 11: Count-based pagination

```java
@Query("""
    SELECT * AS products,
           total_count() AS totalCount
    FROM products
    WHERE category = :category
    ORDER BY name
    OFFSET :offset LIMIT :pageSize
    """)
public QueryEffect<ProductsPage> getProductsPage(PageRequest request) {
  return queryResult();
}
```

### Example 12: Count-based pagination

```java
public record ProductsPage(
  List<Product> products,
  int totalCount
) {}
```

### Example 13: Token-based pagination

```java
public record TokenPageRequest(String category, String pageToken, int pageSize) {}
```

### Example 14: Token-based pagination

```java
@Query("""
    SELECT * AS products,
           next_page_token() AS nextPageToken,
           has_more() AS hasMore
    FROM products
    WHERE category = :category
    OFFSET page_token_offset(:pageToken)
    LIMIT :pageSize
    """)
public QueryEffect<TokenProductsPage> getProductsWithToken(TokenPageRequest request) {
  return queryResult();
}
```

### Example 15: Token-based pagination

```java
public record TokenProductsPage(
  List<Product> products,
  String nextPageToken,
  boolean hasMore
) {}
```

### Example 16: Token-based pagination

```java
// First page request uses empty token
TokenPageRequest request = new TokenPageRequest("Electronics", "", 10);
TokenProductsPage response = client.forView()
  .method(ProductView::getProductsWithToken)
  .invoke(request);

// Next page uses token from previous response
if (!response.nextPageToken().isEmpty()) {
  TokenPageRequest nextRequest = new TokenPageRequest(
    "Electronics",
    response.nextPageToken(),
    10
  );
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/syntax/functions/has-more.html
- https://doc.akka.io/reference/views/syntax/functions/next-page-token.html
- https://doc.akka.io/reference/views/syntax/functions/page-token-offset.html
- https://doc.akka.io/reference/views/syntax/limit.html
- https://doc.akka.io/reference/views/syntax/order-by.html

---
*Source: [https://doc.akka.io/reference/views/syntax/offset.html](https://doc.akka.io/reference/views/syntax/offset.html)*