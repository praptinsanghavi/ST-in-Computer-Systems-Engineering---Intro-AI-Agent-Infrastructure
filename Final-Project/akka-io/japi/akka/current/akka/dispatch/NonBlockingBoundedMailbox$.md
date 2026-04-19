---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:14:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/NonBlockingBoundedMailbox$.html
title: NonBlockingBoundedMailbox$
---

# NonBlockingBoundedMailbox$

## Content

Package [akka.dispatch](package-summary.html)
## Class NonBlockingBoundedMailbox$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")\>
	- - akka.dispatch.NonBlockingBoundedMailbox$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")>`

---

```
public class NonBlockingBoundedMailbox$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.NonBlockingBoundedMailbox$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NonBlockingBoundedMailbox$](NonBlockingBoundedMailbox$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NonBlockingBoundedMailbox$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")` | `[apply](#apply(int))​(int capacity)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.dispatch.NonBlockingBoundedMailbox))​([NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NonBlockingBoundedMailbox$](NonBlockingBoundedMailbox$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NonBlockingBoundedMailbox$
		
		
		
		```
		public NonBlockingBoundedMailbox$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch")>`
		- #### apply
		
		
		
		```
		public [NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch") apply​(int capacity)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([NonBlockingBoundedMailbox](NonBlockingBoundedMailbox.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/NonBlockingBoundedMailbox$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/NonBlockingBoundedMailbox.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/NonBlockingBoundedMailbox$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/NonBlockingBoundedMailbox$.html)*