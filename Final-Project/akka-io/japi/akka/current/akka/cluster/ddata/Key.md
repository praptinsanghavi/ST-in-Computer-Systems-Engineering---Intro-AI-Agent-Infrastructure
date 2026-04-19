---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:00:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.html
title: Key
---

# Key

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Key\<T extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")\>

- java.lang.Object
- - akka.cluster.ddata.Key\<T\>

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[FlagKey](FlagKey.html "class in akka.cluster.ddata")`, `[GCounterKey](GCounterKey.html "class in akka.cluster.ddata")`, `[GSetKey](GSetKey.html "class in akka.cluster.ddata")`, `[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")`, `[LWWMapKey](LWWMapKey.html "class in akka.cluster.ddata")`, `[LWWRegisterKey](LWWRegisterKey.html "class in akka.cluster.ddata")`, `[ORMapKey](ORMapKey.html "class in akka.cluster.ddata")`, `[ORMultiMapKey](ORMultiMapKey.html "class in akka.cluster.ddata")`, `[ORSetKey](ORSetKey.html "class in akka.cluster.ddata")`, `[PNCounterKey](PNCounterKey.html "class in akka.cluster.ddata")`, `[PNCounterMapKey](PNCounterMapKey.html "class in akka.cluster.ddata")`

---

```
public abstract class Key<T extends [ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>
extends java.lang.Object
implements java.io.Serializable
```

Key for the key\-value data in [`Replicator`](Replicator.html "class in akka.cluster.ddata"). The type of the data value
 is defined in the key. Keys are compared equal if the `id` strings are equal,
 i.e. use unique identifiers.
 
 Specific classes are provided for the built in data types, e.g. [`ORSetKey`](ORSetKey.html "class in akka.cluster.ddata"),
 and you can create your own keys.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.Key)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Key.UnspecificKey](Key.UnspecificKey.html "class in akka.cluster.ddata")` |  |
	| `static class` | `[Key.UnspecificKey$](Key.UnspecificKey$.html "class in akka.cluster.ddata")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Key](#%3Cinit%3E(java.lang.String))​(java.lang.String id)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object o)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[id](#id())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.String>` | `[unapply](#unapply(akka.cluster.ddata.Key))​([Key](Key.html "class in akka.cluster.ddata")<?> k)` | Extract the [`id()`](#id()). |
	| `[Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")>` | `[withId](#withId(java.lang.String))​(java.lang.String newId)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Key
		
		
		
		```
		public Key​(java.lang.String id)
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.String> unapply​([Key](Key.html "class in akka.cluster.ddata")<?> k)
		```
		
		Extract the [`id()`](#id()).
		- #### id
		
		
		
		```
		public java.lang.String id()
		```
		- #### withId
		
		
		
		```
		public [Key](Key.html "class in akka.cluster.ddata")<[ReplicatedData](ReplicatedData.html "interface in akka.cluster.ddata")> withId​(java.lang.String newId)
		```
		- #### equals
		
		
		
		```
		public final boolean equals​(java.lang.Object o)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public final int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/FlagKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GCounterKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/GSetKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.UnspecificKey$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.UnspecificKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWMapKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/LWWRegisterKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORMapKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORMultiMapKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ORSetKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/PNCounterMapKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.html](https://doc.akka.io/japi/akka/current/akka/cluster/ddata/Key.html)*