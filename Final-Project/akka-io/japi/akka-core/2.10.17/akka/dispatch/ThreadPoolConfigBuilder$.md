---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfigBuilder$.html
title: ThreadPoolConfigBuilder$
---

# ThreadPoolConfigBuilder$

## Content

Package [akka.dispatch](package-summary.html)
## Class ThreadPoolConfigBuilder$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")\>
	- - akka.dispatch.ThreadPoolConfigBuilder$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")>`

---

```
public class ThreadPoolConfigBuilder$
extends scala.runtime.AbstractFunction1<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.dispatch.ThreadPoolConfigBuilder$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ThreadPoolConfigBuilder$](ThreadPoolConfigBuilder$.html "class in akka.dispatch")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThreadPoolConfigBuilder$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")` | `[apply](#apply(akka.dispatch.ThreadPoolConfig))​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")>` | `[unapply](#unapply(akka.dispatch.ThreadPoolConfigBuilder))​([ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ThreadPoolConfigBuilder$](ThreadPoolConfigBuilder$.html "class in akka.dispatch") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ThreadPoolConfigBuilder$
		
		
		
		```
		public ThreadPoolConfigBuilder$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")>`
		- #### apply
		
		
		
		```
		public [ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") apply​([ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch") config)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch"),​[ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ThreadPoolConfig](ThreadPoolConfig.html "class in akka.dispatch")> unapply​([ThreadPoolConfigBuilder](ThreadPoolConfigBuilder.html "class in akka.dispatch") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfig.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfigBuilder$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfigBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfigBuilder$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/ThreadPoolConfigBuilder$.html)*