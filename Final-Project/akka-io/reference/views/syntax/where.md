---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:42Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/where.html
title: 'WHERE :: Akka Documentation'
---

# WHERE :: Akka Documentation

## Content

# WHERE

The `WHERE` clause filters query results based on specified conditions. It allows you to retrieve only the rows that satisfy the filtering criteria, enabling precise data selection.

## Syntax

```
WHERE <condition> [AND|OR <condition>...]
```

## Elements

`condition`

An expression that evaluates to true or false. Only rows for which the condition evaluates to true are included in the result.

## Supported operators

### Comparison operators

The WHERE clause supports various comparison operators for creating conditions:

| Operator | Description | Example |
| --- | --- | --- |
| [`=`](operators/comparison.html#equals) | Equals \- Tests if values are equal | `name = 'John'` or `status = :statusParam` |
| [`!=`](operators/comparison.html#not-equals) | Not equals \- Tests if values are not equal | `category != 'Electronics'` |
| [`>`](operators/comparison.html#greater-than) | Greater than \- Tests if left value is greater | `price > 100` or `created > '2023-01-01'` |
| [`>=`](operators/comparison.html#greater-equals) | Greater than or equal to | `price >= 100` or `age >= 18` |
| [`<`](operators/comparison.html#less-than) | Less than \- Tests if left value is smaller | `price < 50` or `created < :dateParam` |
| [`⇐`](operators/comparison.html#less-equals) | Less than or equal to | `price ⇐ 50` or `count ⇐ 10` |

### Logical operators

Logical operators combine multiple conditions:

| Operator | Description | Example |
| --- | --- | --- |
| [`AND`](operators/logical.html#and) | Requires both conditions to be true | `category = 'Books' AND price < 20` |
| [`OR`](operators/logical.html#or) | Requires at least one condition to be true | `status = 'new' OR status = 'sale'` |
| [`NOT`](operators/logical.html#not) | Negates a condition | `NOT price > 100` or `NOT (status = 'deleted')` |

### Set membership operators

Check if values are members of sets:

| Operator | Description | Example |
| --- | --- | --- |
| [`IN`](operators/in.html) | Tests if a value matches any in a list | `category IN ('Books', 'Magazines', 'Comics')` |
| [`= ANY`](operators/any.html) | Tests if a value matches any in an array column | `'electronics' = ANY(tags)` or `category = ANY(:categoryList)` |

### Null testing

Operators for checking null values:

| Operator | Description | Example |
| --- | --- | --- |
| [`IS NULL`](operators/is-null.html) | Tests if a value is NULL (missing) | `phoneNumber IS NULL` |
| [`IS NOT NULL`](operators/is-null.html) | Tests if a value is not NULL (present) | `email IS NOT NULL` |

### Pattern matching

Operators for string pattern matching:

| Operator | Description | Example |
| --- | --- | --- |
| [`LIKE`](operators/like.html) | Pattern matching with wildcards | `name LIKE 'Jo%'` or `code LIKE 'ABC_%'` |

### Text search function

Advanced text searching capabilities:

| Function | Description | Example |
| --- | --- | --- |
| [`text_search()`](functions/text-search.html) | Language\-aware text search with word tokenization | `text_search(description, :searchTerms, 'english')` |

## Examples

### Basic filtering

Simple equality filter

```
SELECT * FROM products
WHERE category = 'Electronics'
```

Numeric comparison

```
SELECT * FROM products
WHERE price < 100
```

Date comparison

```
SELECT * FROM customers
WHERE joinDate > '2023-01-01'
```

### Multiple conditions

Combining conditions with AND

```
SELECT * FROM products
WHERE category = 'Electronics' AND price < 500 AND inStock = true
```

Combining conditions with OR

```
SELECT * FROM customers
WHERE region = 'Europe' OR region = 'Asia'
```

Using parentheses for complex logic

```
SELECT * FROM products
WHERE (category = 'Electronics' OR category = 'Computers')
  AND price < 1000
  AND NOT discontinued = true
```

### Working with NULL values

Finding missing values

```
SELECT * FROM customers
WHERE phoneNumber IS NULL
```

Finding present values

```
SELECT * FROM customers
WHERE address IS NOT NULL AND address.street IS NOT NULL
```

### Using sets and arrays

Testing membership in a fixed list

```
SELECT * FROM products
WHERE category IN ('Electronics', 'Computers', 'Accessories')
```

Testing membership in a parameter list

```
SELECT * FROM products
WHERE category IN (:category1, :category2, :category3)
```

Testing membership in an array column

```
SELECT * FROM products
WHERE :searchTag = ANY(tags)
```

Testing membership with an array parameter

```
SELECT * FROM customers
WHERE status = ANY(:statusList)
```

### Text searching

Pattern matching with prefix

```
SELECT * FROM customers
WHERE email LIKE 'john.%'
```

Pattern matching with suffix

```
SELECT * FROM customers
WHERE email LIKE '%.com'
```

Full\-text search

```
SELECT * FROM articles
WHERE text_search(content, :searchQuery, 'english')
```

### Accessing nested fields

Filter based on nested object fields

```
SELECT * FROM customers
WHERE address.country = 'USA' AND address.state = 'California'
```

Filter with deeply nested fields

```
SELECT * FROM orders
WHERE shipping.address.zipCode = '10001'
```

## Notes

- Conditions in the WHERE clause are applied before any GROUP BY, ORDER BY, or LIMIT operations
- For complex conditions, use parentheses to explicitly control the order of evaluation
- Type compatibility is enforced \- you cannot directly compare values of different types
- NULL values require special handling with IS NULL and IS NOT NULL \- standard comparison operators don’t work with NULL
- The LIKE operator requires a non\-wildcard prefix or suffix for optimal performance
- For pagination efficiency, ensure your WHERE conditions match available indexes

## Related features

- [Operators overview](operators/index.html) \- Complete reference for all operators
- [text\_search() function](functions/text-search.html) \- Advanced text search capabilities
- [JOIN clause](join.html) \- Combining data from multiple tables
- [FROM clause](from.html) \- Specifies the source table
- [Data types](../concepts/data-types.html) \- Type compatibility in conditions
- [Optional fields](../concepts/optional-fields.html) \- Working with null values

## Code Examples

### Example 1: Syntax

```sql
WHERE <condition> [AND|OR <condition>...]
```

### Example 2: Basic filtering

```sql
SELECT * FROM products
WHERE category = 'Electronics'
```

### Example 3: Basic filtering

```sql
SELECT * FROM products
WHERE price < 100
```

### Example 4: Basic filtering

```sql
SELECT * FROM customers
WHERE joinDate > '2023-01-01'
```

### Example 5: Multiple conditions

```sql
SELECT * FROM products
WHERE category = 'Electronics' AND price < 500 AND inStock = true
```

### Example 6: Multiple conditions

```sql
SELECT * FROM customers
WHERE region = 'Europe' OR region = 'Asia'
```

### Example 7: Multiple conditions

```sql
SELECT * FROM products
WHERE (category = 'Electronics' OR category = 'Computers')
  AND price < 1000
  AND NOT discontinued = true
```

### Example 8: Working with NULL values

```sql
SELECT * FROM customers
WHERE phoneNumber IS NULL
```

### Example 9: Working with NULL values

```sql
SELECT * FROM customers
WHERE address IS NOT NULL AND address.street IS NOT NULL
```

### Example 10: Using sets and arrays

```sql
SELECT * FROM products
WHERE category IN ('Electronics', 'Computers', 'Accessories')
```

### Example 11: Using sets and arrays

```sql
SELECT * FROM products
WHERE category IN (:category1, :category2, :category3)
```

### Example 12: Using sets and arrays

```sql
SELECT * FROM products
WHERE :searchTag = ANY(tags)
```

### Example 13: Using sets and arrays

```sql
SELECT * FROM customers
WHERE status = ANY(:statusList)
```

### Example 14: Text searching

```sql
SELECT * FROM customers
WHERE email LIKE 'john.%'
```

### Example 15: Text searching

```sql
SELECT * FROM customers
WHERE email LIKE '%.com'
```

### Example 16: Text searching

```sql
SELECT * FROM articles
WHERE text_search(content, :searchQuery, 'english')
```

### Example 17: Accessing nested fields

```sql
SELECT * FROM customers
WHERE address.country = 'USA' AND address.state = 'California'
```

### Example 18: Accessing nested fields

```sql
SELECT * FROM orders
WHERE shipping.address.zipCode = '10001'
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/data-types.html
- https://doc.akka.io/reference/views/concepts/optional-fields.html
- https://doc.akka.io/reference/views/syntax/from.html
- https://doc.akka.io/reference/views/syntax/functions/text-search.html
- https://doc.akka.io/reference/views/syntax/join.html
- https://doc.akka.io/reference/views/syntax/operators/any.html
- https://doc.akka.io/reference/views/syntax/operators/comparison.html
- https://doc.akka.io/reference/views/syntax/operators/in.html
- https://doc.akka.io/reference/views/syntax/operators/index.html
- https://doc.akka.io/reference/views/syntax/operators/is-null.html
- https://doc.akka.io/reference/views/syntax/operators/like.html
- https://doc.akka.io/reference/views/syntax/operators/logical.html

---
*Source: [https://doc.akka.io/reference/views/syntax/where.html](https://doc.akka.io/reference/views/syntax/where.html)*