---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:10Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/has-more.html
title: 'has_more() :: Akka Documentation'
---

# has_more() :: Akka Documentation

## Content

# has\_more()

The `has_more()` function returns a boolean value indicating whether there are additional results available beyond the current page. It provides a convenient way to determine if more pages exist without having to check if the next page token is empty.

## Syntax

```
has_more() AS alias
```

## Elements

`AS alias`

Required aliasing for the boolean result in the query response. The alias determines the field name in the response object.

## Features

Continuation Check

Provides a simple boolean indicator that can be used in user interfaces to show or hide "load more" or pagination controls.

Works with All Paging Methods

Can be used with both token\-based pagination and traditional offset/limit pagination.

Zero Additional Fetch

Determines if more results exist without requiring an extra query to attempt to fetch the next page.

## Examples

Basic usage with LIMIT

```
SELECT * AS products, has_more() AS moreAvailable
FROM products
LIMIT 10
```

With token\-based pagination

```
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMore
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

With filtering and ordering

```
SELECT * AS products, has_more() AS moreProducts
FROM products
WHERE category = :category
ORDER BY price ASC
OFFSET :startFrom LIMIT :pageSize
```

Checking for more without including next page token

```
SELECT * AS products, has_more() AS hasMoreProducts
FROM products
LIMIT 20
```

## Usage Flow

1. **Include in Query**: Add the function to your SELECT clause with an alias:

```
SELECT * AS products, has_more() AS moreAvailable
```
2. **Response Structure**: Define a response type including the boolean field:

```
public record ProductsResponse(List<Product> products, boolean moreAvailable) {}
```
3. **Client Logic**: Use the boolean to control pagination UI:

```
if (response.moreAvailable()) {
    // Show "Load More" button or next page control
} else {
    // Hide pagination controls - we're at the end
}
```

## Notes

- The `has_more()` function must have an alias specified with `AS`
- The function returns `true` if there are more results beyond the current page, `false` if the current page contains the last results
- When used with `LIMIT`, it checks if there are more than `LIMIT` results matching the query
- The function is particularly useful for infinite scrolling or "load more" UI patterns
- The function can be used alongside `next_page_token()` to provide both a boolean indicator and a token for the next page

## Related Features

- [next\_page\_token() function](next-page-token.html) \- Generates tokens for subsequent page requests
- [page\_token\_offset() function](page-token-offset.html) \- Uses a token to determine offset position
- [Pagination](../../concepts/pagination.html) \- Complete guide to pagination approaches
- [LIMIT clause](../limit.html) \- Controls page size and works with has\_more()

## Code Examples

### Example 1: Syntax

```sql
has_more() AS alias
```

### Example 2: Examples

```sql
SELECT * AS products, has_more() AS moreAvailable
FROM products
LIMIT 10
```

### Example 3: Examples

```sql
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMore
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 4: Examples

```sql
SELECT * AS products, has_more() AS moreProducts
FROM products
WHERE category = :category
ORDER BY price ASC
OFFSET :startFrom LIMIT :pageSize
```

### Example 5: Examples

```sql
SELECT * AS products, has_more() AS hasMoreProducts
FROM products
LIMIT 20
```

### Example 6: Usage Flow

```sql
SELECT * AS products, has_more() AS moreAvailable
```

### Example 7: Usage Flow

```java
public record ProductsResponse(List<Product> products, boolean moreAvailable) {}
```

### Example 8: Usage Flow

```java
if (response.moreAvailable()) {
    // Show "Load More" button or next page control
} else {
    // Hide pagination controls - we're at the end
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/syntax/functions/next-page-token.html
- https://doc.akka.io/reference/views/syntax/functions/page-token-offset.html
- https://doc.akka.io/reference/views/syntax/limit.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/has-more.html](https://doc.akka.io/reference/views/syntax/functions/has-more.html)*