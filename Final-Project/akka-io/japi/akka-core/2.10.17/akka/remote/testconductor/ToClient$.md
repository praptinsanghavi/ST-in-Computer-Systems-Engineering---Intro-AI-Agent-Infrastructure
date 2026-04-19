---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:52:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/ToClient$.html
title: ToClient$
---

# ToClient$

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class ToClient$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ClientOp](ClientOp.html "interface in akka.remote.testconductor"),​akka.remote.testconductor.ToClient\>
	- - akka.remote.testconductor.ToClient$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ClientOp](ClientOp.html "interface in akka.remote.testconductor"),​akka.remote.testconductor.ToClient>`

---

```
public class ToClient$
extends scala.runtime.AbstractFunction1<[ClientOp](ClientOp.html "interface in akka.remote.testconductor"),​akka.remote.testconductor.ToClient>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.ToClient$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ToClient$](ToClient$.html "class in akka.remote.testconductor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ToClient$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.testconductor.ToClient` | `[apply](#apply(akka.remote.testconductor.ClientOp))​([ClientOp](ClientOp.html "interface in akka.remote.testconductor") msg)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ClientOp](ClientOp.html "interface in akka.remote.testconductor")>` | `[unapply](#unapply(akka.remote.testconductor.ToClient))​(akka.remote.testconductor.ToClient x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ToClient$](ToClient$.html "class in akka.remote.testconductor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ToClient$
		
		
		
		```
		public ToClient$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ClientOp](ClientOp.html "interface in akka.remote.testconductor"),​akka.remote.testconductor.ToClient>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ClientOp](ClientOp.html "interface in akka.remote.testconductor"),​akka.remote.testconductor.ToClient>`
		- #### apply
		
		
		
		```
		public akka.remote.testconductor.ToClient apply​([ClientOp](ClientOp.html "interface in akka.remote.testconductor") msg)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ClientOp](ClientOp.html "interface in akka.remote.testconductor"),​akka.remote.testconductor.ToClient>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ClientOp](ClientOp.html "interface in akka.remote.testconductor")> unapply​(akka.remote.testconductor.ToClient x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/ClientOp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/ToClient$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/ToClient$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/ToClient$.html)*