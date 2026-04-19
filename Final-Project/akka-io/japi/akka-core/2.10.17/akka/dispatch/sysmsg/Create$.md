---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:43:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/Create$.html
title: Create$
---

# Create$

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class Create$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.Option\<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")\>,​akka.dispatch.sysmsg.Create\>
	- - akka.dispatch.sysmsg.Create$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")>,​akka.dispatch.sysmsg.Create>`

---

```
public class Create$
extends scala.runtime.AbstractFunction1<scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")>,​akka.dispatch.sysmsg.Create>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.dispatch.sysmsg.Create$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Create$](Create$.html "class in akka.dispatch.sysmsg")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Create$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.sysmsg.Create` | `[apply](#apply(scala.Option))​(scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")> failure)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")>>` | `[unapply](#unapply(akka.dispatch.sysmsg.Create))​(akka.dispatch.sysmsg.Create x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Create$](Create$.html "class in akka.dispatch.sysmsg") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Create$
		
		
		
		```
		public Create$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")>,​akka.dispatch.sysmsg.Create>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")>,​akka.dispatch.sysmsg.Create>`
		- #### apply
		
		
		
		```
		public akka.dispatch.sysmsg.Create apply​(scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")> failure)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")>,​akka.dispatch.sysmsg.Create>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Option<[ActorInitializationException](../../actor/ActorInitializationException.html "class in akka.actor")>> unapply​(akka.dispatch.sysmsg.Create x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorInitializationException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/Create$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/Create$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/sysmsg/Create$.html)*