---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:47Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/concepts/optional-fields.html
title: 'Optional Fields :: Akka Documentation'
---

# Optional Fields :: Akka Documentation

## Content

# Optional Fields

In View queries and data models, optional fields represent values that may or may not be present. This page explains how to work with optional fields in Views, including representing them in Java, querying them, and handling them in results.

## Representing Optional Fields in Java

There are several ways to represent optional fields in your View data models:

### Non\-primitive Types

Use Java’s non\-primitive (reference) types instead of primitives:

```
// Instead of this (primitive)
public record Customer(String id, String name, int age) { }

// Use this (reference type can be null)
public record Customer(String id, String name, Integer age) { }
```

When a field is null, it indicates the value is missing.

### Java Optional

Wrap fields in `java.util.Optional`:

```
public record Customer(
    String id,
    String name,
    Optional<String> phoneNumber,
    Optional<Address> address
) { }
```

This approach makes the optionality explicit in the type system.

### Nested Objects

For nested fields, the entire nested object can be null, or fields within it can be null:

```
public record Customer(
    String id,
    String name,
    Address address // address might be null
) { }

public record Address(
    String street,
    String city,    // city might be null
    String country
) { }
```

## Querying Optional Fields

### Using IS NULL / IS NOT NULL

To find rows where a field is missing (null) or present (not null), use the `IS NULL` and `IS NOT NULL` operators:

```
-- Find customers without a phone number
SELECT * FROM customers
WHERE phoneNumber IS NULL

-- Find customers with a phone number
SELECT * FROM customers
WHERE phoneNumber IS NOT NULL
```

### Querying Nested Optional Fields

For optional nested fields, there are two ways a field can be null:

1. The parent object is null
2. The specific field within the parent is null

```
-- Find customers where the address is missing
SELECT * FROM customers
WHERE address IS NULL

-- Find customers with an address but no city specified
SELECT * FROM customers
WHERE address IS NOT NULL AND address.city IS NULL
```

### Comparing Optional Values

Standard comparison operators (`=`, `!=`, `>`, etc.) only work on non\-null values. To properly handle both null and non\-null cases, combine `IS NULL` / `IS NOT NULL` with standard comparisons:

```
-- Find customers with a specific phone number or no phone number
SELECT * FROM customers
WHERE phoneNumber = :phone OR phoneNumber IS NULL
```

## Optional Fields in Results

When mapping query results to Java types, optional fields should be represented appropriately:

### Nullable Reference Types

For fields that might be null:

```
public record CustomerResult(
    String id,
    String name,
    String phoneNumber,  // might be null
    Address address      // might be null
) { }
```

### Java Optional

For explicit optionality:

```
public record CustomerResult(
    String id,
    String name,
    Optional<String> phoneNumber,
    Optional<Address> address
) { }
```

## Default Values for Missing Fields

When a field is null in the view data but mapped to a primitive type in a result object, default values are used:

- `int`, `long`, `short`, `byte`: `0`
- `float`, `double`: `0.0`
- `boolean`: `false`
- `char`: `\u0000` (null character)

To avoid unexpected default values, use reference types instead of primitives when a field might be null.

## Best Practices

### When to Make Fields Optional

Fields should be optional when:

- The information might not be available for all entities
- The field represents optional behavior or characteristics
- The field is added in a schema evolution and might not exist for older entities
- There’s a meaningful semantic difference between "not applicable" and "not provided"

### Handling Optional Fields

- Use `IS NULL` / `IS NOT NULL` to filter based on presence or absence
- Consider providing default values for missing fields when appropriate
- Be careful when querying nested optional fields \- check if the parent is null first
- Use appropriate Java types (reference types or `Optional`) for optional fields in result types
- Document which fields are optional to avoid confusion

### Avoiding NULL Issues

