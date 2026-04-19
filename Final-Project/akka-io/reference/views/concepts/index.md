---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:18Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/concepts/index.html
title: 'View Concepts :: Akka Documentation'
---

# View Concepts :: Akka Documentation

## Content

# View Concepts

This section covers the key concepts that underpin Akka Views, explaining how they work and how to use them effectively in your applications.

## Core Concepts

### Data Structure and Access

- [Table Updaters](table-updaters.html) \- The fundamental building blocks of Views, defining data sources and table structures
- [Data Types](data-types.html) \- The supported data types in Views and how they map between Java and the query language
- [Result Mapping](result-mapping.html) \- How query results are transformed into Java objects in your application

### Specialized Data Handling

- [Optional Fields](optional-fields.html) \- Working with values that may or may not be present
- [Array Types](array-types.html) \- Handling collections of values within a single view row

### Advanced Features

- [Advanced Views](advanced-views.html) \- Creating sophisticated views with multiple tables, joins, and complex data structures

## Understanding Views

Views in Akka provide a flexible way to access your data using patterns beyond simple key\-based lookups. They create queryable projections of your entities that can be optimized for specific access patterns.

### How Views Work

1. **Data Consumption**: Views subscribe to events or state changes from entities or topics
2. **Transformation**: These events/changes are transformed into rows in view tables
3. **Indexing**: Views automatically create indexes based on your queries
4. **Querying**: The view query language allows you to retrieve and filter this data

### View Benefits

- **Flexible Access Patterns**: Access data by any field, not just entity IDs
- **Optimized Queries**: Views create indexes for efficient querying based on your needs
- **Joined Data**: Combine data from multiple entities into unified query results
- **Custom Projections**: Transform entity data into formats optimized for reading

### View Characteristics

- **Eventually Consistent**: Views are eventually consistent with their source entities
- **Read Optimized**: Views are designed for efficient reading, not for updates
- **Declarative Definition**: Views are defined by their queries and transformations
- **Automatic Maintenance**: Updates to views happen automatically as entities change

## From Entity to View

Understanding the relationship between entities and views is key to effective modeling:

### Entity Focus vs. View Focus

- **Entities**: Focus on business logic, command handling, and state consistency
- **Views**: Focus on data access patterns, querying, and read optimizations

### Data Flow

1. Clients send commands to entities
2. Entities process commands and emit events or state changes
3. Views consume these events/changes and update their tables
4. Clients query views to read data in the desired format

### Creating Effective Views

- Define views based on access patterns in your application
- Consider different views for different query needs
- Design your table structure and queries together
- Balance normalization and denormalization based on query patterns

## Related Documentation

- [View Query Syntax](../syntax/index.html) \- Complete reference for the View query language
- [Implementing Views](../../../sdk/views.html) \- How to implement Views in your application

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/advanced-views.html
- https://doc.akka.io/reference/views/concepts/array-types.html
- https://doc.akka.io/reference/views/concepts/data-types.html
- https://doc.akka.io/reference/views/concepts/optional-fields.html
- https://doc.akka.io/reference/views/concepts/result-mapping.html
- https://doc.akka.io/reference/views/concepts/table-updaters.html
- https://doc.akka.io/reference/views/syntax/index.html
- https://doc.akka.io/sdk/views.html

---
*Source: [https://doc.akka.io/reference/views/concepts/index.html](https://doc.akka.io/reference/views/concepts/index.html)*