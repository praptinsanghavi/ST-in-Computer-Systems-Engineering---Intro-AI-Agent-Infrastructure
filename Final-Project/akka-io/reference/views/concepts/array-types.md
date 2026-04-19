---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:49Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/concepts/array-types.html
title: 'Array Types :: Akka Documentation'
---

# Array Types :: Akka Documentation

## Content

# Array Types

Array types in Views allow you to work with collections of values within a single row. This page explains how to define, query, and manipulate array data in your Views.

## Defining Array Fields in Java

There are several ways to represent array fields in your View data models:

### Collections

Use Java collection types to represent arrays:

```
public record Product(
    String id,
    String name,
    List<String> categories,
    Set<String> tags
) { }
```

All Java collection types (List, Set, Collection, etc.) are treated as arrays in view queries.

### Java Arrays

Native Java arrays are also supported:

```
public record Product(
    String id,
    String name,
    String[] categories,
    int[] ratings
) { }
```

### Nested Object Arrays

Arrays can contain complex objects:

```
public record Order(
    String id,
    String customerId,
    List<OrderItem> items
) { }

public record OrderItem(
    String productId,
    int quantity,
    double price
) { }
```

## Querying Array Fields

### Testing Membership with \= ANY

The primary way to query array fields is with the `= ANY` operator, which tests if an array contains a specific value:

```
-- Find products in a specific category
SELECT * FROM products
WHERE 'Electronics' = ANY(categories)

-- Find products with a specific tag from a parameter
SELECT * FROM products
WHERE :tag = ANY(tags)
```

The `= ANY` operator can be used in two ways:

1. `value = ANY(arrayColumn)` \- Tests if the array column contains the value
2. `column = ANY(:arrayParameter)` \- Tests if the column’s value is in the array parameter

### Filtering with Array Parameters

You can pass arrays as parameters to filter rows:

```
-- Find products with IDs in a specific list
SELECT * FROM products
WHERE id = ANY(:productIds)
```

In your Java code, pass a List, Set, or array as the parameter:

```
List<String> productIds = List.of("prod-1", "prod-2", "prod-3");
componentClient.forView()
    .method(ProductView::getProducts)
    .invoke(productIds);
```

## Creating Arrays in Query Results

### Using collect() Function

The primary way to create arrays in query results is with the `collect()` function, typically combined with `GROUP BY`:

```
-- Group products by category
SELECT category, collect(*) AS products
FROM products
GROUP BY category
```

This groups products by category and creates an array of product objects for each category.

### Collecting Specific Fields

You can collect specific fields into arrays:

```
-- Collect just product names for each category
SELECT category, collect(name) AS productNames
FROM products
GROUP BY category
```

### Collecting Distinct Values

Use the `distinct` keyword to eliminate duplicates:

```
-- Collect unique tags across products
SELECT collect(distinct tags) AS allTags
FROM products
```

### Arrays of Nested Objects

Create arrays of custom\-structured objects:

```
-- Create custom objects in the array
SELECT category, collect((name, price) AS item) AS products
FROM products
GROUP BY category
```

## Mapping Array Results in Java

Results containing arrays map to collection types in Java:

```
public record CategoryProducts(
    String category,
    List<Product> products
) { }

public record CategoryProductNames(
    String category,
    List<String> productNames
) { }

public record CategoryItems(
    String category,
    List<ProductItem> products
) { }

public record ProductItem(
    String name,
    double price
) { }
```

## Array Limitations and Behavior

### Querying Within Arrays

In the current implementation, querying for specific elements within arrays has some limitations:

- You can check if an array contains a value using `= ANY`
- Directly accessing array elements by index is not supported
- Querying nested properties within array elements is not supported

### Empty Arrays

Empty arrays are handled as follows:

- `value = ANY(emptyArray)` will always be false
- `collect(…​)` on an empty result set produces an empty array

### NULL vs. Empty Array

There’s a distinction between NULL arrays and empty arrays:

- NULL array: The array field itself is missing (`array IS NULL`)
- Empty array: The array exists but contains no elements (`array = '{}'`)

These are queried differently:

```
-- Find products with no categories specified (NULL array)
SELECT * FROM products
WHERE categories IS NULL

-- This would find products with an empty categories array,
-- but this precise syntax isn't currently supported
```

## Best Practices

### When to Use Arrays

Arrays are useful for:

- Categorization and tagging (products with multiple categories)
- Property lists (features, attributes)
- Simple one\-to\-many relationships within a row
- Aggregating related items in query results

### Performance Considerations

- Arrays are stored and indexed efficiently in the underlying database
- The `= ANY` operator can use indexes when properly configured
- For very large arrays, consider alternative data models

### Array Design Tips

- Keep arrays reasonably sized (typically under a few hundred elements)
- For complex many\-to\-many relationships, consider using separate tables and JOINs
- Use appropriate collection types in your Java models (List, Set, etc.)
- Document the expected behavior of your array fields

## Examples

### Full Example: Product Tags and Categories

Model:

```
public record Product(
    String id,
    String name,
    double price,
    List<String> categories,
    Set<String> tags
) { }
```

Query examples:

