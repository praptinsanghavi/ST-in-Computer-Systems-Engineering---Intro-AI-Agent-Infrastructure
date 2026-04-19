---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html
title: StreamSubscriptionTimeoutTerminationMode.NoopTermination$
---

# StreamSubscriptionTimeoutTerminationMode.NoopTermination$

## Content

Package [akka.stream](package-summary.html)
## Class StreamSubscriptionTimeoutTerminationMode.NoopTermination$

- java.lang.Object
- - [akka.stream.StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")
	- - akka.stream.StreamSubscriptionTimeoutTerminationMode.NoopTermination$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")

---

```
public static class StreamSubscriptionTimeoutTerminationMode.NoopTermination$
extends [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.StreamSubscriptionTimeoutTerminationMode.NoopTermination$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")
		
		
		`[StreamSubscriptionTimeoutTerminationMode.CancelTermination$](StreamSubscriptionTimeoutTerminationMode.CancelTermination$.html "class in akka.stream"), [StreamSubscriptionTimeoutTerminationMode.NoopTermination$](StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html "class in akka.stream"), [StreamSubscriptionTimeoutTerminationMode.WarnTermination$](StreamSubscriptionTimeoutTerminationMode.WarnTermination$.html "class in akka.stream")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamSubscriptionTimeoutTerminationMode.NoopTermination$](StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoopTermination$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "class in akka.stream")
		
		
		`[cancel](StreamSubscriptionTimeoutTerminationMode.html#cancel()), [noop](StreamSubscriptionTimeoutTerminationMode.html#noop()), [warn](StreamSubscriptionTimeoutTerminationMode.html#warn())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamSubscriptionTimeoutTerminationMode.NoopTermination$](StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoopTermination$
		
		
		
		```
		public NoopTermination$()
		```

	- ### Method Detail
	
	
	
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.CancelTermination$.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.WarnTermination$.html
- https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamSubscriptionTimeoutTerminationMode.NoopTermination$.html)*