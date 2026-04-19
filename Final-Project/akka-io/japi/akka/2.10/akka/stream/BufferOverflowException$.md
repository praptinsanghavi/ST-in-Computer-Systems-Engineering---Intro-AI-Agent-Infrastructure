---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:01:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/BufferOverflowException$.html
title: BufferOverflowException$
---

# BufferOverflowException$

## Content

Package [akka.stream](package-summary.html)
## Class BufferOverflowException$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.String,​[BufferOverflowException](BufferOverflowException.html "class in akka.stream")\>
	- - akka.stream.BufferOverflowException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.String,​[BufferOverflowException](BufferOverflowException.html "class in akka.stream")>`

---

```
public class BufferOverflowException$
extends scala.runtime.AbstractFunction1<java.lang.String,​[BufferOverflowException](BufferOverflowException.html "class in akka.stream")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.BufferOverflowException$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BufferOverflowException$](BufferOverflowException$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BufferOverflowException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BufferOverflowException](BufferOverflowException.html "class in akka.stream")` | `[apply](#apply(java.lang.String))​(java.lang.String msg)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.stream.BufferOverflowException))​([BufferOverflowException](BufferOverflowException.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BufferOverflowException$](BufferOverflowException$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BufferOverflowException$
		
		
		
		```
		public BufferOverflowException$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.String,​[BufferOverflowException](BufferOverflowException.html "class in akka.stream")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.String,​[BufferOverflowException](BufferOverflowException.html "class in akka.stream")>`
		- #### apply
		
		
		
		```
		public [BufferOverflowException](BufferOverflowException.html "class in akka.stream") apply​(java.lang.String msg)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.String,​[BufferOverflowException](BufferOverflowException.html "class in akka.stream")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​([BufferOverflowException](BufferOverflowException.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/BufferOverflowException$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/BufferOverflowException.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/BufferOverflowException$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/BufferOverflowException$.html)*