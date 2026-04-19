---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:24Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/concepts/result-mapping.html
title: 'Result Mapping :: Akka Documentation'
---

# Result Mapping :: Akka Documentation

## Content

# Result Mapping

Result mapping is the process of converting data retrieved by View queries into Java objects. This page explains how query results are mapped to Java types and provides guidance on defining response types that align with your queries.

## Query Result Structure

The structure of your query result is determined by:

1. The columns selected in the `SELECT` clause
2. The aliases assigned to those columns using `AS`
3. Any nesting created by grouping columns or using `collect()`

The mapping system establishes a correspondence between this structure and your Java response types.

## Basic Mapping Rules

### Field Names

Field names in your Java classes must match the column names or aliases in your query:

```
SELECT id, name, email FROM customers
```

Must map to a Java class with fields named `id`, `name`, and `email`:

```
public record CustomerResponse(String id, String name, String email) { }
```

### Using Aliases

Use the `AS` keyword to map columns to differently named Java fields:

```
SELECT id, name AS customerName, email AS contactEmail FROM customers
```

Maps to:

```
public record CustomerResponse(
    String id,
    String customerName,
    String contactEmail
) { }
```

### Wildcard Selection

When using `*` to select all columns, you can map to a specific field with an alias:

```
SELECT * AS customer FROM customers
```

Maps to:

```
public record Response(Customer customer) { }
```

Where `Customer` contains all the fields from the `customers` table.

## Complex Mappings

### Nested Objects

Create nested objects by grouping columns with parentheses and an alias:

```
SELECT id, (name, email) AS contactInfo FROM customers
```

Maps to:

```
public record CustomerResponse(
    String id,
    ContactInfo contactInfo
) { }

public record ContactInfo(String name, String email) { }
```

### Custom Field Names in Nested Objects

Specify field names within nested objects:

```
SELECT id, (name AS fullName, email AS emailAddress) AS contact FROM customers
```

Maps to:

```
public record CustomerResponse(
    String id,
    Contact contact
) { }

public record Contact(String fullName, String emailAddress) { }
```

### Collections

