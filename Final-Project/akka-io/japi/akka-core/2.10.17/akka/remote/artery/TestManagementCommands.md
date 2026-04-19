---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:51:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/TestManagementCommands.FailInboundStreamOnce$.html
title: TestManagementCommands.FailInboundStreamOnce$
---

# TestManagementCommands.FailInboundStreamOnce$

## Content

Package [akka.remote.artery](package-summary.html)
## Class TestManagementCommands.FailInboundStreamOnce$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Throwable,​[TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery")\>
	- - akka.remote.artery.TestManagementCommands.FailInboundStreamOnce$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Throwable,​[TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery")>`

Enclosing class:
[TestManagementCommands](TestManagementCommands.html "class in akka.remote.artery")

---

```
public static class TestManagementCommands.FailInboundStreamOnce$
extends scala.runtime.AbstractFunction1<java.lang.Throwable,​[TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.artery.TestManagementCommands.FailInboundStreamOnce$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestManagementCommands.FailInboundStreamOnce$](TestManagementCommands.FailInboundStreamOnce$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FailInboundStreamOnce$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery")` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable ex)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.remote.artery.TestManagementCommands.FailInboundStreamOnce))​([TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestManagementCommands.FailInboundStreamOnce$](TestManagementCommands.FailInboundStreamOnce$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FailInboundStreamOnce$
		
		
		
		```
		public FailInboundStreamOnce$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Throwable,​[TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Throwable,​[TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery")>`
		- #### apply
		
		
		
		```
		public [TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery") apply​(java.lang.Throwable ex)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Throwable,​[TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Throwable> unapply​([TestManagementCommands.FailInboundStreamOnce](TestManagementCommands.FailInboundStreamOnce.html "class in akka.remote.artery") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/TestManagementCommands.FailInboundStreamOnce$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/TestManagementCommands.FailInboundStreamOnce.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/TestManagementCommands.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/TestManagementCommands.FailInboundStreamOnce$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/TestManagementCommands.FailInboundStreamOnce$.html)*