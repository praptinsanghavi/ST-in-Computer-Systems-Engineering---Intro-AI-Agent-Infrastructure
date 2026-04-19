---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:01:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState.Received.html
title: FlowMonitorState.Received
---

# FlowMonitorState.Received

## Content

Package [akka.stream](package-summary.html)
## Class FlowMonitorState.Received\<U\>

- java.lang.Object
- - akka.stream.FlowMonitorState.Received\<U\>

- All Implemented Interfaces:
`[FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[FlowMonitorState](FlowMonitorState.html "class in akka.stream")

---

```
public static final class FlowMonitorState.Received<U>
extends java.lang.Object
implements [FlowMonitorState.StreamState](FlowMonitorState.StreamState.html "interface in akka.stream")<U>, scala.Product, java.io.Serializable
```

Stream processed a message
 
 param: msg The processed message

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.FlowMonitorState.Received)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Received](#%3Cinit%3E(U))​([U](FlowMonitorState.Received.html "type parameter in FlowMonitorState.Received") msg)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<U> [FlowMonitorState.Received](FlowMonitorState.Received.html "class in akka.stream")<U>` | `[copy](#copy(U))​(U msg)` |  |
	| `<U> U` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[U](FlowMonitorState.Received.html "type parameter in FlowMonitorState.Received")` | `[msg](#msg())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Received
		
		
		
		```
		public Received​([U](FlowMonitorState.Received.html "type parameter in FlowMonitorState.Received") msg)
		```

	- ### Method Detail
	
	
	
		- #### msg
		
		
		
		```
		public [U](FlowMonitorState.Received.html "type parameter in FlowMonitorState.Received") msg()
		```
		- #### copy
		
		
		
		```
		public <U> [FlowMonitorState.Received](FlowMonitorState.Received.html "class in akka.stream")<U> copy​(U msg)
		```
		- #### copy$default$1
		
		
		
		```
		public <U> U copy$default$1()
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

- https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState.Received.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState.StreamState.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState.Received.html](https://doc.akka.io/japi/akka-core/current/akka/stream/FlowMonitorState.Received.html)*