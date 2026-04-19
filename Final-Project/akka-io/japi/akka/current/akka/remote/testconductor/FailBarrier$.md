---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testconductor/FailBarrier$.html
title: FailBarrier$
---

# FailBarrier$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class FailBarrier$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.String,​akka.remote.testconductor.FailBarrier\>
	- - akka.remote.testconductor.FailBarrier$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.String,​akka.remote.testconductor.FailBarrier>`

---

```
public class FailBarrier$
extends scala.runtime.AbstractFunction1<java.lang.String,​akka.remote.testconductor.FailBarrier>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.FailBarrier$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FailBarrier$](FailBarrier$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FailBarrier$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.FailBarrier` | `[apply](#apply(java.lang.String))​(java.lang.String name)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.remote.testconductor.FailBarrier))​(akka.remote.testconductor.FailBarrier x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FailBarrier$](FailBarrier$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FailBarrier$
		
		
		
		```
		public FailBarrier$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.String,​akka.remote.testconductor.FailBarrier>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.String,​akka.remote.testconductor.FailBarrier>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.FailBarrier apply​(java.lang.String name)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.String,​akka.remote.testconductor.FailBarrier>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​(akka.remote.testconductor.FailBarrier x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/FailBarrier$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testconductor/FailBarrier$.html](https://doc.akka.io/japi/akka/current/akka/remote/testconductor/FailBarrier$.html)*