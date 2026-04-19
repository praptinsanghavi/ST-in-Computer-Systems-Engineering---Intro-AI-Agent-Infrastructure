---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:51Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/operators/logical.html
title: 'Logical Operators :: Akka Documentation'
---

# Logical Operators :: Akka Documentation

## Content

# Logical Operators

Logical operators combine conditions and enable complex filtering expressions. They allow you to express compound conditions by combining simpler conditions using boolean logic.

## Available Operators

### AND

The `AND` operator combines two conditions and returns true only when both conditions are true.

Syntax:

```
<condition1> AND <condition2>
```

Examples:

```
category = 'Electronics' AND price < 500
status = 'active' AND createdDate > '2023-01-01'
country = 'USA' AND state = 'California' AND city = 'San Francisco'
```

Truth table:

| Condition 1 | Condition 2 | Result |
| --- | --- | --- |
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

### OR

The `OR` operator combines two conditions and returns true when either condition is true or both are true.

Syntax:

```
<condition1> OR <condition2>
```

Examples:

```
category = 'Electronics' OR category = 'Computers'
price < 100 OR onSale = true
country = 'USA' OR country = 'Canada' OR country = 'Mexico'
```

Truth table:

| Condition 1 | Condition 2 | Result |
| --- | --- | --- |
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

### NOT

The `NOT` operator negates a condition, reversing its boolean value.

Syntax:

```
NOT <condition>
```

Examples:

```
NOT category = 'Electronics'
NOT price > 100
NOT (address.city = 'New York' AND age > 65)
```

Truth table:

| Condition | Result |
| --- | --- |
| true | false |
| false | true |

## Operator Precedence

In the View query language, logical operators have the following precedence (from highest to lowest):

1. NOT
2. AND
3. OR

This means that:

- `NOT a AND b` is evaluated as `(NOT a) AND b`
- `a AND b OR c` is evaluated as `(a AND b) OR c`
- `a OR b AND c` is evaluated as `a OR (b AND c)`

Use parentheses to override the default precedence:

```
(category = 'Electronics' OR category = 'Computers') AND price < 1000
```

## Complex Expressions

Logical operators can be combined to create complex conditions:

```
(category = 'Electronics' OR category = 'Computers')
AND (price < 1000 OR onSale = true)
AND NOT discontinued = true
```

## Alternative Expressions

Many complex logical expressions can be simplified using other operators:

| Complex Expression | Simpler Alternative |
| --- | --- |
| `category = 'A' OR category = 'B' OR category = 'C'` | `category IN ('A', 'B', 'C')` |
| `NOT a = b` | `a != b` |
| `NOT a > b` | `a ⇐ b` |
| `NOT a < b` | `a >= b` |
| `NOT a IS NULL` | `a IS NOT NULL` |

## De Morgan’s Laws

These logical equivalences can help simplify negated expressions:

- `NOT (a AND b)` is equivalent to `NOT a OR NOT b`
- `NOT (a OR b)` is equivalent to `NOT a AND NOT b`

## Notes

- Use parentheses to make complex expressions more readable and to ensure the correct evaluation order
- When combining many OR conditions with the same column, consider using the IN operator instead
- For checking if a value is in an array column, use the \= ANY operator
- Logical operators work with any expressions that evaluate to boolean values

## Related Features

- [Operators Overview](index.html) \- All available operators
- [Comparison Operators](comparison.html) \- \=, !\=, \>, \<, etc.
- [IN Operator](in.html) \- Shorthand for multiple OR conditions with equality
- [\= ANY Operator](any.html) \- Tests if a value is in an array
- [WHERE Clause](../where.html) \- Using logical operators for filtering

## Code Examples

### Example 1: AND

```sql
<condition1> AND <condition2>
```

### Example 2: AND

```sql
category = 'Electronics' AND price < 500
status = 'active' AND createdDate > '2023-01-01'
country = 'USA' AND state = 'California' AND city = 'San Francisco'
```

### Example 3: OR

```sql
<condition1> OR <condition2>
```

### Example 4: OR

```sql
category = 'Electronics' OR category = 'Computers'
price < 100 OR onSale = true
country = 'USA' OR country = 'Canada' OR country = 'Mexico'
```

### Example 5: NOT

```sql
NOT <condition>
```

### Example 6: NOT

```sql
NOT category = 'Electronics'
NOT price > 100
NOT (address.city = 'New York' AND age > 65)
```

### Example 7: Operator Precedence

```sql
(category = 'Electronics' OR category = 'Computers') AND price < 1000
```

### Example 8: Complex Expressions

```sql
(category = 'Electronics' OR category = 'Computers')
AND (price < 1000 OR onSale = true)
AND NOT discontinued = true
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/syntax/operators/any.html
- https://doc.akka.io/reference/views/syntax/operators/comparison.html
- https://doc.akka.io/reference/views/syntax/operators/in.html
- https://doc.akka.io/reference/views/syntax/operators/index.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/operators/logical.html](https://doc.akka.io/reference/views/syntax/operators/logical.html)*