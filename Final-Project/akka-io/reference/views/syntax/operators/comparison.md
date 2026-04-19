---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:48Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/operators/comparison.html
title: 'Comparison Operators :: Akka Documentation'
---

# Comparison Operators :: Akka Documentation

## Content

# Comparison Operators

Comparison operators compare values and return boolean results. They form the foundation of filtering conditions in the WHERE clause and join conditions in the JOIN clause.

## Syntax

```
<value1> <operator> <value2>
```

## Available Operators

### Equals (\=)

Tests if two values are equal.

Syntax:

```
<value1> = <value2>
```

Examples:

```
name = 'John'
age = 30
status = :statusParameter
customer.address.city = 'New York'
```

### Not Equals (!\=)

Tests if two values are not equal.

Syntax:

```
<value1> != <value2>
```

Examples:

```
category != 'Electronics'
status != 'inactive'
price != :targetPrice
```

### Greater Than (\>)

Tests if the first value is greater than the second value.

Syntax:

```
<value1> > <value2>
```

Examples:

```
price > 100
age > 18
createdDate > '2023-01-01'
```

### Greater Than or Equal To (\>\=)

Tests if the first value is greater than or equal to the second value.

Syntax:

```
<value1> >= <value2>
```

Examples:

```
price >= 100
age >= 18
rating >= :minimumRating
```

### Less Than (\<)

Tests if the first value is less than the second value.

Syntax:

```
<value1> < <value2>
```

Examples:

```
price < 50
age < 65
expireDate < :currentDate
```

### Less Than or Equal To (⇐)

Tests if the first value is less than or equal to the second value.

Syntax:

```
<value1> <= <value2>
```

Examples:

```
price <= 50
age <= 65
endDate <= '2023-12-31'
```

## Type Compatibility

Comparison operators require compatible types on both sides:

- String values can only be compared with other strings
- Numeric values (int, long, float, double) can be compared with other numeric values
- Boolean values can only be compared with other booleans
- Date/timestamp values can only be compared with other date/timestamp values

## Comparison with NULL

Comparison operators (`=`, `!=`, `>`, etc.) do not work correctly with NULL values. Use the [IS NULL / IS NOT NULL](is-null.html) operators instead:

```
-- Incorrect: does not find rows where email is NULL
email = NULL

-- Correct: finds rows where email is NULL
email IS NULL
```

## Usage in WHERE Clause

Comparison operators are commonly used in the WHERE clause to filter results:

```
SELECT * FROM products
WHERE price > 100 AND category = 'Electronics'
```

## Usage in JOIN Conditions

Comparison operators define how tables are joined together:

```
SELECT c.name, o.id
FROM customers AS c
JOIN orders AS o ON o.customerId = c.id
```

## Notes

- String comparisons are case\-sensitive
- Date/time comparisons work with ISO format strings (`'YYYY-MM-DD'`, `'YYYY-MM-DDThh:mm:ss'`)
- When comparing values of different but compatible numeric types, implicit conversion may occur
- Field paths can be used on either side of a comparison operator

## Related Features

- [Operators Overview](index.html) \- All available operators
- [Logical Operators](logical.html) \- AND, OR, NOT operators
- [WHERE clause](../where.html) \- Using comparisons for filtering
- [IS NULL / IS NOT NULL](is-null.html) \- Testing for NULL values
- [Data Types](../../concepts/data-types.html) \- Type compatibility information

## Code Examples

### Example 1: Syntax

```sql
<value1> <operator> <value2>
```

### Example 2: Equals (=)

```sql
<value1> = <value2>
```

### Example 3: Equals (=)

```sql
name = 'John'
age = 30
status = :statusParameter
customer.address.city = 'New York'
```

### Example 4: Not Equals (!=)

```sql
<value1> != <value2>
```

### Example 5: Not Equals (!=)

```sql
category != 'Electronics'
status != 'inactive'
price != :targetPrice
```

### Example 6: Greater Than (>)

```sql
<value1> > <value2>
```

### Example 7: Greater Than (>)

```sql
price > 100
age > 18
createdDate > '2023-01-01'
```

### Example 8: Greater Than or Equal To (>=)

```sql
<value1> >= <value2>
```

### Example 9: Greater Than or Equal To (>=)

```sql
price >= 100
age >= 18
rating >= :minimumRating
```

### Example 10: Less Than (<)

```sql
<value1> < <value2>
```

### Example 11: Less Than (<)

```sql
price < 50
age < 65
expireDate < :currentDate
```

### Example 12: Less Than or Equal To (⇐)

```sql
<value1> <= <value2>
```

### Example 13: Less Than or Equal To (⇐)

```sql
price <= 50
age <= 65
endDate <= '2023-12-31'
```

### Example 14: Comparison with NULL

```sql
-- Incorrect: does not find rows where email is NULL
email = NULL

-- Correct: finds rows where email is NULL
email IS NULL
```

### Example 15: Usage in WHERE Clause

```sql
SELECT * FROM products
WHERE price > 100 AND category = 'Electronics'
```

### Example 16: Usage in JOIN Conditions

```sql
SELECT c.name, o.id
FROM customers AS c
JOIN orders AS o ON o.customerId = c.id
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/data-types.html
- https://doc.akka.io/reference/views/syntax/operators/index.html
- https://doc.akka.io/reference/views/syntax/operators/is-null.html
- https://doc.akka.io/reference/views/syntax/operators/logical.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/operators/comparison.html](https://doc.akka.io/reference/views/syntax/operators/comparison.html)*