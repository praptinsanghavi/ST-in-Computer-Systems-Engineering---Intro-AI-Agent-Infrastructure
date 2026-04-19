---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:53Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/operators/is-null.html
title: 'IS NULL / IS NOT NULL :: Akka Documentation'
---

# IS NULL / IS NOT NULL :: Akka Documentation

## Content

# IS NULL / IS NOT NULL

The `IS NULL` and `IS NOT NULL` operators check if a value is missing (NULL) or present in a column. These operators are essential for handling optional fields in your data models.

## Syntax

```
<column_or_expression> IS NULL
<column_or_expression> IS NOT NULL
```

## Elements

`column_or_expression`

The column or expression to check for NULL or non\-NULL value.

## Features

NULL Testing

Checks whether a value is NULL (missing) or not NULL (present).

Optional Field Handling

Provides a way to filter results based on whether optional fields have values or not.

Three\-valued Logic

Handles the special NULL value, which is neither equal to nor different from any other value, including another NULL.

## Examples

Find customers without a phone number

```
SELECT * FROM customers
WHERE phoneNumber IS NULL
```

Find customers with a phone number

```
SELECT * FROM customers
WHERE phoneNumber IS NOT NULL
```

Find customers with missing address information

```
SELECT * FROM customers
WHERE address IS NULL OR address.street IS NULL
```

Combined with other conditions

```
SELECT * FROM products
WHERE category = 'Electronics' AND description IS NOT NULL
```

Filter with nested fields

```
SELECT * FROM orders
WHERE shippingAddress IS NOT NULL AND billingAddress IS NULL
```

## NULL in Java Types

In the View query language, NULL values correspond to specific representations in Java:

1. For primitive types (int, long, boolean, etc.), NULL is not directly representable
2. For object types (Integer, Long, Boolean, etc.), NULL is represented as `null`
3. For `Optional<T>` types, NULL is represented as an empty Optional
4. For nested objects, NULL can mean the entire object is missing

## Notes

- NULL values require special comparison operators \- they cannot be compared using standard operators like `=` or `!=`
- The expression `column = NULL` will not work as expected; use `column IS NULL` instead
- Similarly, `column != NULL` will not work; use `column IS NOT NULL` instead
- NULL values in Java are represented differently based on the field type:

	- For primitive types, default values are used (0, false, etc.)
	- For reference types, `null` is used
	- For `Optional<T>`, an empty Optional is used
- A NULL in a nested field can indicate either that the field itself is NULL or that a parent object is NULL

## Related Features

- [WHERE clause](../where.html) \- Used with IS NULL / IS NOT NULL for filtering
- [Optional Fields](../../concepts/optional-fields.html) \- Working with optional data in views

## Code Examples

### Example 1: Syntax

```sql
<column_or_expression> IS NULL
<column_or_expression> IS NOT NULL
```

### Example 2: Examples

```sql
SELECT * FROM customers
WHERE phoneNumber IS NULL
```

### Example 3: Examples

```sql
SELECT * FROM customers
WHERE phoneNumber IS NOT NULL
```

### Example 4: Examples

```sql
SELECT * FROM customers
WHERE address IS NULL OR address.street IS NULL
```

### Example 5: Examples

```sql
SELECT * FROM products
WHERE category = 'Electronics' AND description IS NOT NULL
```

### Example 6: Examples

```sql
SELECT * FROM orders
WHERE shippingAddress IS NOT NULL AND billingAddress IS NULL
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/optional-fields.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/operators/is-null.html](https://doc.akka.io/reference/views/syntax/operators/is-null.html)*