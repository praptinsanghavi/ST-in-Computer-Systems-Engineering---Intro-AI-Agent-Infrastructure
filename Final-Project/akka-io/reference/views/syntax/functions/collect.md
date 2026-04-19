---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:53Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/functions/collect.html
title: 'collect() :: Akka Documentation'
---

# collect() :: Akka Documentation

## Content

# collect()

The `collect()` function creates collections or arrays of values from multiple rows in a query result. It is primarily used with `GROUP BY` to aggregate related data into nested structures, enabling hierarchical representations of one\-to\-many relationships.

## Syntax

```
collect([distinct] <select_expression>) AS <alias>
```

## Elements

`distinct`

Optional keyword that removes duplicate values from the collection.

`select_expression`

The expression to collect into an array. This can be:

- A single column name
- A wildcard `*` to collect all columns
- A composite expression like `(column1, column2)` to create objects within the collection

`AS alias`

Required aliasing for the collection in the query result. The alias determines the field name in the response object.

## Features

Data Aggregation

Aggregates values from multiple rows into a single array or collection.

Hierarchical Structures

Creates nested data structures that represent one\-to\-many relationships in the results.

Object Collections

Can collect not just simple values but also complex objects with multiple fields.

Duplicate Elimination

With the `distinct` keyword, removes duplicate values from the collection.

## Examples

Collect all columns into an array

```
SELECT category, collect(*) AS products
FROM products
GROUP BY category
```

Collect a single column into an array

```
SELECT category, collect(name) AS productNames
FROM products
GROUP BY category
```

Collect without duplicate values

```
SELECT category, collect(distinct manufacturer) AS manufacturers
FROM products
GROUP BY category
```

Collect with custom object structure

```
SELECT category, collect(name, price) AS products
FROM products
GROUP BY category
```

Complex nested structure with multiple collections

```
SELECT
  category,
  (
    collect(name) AS names,
    collect(price, manufacturer) AS productDetails,
    collect(distinct manufacturer) AS uniqueManufacturers
  ) AS categoryData
FROM products
GROUP BY category
```

## Java Type Mapping

The collect() function maps to Java collection types in your response objects. For example:

```
SELECT category, collect(name) AS productNames
FROM products
GROUP BY category
```

Would map to a Java type like:

```
public record CategoryResponse(
    String category,
    List<String> productNames
) {}
```

For complex objects within collections:

```
SELECT category, collect(name, price) AS products
FROM products
GROUP BY category
```

Would map to:

```
public record CategoryResponse(
    String category,
    List<ProductInfo> products
) {}

public record ProductInfo(
    String name,
    double price
) {}
```

## Notes

- The `collect()` function is most effective when used with `GROUP BY`
- The alias for `collect()` is required and should match a collection field in your Java response type
- The `distinct` keyword eliminates duplicates based on the entire collected expression
- Collections maintain the order determined by the query’s `ORDER BY` clause, or the natural index order if no explicit ordering is specified
- For complex nested structures, ensure that your Java classes have the correct nesting of fields and collection types

## Related Features

- [GROUP BY clause](../group-by.html) \- Groups rows for collection
- [SELECT clause](../select.html) \- Used with collect() for result structure
- [DISTINCT keyword](distinct.html) \- Eliminates duplicate values
- [Result Mapping](../../concepts/result-mapping.html) \- How query results map to Java types

## Code Examples

### Example 1: Syntax

```sql
collect([distinct] <select_expression>) AS <alias>
```

### Example 2: Examples

```sql
SELECT category, collect(*) AS products
FROM products
GROUP BY category
```

### Example 3: Examples

```sql
SELECT category, collect(name) AS productNames
FROM products
GROUP BY category
```

### Example 4: Examples

```sql
SELECT category, collect(distinct manufacturer) AS manufacturers
FROM products
GROUP BY category
```

### Example 5: Examples

```sql
SELECT category, collect(name, price) AS products
FROM products
GROUP BY category
```

### Example 6: Examples

```sql
SELECT
  category,
  (
    collect(name) AS names,
    collect(price, manufacturer) AS productDetails,
    collect(distinct manufacturer) AS uniqueManufacturers
  ) AS categoryData
FROM products
GROUP BY category
```

### Example 7: Java Type Mapping

```sql
SELECT category, collect(name) AS productNames
FROM products
GROUP BY category
```

### Example 8: Java Type Mapping

```java
public record CategoryResponse(
    String category,
    List<String> productNames
) {}
```

### Example 9: Java Type Mapping

```sql
SELECT category, collect(name, price) AS products
FROM products
GROUP BY category
```

### Example 10: Java Type Mapping

```java
public record CategoryResponse(
    String category,
    List<ProductInfo> products
) {}

public record ProductInfo(
    String name,
    double price
) {}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/result-mapping.html
- https://doc.akka.io/reference/views/syntax/functions/distinct.html
- https://doc.akka.io/reference/views/syntax/group-by.html
- https://doc.akka.io/reference/views/syntax/select.html

---
*Source: [https://doc.akka.io/reference/views/syntax/functions/collect.html](https://doc.akka.io/reference/views/syntax/functions/collect.html)*