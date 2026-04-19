---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/event/ActorWithLogClass$.html
title: ActorWithLogClass$
---

# ActorWithLogClass$

## Content

Package [akka.event](package-summary.html)
## Class ActorWithLogClass$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[Actor](../actor/Actor.html "interface in akka.actor"),​java.lang.Class\<?\>,​akka.event.ActorWithLogClass\>
	- - akka.event.ActorWithLogClass$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[Actor](../actor/Actor.html "interface in akka.actor"),​java.lang.Class<?>,​akka.event.ActorWithLogClass>`

---

```
public class ActorWithLogClass$
extends scala.runtime.AbstractFunction2<[Actor](../actor/Actor.html "interface in akka.actor"),​java.lang.Class<?>,​akka.event.ActorWithLogClass>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.event.ActorWithLogClass$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorWithLogClass$](ActorWithLogClass$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorWithLogClass$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.event.ActorWithLogClass` | `[apply](#apply(akka.actor.Actor,java.lang.Class))​([Actor](../actor/Actor.html "interface in akka.actor") actor,  java.lang.Class<?> logClass)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[Actor](../actor/Actor.html "interface in akka.actor"),​java.lang.Class<?>>>` | `[unapply](#unapply(akka.event.ActorWithLogClass))​(akka.event.ActorWithLogClass x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorWithLogClass$](ActorWithLogClass$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorWithLogClass$
		
		
		
		```
		public ActorWithLogClass$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[Actor](../actor/Actor.html "interface in akka.actor"),​java.lang.Class<?>,​akka.event.ActorWithLogClass>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[Actor](../actor/Actor.html "interface in akka.actor"),​java.lang.Class<?>,​akka.event.ActorWithLogClass>`
		- #### apply
		
		
		
		```
		public akka.event.ActorWithLogClass apply​([Actor](../actor/Actor.html "interface in akka.actor") actor,
		                                          java.lang.Class<?> logClass)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[Actor](../actor/Actor.html "interface in akka.actor"),​java.lang.Class<?>,​akka.event.ActorWithLogClass>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[Actor](../actor/Actor.html "interface in akka.actor"),​java.lang.Class<?>>> unapply​(akka.event.ActorWithLogClass x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/event/ActorWithLogClass$.html
- https://doc.akka.io/japi/akka/current/akka/event/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/event/ActorWithLogClass$.html](https://doc.akka.io/japi/akka/current/akka/event/ActorWithLogClass$.html)*