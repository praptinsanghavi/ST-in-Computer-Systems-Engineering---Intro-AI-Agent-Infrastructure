---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:10Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/page-token-offset.html
title: 'page_token_offset() :: Akka Documentation'
---

# page_token_offset() :: Akka Documentation

## Content

# page\_token\_offset()

The `page_token_offset()` function implements token\-based pagination by using an opaque token from a previous query to determine the starting position for the current query. This approach provides more stable pagination when underlying data changes between page requests.

## Syntax

```
OFFSET page_token_offset(:parameter_name)
```

## Elements

`:parameter_name`

The parameter containing the page token. This token is typically obtained from the `next_page_token()` function in a previous query result.

## Features

Token\-based Pagination

Enables cursor\-based pagination that maintains consistency even when data changes between page requests.

Stable Paging

Prevents the skipping or duplication of results that can occur with numeric offsets when data is added or removed between page requests.

Context Preservation

The token encapsulates information about the exact position in the result set, including sort order and filter conditions.

## Examples

Basic token\-based pagination

```
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

Token\-based pagination with sorting

```
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
ORDER BY price DESC
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

Complete pagination example with has\_more check

```
SELECT * AS products,
       next_page_token() AS nextPageToken,
       has_more() AS hasMoreProducts
FROM products
WHERE category = :category
ORDER BY price ASC
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

## Usage Flow

1. **First Page Request**: For the first page request, use an empty string as the token value:

```
String pageToken = ""; // Empty string for first page
```
2. **Process Response**: The query response includes results and a next page token:

```
{
  "products": [...],
  "nextPageToken": "eyJvZmZzZXQiOjEwLCJzb3J0IjoicHJpY2UgREVTQyJ9"
}
```
3. **Request Next Page**: Use the received token for the next page request:

```
String pageToken = response.nextPageToken(); // Token from previous response
```
4. **Detect Last Page**: When the last page is reached, an empty token is returned:

```
if (response.nextPageToken().isEmpty()) {
    // Last page reached
}
```

## Notes

- The page token is an opaque string and should be treated as a black box \- do not attempt to parse or modify it
- For the first page request, use an empty string as the page token
- When the last page is reached, an empty string is returned as the next page token
- Tokens are specific to a particular query structure \- changing the query conditions or sort order invalidates existing tokens
- If no `LIMIT` is specified with `page_token_offset()`, a default page size of 100 is used

## Related Features

- [next\_page\_token() function](next-page-token.html) \- Generates tokens for subsequent page requests
- [has\_more() function](has-more.html) \- Indicates whether more results exist
- [Pagination](../../concepts/pagination.html) \- Complete guide to pagination approaches
- [OFFSET clause](../offset.html) \- General offset functionality
- [LIMIT clause](../limit.html) \- Controls page size

## Code Examples

### Example 1: Syntax

```sql
OFFSET page_token_offset(:parameter_name)
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
ORDER BY price ASC
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 5: Usage Flow

```java
String pageToken = ""; // Empty string for first page
```

### Example 6: Usage Flow

```json
{
  "products": [...],
  "nextPageToken": "eyJvZmZzZXQiOjEwLCJzb3J0IjoicHJpY2UgREVTQyJ9"
}
```

### Example 7: Usage Flow

```java
String pageToken = response.nextPageToken(); // Token from previous response
```

### Example 8: Usage Flow

```java
if (response.nextPageToken().isEmpty()) {
    // Last page reached
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/syntax/functions/has-more.html
- https://doc.akka.io/reference/views/syntax/functions/next-page-token.html
- https://doc.akka.io/reference/views/syntax/limit.html
- https://doc.akka.io/reference/views/syntax/offset.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/page-token-offset.html](https://doc.akka.io/reference/views/syntax/functions/page-token-offset.html)*