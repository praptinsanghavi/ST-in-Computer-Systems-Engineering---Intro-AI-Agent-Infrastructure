---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:49Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/as.html
title: 'AS :: Akka Documentation'
---

# AS :: Akka Documentation

## Content

# AS

The `AS` keyword creates aliases for columns, expressions, tables, or functions in a query. Aliases provide meaningful names for the query results and are essential for mapping query results to Java objects in the View response.

## Syntax

Column or expression alias:

```
<column_or_expression> AS <alias>
```

Table alias:

```
<table_name> AS <alias>
```

## Elements

`column_or_expression`

A column name, function, or expression that you want to alias.

`table_name`

The name of a table that you want to alias.

`alias`

A new name to assign to the column, expression, or table. This name will be used in the query result and should match field names in your Java response types.

## Features

Result mapping

Maps columns or expressions in the query result to fields in your Java response types, ensuring proper deserialization.

Column renaming

Renames columns in the result set to match the required field names or to make them more meaningful.

Structuring results

When used with composite expressions, enables creation of nested objects and structured data in the result.

Table references

Creates shorter or more meaningful names for tables, especially useful in joins and complex queries.

## Examples

### Basic column aliases

Simple column alias

```
SELECT name AS customerName FROM customers
```

Alias for a nested field

```
SELECT address.city AS customerCity FROM customers
```

Multiple aliases in a single query

```
SELECT
  id,
  name AS customerName,
  email AS contactEmail,
  status
FROM customers
```

### Aliases for special elements

Alias for a collection

```
SELECT * AS products FROM products
```

Alias for a parameter

```
SELECT :requestId AS requestId, name FROM customers
```

Alias for a function result

```
SELECT next_page_token() AS nextPageToken FROM products
```

### Aliases for nested structures

Simple nested object

```
SELECT (name, email) AS contactInfo FROM customers
```

Complex nested object with custom field names

```
SELECT (
  name AS fullName,
  email AS emailAddress,
  phone AS phoneNumber
) AS contactDetails
FROM customers
```

Multiple nested objects

```
SELECT
  id,
  (name, email) AS contactInfo,
  (address.street, address.city, address.zipCode) AS location
FROM customers
```

Nested object with collections

```
SELECT
  category,
  (
    collect(name) AS productNames,
    collect(price) AS pricePoints
  ) AS categoryData
FROM products
GROUP BY category
```

### Table aliases

Basic table alias in JOIN

```
SELECT c.name, o.id
FROM customers AS c
JOIN orders AS o ON o.customerId = c.id
```

Multiple table aliases in complex joins

```
SELECT
  c.name,
  o.id AS orderId,
  p.name AS productName
FROM customers AS c
JOIN orders AS o ON o.customerId = c.id
JOIN products AS p ON p.id = o.productId
```

## Java type mapping

The alias names in your query must match the field names in your Java response types. For example:

```
SELECT
  id,
  name AS customerName,
  (address.street, address.city) AS location
FROM customers
```

Should match a Java type like:

```
public record CustomerResponse(
  String id,
  String customerName,
  Location location
) {}

public record Location(
  String street,
  String city
) {}
```

For collection results:

```
SELECT category, collect(name) AS productNames
FROM products
GROUP BY category
```

Maps to:

```
public record CategorySummary(
  String category,
  List<String> productNames
) {}
```

## Alias requirements and constraints

### When aliases are required

Aliases are mandatory in the following cases:

- For composite expressions: `(name, email) AS contactInfo`
- For special functions: `next_page_token() AS nextPageToken`
- When collecting items: `collect(name) AS productNames`
- When using wildcards with a specific field name: `* AS items`

### Naming constraints

- Alias names must be valid Java identifiers
- Alias names are case\-sensitive and should match your Java field names exactly
- Reserved words should be avoided or enclosed in backticks
- If alias names contain special characters or spaces, they must be enclosed in backticks

## Notes

- Aliases defined in the SELECT clause can’t be referenced in WHERE clauses
- Table aliases can be referenced in SELECT, WHERE, and ON clauses
- Aliases are primarily for result mapping and don’t affect the underlying data
- For complex nested structures, ensure that your Java classes have matching structure
- The mapping between SQL aliases and Java fields is case\-sensitive

## Related features

- [SELECT clause](select.html) \- Uses aliases for result mapping
- [FROM clause](from.html) \- Can include table aliases
- [JOIN clause](join.html) \- Often uses table aliases
- [Result mapping](../concepts/result-mapping.html) \- How query results map to Java types

## Code Examples

### Example 1: Syntax

```sql
<column_or_expression> AS <alias>
```

### Example 2: Syntax

```sql
<table_name> AS <alias>
```

### Example 3: Basic column aliases

```sql
SELECT name AS customerName FROM customers
```

### Example 4: Basic column aliases

```sql
SELECT address.city AS customerCity FROM customers
```

### Example 5: Basic column aliases

```sql
SELECT
  id,
  name AS customerName,
  email AS contactEmail,
  status
FROM customers
```

### Example 6: Aliases for special elements

```sql
SELECT * AS products FROM products
```

### Example 7: Aliases for special elements

```sql
SELECT :requestId AS requestId, name FROM customers
```

### Example 8: Aliases for special elements

```sql
SELECT next_page_token() AS nextPageToken FROM products
```

### Example 9: Aliases for nested structures

```sql
SELECT (name, email) AS contactInfo FROM customers
```

### Example 10: Aliases for nested structures

```sql
SELECT (
  name AS fullName,
  email AS emailAddress,
  phone AS phoneNumber
) AS contactDetails
FROM customers
```

### Example 11: Aliases for nested structures

```sql
SELECT
  id,
  (name, email) AS contactInfo,
  (address.street, address.city, address.zipCode) AS location
FROM customers
```

### Example 12: Aliases for nested structures

```sql
SELECT
  category,
  (
    collect(name) AS productNames,
    collect(price) AS pricePoints
  ) AS categoryData
FROM products
GROUP BY category
```

### Example 13: Table aliases

```sql
SELECT c.name, o.id
FROM customers AS c
JOIN orders AS o ON o.customerId = c.id
```

### Example 14: Table aliases

```sql
SELECT
  c.name,
  o.id AS orderId,
  p.name AS productName
FROM customers AS c
JOIN orders AS o ON o.customerId = c.id
JOIN products AS p ON p.id = o.productId
```

### Example 15: Java type mapping

```sql
SELECT
  id,
  name AS customerName,
  (address.street, address.city) AS location
FROM customers
```

### Example 16: Java type mapping

```java
public record CustomerResponse(
  String id,
  String customerName,
  Location location
) {}

public record Location(
  String street,
  String city
) {}
```

### Example 17: Java type mapping

```sql
SELECT category, collect(name) AS productNames
FROM products
GROUP BY category
```

### Example 18: Java type mapping

```java
public record CategorySummary(
  String category,
  List<String> productNames
) {}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/result-mapping.html
- https://doc.akka.io/reference/views/syntax/from.html
- https://doc.akka.io/reference/views/syntax/join.html
- https://doc.akka.io/reference/views/syntax/select.html

---
*Source: [https://doc.akka.io/reference/views/syntax/as.html](https://doc.akka.io/reference/views/syntax/as.html)*