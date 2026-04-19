---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:27:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogLevel.html
title: Logging.LogLevel
---

# Logging.LogLevel

## Content

Package [akka.event](package-summary.html)
## Class Logging.LogLevel

- java.lang.Object
- - scala.AnyVal
	- - akka.event.Logging.LogLevel

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Logging](Logging.html "class in akka.event")

---

```
public static final class Logging.LogLevel
extends scala.AnyVal
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.event.Logging.LogLevel)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogLevel](#%3Cinit%3E(int))​(int asInt)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[$greater](#$greater(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)` |  |
	| `boolean` | `[$greater$eq](#$greater$eq(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)` |  |
	| `boolean` | `[$less](#$less(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)` |  |
	| `boolean` | `[$less$eq](#$less$eq(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)` |  |
	| `int` | `[asInt](#asInt())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[copy](#copy(int))​(int asInt)` |  |
	| `int` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
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
	
	
	
		- #### LogLevel
		
		
		
		```
		public LogLevel​(int asInt)
		```

	- ### Method Detail
	
	
	
		- #### asInt
		
		
		
		```
		public int asInt()
		```
		- #### $greater$eq
		
		
		
		```
		public final boolean $greater$eq​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)
		```
		- #### $less$eq
		
		
		
		```
		public final boolean $less$eq​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)
		```
		- #### $greater
		
		
		
		```
		public final boolean $greater​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)
		```
		- #### $less
		
		
		
		```
		public final boolean $less​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)
		```
		- #### copy
		
		
		
		```
		public [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") copy​(int asInt)
		```
		- #### copy$default$1
		
		
		
		```
		public int copy$default$1()
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
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka/2.10/akka/event/Logging.html
- https://doc.akka.io/japi/akka/2.10/akka/event/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogLevel.html](https://doc.akka.io/japi/akka/2.10/akka/event/Logging.LogLevel.html)*