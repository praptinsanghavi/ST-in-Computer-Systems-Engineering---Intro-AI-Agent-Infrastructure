---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testkit/Unthrottled$.html
title: Unthrottled$
---

# Unthrottled$

## Content

Package [akka.remote.testkit](package-summary.html)
## Class Unthrottled$

- java.lang.Object
- - akka.remote.testkit.Unthrottled$

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Unthrottled$
extends java.lang.Object
implements [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testkit.Unthrottled$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Unthrottled$](Unthrottled$.html "class in akka.remote.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Unthrottled$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[timeToAvailable](#timeToAvailable(long,int))​(long currentNanoTime,  int tokens)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Tuple2<[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​java.lang.Object>` | `[tryConsumeTokens](#tryConsumeTokens(long,int))​(long nanoTimeOfSend,  int tokens)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Unthrottled$](Unthrottled$.html "class in akka.remote.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Unthrottled$
		
		
		
		```
		public Unthrottled$()
		```

	- ### Method Detail
	
	
	
		- #### tryConsumeTokens
		
		
		
		```
		public scala.Tuple2<[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit"),​java.lang.Object> tryConsumeTokens​(long nanoTimeOfSend,
		                                                                          int tokens)
		```
		
		
		Specified by:
		`[tryConsumeTokens](ThrottleMode.html#tryConsumeTokens(long,int))` in interface `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")`
		- #### timeToAvailable
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration timeToAvailable​(long currentNanoTime,
		                                                                int tokens)
		```
		
		
		Specified by:
		`[timeToAvailable](ThrottleMode.html#timeToAvailable(long,int))` in interface `[ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit")`
		- #### getInstance
		
		
		
		```
		public [ThrottleMode](ThrottleMode.html "interface in akka.remote.testkit") getInstance()
		```
		
		Java API: get the singleton instance
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

- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/ThrottleMode.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/Unthrottled$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testkit/Unthrottled$.html](https://doc.akka.io/japi/akka/current/akka/remote/testkit/Unthrottled$.html)*