---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:51:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/ActorSystemTerminatingAck$.html
title: ActorSystemTerminatingAck$
---

# ActorSystemTerminatingAck$

## Content

Package [akka.remote.artery](package-summary.html)
## Class ActorSystemTerminatingAck$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.ActorSystemTerminatingAck\>
	- - akka.remote.artery.ActorSystemTerminatingAck$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.ActorSystemTerminatingAck>`

---

```
public class ActorSystemTerminatingAck$
extends scala.runtime.AbstractFunction1<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.ActorSystemTerminatingAck>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.artery.ActorSystemTerminatingAck$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorSystemTerminatingAck$](ActorSystemTerminatingAck$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSystemTerminatingAck$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.ActorSystemTerminatingAck` | `[apply](#apply(akka.remote.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.remote") from)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.remote")>` | `[unapply](#unapply(akka.remote.artery.ActorSystemTerminatingAck))​(akka.remote.artery.ActorSystemTerminatingAck x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorSystemTerminatingAck$](ActorSystemTerminatingAck$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorSystemTerminatingAck$
		
		
		
		```
		public ActorSystemTerminatingAck$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.ActorSystemTerminatingAck>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.ActorSystemTerminatingAck>`
		- #### apply
		
		
		
		```
		public akka.remote.artery.ActorSystemTerminatingAck apply​([UniqueAddress](../UniqueAddress.html "class in akka.remote") from)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[UniqueAddress](../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.ActorSystemTerminatingAck>`
		- #### unapply
		
		
		
		```
		public scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.remote")> unapply​(akka.remote.artery.ActorSystemTerminatingAck x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/ActorSystemTerminatingAck$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/ActorSystemTerminatingAck$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/ActorSystemTerminatingAck$.html)*