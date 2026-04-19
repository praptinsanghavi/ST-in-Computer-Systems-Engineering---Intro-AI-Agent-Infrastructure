---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:42Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/syntax/from.html
title: 'FROM :: Akka Documentation'
---

# FROM :: Akka Documentation

## Content

# FROM

The `FROM` clause specifies the data source for your query, indicating which view table to retrieve data from. In multi\-table views, it establishes the primary source table that can be joined with other tables.

## Syntax

```
FROM <table_name>
```

## Elements

`table_name`

The name of the view table to query. This corresponds to a `TableUpdater` defined in your View. Table names can be specified with the `@Table` annotation or can be automatically derived for single table views.

## Features

Table selection

Specifies the primary source table for the query. This table contains the rows that will be examined by the query.

Derived tables

In advanced scenarios, a subquery can be used in place of a table name to create a derived table.

## Table names

Table names in a View query correspond to the name specified in the `@Table` annotation on a `TableUpdater` class. Single table views may omit the `@Table` annotation.

## Examples

Basic FROM clause

```
SELECT * FROM customers
```

Using a table name explicitly defined with `@Table("customer_profiles")`

```
SELECT * FROM customer_profiles
```

Referencing table in a join context

```
SELECT customers.name, orders.id
FROM customers
JOIN orders ON orders.customerId = customers.id
```

Using a derived table (advanced)

```
SELECT * FROM (
  SELECT name, address
  FROM customers
  WHERE active = true
) AS active_customers
```

## Notes

- The `FROM` clause is required in every query
- Table names are case\-sensitive
- When using joins, the first table in the FROM clause becomes the left side of the first join
- Table names must correspond to `TableUpdater` classes defined in your View
- If table names contain special characters or spaces, they must be enclosed in backticks

## Related Features

- [SELECT clause](select.html) \- Specifies what data to retrieve
- [JOIN clause](join.html) \- Combines data from multiple tables
- [WHERE clause](where.html) \- Filters results based on conditions
- [Table updaters](../concepts/table-updaters.html) \- Defining view tables in code

## Code Examples

### Example 1: Syntax

```sql
FROM <table_name>
```

### Example 2: Examples

```sql
SELECT * FROM customers
```

### Example 3: Examples

```sql
SELECT * FROM customer_profiles
```

### Example 4: Examples

```sql
SELECT customers.name, orders.id
FROM customers
JOIN orders ON orders.customerId = customers.id
```

### Example 5: Examples

```sql
SELECT * FROM (
  SELECT name, address
  FROM customers
  WHERE active = true
) AS active_customers
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/table-updaters.html
- https://doc.akka.io/reference/views/syntax/join.html
- https://doc.akka.io/reference/views/syntax/select.html
- https://doc.akka.io/reference/views/syntax/where.html

---
*Source: [https://doc.akka.io/reference/views/syntax/from.html](https://doc.akka.io/reference/views/syntax/from.html)*