---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:59:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptTerminationException$.html
title: AbruptTerminationException$
---

# AbruptTerminationException$

## Content

Package [akka.stream](package-summary.html)
## Class AbruptTerminationException$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")\>
	- - akka.stream.AbruptTerminationException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")>`

---

```
public class AbruptTerminationException$
extends scala.runtime.AbstractFunction1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.AbruptTerminationException$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AbruptTerminationException$](AbruptTerminationException$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbruptTerminationException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.stream.AbruptTerminationException))​([AbruptTerminationException](AbruptTerminationException.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AbruptTerminationException$](AbruptTerminationException$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AbruptTerminationException$
		
		
		
		```
		public AbruptTerminationException$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")>`
		- #### apply
		
		
		
		```
		public [AbruptTerminationException](AbruptTerminationException.html "class in akka.stream") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") actor)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> unapply​([AbruptTerminationException](AbruptTerminationException.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptTerminationException$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptTerminationException.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptTerminationException$.html](https://doc.akka.io/japi/akka-core/current/akka/stream/AbruptTerminationException$.html)*