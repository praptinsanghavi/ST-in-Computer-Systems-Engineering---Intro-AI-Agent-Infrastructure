---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter.WriteAck.html
title: EventWriter.WriteAck
---

# EventWriter.WriteAck

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class EventWriter.WriteAck

- java.lang.Object
- - akka.persistence.typed.internal.EventWriter.WriteAck

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[EventWriter](EventWriter.html "class in akka.persistence.typed.internal")

---

```
public static final class EventWriter.WriteAck
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.EventWriter.WriteAck)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteAck](#%3Cinit%3E(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNumber)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal")` | `[copy](#copy(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNumber)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[sequenceNumber](#sequenceNumber())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### WriteAck
		
		
		
		```
		public WriteAck​(java.lang.String persistenceId,
		                long sequenceNumber)
		```

	- ### Method Detail
	
	
	
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		- #### sequenceNumber
		
		
		
		```
		public long sequenceNumber()
		```
		- #### copy
		
		
		
		```
		public [EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal") copy​(java.lang.String persistenceId,
		                                 long sequenceNumber)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter.WriteAck.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter.WriteAck.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/EventWriter.WriteAck.html)*