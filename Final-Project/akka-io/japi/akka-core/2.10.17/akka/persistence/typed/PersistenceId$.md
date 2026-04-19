---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId$.html
title: PersistenceId$
---

# PersistenceId$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class PersistenceId$

- java.lang.Object
- - akka.persistence.typed.PersistenceId$

- ---

```
public class PersistenceId$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PersistenceId$](PersistenceId$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceId$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by  concatenating them with `|` separator. |
	| `[PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId,  java.lang.String separator)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by  concatenating them with the `separator`. |
	| `java.lang.String` | `[concat](#concat(java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId)` | Constructs a persistence id `String` from the given `entityTypeHint` and `entityId` by  concatenating them with `|` separator. |
	| `java.lang.String` | `[concat](#concat(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId,  java.lang.String separator)` | Constructs a persistence id `String` from the given `entityTypeHint` and `entityId` by  concatenating them with the `separator`. |
	| `java.lang.String` | `[DefaultSeparator](#DefaultSeparator())()` | Default separator character used for concatenating a `typeHint` with `entityId` to construct unique persistenceId. |
	| `java.lang.String` | `[extractEntityId](#extractEntityId(java.lang.String))​(java.lang.String id)` | Extract the `entityId` from a persistence id String with the default separator `|`. |
	| `java.lang.String` | `[extractEntityType](#extractEntityType(java.lang.String))​(java.lang.String id)` | Extract the `entityTypeHint` from a persistence id String with the default separator `|`. |
	| `[PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[of](#of(java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by  concatenating them with `|` separator. |
	| `[PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[of](#of(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String entityTypeHint,  java.lang.String entityId,  java.lang.String separator)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") from the given `entityTypeHint` and `entityId` by  concatenating them with the `separator`. |
	| `[PersistenceId](PersistenceId.html "class in akka.persistence.typed")` | `[ofUniqueId](#ofUniqueId(java.lang.String))​(java.lang.String id)` | Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") with `id` as the full unique identifier. |
	| `scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[unapply](#unapply(akka.persistence.typed.PersistenceId))​([PersistenceId](PersistenceId.html "class in akka.persistence.typed") persistenceId)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PersistenceId$](PersistenceId$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PersistenceId$
		
		
		
		```
		public PersistenceId$()
		```

	- ### Method Detail
	
	
	
		- #### DefaultSeparator
		
		
		
		```
		public java.lang.String DefaultSeparator()
		```
		
		Default separator character used for concatenating a `typeHint` with `entityId` to construct unique persistenceId.
		 This must be same as in Lagom's `scaladsl.PersistentEntity`, for compatibility. No separator is used
		 in Lagom's `javadsl.PersistentEntity` so for compatibility with that the `""` separator must be used instead.
		- #### apply
		
		
		
		```
		public [PersistenceId](PersistenceId.html "class in akka.persistence.typed") apply​(java.lang.String entityTypeHint,
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
		public [PersistenceId](PersistenceId.html "class in akka.persistence.typed") apply​(java.lang.String entityTypeHint,
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
		public [PersistenceId](PersistenceId.html "class in akka.persistence.typed") of​(java.lang.String entityTypeHint,
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
		public [PersistenceId](PersistenceId.html "class in akka.persistence.typed") of​(java.lang.String entityTypeHint,
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
		public java.lang.String concat​(java.lang.String entityTypeHint,
		                               java.lang.String entityId)
		```
		
		Constructs a persistence id `String` from the given `entityTypeHint` and `entityId` by
		 concatenating them with `|` separator.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the `entityTypeHint` or `entityId` contains `|`
		- #### concat
		
		
		
		```
		public java.lang.String concat​(java.lang.String entityTypeHint,
		                               java.lang.String entityId,
		                               java.lang.String separator)
		```
		
		Constructs a persistence id `String` from the given `entityTypeHint` and `entityId` by
		 concatenating them with the `separator`.
		 
		
		Throws:
		`java.lang.IllegalArgumentException` \- if the `entityTypeHint` or `entityId` contains `separator`
		- #### ofUniqueId
		
		
		
		```
		public [PersistenceId](PersistenceId.html "class in akka.persistence.typed") ofUniqueId​(java.lang.String id)
		```
		
		Constructs a [`PersistenceId`](PersistenceId.html "class in akka.persistence.typed") with `id` as the full unique identifier.
		- #### extractEntityType
		
		
		
		```
		public java.lang.String extractEntityType​(java.lang.String id)
		```
		
		Extract the `entityTypeHint` from a persistence id String with the default separator `|`.
		 If the separator `|` is not found it return the empty String (`""`).
		- #### extractEntityId
		
		
		
		```
		public java.lang.String extractEntityId​(java.lang.String id)
		```
		
		Extract the `entityId` from a persistence id String with the default separator `|`.
		 If the separator `|` is not found it return the `id`.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> unapply​([PersistenceId](PersistenceId.html "class in akka.persistence.typed") persistenceId)
		```

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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId$.html)*