---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html
title: GracefulShutdownQuarantinedEvent
---

# GracefulShutdownQuarantinedEvent

## Content

Package [akka.remote.artery](package-summary.html)
## Class GracefulShutdownQuarantinedEvent

- java.lang.Object
- - akka.remote.artery.GracefulShutdownQuarantinedEvent

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class GracefulShutdownQuarantinedEvent
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.artery.GracefulShutdownQuarantinedEvent)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GracefulShutdownQuarantinedEvent](#%3Cinit%3E(akka.remote.UniqueAddress,java.lang.String))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress,  java.lang.String reason)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery")` | `[apply](#apply(akka.remote.UniqueAddress,java.lang.String))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress,  java.lang.String reason)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery")` | `[copy](#copy(akka.remote.UniqueAddress,java.lang.String))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress,  java.lang.String reason)` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.remote")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.String` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[reason](#reason())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​java.lang.String>>` | `[unapply](#unapply(akka.remote.artery.GracefulShutdownQuarantinedEvent))​([GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery") x$0)` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.remote")` | `[uniqueAddress](#uniqueAddress())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### GracefulShutdownQuarantinedEvent
		
		
		
		```
		public GracefulShutdownQuarantinedEvent​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress,
		                                        java.lang.String reason)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery") apply​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress,
		                                                     java.lang.String reason)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​java.lang.String>> unapply​([GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery") x$0)
		```
		- #### uniqueAddress
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress()
		```
		- #### reason
		
		
		
		```
		public java.lang.String reason()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [GracefulShutdownQuarantinedEvent](GracefulShutdownQuarantinedEvent.html "class in akka.remote.artery") copy​([UniqueAddress](../UniqueAddress.html "class in akka.remote") uniqueAddress,
		                                             java.lang.String reason)
		```
		- #### copy$default$1
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.remote") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.String copy$default$2()
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

- https://doc.akka.io/japi/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/GracefulShutdownQuarantinedEvent.html)*