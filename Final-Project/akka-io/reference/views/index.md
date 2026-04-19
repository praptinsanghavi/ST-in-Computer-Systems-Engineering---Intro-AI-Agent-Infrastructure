---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:18:55Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/index.html
title: 'View reference :: Akka Documentation'
---

# View reference :: Akka Documentation

## Content

# View reference

This reference guide provides comprehensive documentation for Akka Views and the View query language, which enables you to query and filter data from your Views using SQL\-like syntax.

## Introduction to View queries

Akka Views provide a flexible way to query entities by attributes other than their entity ID. Views allow you to create specialized read models that are optimized for specific access patterns and queries.

The View query language is designed to be:

- **Familiar** \- Uses SQL\-like syntax that should be intuitive to most developers
- **Powerful** \- Supports filtering, joining, sorting, and creating complex data structures
- **Flexible** \- Adapts to various data access patterns and requirements
- **Efficient** \- Creates appropriate indexes based on your query patterns

## Getting started

A basic View query has the following structure:

```
SELECT <select_expressions>
FROM <table_name>
WHERE <filter_conditions>
```

For example:

```
SELECT * FROM customers
WHERE region = 'Europe' AND active = true
ORDER BY name
LIMIT 10
```

This query returns up to 10 active customers from the Europe region, ordered by name.

## Using this reference

This reference guide is organized into two main sections:

### View query syntax reference

The [View query syntax](syntax/index.html) section documents the language elements, operators, and functions that make up the View query language:

- **Core Clauses** \- SELECT, FROM, WHERE, etc.
- **Operators** \- Comparison, logical, and special operators
- **Functions** \- Aggregation, pagination, and utility functions

Start with the [Query](syntax/query.html) page for a complete overview of the query structure.

### View concepts reference

The [View concepts](concepts/index.html) section explains the fundamental concepts and patterns for working with Views:

- **Data Structure** \- How data is organized and accessed in Views
- **Data Types** \- Type system and mapping between Java and query language
- **Advanced Features** \- Complex querying capabilities and patterns

## Common use cases

### Filtering data

Filter entities based on field values:

```
SELECT * FROM products
WHERE category = 'Electronics' AND price < 1000
```

### Accessing nested fields

Access fields within nested objects:

```
SELECT * FROM customers
WHERE address.country = 'USA' AND address.state = 'California'
```

### Joining related data

Combine data from multiple tables:

```
SELECT c.name, o.id, o.amount
FROM customers AS c
JOIN orders AS o ON o.customerId = c.id
WHERE c.id = :customerId
```

### Creating nested structures

Build hierarchical data structures:

```
SELECT
  category,
  collect(*) AS products
FROM products
GROUP BY category
```

### Pagination

Implement pagination for large result sets:

```
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

## View implementation in Java

Views are implemented in Java by extending the `akka.javasdk.view.View` class and defining:

1. **Table updaters** \- Define how entity events or state changes update the view
2. **Query methods** \- Define the queries that can be executed against the view

Here’s a simple example:

```
@Component(id = "customers-view")
public class CustomerView extends View {

  @Consume.FromKeyValueEntity(CustomerEntity.class)
  public static class Customers extends TableUpdater<Customer> { }

  @Query("SELECT * FROM customers WHERE region = :region ORDER BY name")
  public QueryEffect<CustomerList> getCustomersByRegion(String region) {
    return queryResult();
  }

  public record CustomerList(List<Customer> customers) { }
}
```

For detailed information, see [implementing Views in your application](../../sdk/views.html).

## Related documentation

- [Implementing Views](../../sdk/views.html) \- Comprehensive guide to implementing Views
- [Advanced Views](concepts/advanced-views.html) \- Advanced usage patterns and features

## Code Examples

### Example 1: Getting started

```sql
SELECT <select_expressions>
FROM <table_name>
WHERE <filter_conditions>
```

### Example 2: Getting started

```sql
SELECT * FROM customers
WHERE region = 'Europe' AND active = true
ORDER BY name
LIMIT 10
```

### Example 3: Filtering data

```sql
SELECT * FROM products
WHERE category = 'Electronics' AND price < 1000
```

### Example 4: Accessing nested fields

```sql
SELECT * FROM customers
WHERE address.country = 'USA' AND address.state = 'California'
```

### Example 5: Joining related data

```sql
SELECT c.name, o.id, o.amount
FROM customers AS c
JOIN orders AS o ON o.customerId = c.id
WHERE c.id = :customerId
```

### Example 6: Creating nested structures

```sql
SELECT
  category,
  collect(*) AS products
FROM products
GROUP BY category
```

### Example 7: Pagination

```sql
SELECT * AS products, next_page_token() AS nextPageToken
FROM products
OFFSET page_token_offset(:pageToken)
LIMIT 10
```

### Example 8: View implementation in Java

```java
@Component(id = "customers-view")
public class CustomerView extends View {

  @Consume.FromKeyValueEntity(CustomerEntity.class)
  public static class Customers extends TableUpdater<Customer> { }

  @Query("SELECT * FROM customers WHERE region = :region ORDER BY name")
  public QueryEffect<CustomerList> getCustomersByRegion(String region) {
    return queryResult();
  }

  public record CustomerList(List<Customer> customers) { }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/advanced-views.html
- https://doc.akka.io/reference/views/concepts/index.html
- https://doc.akka.io/reference/views/syntax/index.html
- https://doc.akka.io/reference/views/syntax/query.html
- https://doc.akka.io/sdk/views.html

---
*Source: [https://doc.akka.io/reference/views/index.html](https://doc.akka.io/reference/views/index.html)*