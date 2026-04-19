---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/ThisActorSystemQuarantinedEvent.html
title: ThisActorSystemQuarantinedEvent
---

# ThisActorSystemQuarantinedEvent

## Content

Package [akka.remote.artery](package-summary.html)
## Class ThisActorSystemQuarantinedEvent

- java.lang.Object
- - akka.remote.artery.ThisActorSystemQuarantinedEvent

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ThisActorSystemQuarantinedEvent
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.artery.ThisActorSystemQuarantinedEvent)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThisActorSystemQuarantinedEvent](#%3Cinit%3E(akka.remote.UniqueAddress,akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress,  [UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery")` | `[apply](#apply(akka.remote.UniqueAddress,akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress,  [UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery")` | `[copy](#copy(akka.remote.UniqueAddress,akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress,  [UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress)` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.remote")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.remote")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.remote")` | `[localAddress](#localAddress())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.remote")` | `[remoteAddress](#remoteAddress())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple2<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​[UniqueAddress](../UniqueAddress.html "class in akka.remote")>>` | `[unapply](#unapply(akka.remote.artery.ThisActorSystemQuarantinedEvent))​([ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ThisActorSystemQuarantinedEvent
		
		
		
		```
		public ThisActorSystemQuarantinedEvent​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress,
		                                       [UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery") apply​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress,
		                                                    [UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple2<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​[UniqueAddress](../UniqueAddress.html "class in akka.remote")>> unapply​([ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery") x$0)
		```
		- #### localAddress
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress()
		```
		- #### remoteAddress
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [ThisActorSystemQuarantinedEvent](ThisActorSystemQuarantinedEvent.html "class in akka.remote.artery") copy​([UniqueAddress](../UniqueAddress.html "class in akka.remote") localAddress,
		                                            [UniqueAddress](../UniqueAddress.html "class in akka.remote") remoteAddress)
		```
		- #### copy$default$1
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.remote") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.remote") copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/ThisActorSystemQuarantinedEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/ThisActorSystemQuarantinedEvent.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/ThisActorSystemQuarantinedEvent.html)*