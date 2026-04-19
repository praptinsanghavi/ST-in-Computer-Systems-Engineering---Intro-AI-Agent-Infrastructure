---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:46Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/views/concepts/table-updaters.html
title: 'Table Updaters :: Akka Documentation'
---

# Table Updaters :: Akka Documentation

## Content

# Table Updaters

Table Updaters are the core components that define and maintain view tables. They subscribe to events or state changes from entities and transform this data into queryable views. This page explains how to define and use Table Updaters in your View components.

## What are Table Updaters?

A Table Updater is a Java class defined inside your View that:

1. Specifies a data source (entity or topic)
2. Defines the structure of a view table
3. Contains logic for transforming incoming data into view rows
4. Handles updates, deletes, and other operations on the view table

## Basic Structure

A Table Updater is defined as a static inner class inside your View:

```
@Component(id = "customer-view")
public class CustomerView extends View {

  @Table("customers") // Optional table name
  @Consume.FromKeyValueEntity(CustomerEntity.class)
  public static class Customers extends TableUpdater<Customer> {
    // Transformation methods go here
  }

  // Query methods go here
}
```

For a full view sample see [Creating a View from a Key Value Entity](../../../sdk/views.html#value-entity)

## Table Naming

Table names can be specified explicitly with the `@Table` annotation:

```
@Table("customers")
public static class Customers extends TableUpdater<Customer> { }
```

For single table views the annotation is optional and is derived from the table name used in the queries in the view.

For multi table [Advanced Views](advanced-views.html) each updater must have the annotation to specify
which table name it updates.

## Data Sources

Table Updaters can consume data from different sources:

### Key Value Entities

Subscribe to state changes from Key Value Entities:

```
@Consume.FromKeyValueEntity(CustomerEntity.class)
```

For a full sample see [Creating a View from a Key Value Entity](../../../sdk/views.html#value-entity)

### Event Sourced Entities

Subscribe to events from Event Sourced Entities:

```
@Consume.FromEventSourcedEntity(CustomerEntity.class)
```

For a full sample see [Creating a View from an Event Sourced Entity](../../../sdk/views.html#event-sourced-entity)

### Workflows

Subscribe to state changes from Workflows:

```
@Consume.FromWorkflow(TransferWorkflow.class)
```

For a full sample see [Creating a View from a Workflow](../../../sdk/views.html#workflow)

### Service to service eventing

Subscribe to events from an Event Sourced entity made available by another Akka service:

```
@Consume.FromServiceStream("service-name", "stream-id")
```

For more details see [Service to Service Eventing](../../../sdk/consuming-producing.html#s2s-eventing)

### Topics

Subscribe to messages from a topic:

```
@Consume.FromTopic("customer-events")
```

For a full sample see [Creating a View from a topic](../../../sdk/views.html#topic-view)

## Generic Type Parameter

The generic type parameter of `TableUpdater<T>` defines the structure of each row in the view table:

```
public static class Customers extends TableUpdater<Customer> { }
```

This means each row in the view table will have the structure of the `Customer` class.

## Transformation Methods

Table Updaters can include an `onUpdate` method to transform incoming data. The update method is handed the incoming event,
message or update, and returns an effect describing what should happen with the table row:

```
@Consume.FromKeyValueEntity(CustomerEntity.class)
public static class CustomerSummaries extends TableUpdater<CustomerSummary> {

  public Effect<CustomerSummary> onUpdate(Customer customer) {
    return effects().updateRow(
      new CustomerSummary(
        updateContext().eventSubject().get(),
        customer.name(),
        customer.email()
      )
    );
  }
}
```

For a few examples of different table update handlers see [Implementing Views](../../../sdk/views.html)

## Effect Types

Table Updater methods return `Effect` objects that define what happens to the view table:

### Update Row

Updates or inserts a row in the view table:

```
return effects().updateRow(newRowState);
```

### Delete Row

Deletes the current row from the view table:

```
return effects().deleteRow();
```

### Ignore

Makes no changes to the view table:

```
return effects().ignore();
```

## Accessing Context

Table Updaters provide context about the current update:

### Update Context

Access information about the event or state change:

```
// Get the entity ID
String entityId = updateContext().eventSubject().get();

// Check if the event originated in the local region
boolean isLocal = updateContext().hasLocalOrigin();

// Get the region where the event originated
String originRegion = updateContext().originRegion();
```

### Row State

Access the current state of the row being updated:

```
// For immutable types, create a new instance with updated fields
return effects().updateRow(rowState().withName(nameChanged.newName()));

// For mutable types, modify and return
CustomerRow current = rowState();
current.setName(nameChanged.newName());
return effects().updateRow(current);
```

## Multi\-Table Views

A single View can define multiple Table Updaters to create a view with multiple tables:

```
@Component(id = "shop-view")
public class ShopView extends View {

  @Table("customers")
  @Consume.FromEventSourcedEntity(CustomerEntity.class)
  public static class Customers extends TableUpdater<Customer> {
    // Customer transformation methods
  }

  @Table("products")
  @Consume.FromEventSourcedEntity(ProductEntity.class)
  public static class Products extends TableUpdater<Product> {
    // Product transformation methods
  }

  @Table("orders")
  @Consume.FromKeyValueEntity(OrderEntity.class)
  public static class Orders extends TableUpdater<Order> {
    // Order transformation methods
  }

  // Query methods that can join across tables
  @Query("""
    SELECT c.name, o.*, p.name AS productName
    FROM customers AS c
    JOIN orders AS o ON c.id = o.customerId
    JOIN products AS p ON o.productId = p.id
    WHERE c.id = :customerId
    """)
  public QueryEffect<CustomerOrders> getCustomerOrders(String customerId) {
    return queryResult();
  }
}
```

For details on querying multi table views, see [Advanced Views](advanced-views.html)

## Handling Deletes

To handle entity deletions

### For Key Value Entities

Use the `@DeleteHandler` annotation:

```
@Consume.FromKeyValueEntity(CustomerEntity.class)
public static class Customers extends TableUpdater<Customer> {

  @DeleteHandler
  public Effect<Customer> onDelete() {
    return effects().deleteRow();
  }
}
```

### For Event Sourced Entities

Handle delete events explicitly:

```
@Consume.FromEventSourcedEntity(CustomerEntity.class)
public static class Customers extends TableUpdater<Customer> {

  public Effect<Customer> onEvent(CustomerEvent event) {
    return switch (event) {
      case CustomerEvent.CustomerDeleted deleted -> effects().deleteRow();
      // Handle other events
    };
  }
}
```

## Related Features

- [Data Types](data-types.html) \- Types supported in views
- [FROM clause](../syntax/from.html) \- Referencing tables in queries
- [JOIN clause](../syntax/join.html) \- Combining data from multiple tables
- [Advanced Views](advanced-views.html) \- Creating complex views

## Code Examples

### Example 1: Basic Structure

```java
@Component(id = "customer-view")
public class CustomerView extends View {

  @Table("customers") // Optional table name
  @Consume.FromKeyValueEntity(CustomerEntity.class)
  public static class Customers extends TableUpdater<Customer> {
    // Transformation methods go here
  }

  // Query methods go here
}
```

### Example 2: Table Naming

```java
@Table("customers")
public static class Customers extends TableUpdater<Customer> { }
```

### Example 3: Key Value Entities

```java
@Consume.FromKeyValueEntity(CustomerEntity.class)
```

### Example 4: Event Sourced Entities

```java
@Consume.FromEventSourcedEntity(CustomerEntity.class)
```

### Example 5: Workflows

```java
@Consume.FromWorkflow(TransferWorkflow.class)
```

### Example 6: Service to service eventing

```java
@Consume.FromServiceStream("service-name", "stream-id")
```

### Example 7: Topics

```java
@Consume.FromTopic("customer-events")
```

### Example 8: Generic Type Parameter

```java
public static class Customers extends TableUpdater<Customer> { }
```

### Example 9: Transformation Methods

```java
@Consume.FromKeyValueEntity(CustomerEntity.class)
public static class CustomerSummaries extends TableUpdater<CustomerSummary> {

  public Effect<CustomerSummary> onUpdate(Customer customer) {
    return effects().updateRow(
      new CustomerSummary(
        updateContext().eventSubject().get(),
        customer.name(),
        customer.email()
      )
    );
  }
}
```

### Example 10: Update Row

```java
return effects().updateRow(newRowState);
```

### Example 11: Delete Row

```java
return effects().deleteRow();
```

### Example 12: Ignore

```java
return effects().ignore();
```

### Example 13: Update Context

```java
// Get the entity ID
String entityId = updateContext().eventSubject().get();

// Check if the event originated in the local region
boolean isLocal = updateContext().hasLocalOrigin();

// Get the region where the event originated
String originRegion = updateContext().originRegion();
```

### Example 14: Row State

```java
// For immutable types, create a new instance with updated fields
return effects().updateRow(rowState().withName(nameChanged.newName()));

// For mutable types, modify and return
CustomerRow current = rowState();
current.setName(nameChanged.newName());
return effects().updateRow(current);
```

### Example 15: Multi-Table Views

```java
@Component(id = "shop-view")
public class ShopView extends View {

  @Table("customers")
  @Consume.FromEventSourcedEntity(CustomerEntity.class)
  public static class Customers extends TableUpdater<Customer> {
    // Customer transformation methods
  }

  @Table("products")
  @Consume.FromEventSourcedEntity(ProductEntity.class)
  public static class Products extends TableUpdater<Product> {
    // Product transformation methods
  }

  @Table("orders")
  @Consume.FromKeyValueEntity(OrderEntity.class)
  public static class Orders extends TableUpdater<Order> {
    // Order transformation methods
  }

  // Query methods that can join across tables
  @Query("""
    SELECT c.name, o.*, p.name AS productName
    FROM customers AS c
    JOIN orders AS o ON c.id = o.customerId
    JOIN products AS p ON o.productId = p.id
    WHERE c.id = :customerId
    """)
  public QueryEffect<CustomerOrders> getCustomerOrders(String customerId) {
    return queryResult();
  }
}
```

### Example 16: For Key Value Entities

```java
@Consume.FromKeyValueEntity(CustomerEntity.class)
public static class Customers extends TableUpdater<Customer> {

  @DeleteHandler
  public Effect<Customer> onDelete() {
    return effects().deleteRow();
  }
}
```

### Example 17: For Event Sourced Entities

```java
@Consume.FromEventSourcedEntity(CustomerEntity.class)
public static class Customers extends TableUpdater<Customer> {

  public Effect<Customer> onEvent(CustomerEvent event) {
    return switch (event) {
      case CustomerEvent.CustomerDeleted deleted -> effects().deleteRow();
      // Handle other events
    };
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/views/concepts/advanced-views.html
- https://doc.akka.io/reference/views/concepts/data-types.html
- https://doc.akka.io/reference/views/syntax/from.html
- https://doc.akka.io/reference/views/syntax/join.html
- https://doc.akka.io/sdk/consuming-producing.html
- https://doc.akka.io/sdk/views.html

---
*Source: [https://doc.akka.io/reference/views/concepts/table-updaters.html](https://doc.akka.io/reference/views/concepts/table-updaters.html)*