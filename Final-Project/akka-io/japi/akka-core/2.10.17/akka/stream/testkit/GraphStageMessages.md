---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/GraphStageMessages.StageFailure.html
title: GraphStageMessages.StageFailure
---

# GraphStageMessages.StageFailure

## Content

Package [akka.stream.testkit](package-summary.html)
## Class GraphStageMessages.StageFailure

- java.lang.Object
- - akka.stream.testkit.GraphStageMessages.StageFailure

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[GraphStageMessages](GraphStageMessages.html "class in akka.stream.testkit")

---

```
public static class GraphStageMessages.StageFailure
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Sent to the probe when the operator callback threw an exception
 param: operation The operation that failed

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.testkit.GraphStageMessages.StageFailure)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StageFailure](#%3Cinit%3E(akka.stream.testkit.GraphStageMessages.StageMessage,java.lang.Throwable))​([GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit") operation,  java.lang.Throwable exception)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[GraphStageMessages.StageFailure](GraphStageMessages.StageFailure.html "class in akka.stream.testkit")` | `[copy](#copy(akka.stream.testkit.GraphStageMessages.StageMessage,java.lang.Throwable))​([GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit") operation,  java.lang.Throwable exception)` |  |
	| `[GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit")` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Throwable` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[exception](#exception())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit")` | `[operation](#operation())()` |  |
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
	
	
	
		- #### StageFailure
		
		
		
		```
		public StageFailure​([GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit") operation,
		                    java.lang.Throwable exception)
		```

	- ### Method Detail
	
	
	
		- #### operation
		
		
		
		```
		public [GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit") operation()
		```
		- #### exception
		
		
		
		```
		public java.lang.Throwable exception()
		```
		- #### copy
		
		
		
		```
		public [GraphStageMessages.StageFailure](GraphStageMessages.StageFailure.html "class in akka.stream.testkit") copy​([GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit") operation,
		                                            java.lang.Throwable exception)
		```
		- #### copy$default$1
		
		
		
		```
		public [GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public java.lang.Throwable copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/GraphStageMessages.StageFailure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/GraphStageMessages.StageMessage.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/GraphStageMessages.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/GraphStageMessages.StageFailure.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/testkit/GraphStageMessages.StageFailure.html)*