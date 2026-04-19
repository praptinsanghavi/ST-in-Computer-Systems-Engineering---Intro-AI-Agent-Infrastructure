---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize$.html
title: AdjustPoolSize$
---

# AdjustPoolSize$

## Content

Package [akka.routing](package-summary.html)
## Class AdjustPoolSize$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[AdjustPoolSize](AdjustPoolSize.html "class in akka.routing")\>
	- - akka.routing.AdjustPoolSize$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[AdjustPoolSize](AdjustPoolSize.html "class in akka.routing")>`

---

```
public class AdjustPoolSize$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[AdjustPoolSize](AdjustPoolSize.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.AdjustPoolSize$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AdjustPoolSize$](AdjustPoolSize$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdjustPoolSize$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AdjustPoolSize](AdjustPoolSize.html "class in akka.routing")` | `[apply](#apply(int))​(int change)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.routing.AdjustPoolSize))​([AdjustPoolSize](AdjustPoolSize.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AdjustPoolSize$](AdjustPoolSize$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AdjustPoolSize$
		
		
		
		```
		public AdjustPoolSize$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[AdjustPoolSize](AdjustPoolSize.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[AdjustPoolSize](AdjustPoolSize.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [AdjustPoolSize](AdjustPoolSize.html "class in akka.routing") apply​(int change)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([AdjustPoolSize](AdjustPoolSize.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize$.html)*