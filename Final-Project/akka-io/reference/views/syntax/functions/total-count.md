---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:08Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/total-count.html
title: 'total_count() :: Akka Documentation'
---

# total_count() :: Akka Documentation

## Content

# total\_count()

The `total_count()` function returns the total number of rows that match a query’s conditions, regardless of pagination settings. This allows applications to display the total result count and calculate the total number of pages.

## Syntax

```
total_count() [AS alias]
```

## Elements

`AS alias`

Optional aliasing for the count result in the query response. If not specified, the count will be available in a field named `totalCount`.

## Features

Total Results Count

Returns the total number of rows that match the query conditions, irrespective of `LIMIT` and `OFFSET` clauses.

Pagination Information

Enables applications to display pagination information like "Showing 1\-10 of 237 results" or to calculate the total number of pages.

Same Query Conditions

The total count is calculated using the same filter conditions as the main query, ensuring consistency.

## Examples

Basic usage without an alias

```
SELECT * AS products, total_count()
FROM products
LIMIT 10
```

With a custom alias

```
SELECT * AS products, total_count() AS totalProducts
FROM products
LIMIT 10
```

Combined with token\-based pagination

```
SELECT * AS products,
       next_page_token() AS nextPageToken,
       total_count() AS totalCount
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

With filtering and other pagination info

```
SELECT * AS products,
       total_count() AS totalCount,
       has_more() AS hasMore
FROM products
WHERE category = :category
ORDER BY price ASC
LIMIT 10
```

## Usage Flow

1. **Include in Query**: Add the function to your SELECT clause, optionally with an alias:

```
SELECT * AS products, total_count() AS totalCount
```
2. **Response Structure**: Define a response type that includes the count:

```
public record ProductsResponse(List<Product> products, int totalCount) {}
```
3. **Pagination Logic**: Use the total count for pagination calculations:

```
int totalPages = (int) Math.ceil((double) response.totalCount() / pageSize);
boolean isLastPage = (currentPage == totalPages);
String paginationText = String.format(
    "Showing %d-%d of %d results",
    startIndex + 1,
    Math.min(startIndex + pageSize, response.totalCount()),
    response.totalCount()
);
```

## Notes

- The `total_count()` function computes the total number of rows that match the query conditions
- Computing the total count may add some overhead to query execution, especially for large result sets
- The count is calculated after WHERE conditions are applied but before any LIMIT or OFFSET
- The function can be combined with both count\-based and token\-based pagination
- For very large result sets, consider if displaying an exact count is necessary or if pagination controls can work with just `has_more()` information

## Performance Considerations

The `total_count()` function requires counting all matching rows in the view, which can be resource\-intensive for large result sets. Consider the following approaches to optimize performance:

- Only include `total_count()` when the count is actually needed by the client
- Use `has_more()` instead when you only need to know if additional pages exist
- Consider caching the total count if it doesn’t change frequently
- For large datasets, approximate counts might be sufficient for UI purposes

## Related Features

- [has\_more() function](has-more.html) \- Alternative for checking if more results exist
- [next\_page\_token() function](next-page-token.html) \- Used for token\-based pagination
- [Pagination](../../concepts/pagination.html) \- Complete guide to pagination approaches
- [LIMIT clause](../limit.html) \- Controls page size
- [count(\*) function](count.html) \- Used for counting grouped results (future feature)

## Code Examples

### Example 1: Syntax

```sql
total_count() [AS alias]
```

### Example 2: Examples

```sql
SELECT * AS products, total_count()
FROM products
LIMIT 10
```

### Example 3: Examples

```sql
SELECT * AS products, total_count() AS totalProducts
FROM products
LIMIT 10
```

### Example 4: Examples

```sql
SELECT * AS products,
       next_page_token() AS nextPageToken,
       total_count() AS totalCount
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 5: Examples

```sql
SELECT * AS products,
       total_count() AS totalCount,
       has_more() AS hasMore
FROM products
WHERE category = :category
ORDER BY price ASC
LIMIT 10
```

### Example 6: Usage Flow

```sql
SELECT * AS products, total_count() AS totalCount
```

### Example 7: Usage Flow

```java
public record ProductsResponse(List<Product> products, int totalCount) {}
```

### Example 8: Usage Flow

```java
int totalPages = (int) Math.ceil((double) response.totalCount() / pageSize);
boolean isLastPage = (currentPage == totalPages);
String paginationText = String.format(
    "Showing %d-%d of %d results",
    startIndex + 1,
    Math.min(startIndex + pageSize, response.totalCount()),
    response.totalCount()
);
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/syntax/functions/count.html
- https://doc.akka.io/reference/views/syntax/functions/has-more.html
- https://doc.akka.io/reference/views/syntax/functions/next-page-token.html
- https://doc.akka.io/reference/views/syntax/limit.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/total-count.html](https://doc.akka.io/reference/views/syntax/functions/total-count.html)*