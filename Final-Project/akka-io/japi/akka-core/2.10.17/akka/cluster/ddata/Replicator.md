---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:34:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.WriteTo.html
title: Replicator.WriteTo
---

# Replicator.WriteTo

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class Replicator.WriteTo

- java.lang.Object
- - akka.cluster.ddata.Replicator.WriteTo

- All Implemented Interfaces:
`[Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Replicator](Replicator.html "class in akka.cluster.ddata")

---

```
public static final class Replicator.WriteTo
extends java.lang.Object
implements [Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.Replicator.WriteTo)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteTo](#%3Cinit%3E(int,java.time.Duration))​(int n,  java.time.Duration timeout)` | Java API |
	| `[WriteTo](#%3Cinit%3E(int,scala.concurrent.duration.FiniteDuration))​(int n,  scala.concurrent.duration.FiniteDuration timeout)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Replicator.WriteTo](Replicator.WriteTo.html "class in akka.cluster.ddata")` | `[copy](#copy(int,scala.concurrent.duration.FiniteDuration))​(int n,  scala.concurrent.duration.FiniteDuration timeout)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[n](#n())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[timeout](#timeout())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### WriteTo
		
		
		
		```
		public WriteTo​(int n,
		               scala.concurrent.duration.FiniteDuration timeout)
		```
		- #### WriteTo
		
		
		
		```
		public WriteTo​(int n,
		               java.time.Duration timeout)
		```
		
		Java API

	- ### Method Detail
	
	
	
		- #### n
		
		
		
		```
		public int n()
		```
		- #### timeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration timeout()
		```
		
		
		Specified by:
		`[timeout](Replicator.WriteConsistency.html#timeout())` in interface `[Replicator.WriteConsistency](Replicator.WriteConsistency.html "interface in akka.cluster.ddata")`
		- #### copy
		
		
		
		```
		public [Replicator.WriteTo](Replicator.WriteTo.html "class in akka.cluster.ddata") copy​(int n,
		                               scala.concurrent.duration.FiniteDuration timeout)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.WriteConsistency.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.WriteTo.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.WriteTo.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/Replicator.WriteTo.html)*