See [Creating Arrays in Query Results](array-types.html#_creating_arrays_in_query_results)

## Special Function Results

### Pagination Functions

Map pagination function results to appropriate fields:

```
SELECT * AS items,
       next_page_token() AS nextPageToken,
       has_more() AS hasMore,
       total_count() AS totalCount
FROM products
LIMIT 10
```

Maps to:

```
public record ProductsPage(
    List<Product> items,
    String nextPageToken,
    boolean hasMore,
    int totalCount
) { }
```

### Count Function

Map count results to numeric fields:

```
SELECT count(*) AS totalCustomers FROM customers
```

Maps to:

```
public record CustomerCount(int totalCustomers) { }
```

## Java Type Compatibility

### Primitive vs. Object Types

Both primitive and object types are supported for numeric and boolean fields:

- `int`/`Integer`
- `long`/`Long`
- `float`/`Float`
- `double`/`Double`
- `boolean`/`Boolean`

Use object types when the field might be NULL.

### Collection Types

Query results that return collections can map to:

- `java.util.List<T>`
- `java.util.Collection<T>`
- Other collection types that can be constructed from a `Collection`

### Optional Fields

Fields that might be NULL can be represented as:

- Object types (e.g., `Integer` instead of `int`)
- `java.util.Optional<T>`
- Nullable fields in a class

## Best Practices

- Define response types that exactly match your query structure
- Use aliases in queries to match your preferred Java field names
- Use nested objects to organize related data
- Consider using Java records for response types
- Match field types carefully to ensure compatibility
- Use object types instead of primitives for potentially NULL values
- Document the relationship between queries and response types

## Examples

### Flat Object Mapping

Query:

```
SELECT id, name, email, createdDate FROM customers WHERE id = :customerId
```

Response type:

```
public record CustomerDetails(
    String id,
    String name,
    String email,
    Instant createdDate
) { }
```

### Nested Object Mapping

Query:

```
SELECT id,
       name,
       (street, city, zipCode, country) AS address
FROM customers
WHERE id = :customerId
```

Response types:

```
public record CustomerWithAddress(
    String id,
    String name,
    Address address
) { }

public record Address(
    String street,
    String city,
    String zipCode,
    String country
) { }
```

### Collection Result Mapping

Query:

```
SELECT category,
       collect((name, price, description) AS item) AS products
FROM products
GROUP BY category
WHERE category = :category
```

Response types:

```
public record CategoryProducts(
    String category,
    List<ProductItem> products
) { }

public record ProductItem(
    String name,
    double price,
    String description
) { }
```

## Related Features

- [SELECT clause](../syntax/select.html) \- Defining the result structure
- [AS keyword](../syntax/as.html) \- Naming result fields
- [collect() function](../syntax/functions/collect.html) \- Creating collections in results
- [Data Types](data-types.html) \- Type compatibility information
- [Optional Fields](optional-fields.html) \- Working with nullable fields

## Code Examples

### Example 1: Field Names

```sql
SELECT id, name, email FROM customers
```

### Example 2: Field Names

```java
public record CustomerResponse(String id, String name, String email) { }
```

### Example 3: Using Aliases

```sql
SELECT id, name AS customerName, email AS contactEmail FROM customers
```

### Example 4: Using Aliases

```java
public record CustomerResponse(
    String id,
    String customerName,
    String contactEmail
) { }
```

### Example 5: Wildcard Selection

```sql
SELECT * AS customer FROM customers
```

### Example 6: Wildcard Selection

```java
public record Response(Customer customer) { }
```

### Example 7: Nested Objects

```sql
SELECT id, (name, email) AS contactInfo FROM customers
```

### Example 8: Nested Objects

```java
public record CustomerResponse(
    String id,
    ContactInfo contactInfo
) { }

public record ContactInfo(String name, String email) { }
```

### Example 9: Custom Field Names in Nested Objects

```sql
SELECT id, (name AS fullName, email AS emailAddress) AS contact FROM customers
```

### Example 10: Custom Field Names in Nested Objects

```java
public record CustomerResponse(
    String id,
    Contact contact
) { }

public record Contact(String fullName, String emailAddress) { }
```

### Example 11: Pagination Functions

```sql
SELECT * AS items,
       next_page_token() AS nextPageToken,
       has_more() AS hasMore,
       total_count() AS totalCount
FROM products
LIMIT 10
```

### Example 12: Pagination Functions

```java
public record ProductsPage(
    List<Product> items,
    String nextPageToken,
    boolean hasMore,
    int totalCount
) { }
```

### Example 13: Count Function

```sql
SELECT count(*) AS totalCustomers FROM customers
```

### Example 14: Count Function

```java
public record CustomerCount(int totalCustomers) { }
```

### Example 15: Flat Object Mapping

```sql
SELECT id, name, email, createdDate FROM customers WHERE id = :customerId
```

### Example 16: Flat Object Mapping

```java
public record CustomerDetails(
    String id,
    String name,
    String email,
    Instant createdDate
) { }
```

### Example 17: Nested Object Mapping

```sql
SELECT id,
       name,
       (street, city, zipCode, country) AS address
FROM customers
WHERE id = :customerId
```

### Example 18: Nested Object Mapping

```java
public record CustomerWithAddress(
    String id,
    String name,
    Address address
) { }

public record Address(
    String street,
    String city,
    String zipCode,
    String country
) { }
```

### Example 19: Collection Result Mapping

```sql
SELECT category,
       collect((name, price, description) AS item) AS products
FROM products
GROUP BY category
WHERE category = :category
```

### Example 20: Collection Result Mapping

```java
public record CategoryProducts(
    String category,
    List<ProductItem> products
) { }

public record ProductItem(
    String name,
    double price,
    String description
) { }
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/array-types.html
- https://doc.akka.io/reference/views/concepts/data-types.html
- https://doc.akka.io/reference/views/concepts/optional-fields.html
- https://doc.akka.io/reference/views/syntax/as.html
- https://doc.akka.io/reference/views/syntax/functions/collect.html
- https://doc.akka.io/reference/views/syntax/select.html

---
*Source: [https://doc.akka.io/reference/views/concepts/result-mapping.html](https://doc.akka.io/reference/views/concepts/result-mapping.html)*