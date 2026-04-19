---
description: 'declaration: package: akka.javasdk.annotations, annotation type: ProtoEventTypes'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:12Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/ProtoEventTypes.html
title: ProtoEventTypes
---

# ProtoEventTypes

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: ProtoEventTypes

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface ProtoEventTypes

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface ProtoEventTypes
Declares the concrete protobuf message classes used as events.

 This annotation is only needed when using protobuf messages (`GeneratedMessageV3`
 subclasses) as events. When using Java sealed interfaces for events, the event types are
 automatically discovered from the permitted subclasses.

 

Can be applied to:

 

- **Event Sourced Entities** — declares the allowed event types. If the entity tries to
 persist an event type not listed, the operation fails. The `applyEvent` handler
 accepts `GeneratedMessageV3` and uses pattern matching to handle each type.
- **Consumers** — declares the protobuf event types the consumer handles. When a handler
 method accepts `GeneratedMessageV3`, the annotation tells the SDK which concrete
 types to of messages that are expected. If another type of message arrives to the consumer
 it will fail processing it. If the annotation is not present, the types are auto\-resolved
 from the source entity's `@ProtoEventTypes` annotation if it is a local event sourced
 entity (using [`Consume.FromEventSourcedEntity`](Consume.FromEventSourcedEntity.html "annotation interface in akka.javasdk.annotations").)
- **View TableUpdaters** — same as consumers: declares the protobuf event types the
 updater handles. If omitted, types are auto\-resolved from the source entity.

Example usage on an Event Sourced Entity:

 

```

 @ComponentId("my-entity")
 @ProtoEventTypes({CustomerCreated.class, CustomerNameChanged.class})
 public class MyEntity extends EventSourcedEntity<MyState, GeneratedMessageV3> {
   // ...
 }
 
```

Example usage on a Consumer (explicit types):

 

```

 @ComponentId("my-consumer")
 @Consume.FromEventSourcedEntity(MyEntity.class)
 @ProtoEventTypes({CustomerCreated.class, CustomerNameChanged.class})
 public class MyConsumer extends Consumer {
   public Effect onEvent(GeneratedMessageV3 event) { ... }
 }
 
```

When consuming from an entity that already has `@ProtoEventTypes`, the annotation on the
 consumer or view can be omitted and the types will be resolved from the source entity
 automatically.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<? extends com.google.protobuf.GeneratedMessageV3>[]`
`[value](#value())`

The protobuf message classes used as event types.

- ## Element Details

	- ### value
	
	
	[Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<? extends com.google.protobuf.GeneratedMessageV3\>\[] value
	The protobuf message classes used as event types.
	
	Returns:
	array of protobuf message classes representing the event types

## Code Examples

### Example 1: Annotation Interface ProtoEventTypes

```text
@ComponentId("my-entity")
 @ProtoEventTypes({CustomerCreated.class, CustomerNameChanged.class})
 public class MyEntity extends EventSourcedEntity<MyState, GeneratedMessageV3> {
   // ...
 }
```

### Example 2: Annotation Interface ProtoEventTypes

```text
@ComponentId("my-consumer")
 @Consume.FromEventSourcedEntity(MyEntity.class)
 @ProtoEventTypes({CustomerCreated.class, CustomerNameChanged.class})
 public class MyConsumer extends Consumer {
   public Effect onEvent(GeneratedMessageV3 event) { ... }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromEventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/ProtoEventTypes.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/ProtoEventTypes.html)*