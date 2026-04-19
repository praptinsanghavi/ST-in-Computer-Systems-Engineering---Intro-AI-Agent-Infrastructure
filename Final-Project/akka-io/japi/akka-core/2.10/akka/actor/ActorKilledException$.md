---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:57:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorKilledException$.html
title: ActorKilledException$
---

# ActorKilledException$

## Content

Package [akka.actor](package-summary.html)
## Class ActorKilledException$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.String,​[ActorKilledException](ActorKilledException.html "class in akka.actor")\>
	- - akka.actor.ActorKilledException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.String,​[ActorKilledException](ActorKilledException.html "class in akka.actor")>`

---

```
public class ActorKilledException$
extends scala.runtime.AbstractFunction1<java.lang.String,​[ActorKilledException](ActorKilledException.html "class in akka.actor")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorKilledException$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorKilledException$](ActorKilledException$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorKilledException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorKilledException](ActorKilledException.html "class in akka.actor")` | `[apply](#apply(java.lang.String))​(java.lang.String message)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.actor.ActorKilledException))​([ActorKilledException](ActorKilledException.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorKilledException$](ActorKilledException$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorKilledException$
		
		
		
		```
		public ActorKilledException$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.String,​[ActorKilledException](ActorKilledException.html "class in akka.actor")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.String,​[ActorKilledException](ActorKilledException.html "class in akka.actor")>`
		- #### apply
		
		
		
		```
		public [ActorKilledException](ActorKilledException.html "class in akka.actor") apply​(java.lang.String message)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.String,​[ActorKilledException](ActorKilledException.html "class in akka.actor")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​([ActorKilledException](ActorKilledException.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorKilledException$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorKilledException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorKilledException$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorKilledException$.html)*