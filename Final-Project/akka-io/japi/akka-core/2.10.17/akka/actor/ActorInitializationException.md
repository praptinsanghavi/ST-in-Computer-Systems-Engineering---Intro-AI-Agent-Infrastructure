---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorInitializationException.html
title: ActorInitializationException
---

# ActorInitializationException

## Content

Package [akka.actor](package-summary.html)
## Class ActorInitializationException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.actor.ActorInitializationException

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[PostRestartException](PostRestartException.html "class in akka.actor")`, `[PreRestartException](PreRestartException.html "class in akka.actor")`

---

```
public class ActorInitializationException
extends [AkkaException](../AkkaException.html "class in akka")
```

An ActorInitializationException is thrown when the initialization logic for an Actor fails.
 
 There is an extractor which works for ActorInitializationException and its subtypes:
 

```

 ex match {
   case ActorInitializationException(actor, message, cause) => ...
 }
 
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorInitializationException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Modifier | Constructor | Description |
	| `protected` | `[ActorInitializationException](#%3Cinit%3E(akka.actor.ActorRef,java.lang.String,java.lang.Throwable))​([ActorRef](ActorRef.html "class in akka.actor") actor,  java.lang.String message,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getActor](#getActor())()` |  |
	| `static scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.ActorInitializationException))​([ActorInitializationException](ActorInitializationException.html "class in akka.actor") ex)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorInitializationException
		
		
		
		```
		protected ActorInitializationException​([ActorRef](ActorRef.html "class in akka.actor") actor,
		                                       java.lang.String message,
		                                       java.lang.Throwable cause)
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.String,​java.lang.Throwable>> unapply​([ActorInitializationException](ActorInitializationException.html "class in akka.actor") ex)
		```
		- #### getActor
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") getActor()
		```

## Code Examples

### Example 1: Class ActorInitializationException

```text
ex match {
   case ActorInitializationException(actor, message, cause) => ...
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PostRestartException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PreRestartException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorInitializationException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorInitializationException.html)*