---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:51Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/operators/in.html
title: 'IN :: Akka Documentation'
---

# IN :: Akka Documentation

## Content

# IN

The `IN` operator checks if a value matches any value in a specified list or set. It provides a concise way to check for multiple possible values without using multiple OR conditions.

## Syntax

```
<column_or_expression> IN (<value_list>)
```

Where `<value_list>` is a comma\-separated list of:

- Literal values
- Parameters
- A combination of both

## Elements

`column_or_expression`

The column or expression to check against the values in the list.

`value_list`

A comma\-separated list of values to check against. These can be literals, parameters, or a combination.

## Features

Multiple Value Matching

Tests if a value equals any of several specified values without needing multiple OR conditions.

Parameter Support

Accepts parameters for dynamic value lists, allowing client code to provide the values at runtime.

Mixed Literal and Parameter Values

Supports lists containing both literal values and parameters in the same IN expression.

## Examples

Using literal values

```
SELECT * FROM products
WHERE category IN ('Electronics', 'Computers', 'Accessories')
```

Using parameters

```
SELECT * FROM products
WHERE category IN (:category1, :category2, :category3)
```

Using mixed literals and parameters

```
SELECT * FROM products
WHERE category IN ('Electronics', :category1, :category2)
```

With nested fields

```
SELECT * FROM customers
WHERE address.country IN ('USA', 'Canada', 'Mexico')
```

Combined with other conditions

```
SELECT * FROM products
WHERE category IN ('Electronics', 'Computers')
AND price < 1000
```

## Comparison with \= ANY

The View query language provides two similar operators for checking membership in a set:

- `IN` \- Used with a list of values specified in the query
- `= ANY` \- Used with array columns or parameters

The primary differences are:

| IN | \= ANY |
| --- | --- |
| `column IN (val1, val2, …​)` | `column = ANY(array_column)` or `value = ANY(array_parameter)` |
| For fixed lists of values | For array columns or array parameters |
| Values specified directly in the query | Values come from an array column or parameter |

## Notes

- The `IN` operator is equivalent to multiple OR conditions combined with equals (\=) operations
- All values in the list must be of compatible types with the column being compared
- Performance is typically better with `IN` than with multiple OR conditions
- The order of values in the list doesn’t affect the results
- Empty lists are not allowed in the `IN` operator

## Related Features

- [\= ANY operator](any.html) \- Checks if a value matches any element in an array
- [WHERE clause](../where.html) \- Used with IN for filtering
- [OR operator](logical.html#or) \- Alternative way to check multiple conditions

## Code Examples

### Example 1: Syntax

```sql
<column_or_expression> IN (<value_list>)
```

### Example 2: Examples

```sql
SELECT * FROM products
WHERE category IN ('Electronics', 'Computers', 'Accessories')
```

### Example 3: Examples

```sql
SELECT * FROM products
WHERE category IN (:category1, :category2, :category3)
```

### Example 4: Examples

```sql
SELECT * FROM products
WHERE category IN ('Electronics', :category1, :category2)
```

### Example 5: Examples

```sql
SELECT * FROM customers
WHERE address.country IN ('USA', 'Canada', 'Mexico')
```

### Example 6: Examples

```sql
SELECT * FROM products
WHERE category IN ('Electronics', 'Computers')
AND price < 1000
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/syntax/operators/any.html
- https://doc.akka.io/reference/views/syntax/operators/logical.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/operators/in.html](https://doc.akka.io/reference/views/syntax/operators/in.html)*