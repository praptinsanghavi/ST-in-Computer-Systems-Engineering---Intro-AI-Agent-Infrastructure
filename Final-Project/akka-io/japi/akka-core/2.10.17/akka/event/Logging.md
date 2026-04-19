---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel$.html
title: Logging.LogLevel$
---

# Logging.LogLevel$

## Content

Package [akka.event](package-summary.html)
## Class Logging.LogLevel$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")\>
	- - akka.event.Logging.LogLevel$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")>`

Enclosing class:
[Logging](Logging.html "class in akka.event")

---

```
public static class Logging.LogLevel$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.event.Logging.LogLevel$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Logging.LogLevel$](Logging.LogLevel$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogLevel$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[$greater$eq$extension](#$greater$eq$extension(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)` |  |
	| `boolean` | `[$greater$extension](#$greater$extension(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)` |  |
	| `boolean` | `[$less$eq$extension](#$less$eq$extension(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)` |  |
	| `boolean` | `[$less$extension](#$less$extension(akka.event.Logging.LogLevel,akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)` |  |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[apply](#apply(int))​(int asInt)` |  |
	| `boolean` | `[canEqual$extension](#canEqual$extension(akka.event.Logging.LogLevel,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  java.lang.Object x$1)` |  |
	| `int` | `[copy$default$1$extension](#copy$default$1$extension(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)` |  |
	| `[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")` | `[copy$extension](#copy$extension(akka.event.Logging.LogLevel,int))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  int asInt)` |  |
	| `boolean` | `[equals$extension](#equals$extension(akka.event.Logging.LogLevel,java.lang.Object))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  java.lang.Object x$1)` |  |
	| `int` | `[hashCode$extension](#hashCode$extension(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)` |  |
	| `int` | `[productArity$extension](#productArity$extension(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)` |  |
	| `java.lang.Object` | `[productElement$extension](#productElement$extension(akka.event.Logging.LogLevel,int))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  int x$1)` |  |
	| `java.lang.String` | `[productElementName$extension](#productElementName$extension(akka.event.Logging.LogLevel,int))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,  int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator$extension](#productIterator$extension(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)` |  |
	| `java.lang.String` | `[productPrefix$extension](#productPrefix$extension(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `java.lang.String` | `[toString$extension](#toString$extension(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.event.Logging.LogLevel))​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Logging.LogLevel$](Logging.LogLevel$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LogLevel$
		
		
		
		```
		public LogLevel$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[Logging.LogLevel](Logging.LogLevel.html "class in akka.event")>`
		- #### apply
		
		
		
		```
		public [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") apply​(int asInt)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") x$0)
		```
		- #### $greater$eq$extension
		
		
		
		```
		public final boolean $greater$eq$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                           [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)
		```
		- #### $less$eq$extension
		
		
		
		```
		public final boolean $less$eq$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                        [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)
		```
		- #### $greater$extension
		
		
		
		```
		public final boolean $greater$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                        [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)
		```
		- #### $less$extension
		
		
		
		```
		public final boolean $less$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                     [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") other)
		```
		- #### copy$extension
		
		
		
		```
		public final [Logging.LogLevel](Logging.LogLevel.html "class in akka.event") copy$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                             int asInt)
		```
		- #### copy$default$1$extension
		
		
		
		```
		public final int copy$default$1$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)
		```
		- #### productPrefix$extension
		
		
		
		```
		public final java.lang.String productPrefix$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)
		```
		- #### productArity$extension
		
		
		
		```
		public final int productArity$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)
		```
		- #### productElement$extension
		
		
		
		```
		public final java.lang.Object productElement$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                                       int x$1)
		```
		- #### productIterator$extension
		
		
		
		```
		public final scala.collection.Iterator<java.lang.Object> productIterator$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)
		```
		- #### canEqual$extension
		
		
		
		```
		public final boolean canEqual$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                        java.lang.Object x$1)
		```
		- #### productElementName$extension
		
		
		
		```
		public final java.lang.String productElementName$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                                           int x$1)
		```
		- #### hashCode$extension
		
		
		
		```
		public final int hashCode$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)
		```
		- #### equals$extension
		
		
		
		```
		public final boolean equals$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this,
		                                      java.lang.Object x$1)
		```
		- #### toString$extension
		
		
		
		```
		public final java.lang.String toString$extension​([Logging.LogLevel](Logging.LogLevel.html "class in akka.event") $this)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/event/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/event/Logging.LogLevel$.html)*