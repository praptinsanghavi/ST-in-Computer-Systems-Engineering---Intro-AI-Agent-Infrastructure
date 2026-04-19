---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:44Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/order-by.html
title: 'ORDER BY :: Akka Documentation'
---

# ORDER BY :: Akka Documentation

## Content

# ORDER BY

The `ORDER BY` clause sorts the query results based on one or more columns in ascending or descending order. It determines the sequence in which rows appear in the query result.

## Syntax

```
ORDER BY <column> [ASC|DESC] [, <column> [ASC|DESC]]...
```

## Elements

`column`

A column name or expression by which to sort the results. Multiple columns can be specified, separated by commas.

`ASC`

Optional keyword indicating ascending order (the default if not specified). Results are sorted from lowest to highest value.

`DESC`

Optional keyword indicating descending order. Results are sorted from highest to lowest value.

## Features

Sorting

Arranges the result rows based on the values in the specified columns.

Multi\-column Ordering

Allows sorting by multiple columns, where the second column is used to break ties in the first column, and so on.

Direction Control

Supports both ascending and descending order for each column independently.

## Examples

Sort in ascending order (default)

```
SELECT * FROM products
ORDER BY price
```

Sort in descending order

```
SELECT * FROM products
ORDER BY price DESC
```

Sort by multiple columns

```
SELECT * FROM products
ORDER BY category, price DESC
```

Sort with nested fields

```
SELECT * FROM customers
ORDER BY address.city, name
```

Sort with filtering

```
SELECT * FROM products
WHERE category = 'Electronics'
ORDER BY price ASC
```

Sort with limiting results

```
SELECT * FROM products
ORDER BY price DESC
LIMIT 10
```

## Notes

- If no `ORDER BY` clause is specified, the results are returned in no guaranteed order
- `ASC` is the default order if not specified
- Sorting is based on the natural order for the data type of the column
- NULL values are typically placed last in ascending sorts and first in descending sorts
- When sorting by multiple columns, the order of columns in the `ORDER BY` clause determines the significance of the sort (primary, secondary, etc.)
- Performance may be affected when sorting by columns that are not indexed

## Ordering Constraints

Some order operations may be rejected if they cannot be efficiently implemented with the view’s index structure. Generally, to order by a field, it should also appear in the `WHERE` conditions or be directly related to fields that do.

For example, if you filter with `WHERE category = :category`, ordering by `price` within that category would be allowed, but ordering by an unrelated field might not be supported.

## Related Features

- [WHERE clause](where.html) \- Filters results before sorting
- [LIMIT clause](limit.html) \- Limits the number of sorted results
- [OFFSET clause](offset.html) \- Skips a number of sorted results
- [Pagination](../concepts/pagination.html) \- Pagination with sorted results

## Code Examples

### Example 1: Syntax

```sql
ORDER BY <column> [ASC|DESC] [, <column> [ASC|DESC]]...
```

### Example 2: Examples

```sql
SELECT * FROM products
ORDER BY price
```

### Example 3: Examples

```sql
SELECT * FROM products
ORDER BY price DESC
```

### Example 4: Examples

```sql
SELECT * FROM products
ORDER BY category, price DESC
```

### Example 5: Examples

```sql
SELECT * FROM customers
ORDER BY address.city, name
```

### Example 6: Examples

```sql
SELECT * FROM products
WHERE category = 'Electronics'
ORDER BY price ASC
```

### Example 7: Examples

```sql
SELECT * FROM products
ORDER BY price DESC
LIMIT 10
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/pagination.html
- https://doc.akka.io/reference/views/syntax/limit.html
- https://doc.akka.io/reference/views/syntax/offset.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/order-by.html](https://doc.akka.io/reference/views/syntax/order-by.html)*