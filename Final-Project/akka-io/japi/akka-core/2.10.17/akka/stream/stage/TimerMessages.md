---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/TimerMessages.Timer.html
title: TimerMessages.Timer
---

# TimerMessages.Timer

## Content

Package [akka.stream.stage](package-summary.html)
## Class TimerMessages.Timer

- java.lang.Object
- - akka.stream.stage.TimerMessages.Timer

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[TimerMessages](TimerMessages.html "class in akka.stream.stage")

---

```
public static final class TimerMessages.Timer
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.stage.TimerMessages.Timer)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Timer](#%3Cinit%3E(int,akka.actor.Cancellable))​(int id,  [Cancellable](../../actor/Cancellable.html "interface in akka.actor") task)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage")` | `[copy](#copy(int,akka.actor.Cancellable))​(int id,  [Cancellable](../../actor/Cancellable.html "interface in akka.actor") task)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `[Cancellable](../../actor/Cancellable.html "interface in akka.actor")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[id](#id())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[Cancellable](../../actor/Cancellable.html "interface in akka.actor")` | `[task](#task())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Timer
		
		
		
		```
		public Timer​(int id,
		             [Cancellable](../../actor/Cancellable.html "interface in akka.actor") task)
		```

	- ### Method Detail
	
	
	
		- #### id
		
		
		
		```
		public int id()
		```
		- #### task
		
		
		
		```
		public [Cancellable](../../actor/Cancellable.html "interface in akka.actor") task()
		```
		- #### copy
		
		
		
		```
		public [TimerMessages.Timer](TimerMessages.Timer.html "class in akka.stream.stage") copy​(int id,
		                                [Cancellable](../../actor/Cancellable.html "interface in akka.actor") task)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [Cancellable](../../actor/Cancellable.html "interface in akka.actor") copy$default$2()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/TimerMessages.Timer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/TimerMessages.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/TimerMessages.Timer.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/stage/TimerMessages.Timer.html)*