---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:44Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/limit.html
title: 'LIMIT :: Akka Documentation'
---

# LIMIT :: Akka Documentation

## Content

# LIMIT

The `LIMIT` clause restricts the number of rows returned by a query, specifying the maximum number of results to return. It’s primarily used for pagination and controlling result set size.

## Syntax

```
LIMIT <row_count>
```

## Elements

`row_count`

The maximum number of rows to return. This can be:

- A literal number (e.g., `10`)
- A parameter (e.g., `:pageSize`)

## Features

Result limiting

Caps the number of rows returned by the query to improve performance and manage memory usage.

Pagination control

When combined with `OFFSET`, enables standard pagination by specifying how many items appear on each page.

Resource optimization

Prevents retrieving unnecessarily large result sets, improving query performance and reducing memory usage.

## Examples

### Basic usage

Limit to 10 rows

```
SELECT * FROM products
LIMIT 10
```

Limit using a parameter

```
SELECT * FROM products
LIMIT :maxResults
```

### Pagination scenarios

Combined with OFFSET for basic pagination

```
SELECT * FROM products
OFFSET 20 LIMIT 10
```

Combined with ORDER BY for consistent offset\-based pagination

```
SELECT * FROM products
ORDER BY price DESC
OFFSET 20 LIMIT 10
```

Token\-based pagination (note: no ORDER BY)

```
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Advanced pagination examples

Pagination with total count

```
SELECT * AS products,
       total_count() AS totalCount
FROM products
LIMIT :pageSize
```

Pagination with has\_more indicator

```
SELECT * AS products,
       has_more() AS hasMorePages
FROM products
LIMIT 10
```

Complete pagination example

```
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMore,
       total_count() AS totalCount
FROM products
WHERE category = :category
ORDER BY price ASC
LIMIT :pageSize
```

## Implementation in Java

Java parameter class for multiple query parameters

```
public record ProductsRequest(String category, int pageSize) {}
```

Query method with a single parameter object

```
@Query("SELECT * FROM products WHERE category = :category LIMIT :pageSize")
public QueryEffect<ProductsResponse> getProductsByCategory(ProductsRequest request) {
  return queryResult();
}
```

Response type for limited results

```
public record ProductsResponse(List<Product> products) {}
```

Client usage example

```
// Get first 10 products
ProductsRequest request = new ProductsRequest("Electronics", 10);
ProductsResponse response = client.forView()
  .method(ProductView::getProductsByCategory)
  .invoke(request);
```

## Notes

- If no `LIMIT` is explicitly specified:

	- A default limit of 10000 items is applied for regular queries
	- A more restrictive default limit of 1000 items is applied when results are being projected into a collection
- These default limits help prevent accidentally retrieving extremely large result sets
- When using token\-based pagination without specifying a `LIMIT`, a default page size of 100 is used
- For predictable pagination, always combine `LIMIT` with `ORDER BY` when using offset\-based pagination
- Results cannot be sorted with `ORDER BY` when using token\-based paging (`page_token_offset`)
- Using `has_more()` with `LIMIT` can efficiently indicate if there are additional results beyond the current page
- Very large limit values may impact performance \- use reasonable page sizes for better user experience
- It’s generally better to explicitly specify a LIMIT value that makes sense for your use case rather than relying on the defaults

## Performance considerations

- Choose an appropriate limit size based on your use case:

	- UI pagination: typically 10\-50 items per page
	- API responses: typically 50\-100 items per page
	- Data processing: balance between memory usage and request count
- For large data sets, consider using `has_more()` instead of `total_count()` as it’s more efficient

## Related features

- [OFFSET clause](offset.html) \- Skips a specified number of rows
- [ORDER BY clause](order-by.html) \- Sorts results before applying the limit
- [Pagination](../concepts/pagination.html) \- Complete guide to pagination approaches
- [has\_more() function](functions/has-more.html) \- Checks if there are more results
- [next\_page\_token() function](functions/next-page-token.html) \- For token\-based pagination
- [total\_count() function](functions/total-count.html) \- Gets total matching row count

## Code Examples

### Example 1: Syntax

```sql
LIMIT <row_count>
```

### Example 2: Basic usage

```sql
SELECT * FROM products
LIMIT 10
```

### Example 3: Basic usage

```sql
SELECT * FROM products
LIMIT :maxResults
```

### Example 4: Pagination scenarios

```sql
SELECT * FROM products
OFFSET 20 LIMIT 10
```

### Example 5: Pagination scenarios

```sql
SELECT * FROM products
ORDER BY price DESC
OFFSET 20 LIMIT 10
```

### Example 6: Pagination scenarios

```sql
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 7: Advanced pagination examples

```sql
SELECT * AS products,
       total_count() AS totalCount
FROM products
LIMIT :pageSize
```

### Example 8: Advanced pagination examples

```sql
SELECT * AS products,
       has_more() AS hasMorePages
FROM products
LIMIT 10
```

### Example 9: Advanced pagination examples

```sql
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMore,
       total_count() AS totalCount
FROM products
WHERE category = :category
ORDER BY price ASC
LIMIT :pageSize
```

### Example 10: Implementation in Java

```java
public record ProductsRequest(String category, int pageSize) {}
```

### Example 11: Implementation in Java

```java
@Query("SELECT * FROM products WHERE category = :category LIMIT :pageSize")
public QueryEffect<ProductsResponse> getProductsByCategory(ProductsRequest request) {
  return queryResult();
}
```

### Example 12: Implementation in Java

```java
public record ProductsResponse(List<Product> products) {}
```

### Example 13: Implementation in Java

```java
// Get first 10 products
ProductsRequest request = new ProductsRequest("Electronics", 10);
ProductsResponse response = client.forView()
  .method(ProductView::getProductsByCategory)
  .invoke(request);
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/syntax/functions/has-more.html
- https://doc.akka.io/reference/views/syntax/functions/next-page-token.html
- https://doc.akka.io/reference/views/syntax/functions/total-count.html
- https://doc.akka.io/reference/views/syntax/offset.html
- https://doc.akka.io/reference/views/syntax/order-by.html

---
*Source: [https://doc.akka.io/reference/views/syntax/limit.html](https://doc.akka.io/reference/views/syntax/limit.html)*