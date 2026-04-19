---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:47:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/InvalidPartnerActorException$.html
title: InvalidPartnerActorException$
---

# InvalidPartnerActorException$

## Content

Package [akka.stream](package-summary.html)
## Class InvalidPartnerActorException$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")\>
	- - akka.stream.InvalidPartnerActorException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")>`

---

```
public class InvalidPartnerActorException$
extends scala.runtime.AbstractFunction3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.InvalidPartnerActorException$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [InvalidPartnerActorException$](InvalidPartnerActorException$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InvalidPartnerActorException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")` | `[apply](#apply(akka.actor.ActorRef,akka.actor.ActorRef,java.lang.String))​([ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef,  [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef,  java.lang.String msg)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String>>` | `[unapply](#unapply(akka.stream.InvalidPartnerActorException))​([InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [InvalidPartnerActorException$](InvalidPartnerActorException$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### InvalidPartnerActorException$
		
		
		
		```
		public InvalidPartnerActorException$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")>`
		- #### apply
		
		
		
		```
		public [InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") expectedRef,
		                                          [ActorRef](../actor/ActorRef.html "class in akka.actor") gotRef,
		                                          java.lang.String msg)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String,​[InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[ActorRef](../actor/ActorRef.html "class in akka.actor"),​java.lang.String>> unapply​([InvalidPartnerActorException](InvalidPartnerActorException.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/InvalidPartnerActorException$.html
- https://doc.akka.io/japi/akka/current/akka/stream/InvalidPartnerActorException.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/InvalidPartnerActorException$.html](https://doc.akka.io/japi/akka/current/akka/stream/InvalidPartnerActorException$.html)*