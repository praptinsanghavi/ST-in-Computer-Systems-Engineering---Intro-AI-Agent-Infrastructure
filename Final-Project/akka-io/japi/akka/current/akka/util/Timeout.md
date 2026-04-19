---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:50:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/util/Timeout.html
title: Timeout
---

# Timeout

## Content

Package [akka.util](package-summary.html)
## Class Timeout

- java.lang.Object
- - akka.util.Timeout

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class Timeout
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.util.Timeout)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Timeout](#%3Cinit%3E(long,java.util.concurrent.TimeUnit))​(long length,  java.util.concurrent.TimeUnit unit)` | Construct a Timeout from the given time unit and factor. |
	| `[Timeout](#%3Cinit%3E(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Timeout](Timeout.html "class in akka.util")` | `[apply](#apply(long,java.util.concurrent.TimeUnit))​(long length,  java.util.concurrent.TimeUnit unit)` | Construct a Timeout from the given time unit and factor. |
	| `static [Timeout](Timeout.html "class in akka.util")` | `[apply](#apply(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Timeout](Timeout.html "class in akka.util")` | `[copy](#copy(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [Timeout](Timeout.html "class in akka.util")` | `[create](#create(java.time.Duration))​(java.time.Duration duration)` | Create a Timeout from java.time.Duration. |
	| `scala.concurrent.duration.FiniteDuration` | `[duration](#duration())()` |  |
	| `static [Timeout](Timeout.html "class in akka.util")` | `[durationToTimeout](#durationToTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration duration)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.concurrent.duration.FiniteDuration>` | `[unapply](#unapply(akka.util.Timeout))​([Timeout](Timeout.html "class in akka.util") x$0)` |  |
	| `static [Timeout](Timeout.html "class in akka.util")` | `[zero](#zero())()` | A timeout with zero duration, will cause most requests to always timeout. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Timeout
		
		
		
		```
		public Timeout​(scala.concurrent.duration.FiniteDuration duration)
		```
		- #### Timeout
		
		
		
		```
		public Timeout​(long length,
		               java.util.concurrent.TimeUnit unit)
		```
		
		Construct a Timeout from the given time unit and factor.

	- ### Method Detail
	
	
	
		- #### zero
		
		
		
		```
		public static [Timeout](Timeout.html "class in akka.util") zero()
		```
		
		A timeout with zero duration, will cause most requests to always timeout.
		- #### apply
		
		
		
		```
		public static [Timeout](Timeout.html "class in akka.util") apply​(long length,
		                            java.util.concurrent.TimeUnit unit)
		```
		
		Construct a Timeout from the given time unit and factor.
		- #### create
		
		
		
		```
		public static [Timeout](Timeout.html "class in akka.util") create​(java.time.Duration duration)
		```
		
		Create a Timeout from java.time.Duration.
		- #### durationToTimeout
		
		
		
		```
		public static [Timeout](Timeout.html "class in akka.util") durationToTimeout​(scala.concurrent.duration.FiniteDuration duration)
		```
		- #### apply
		
		
		
		```
		public static [Timeout](Timeout.html "class in akka.util") apply​(scala.concurrent.duration.FiniteDuration duration)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.concurrent.duration.FiniteDuration> unapply​([Timeout](Timeout.html "class in akka.util") x$0)
		```
		- #### duration
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration duration()
		```
		- #### copy
		
		
		
		```
		public [Timeout](Timeout.html "class in akka.util") copy​(scala.concurrent.duration.FiniteDuration duration)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/util/Timeout.html
- https://doc.akka.io/japi/akka/current/akka/util/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/util/Timeout.html](https://doc.akka.io/japi/akka/current/akka/util/Timeout.html)*