```
-- Find products in multiple categories
SELECT * FROM products
WHERE 'Electronics' = ANY(categories) OR 'Gadgets' = ANY(categories)

-- Find products with specific tags
SELECT * FROM products
WHERE :searchTag = ANY(tags)

-- Group products by category
SELECT category, collect(*) AS categoryProducts
FROM products, categories AS category
WHERE category = ANY(categories)
GROUP BY category
```

### Nested Arrays Example

Model:

```
public record Order(
    String id,
    String customerId,
    List<OrderItem> items,
    Instant orderDate
) { }

public record OrderItem(
    String productId,
    String productName,
    int quantity,
    double unitPrice
) { }
```

Queries:

```
-- Group orders by customer
SELECT customerId, collect(*) AS orders
FROM orders
GROUP BY customerId

-- Group with transformations
SELECT
  customerId,
  collect((id, orderDate) AS orderSummary) AS orderHistory
FROM orders
GROUP BY customerId
```

## Related Features

- [\= ANY operator](../syntax/operators/any.html) \- Testing array membership
- [collect() function](../syntax/functions/collect.html) \- Creating arrays in results
- [DISTINCT keyword](../syntax/functions/distinct.html) \- Removing duplicates from arrays
- [GROUP BY clause](../syntax/group-by.html) \- Grouping data for arrays
- [Result Mapping](result-mapping.html) \- How arrays map to Java types

## Code Examples

### Example 1: Collections

```java
public record Product(
    String id,
    String name,
    List<String> categories,
    Set<String> tags
) { }
```

### Example 2: Java Arrays

```java
public record Product(
    String id,
    String name,
    String[] categories,
    int[] ratings
) { }
```

### Example 3: Nested Object Arrays

```java
public record Order(
    String id,
    String customerId,
    List<OrderItem> items
) { }

public record OrderItem(
    String productId,
    int quantity,
    double price
) { }
```

### Example 4: Testing Membership with = ANY

```sql
-- Find products in a specific category
SELECT * FROM products
WHERE 'Electronics' = ANY(categories)

-- Find products with a specific tag from a parameter
SELECT * FROM products
WHERE :tag = ANY(tags)
```

### Example 5: Filtering with Array Parameters

```sql
-- Find products with IDs in a specific list
SELECT * FROM products
WHERE id = ANY(:productIds)
```

### Example 6: Filtering with Array Parameters

```java
List<String> productIds = List.of("prod-1", "prod-2", "prod-3");
componentClient.forView()
    .method(ProductView::getProducts)
    .invoke(productIds);
```

### Example 7: Using collect() Function

```sql
-- Group products by category
SELECT category, collect(*) AS products
FROM products
GROUP BY category
```

### Example 8: Collecting Specific Fields

```sql
-- Collect just product names for each category
SELECT category, collect(name) AS productNames
FROM products
GROUP BY category
```

### Example 9: Collecting Distinct Values

```sql
-- Collect unique tags across products
SELECT collect(distinct tags) AS allTags
FROM products
```

### Example 10: Arrays of Nested Objects

```sql
-- Create custom objects in the array
SELECT category, collect((name, price) AS item) AS products
FROM products
GROUP BY category
```

### Example 11: Mapping Array Results in Java

```java
public record CategoryProducts(
    String category,
    List<Product> products
) { }

public record CategoryProductNames(
    String category,
    List<String> productNames
) { }

public record CategoryItems(
    String category,
    List<ProductItem> products
) { }

public record ProductItem(
    String name,
    double price
) { }
```

### Example 12: NULL vs. Empty Array

```sql
-- Find products with no categories specified (NULL array)
SELECT * FROM products
WHERE categories IS NULL

-- This would find products with an empty categories array,
-- but this precise syntax isn't currently supported
```

### Example 13: Full Example: Product Tags and Categories

```java
public record Product(
    String id,
    String name,
    double price,
    List<String> categories,
    Set<String> tags
) { }
```

### Example 14: Full Example: Product Tags and Categories

```sql
-- Find products in multiple categories
SELECT * FROM products
WHERE 'Electronics' = ANY(categories) OR 'Gadgets' = ANY(categories)

-- Find products with specific tags
SELECT * FROM products
WHERE :searchTag = ANY(tags)

-- Group products by category
SELECT category, collect(*) AS categoryProducts
FROM products, categories AS category
WHERE category = ANY(categories)
GROUP BY category
```

### Example 15: Nested Arrays Example

```java
public record Order(
    String id,
    String customerId,
    List<OrderItem> items,
    Instant orderDate
) { }

public record OrderItem(
    String productId,
    String productName,
    int quantity,
    double unitPrice
) { }
```

### Example 16: Nested Arrays Example

```sql
-- Group orders by customer
SELECT customerId, collect(*) AS orders
FROM orders
GROUP BY customerId

-- Group with transformations
SELECT
  customerId,
  collect((id, orderDate) AS orderSummary) AS orderHistory
FROM orders
GROUP BY customerId
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/result-mapping.html
- https://doc.akka.io/reference/views/syntax/functions/collect.html
- https://doc.akka.io/reference/views/syntax/functions/distinct.html
- https://doc.akka.io/reference/views/syntax/group-by.html
- https://doc.akka.io/reference/views/syntax/operators/any.html

---
*Source: [https://doc.akka.io/reference/views/concepts/array-types.html](https://doc.akka.io/reference/views/concepts/array-types.html)*