- Don’t use `= NULL` or `!= NULL` \- these won’t work as expected
- Check for null parent objects before accessing nested fields
- Watch for default value behavior when mapping nulls to primitive types
- Consider using the `Optional` API for safer handling of potentially missing values

## Examples

### Full Example: Customer with Optional Fields

Entity definition:

```
public record Customer(
    String id,
    String name,
    String email,
    Optional<String> phoneNumber,
    Optional<Address> shippingAddress,
    Optional<Address> billingAddress
) { }

public record Address(
    String street,
    String city,
    String zipCode,
    String country
) { }
```

View query with optional field handling:

```
-- Find customers with a phone number but no shipping address
SELECT * FROM customers
WHERE phoneNumber IS NOT NULL AND shippingAddress IS NULL

-- Find customers with same billing and shipping city
SELECT * FROM customers
WHERE billingAddress IS NOT NULL
  AND shippingAddress IS NOT NULL
  AND billingAddress.city = shippingAddress.city
```

## Related Features

- [IS NULL / IS NOT NULL](../syntax/operators/is-null.html) \- Testing for optional values
- [Data Types](data-types.html) \- Type system information
- [Result Mapping](result-mapping.html) \- Mapping query results to Java types

## Code Examples

### Example 1: Non-primitive Types

```java
// Instead of this (primitive)
public record Customer(String id, String name, int age) { }

// Use this (reference type can be null)
public record Customer(String id, String name, Integer age) { }
```

### Example 2: Java Optional

```java
public record Customer(
    String id,
    String name,
    Optional<String> phoneNumber,
    Optional<Address> address
) { }
```

### Example 3: Nested Objects

```java
public record Customer(
    String id,
    String name,
    Address address // address might be null
) { }

public record Address(
    String street,
    String city,    // city might be null
    String country
) { }
```

### Example 4: Using IS NULL / IS NOT NULL

```sql
-- Find customers without a phone number
SELECT * FROM customers
WHERE phoneNumber IS NULL

-- Find customers with a phone number
SELECT * FROM customers
WHERE phoneNumber IS NOT NULL
```

### Example 5: Querying Nested Optional Fields

```sql
-- Find customers where the address is missing
SELECT * FROM customers
WHERE address IS NULL

-- Find customers with an address but no city specified
SELECT * FROM customers
WHERE address IS NOT NULL AND address.city IS NULL
```

### Example 6: Comparing Optional Values

```sql
-- Find customers with a specific phone number or no phone number
SELECT * FROM customers
WHERE phoneNumber = :phone OR phoneNumber IS NULL
```

### Example 7: Nullable Reference Types

```java
public record CustomerResult(
    String id,
    String name,
    String phoneNumber,  // might be null
    Address address      // might be null
) { }
```

### Example 8: Java Optional

```java
public record CustomerResult(
    String id,
    String name,
    Optional<String> phoneNumber,
    Optional<Address> address
) { }
```

### Example 9: Full Example: Customer with Optional Fields

```java
public record Customer(
    String id,
    String name,
    String email,
    Optional<String> phoneNumber,
    Optional<Address> shippingAddress,
    Optional<Address> billingAddress
) { }

public record Address(
    String street,
    String city,
    String zipCode,
    String country
) { }
```

### Example 10: Full Example: Customer with Optional Fields

```sql
-- Find customers with a phone number but no shipping address
SELECT * FROM customers
WHERE phoneNumber IS NOT NULL AND shippingAddress IS NULL

-- Find customers with same billing and shipping city
SELECT * FROM customers
WHERE billingAddress IS NOT NULL
  AND shippingAddress IS NOT NULL
  AND billingAddress.city = shippingAddress.city
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/data-types.html
- https://doc.akka.io/reference/views/concepts/result-mapping.html
- https://doc.akka.io/reference/views/syntax/operators/is-null.html

---
*Source: [https://doc.akka.io/reference/views/concepts/optional-fields.html](https://doc.akka.io/reference/views/concepts/optional-fields.html)*