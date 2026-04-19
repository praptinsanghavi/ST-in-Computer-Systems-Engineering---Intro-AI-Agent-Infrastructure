---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:53Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/count.html
title: 'count(*) :: Akka Documentation'
---

# count(*) :: Akka Documentation

## Content

# count(\*)

The `count(*)` function returns the number of rows that match the query criteria. In the current implementation, it has specific limitations and usage restrictions.

## Syntax

```
count(*) [AS alias]
```

## Elements

`AS alias`

Optional aliasing for the count result in the query response. If not specified, the count will be available in a field with an implementation\-defined name.

## Features

Row Counting

Counts all rows that match the query’s WHERE conditions.

## Current Limitations

In the current implementation, the `count(*)` function has several important limitations:

Limited Use Cases

The `count(*)` function can only be used for counting all matching rows in a simple query, similar to `total_count()`. It cannot be used with `GROUP BY` for counting rows per group.

Not for Aggregation

Unlike in standard SQL, `count(*)` cannot currently be used as an aggregation function within grouped results.

No Distinct Support

`count(distinct column)` syntax is not currently supported.

No Column Counting

`count(column_name)` for counting non\-NULL values is not currently supported.

## Examples

Basic usage

```
SELECT count(*) AS customerCount FROM customers
```

With WHERE condition

```
SELECT count(*) AS activeCustomers FROM customers WHERE status = 'active'
```

## Notes

- For total counts with pagination, prefer using the `total_count()` function which is specifically designed for this purpose
- For checking if additional pages exist, use the `has_more()` function

## Related Features

- [total\_count() function](total-count.html) \- Returns the total count of rows matching the query
- [has\_more() function](has-more.html) \- Checks if more results exist
- [GROUP BY clause](../group-by.html) \- For future aggregation features

## Code Examples

### Example 1: Syntax

```sql
count(*) [AS alias]
```

### Example 2: Examples

```sql
SELECT count(*) AS customerCount FROM customers
```

### Example 3: Examples

```sql
SELECT count(*) AS activeCustomers FROM customers WHERE status = 'active'
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/syntax/functions/has-more.html
- https://doc.akka.io/reference/views/syntax/functions/total-count.html
- https://doc.akka.io/reference/views/syntax/group-by.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/count.html](https://doc.akka.io/reference/views/syntax/functions/count.html)*