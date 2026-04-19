---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:53Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/index.html
title: 'Functions :: Akka Documentation'
---

# Functions :: Akka Documentation

## Content

# Functions

This page provides an overview of all functions available in the View query language. Functions perform operations on data and return results that can be used in queries.

## Aggregation Functions

Aggregation functions perform calculations across groups of rows.

| Function | Description | Example |
| --- | --- | --- |
| [`collect([distinct`](collect.html) expression)] | Creates a collection of values from multiple rows | `collect(name) AS productNames` |
| [`count(*)`](count.html) | Counts the number of matching rows | `count(*) AS totalCustomers` |

## Pagination Functions

Functions that support pagination and result set management.

| Function | Description | Example |
| --- | --- | --- |
| [`next_page_token()`](next-page-token.html) | Generates a token for retrieving the next page of results | `next_page_token() AS nextPageToken` |
| [`page_token_offset(token)`](page-token-offset.html) | Uses a token to determine the starting position for pagination | `OFFSET page_token_offset(:pageToken)` |
| [`has_more()`](has-more.html) | Indicates if more results exist beyond the current page | `has_more() AS hasMoreResults` |
| [`total_count()`](total-count.html) | Returns the total count of rows matching the query | `total_count() AS totalCount` |

## Text Search Functions

Functions for advanced text searching capabilities.

| Function | Description | Example |
| --- | --- | --- |
| [`text_search(column, query, [config])`](text-search.html) | Performs language\-aware text search | `text_search(description, :searchText, 'english')` |

## Function Usage

Functions can be used in different parts of a query:

- In the `SELECT` clause to compute values for the result
- With the `OFFSET` clause for token\-based pagination
- In the `WHERE` clause for filtering (text\_search only)

## Function Categories by Return Type

### Boolean Functions

- `has_more()` \- Returns true if more results exist beyond the current page
- `text_search()` \- Returns true if the text contains the search terms

### Numeric Functions

- `count(*)` \- Returns the number of rows
- `total_count()` \- Returns the total number of matching rows

### String Functions

- `next_page_token()` \- Returns a string token for pagination

### Collection Functions

- `collect()` \- Returns a collection of values from multiple rows

## Related Features

- [SELECT clause](../select.html) \- Using functions in result projections
- [Paging](../../concepts/pagination.html) \- Using pagination functions
- [WHERE clause](../where.html) \- Using functions in filters
- [Result Mapping](../../concepts/result-mapping.html) \- How function results map to Java types

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/concepts/result-mapping.html
- https://doc.akka.io/reference/views/syntax/functions/collect.html
- https://doc.akka.io/reference/views/syntax/functions/count.html
- https://doc.akka.io/reference/views/syntax/functions/has-more.html
- https://doc.akka.io/reference/views/syntax/functions/next-page-token.html
- https://doc.akka.io/reference/views/syntax/functions/page-token-offset.html
- https://doc.akka.io/reference/views/syntax/functions/text-search.html
- https://doc.akka.io/reference/views/syntax/functions/total-count.html
- https://doc.akka.io/reference/views/syntax/select.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/index.html](https://doc.akka.io/reference/views/syntax/functions/index.html)*