---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:55Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/distinct.html
title: 'DISTINCT :: Akka Documentation'
---

# DISTINCT :: Akka Documentation

## Content

# DISTINCT

The `DISTINCT` keyword eliminates duplicate values in collection results. It is used within the `collect()` function to ensure that only unique values are included in the resulting collection.

## Syntax

```
collect(distinct <select_expression>) AS <alias>
```

## Elements

`select_expression`

The expression to collect unique values from. This can be a single column, multiple columns, or a composite expression.

`AS alias`

Required aliasing for the resulting collection in the query result.

## Features

Duplicate Elimination

Removes duplicate values from collections based on the complete expression being collected.

Unique Value Sets

Creates collections containing only unique values, useful for categories, tags, or other sets where duplicates are unnecessary.

Composite Expression Support

Works with both simple column values and complex expressions, applying uniqueness checks to the entire collected expression.

## Examples

Collect distinct product names

```
SELECT category, collect(distinct name) AS uniqueProductNames
FROM products
GROUP BY category
```

Collect distinct manufacturers

```
SELECT category, collect(distinct manufacturer) AS uniqueManufacturers
FROM products
GROUP BY category
```

Collect distinct composite values

```
SELECT category, collect(distinct (manufacturer, country)) AS uniqueManufacturerLocations
FROM products
GROUP BY category
```

Complex structure with both distinct and non\-distinct collections

```
SELECT
  category,
  (
    collect(*) AS allProducts,
    collect(distinct manufacturer) AS uniqueManufacturers
  ) AS categoryData
FROM products
GROUP BY category
```

## Notes

- Currently, `DISTINCT` is only supported within the `collect()` function
- The `DISTINCT` keyword applies to the entire expression being collected, not just individual fields
- When using composite expressions, uniqueness is determined by considering all values in the expression together
- Unlike some SQL dialects, the View query language does not currently support `SELECT DISTINCT` as a standalone feature
- `DISTINCT` is particularly useful for creating sets of unique categories, tags, or other metadata from related items

## Java Type Mapping

The results of `collect(distinct …​)` map to the same Java collection types as regular `collect()` operations. For example:

```
SELECT category, collect(distinct manufacturer) AS uniqueManufacturers
FROM products
GROUP BY category
```

Would map to a Java type like:

```
public record CategoryResponse(
    String category,
    List<String> uniqueManufacturers
) {}
```

## Related Features

- [collect() function](collect.html) \- Creates collections from grouped rows
- [GROUP BY clause](../group-by.html) \- Groups rows for collection
- [Result Mapping](../../concepts/result-mapping.html) \- How query results map to Java types

## Code Examples

### Example 1: Syntax

```sql
collect(distinct <select_expression>) AS <alias>
```

### Example 2: Examples

```sql
SELECT category, collect(distinct name) AS uniqueProductNames
FROM products
GROUP BY category
```

### Example 3: Examples

```sql
SELECT category, collect(distinct manufacturer) AS uniqueManufacturers
FROM products
GROUP BY category
```

### Example 4: Examples

```sql
SELECT category, collect(distinct (manufacturer, country)) AS uniqueManufacturerLocations
FROM products
GROUP BY category
```

### Example 5: Examples

```sql
SELECT
  category,
  (
    collect(*) AS allProducts,
    collect(distinct manufacturer) AS uniqueManufacturers
  ) AS categoryData
FROM products
GROUP BY category
```

### Example 6: Java Type Mapping

```sql
SELECT category, collect(distinct manufacturer) AS uniqueManufacturers
FROM products
GROUP BY category
```

### Example 7: Java Type Mapping

```java
public record CategoryResponse(
    String category,
    List<String> uniqueManufacturers
) {}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/result-mapping.html
- https://doc.akka.io/reference/views/syntax/functions/collect.html
- https://doc.akka.io/reference/views/syntax/group-by.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/distinct.html](https://doc.akka.io/reference/views/syntax/functions/distinct.html)*