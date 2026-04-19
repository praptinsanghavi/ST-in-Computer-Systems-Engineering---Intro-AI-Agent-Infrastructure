---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/PoisonPill.html
title: PoisonPill
---

# PoisonPill

## Content

Package [akka.actor](package-summary.html)
## Class PoisonPill

- java.lang.Object
- - akka.actor.PoisonPill

- All Implemented Interfaces:
`[AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor")`, `[DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor")`, `[PossiblyHarmful](PossiblyHarmful.html "interface in akka.actor")`, `java.io.Serializable`

Direct Known Subclasses:
`[PoisonPill$](PoisonPill$.html "class in akka.actor")`

---

```
public abstract class PoisonPill
extends java.lang.Object
implements [AutoReceivedMessage](AutoReceivedMessage.html "interface in akka.actor"), [PossiblyHarmful](PossiblyHarmful.html "interface in akka.actor"), [DeadLetterSuppression](DeadLetterSuppression.html "interface in akka.actor")
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.PoisonPill)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoisonPill](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static [PoisonPill$](PoisonPill$.html "class in akka.actor")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
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
	
	
	
		- #### PoisonPill
		
		
		
		```
		public PoisonPill()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [PoisonPill$](PoisonPill$.html "class in akka.actor") getInstance()
		```
		
		Java API: get the singleton instance
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

- https://doc.akka.io/japi/akka/current/akka/actor/AutoReceivedMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka/current/akka/actor/PoisonPill$.html
- https://doc.akka.io/japi/akka/current/akka/actor/PossiblyHarmful.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/PoisonPill.html](https://doc.akka.io/japi/akka/current/akka/actor/PoisonPill.html)*