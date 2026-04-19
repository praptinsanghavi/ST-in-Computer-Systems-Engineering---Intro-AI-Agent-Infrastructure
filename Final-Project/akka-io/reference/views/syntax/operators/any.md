---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:51Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/operators/any.html
title: '= ANY :: Akka Documentation'
---

# = ANY :: Akka Documentation

## Content

# \= ANY

The `= ANY` operator checks if a value equals any element in an array column or parameter. It provides a way to test membership in dynamic arrays without listing all possible values in the query.

## Syntax

```
<value> = ANY(<array_expression>)
```

Where `<array_expression>` can be:

- An array column
- An array parameter
- An array index parameter

## Elements

`value`

The value to check for in the array. This can be a column reference, literal value, or parameter.

`array_expression`

An array or list to search within. This can be a column containing an array or a parameter that contains an array.

## Features

Array Membership Testing

Tests if a value is present in an array column or parameter, without having to list all possible values.

Dynamic Sets

Works with arrays that are stored in the database or provided as parameters, allowing for flexible, dynamic sets.

Bidirectional Usage

Can check if a value is in an array (`value = ANY(array)`) or if an array contains a value (`= ANY(array)`).

## Examples

Check if a value matches any element in an array column

```
SELECT * FROM customers
WHERE :email = ANY(emails)
```

Check if a column value is in an array parameter

```
SELECT * FROM products
WHERE category = ANY(:categoryList)
```

Check if a parameter value is in an array column

```
SELECT * FROM customers
WHERE :searchTag = ANY(tags)
```

Combined with other conditions

```
SELECT * FROM products
WHERE category = ANY(:categories)
AND price < 1000
```

## Comparison with IN

The View query language provides two similar operators for checking membership in a set:

- `IN` \- Used with a list of values specified in the query
- `= ANY` \- Used with array columns or parameters

The primary differences are:

| IN | \= ANY |
| --- | --- |
| `column IN (val1, val2, …​)` | `column = ANY(array_column)` or `value = ANY(array_parameter)` |
| For fixed lists of values | For array columns or array parameters |
| Values specified directly in the query | Values come from an array column or parameter |

## Syntax Variations

The `= ANY` operator supports different orientations:

Column value in array parameter

```
category = ANY(:categories)
```

Parameter value in array column

```
:category = ANY(supportedCategories)
```

Both variations check for membership in the array.

## Notes

- The `= ANY` operator works with array types in the view’s data model
- Arrays can be passed as parameters from Java code using collections or arrays
- Empty arrays are handled gracefully \- nothing will match if the array is empty
- The operation is equivalent to checking if the array contains the specified value
- The order of elements in the array doesn’t affect the results

## Related Features

- [IN operator](in.html) \- Tests if a value matches any value in a specified list
- [WHERE clause](../where.html) \- Used with \= ANY for filtering
- [Array Types](../../concepts/array-types.html) \- Working with array data in views

## Code Examples

### Example 1: Syntax

```sql
<value> = ANY(<array_expression>)
```

### Example 2: Examples

```sql
SELECT * FROM customers
WHERE :email = ANY(emails)
```

### Example 3: Examples

```sql
SELECT * FROM products
WHERE category = ANY(:categoryList)
```

### Example 4: Examples

```sql
SELECT * FROM customers
WHERE :searchTag = ANY(tags)
```

### Example 5: Examples

```sql
SELECT * FROM products
WHERE category = ANY(:categories)
AND price < 1000
```

### Example 6: Syntax Variations

```sql
category = ANY(:categories)
```

### Example 7: Syntax Variations

```sql
:category = ANY(supportedCategories)
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/array-types.html
- https://doc.akka.io/reference/views/syntax/operators/in.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/operators/any.html](https://doc.akka.io/reference/views/syntax/operators/any.html)*