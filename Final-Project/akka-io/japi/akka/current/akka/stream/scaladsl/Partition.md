---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:44:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition.PartitionOutOfBoundsException.html
title: Partition.PartitionOutOfBoundsException
---

# Partition.PartitionOutOfBoundsException

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Partition.PartitionOutOfBoundsException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - java.lang.IndexOutOfBoundsException
				- - akka.stream.scaladsl.Partition.PartitionOutOfBoundsException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

Enclosing class:
[Partition](Partition.html "class in akka.stream.scaladsl")\<[T](Partition.html "type parameter in Partition")\>

---

```
public static class Partition.PartitionOutOfBoundsException
extends java.lang.IndexOutOfBoundsException
implements scala.util.control.NoStackTrace, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.scaladsl.Partition.PartitionOutOfBoundsException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PartitionOutOfBoundsException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Partition.PartitionOutOfBoundsException](Partition.PartitionOutOfBoundsException.html "class in akka.stream.scaladsl")` | `[copy](#copy(java.lang.String))​(java.lang.String msg)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[msg](#msg())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### PartitionOutOfBoundsException
		
		
		
		```
		public PartitionOutOfBoundsException​(java.lang.String msg)
		```

	- ### Method Detail
	
	
	
		- #### msg
		
		
		
		```
		public java.lang.String msg()
		```
		- #### copy
		
		
		
		```
		public [Partition.PartitionOutOfBoundsException](Partition.PartitionOutOfBoundsException.html "class in akka.stream.scaladsl") copy​(java.lang.String msg)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition.PartitionOutOfBoundsException.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition.PartitionOutOfBoundsException.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Partition.PartitionOutOfBoundsException.html)*