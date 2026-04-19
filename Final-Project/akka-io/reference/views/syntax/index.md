---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:18Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/index.html
title: 'View query syntax :: Akka Documentation'
---

# View query syntax :: Akka Documentation

## Content

# View query syntax

The View query language provides a SQL\-like syntax for querying and retrieving data from your views. This page provides an overview of the language features and serves as an entry point to the detailed syntax documentation.

## Overview

The View query language enables you to:

- Select specific data fields or entire objects
- Filter results based on conditions
- Join data from multiple tables
- Sort and limit results
- Create hierarchical data structures
- Paginate large result sets

## Core query components

For the complete query structure and syntax, see [Query](query.html).

### Query structure

- [Query](query.html) \- Complete query structure and composition
- [SELECT](select.html) \- Specifying data to retrieve
- [FROM](from.html) \- Specifying the data source
- [WHERE](where.html) \- Filtering results
- [AS](as.html) \- Creating aliases
- [ORDER BY](order-by.html) \- Sorting results
- [GROUP BY](group-by.html) \- Grouping related data
- [JOIN](join.html) \- Combining data from multiple tables

### Operators

- [Operators overview](operators/index.html) \- All available operators
- [Comparison operators](operators/comparison.html) \- \=, !\=, \>, \<, etc.
- [Logical operators](operators/logical.html) \- AND, OR, NOT
- [IN](operators/in.html) \- Testing membership in a list
- [\= ANY](operators/any.html) \- Testing membership in an array
- [LIKE](operators/like.html) \- Pattern matching
- [IS NULL / IS NOT NULL](operators/is-null.html) \- Testing for null values

### Functions

- [Functions overview](functions/index.html) \- All available functions
- [collect()](functions/collect.html) \- Creating collections from grouped rows
- [count(\*)](functions/count.html) \- Counting rows
- [DISTINCT](functions/distinct.html) \- Removing duplicates
- [text\_search()](functions/text-search.html) \- Advanced text searching

### Pagination

- [Pagination](../concepts/pagination.html) \- Pagination approaches
- [OFFSET](offset.html) \- Skipping results
- [LIMIT](limit.html) \- Limiting result count

## Example queries

Here are a few examples of common query patterns:

Basic query with filtering

```
SELECT * FROM products
WHERE category = 'Electronics' AND price < 500
ORDER BY price ASC
```

Query with pagination

```
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

Query with grouping and collection

```
SELECT category, collect(*) AS products
FROM products
GROUP BY category
```

Start with the [Query](query.html) reference for more examples and detailed syntax information.

## Related concepts

- [Data types](../concepts/data-types.html) \- Types supported in views
- [Result mapping](../concepts/result-mapping.html) \- How queries map to Java types
- [Table updaters](../concepts/table-updaters.html) \- Defining view tables

## Code Examples

### Example 1: Example queries

```sql
SELECT * FROM products
WHERE category = 'Electronics' AND price < 500
ORDER BY price ASC
```

### Example 2: Example queries

```sql
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 3: Example queries

```sql
SELECT category, collect(*) AS products
FROM products
GROUP BY category
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/data-types.html
- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/concepts/result-mapping.html
- https://doc.akka.io/reference/views/concepts/table-updaters.html
- https://doc.akka.io/reference/views/syntax/as.html
- https://doc.akka.io/reference/views/syntax/from.html
- https://doc.akka.io/reference/views/syntax/functions/collect.html
- https://doc.akka.io/reference/views/syntax/functions/count.html
- https://doc.akka.io/reference/views/syntax/functions/distinct.html
- https://doc.akka.io/reference/views/syntax/functions/index.html
- https://doc.akka.io/reference/views/syntax/functions/text-search.html
- https://doc.akka.io/reference/views/syntax/group-by.html
- https://doc.akka.io/reference/views/syntax/join.html
- https://doc.akka.io/reference/views/syntax/limit.html
- https://doc.akka.io/reference/views/syntax/offset.html
- https://doc.akka.io/reference/views/syntax/operators/any.html
- https://doc.akka.io/reference/views/syntax/operators/comparison.html
- https://doc.akka.io/reference/views/syntax/operators/in.html
- https://doc.akka.io/reference/views/syntax/operators/index.html
- https://doc.akka.io/reference/views/syntax/operators/is-null.html
- https://doc.akka.io/reference/views/syntax/operators/like.html
- https://doc.akka.io/reference/views/syntax/operators/logical.html
- https://doc.akka.io/reference/views/syntax/order-by.html
- https://doc.akka.io/reference/views/syntax/query.html
- https://doc.akka.io/reference/views/syntax/select.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/index.html](https://doc.akka.io/reference/views/syntax/index.html)*