---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:05:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/SubscriptionWithCancelException.StageWasCompleted$.html
title: SubscriptionWithCancelException.StageWasCompleted$
---

# SubscriptionWithCancelException.StageWasCompleted$

## Content

Package [akka.stream](package-summary.html)
## Class SubscriptionWithCancelException.StageWasCompleted$

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.stream.SubscriptionWithCancelException.NonFailureCancellation](SubscriptionWithCancelException.NonFailureCancellation.html "class in akka.stream")
				- - akka.stream.SubscriptionWithCancelException.StageWasCompleted$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`, `scala.util.control.NoStackTrace`

Enclosing interface:
[SubscriptionWithCancelException](SubscriptionWithCancelException.html "interface in akka.stream")

---

```
public static class SubscriptionWithCancelException.StageWasCompleted$
extends [SubscriptionWithCancelException.NonFailureCancellation](SubscriptionWithCancelException.NonFailureCancellation.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.SubscriptionWithCancelException.StageWasCompleted$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SubscriptionWithCancelException.StageWasCompleted$](SubscriptionWithCancelException.StageWasCompleted$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StageWasCompleted$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SubscriptionWithCancelException.StageWasCompleted$](SubscriptionWithCancelException.StageWasCompleted$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StageWasCompleted$
		
		
		
		```
		public StageWasCompleted$()
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/SubscriptionWithCancelException.NonFailureCancellation.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SubscriptionWithCancelException.StageWasCompleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SubscriptionWithCancelException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/SubscriptionWithCancelException.StageWasCompleted$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/SubscriptionWithCancelException.StageWasCompleted$.html)*