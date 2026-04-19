---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorIdentity$.html
title: ActorIdentity$
---

# ActorIdentity$

## Content

Package [akka.actor](package-summary.html)
## Class ActorIdentity$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<[ActorRef](ActorRef.html "class in akka.actor")\>,​[ActorIdentity](ActorIdentity.html "class in akka.actor")\>
	- - akka.actor.ActorIdentity$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>,​[ActorIdentity](ActorIdentity.html "class in akka.actor")>`

---

```
public class ActorIdentity$
extends scala.runtime.AbstractFunction2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>,​[ActorIdentity](ActorIdentity.html "class in akka.actor")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorIdentity$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorIdentity$](ActorIdentity$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorIdentity$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorIdentity](ActorIdentity.html "class in akka.actor")` | `[apply](#apply(java.lang.Object,scala.Option))​(java.lang.Object correlationId,  scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>>>` | `[unapply](#unapply(akka.actor.ActorIdentity))​([ActorIdentity](ActorIdentity.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorIdentity$](ActorIdentity$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorIdentity$
		
		
		
		```
		public ActorIdentity$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>,​[ActorIdentity](ActorIdentity.html "class in akka.actor")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>,​[ActorIdentity](ActorIdentity.html "class in akka.actor")>`
		- #### apply
		
		
		
		```
		public [ActorIdentity](ActorIdentity.html "class in akka.actor") apply​(java.lang.Object correlationId,
		                           scala.Option<[ActorRef](ActorRef.html "class in akka.actor")> ref)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>,​[ActorIdentity](ActorIdentity.html "class in akka.actor")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​scala.Option<[ActorRef](ActorRef.html "class in akka.actor")>>> unapply​([ActorIdentity](ActorIdentity.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorIdentity$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorIdentity.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorIdentity$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorIdentity$.html)*