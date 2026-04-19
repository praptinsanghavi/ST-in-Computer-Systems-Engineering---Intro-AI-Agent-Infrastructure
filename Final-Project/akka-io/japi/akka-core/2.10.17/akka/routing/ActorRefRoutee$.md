---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:52:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ActorRefRoutee$.html
title: ActorRefRoutee$
---

# ActorRefRoutee$

## Content

Package [akka.routing](package-summary.html)
## Class ActorRefRoutee$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")\>
	- - akka.routing.ActorRefRoutee$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")>`

---

```
public class ActorRefRoutee$
extends scala.runtime.AbstractFunction1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ActorRefRoutee$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorRefRoutee$](ActorRefRoutee$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefRoutee$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.routing.ActorRefRoutee))​([ActorRefRoutee](ActorRefRoutee.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorRefRoutee$](ActorRefRoutee$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorRefRoutee$
		
		
		
		```
		public ActorRefRoutee$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [ActorRefRoutee](ActorRefRoutee.html "class in akka.routing") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRefRoutee](ActorRefRoutee.html "class in akka.routing")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> unapply​([ActorRefRoutee](ActorRefRoutee.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ActorRefRoutee$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ActorRefRoutee$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ActorRefRoutee$.html)*