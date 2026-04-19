---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime.html
title: LwwTime
---

# LwwTime

## Content

Package [akka.persistence.typed.crdt](package-summary.html)
## Class LwwTime

- java.lang.Object
- - akka.persistence.typed.crdt.LwwTime

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class LwwTime
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Utility class for comparing timestamp replica
 identifier when implementing last\-writer wins.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.crdt.LwwTime)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LwwTime](#%3Cinit%3E(long,akka.persistence.typed.ReplicaId))​(long timestamp,  [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")` | `[apply](#apply(long,akka.persistence.typed.ReplicaId))​(long timestamp,  [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")` | `[copy](#copy(long,akka.persistence.typed.ReplicaId))​(long timestamp,  [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)` |  |
	| `long` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[LwwTime](LwwTime.html "class in akka.persistence.typed.crdt")` | `[increase](#increase(long,akka.persistence.typed.ReplicaId))​(long t,  [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId)` | Create a new `LwwTime` that has a `timestamp` that is  `max` of the given timestamp and previous timestamp \+ 1,  i.e. |
	| `boolean` | `[isAfter](#isAfter(akka.persistence.typed.crdt.LwwTime))​([LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") other)` | Compare this `LwwTime` with the `other`. |
	| `[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")` | `[originReplica](#originReplica())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")>>` | `[unapply](#unapply(akka.persistence.typed.crdt.LwwTime))​([LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### LwwTime
		
		
		
		```
		public LwwTime​(long timestamp,
		               [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") apply​(long timestamp,
		                            [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<java.lang.Object,​[ReplicaId](../ReplicaId.html "class in akka.persistence.typed")>> unapply​([LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") x$0)
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### originReplica
		
		
		
		```
		public [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica()
		```
		- #### increase
		
		
		
		```
		public [LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") increase​(long t,
		                        [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") replicaId)
		```
		
		Create a new `LwwTime` that has a `timestamp` that is
		 `max` of the given timestamp and previous timestamp \+ 1,
		 i.e. monotonically increasing.
		- #### isAfter
		
		
		
		```
		public boolean isAfter​([LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") other)
		```
		
		Compare this `LwwTime` with the `other`.
		 Greatest timestamp wins. If both timestamps are
		 equal the `dc` identifiers are compared and the
		 one sorted first in alphanumeric order wins.
		- #### copy
		
		
		
		```
		public [LwwTime](LwwTime.html "class in akka.persistence.typed.crdt") copy​(long timestamp,
		                    [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") originReplica)
		```
		- #### copy$default$1
		
		
		
		```
		public long copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ReplicaId](../ReplicaId.html "class in akka.persistence.typed") copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/LwwTime.html)*