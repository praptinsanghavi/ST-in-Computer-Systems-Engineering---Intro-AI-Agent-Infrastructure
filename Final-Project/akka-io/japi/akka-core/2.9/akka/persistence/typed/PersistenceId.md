---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/PersistenceId.html
title: PersistenceId
---

# PersistenceId

## Content

Package [akka.persistence.typed](package-summary.html)
## Class PersistenceId

- java.lang.Object
- - akka.persistence.typed.PersistenceId

- ---

```
public final class PersistenceId
extends java.lang.Object
```

Unique identifier in the backend data store (journal and snapshot store) of the
 persistent actor.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceId](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by  concatenating them with `|` separator. |
	| `static [PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId,  java.lang.String separator)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by  concatenating them with the `separator`. |
	| `static java.lang.String` | `[concat](#concat(java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId)` | Constructs a persistence id `String` from the given `entityTypeHint` and `entityId` by  concatenating them with `|` separator. |
	| `static java.lang.String` | `[concat](#concat(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId,  java.lang.String separator)` | Constructs a persistence id `String` from the given `entityTypeHint` and `entityId` by  concatenating them with the `separator`. |
	| `static java.lang.String` | `[DefaultSeparator](#DefaultSeparator())()` | Default separator character used for concatenating a `typeHint` with `entityId` to construct unique persistenceId. |
	| `java.lang.String` | `[entityId](#entityId())()` |  |
	| `java.lang.String` | `[entityTypeHint](#entityTypeHint())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `static java.lang.String` | `[extractEntityId](#extractEntityId(java.lang.String))​(java.lang.String id)` | Extract the `entityId` from a persistence id String with the default separator `|`. |
	| `static java.lang.String` | `[extractEntityType](#extractEntityType(java.lang.String))​(java.lang.String id)` | Extract the `entityTypeHint` from a persistence id String with the default separator `|`. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[id](#id())()` |  |
	| `static [PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[of](#of(java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by  concatenating them with `|` separator. |
	| `static [PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[of](#of(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId,  java.lang.String separator)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by  concatenating them with the `separator`. |
	| `static [PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[ofUniqueId](#ofUniqueId(java.lang.String))​(java.lang.String id)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") with `id` as the full unique identifier. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.persistence.typed.PersistenceId))​([PersistenceId](PersistenceId.html "class in akka.persistence.typed") persistenceId)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceId
		
		
		
		```
		public PersistenceId()
		```

	- ### Method Detail
	
	
	
		- #### DefaultSeparator
		
		
		
		```
		public static java.lang.String DefaultSeparator()
		```
		
		Default separator character used for concatenating a `typeHint` with `entityId` to construct unique persistenceId.
		 This must be same as in Lagom's `scaladsl.PersistentEntity`, for compatibility. No separator is used
		 in Lagom's `javadsl.PersistentEntity` so for compatibility with that the `""` separator must be used instead.
		- #### apply
		
		
		
		```
		public static [PersistenceId](PersistenceId.html "class in akka.persistence.typed") apply​(java.lang.String entityTypeHint,
		                                  java.lang.String entityId)
		```
		
		Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by
		 concatenating them with `|` separator.
		 
		 Cluster Sharding is often used together with `EventSourcedBehavior` for the entities.
		 The `PersistenceId` of the `EventSourcedBehavior` can typically be constructed with:
		 
		
		
		```
		
		 PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId)
		 
		```
		
		
		 That format of the `PersistenceId` is not mandatory and only provided as a convenience of
		 a "standardized" format.
		 
		
		
		 Another separator can be defined by using the `apply` that takes a `separator` parameter.
		 
		
		
		 The `|` separator is also used in Lagom's `scaladsl.PersistentEntity` but no separator is used
		 in Lagom's `javadsl.PersistentEntity`. For compatibility with Lagom's `javadsl.PersistentEntity`
		 you should use `""` as the separator.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the `entityTypeHint` or `entityId` contains `|`
		- #### apply
		
		
		
		```
		public static [PersistenceId](PersistenceId.html "class in akka.persistence.typed") apply​(java.lang.String entityTypeHint,
		                                  java.lang.String entityId,
		                                  java.lang.String separator)
		```
		
		Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by
		 concatenating them with the `separator`.
		 
		 Cluster Sharding is often used together with `EventSourcedBehavior` for the entities.
		 The `PersistenceId` of the `EventSourcedBehavior` can typically be constructed with:
		 
		
		
		```
		
		 PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId)
		 
		```
		
		
		 That format of the `PersistenceId` is not mandatory and only provided as a convenience of
		 a "standardized" format.
		 
		
		
		 The default separator `|` is used by the `apply` that doesn't take a `separator` parameter.
		 
		
		
		 The `|` separator is also used in Lagom's `scaladsl.PersistentEntity` but no separator is used
		 in Lagom's `javadsl.PersistentEntity`. For compatibility with Lagom's `javadsl.PersistentEntity`
		 you should use `""` as the separator.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the `entityTypeHint` or `entityId` contains `separator`
		- #### of
		
		
		
		```
		public static [PersistenceId](PersistenceId.html "class in akka.persistence.typed") of​(java.lang.String entityTypeHint,
		                               java.lang.String entityId)
		```
		
		Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by
		 concatenating them with `|` separator.
		 
		 Cluster Sharding is often used together with `EventSourcedBehavior` for the entities.
		 The `PersistenceId` of the `EventSourcedBehavior` can typically be constructed with:
		 
		
		
		```
		
		 PersistenceId.of(entityContext.getEntityTypeKey().name(), entityContext.getEntityId())
		 
		```
		
		
		 That format of the `PersistenceId` is not mandatory and only provided as a convenience of
		 a "standardized" format.
		 
		
		
		 Another separator can be defined by using the `PersistenceId.of` that takes a `separator` parameter.
		 
		
		
		 The `|` separator is also used in Lagom's `scaladsl.PersistentEntity` but no separator is used
		 in Lagom's `javadsl.PersistentEntity`. For compatibility with Lagom's `javadsl.PersistentEntity`
		 you should use `""` as the separator.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the `entityTypeHint` or `entityId` contains `|`
		- #### of
		
		
		
		```
		public static [PersistenceId](PersistenceId.html "class in akka.persistence.typed") of​(java.lang.String entityTypeHint,
		                               java.lang.String entityId,
		                               java.lang.String separator)
		```
		
		Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by
		 concatenating them with the `separator`.
		 
		 Cluster Sharding is often used together with `EventSourcedBehavior` for the entities.
		 The `PersistenceId` of the `EventSourcedBehavior` can typically be constructed with:
		 
		
		
		```
		
		 PersistenceId.of(entityContext.getEntityTypeKey().name(), entityContext.getEntityId())
		 
		```
		
		
		 That format of the `PersistenceId` is not mandatory and only provided as a convenience of
		 a "standardized" format.
		 
		
		
		 The default separator `|` is used by the `apply` that doesn't take a `separator` parameter.
		 
		
		
		 The `|` separator is also used in Lagom's `scaladsl.PersistentEntity` but no separator is used
		 in Lagom's `javadsl.PersistentEntity`. For compatibility with Lagom's `javadsl.PersistentEntity`
		 you should use `""` as the separator.
		 
		
		
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the `entityTypeHint` or `entityId` contains `separator`
		- #### concat
		
		
		
		```
		public static java.lang.String concat​(java.lang.String entityTypeHint,
		                                      java.lang.String entityId)
		```
		
		Constructs a persistence id `String` from the given `entityTypeHint` and `entityId` by
		 concatenating them with `|` separator.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the `entityTypeHint` or `entityId` contains `|`
		- #### concat
		
		
		
		```
		public static java.lang.String concat​(java.lang.String entityTypeHint,
		                                      java.lang.String entityId,
		                                      java.lang.String separator)
		```
		
		Constructs a persistence id `String` from the given `entityTypeHint` and `entityId` by
		 concatenating them with the `separator`.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the `entityTypeHint` or `entityId` contains `separator`
		- #### ofUniqueId
		
		
		
		```
		public static [PersistenceId](PersistenceId.html "class in akka.persistence.typed") ofUniqueId​(java.lang.String id)
		```
		
		Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") with `id` as the full unique identifier.
		- #### extractEntityType
		
		
		
		```
		public static java.lang.String extractEntityType​(java.lang.String id)
		```
		
		Extract the `entityTypeHint` from a persistence id String with the default separator `|`.
		 If the separator `|` is not found it return the empty String (`""`).
		- #### extractEntityId
		
		
		
		```
		public static java.lang.String extractEntityId​(java.lang.String id)
		```
		
		Extract the `entityId` from a persistence id String with the default separator `|`.
		 If the separator `|` is not found it return the `id`.
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​([PersistenceId](PersistenceId.html "class in akka.persistence.typed") persistenceId)
		```
		- #### id
		
		
		
		```
		public java.lang.String id()
		```
		- #### entityTypeHint
		
		
		
		```
		public java.lang.String entityTypeHint()
		```
		- #### entityId
		
		
		
		```
		public java.lang.String entityId()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`

## Code Examples

### Example 1: apply

```text
PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId)
```

### Example 2: apply

```text
PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId)
```

### Example 3: of

```text
PersistenceId.of(entityContext.getEntityTypeKey().name(), entityContext.getEntityId())
```

### Example 4: of

```text
PersistenceId.of(entityContext.getEntityTypeKey().name(), entityContext.getEntityId())
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/PersistenceId.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/typed/PersistenceId.html)*