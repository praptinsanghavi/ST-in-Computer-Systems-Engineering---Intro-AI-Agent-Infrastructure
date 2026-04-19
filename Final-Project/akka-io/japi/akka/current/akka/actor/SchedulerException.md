---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/SchedulerException.html
title: SchedulerException
---

# SchedulerException

## Content

Package [akka.actor](package-summary.html)
## Class SchedulerException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.actor.SchedulerException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

---

```
public final class SchedulerException
extends [AkkaException](../AkkaException.html "class in akka")
implements scala.util.control.NoStackTrace, scala.Product, java.io.Serializable
```

This exception is thrown by Scheduler.schedule\* when scheduling is not
 possible, e.g. after shutting down the Scheduler.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.SchedulerException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SchedulerException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SchedulerException](SchedulerException.html "class in akka.actor")` | `[apply](#apply(java.lang.String))​(java.lang.String msg)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SchedulerException](SchedulerException.html "class in akka.actor")` | `[copy](#copy(java.lang.String))​(java.lang.String msg)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[msg](#msg())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.String>` | `[unapply](#unapply(akka.actor.SchedulerException))​([SchedulerException](SchedulerException.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SchedulerException
		
		
		
		```
		public SchedulerException​(java.lang.String msg)
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public static final java.lang.String toString()
		```
		- #### apply
		
		
		
		```
		public static [SchedulerException](SchedulerException.html "class in akka.actor") apply​(java.lang.String msg)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.String> unapply​([SchedulerException](SchedulerException.html "class in akka.actor") x$0)
		```
		- #### msg
		
		
		
		```
		public java.lang.String msg()
		```
		- #### copy
		
		
		
		```
		public [SchedulerException](SchedulerException.html "class in akka.actor") copy​(java.lang.String msg)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/AkkaException.html
- https://doc.akka.io/japi/akka/current/akka/actor/SchedulerException.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/SchedulerException.html](https://doc.akka.io/japi/akka/current/akka/actor/SchedulerException.html)*