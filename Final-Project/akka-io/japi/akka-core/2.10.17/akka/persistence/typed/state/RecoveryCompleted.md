---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:54:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted.html
title: RecoveryCompleted
---

# RecoveryCompleted

## Content

Package [akka.persistence.typed.state](package-summary.html)
## Class RecoveryCompleted

- java.lang.Object
- - akka.persistence.typed.state.RecoveryCompleted

- All Implemented Interfaces:
`[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")`, `[DurableStateSignal](DurableStateSignal.html "interface in akka.persistence.typed.state")`

Direct Known Subclasses:
`[RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence.typed.state")`

---

```
public abstract class RecoveryCompleted
extends java.lang.Object
implements [DurableStateSignal](DurableStateSignal.html "interface in akka.persistence.typed.state")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryCompleted](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state")` | `[instance](#instance())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RecoveryCompleted
		
		
		
		```
		public RecoveryCompleted()
		```

	- ### Method Detail
	
	
	
		- #### instance
		
		
		
		```
		public static [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed.state") instance()
		```
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/DurableStateSignal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/state/RecoveryCompleted.html)*