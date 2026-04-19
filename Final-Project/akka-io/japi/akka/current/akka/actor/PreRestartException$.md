---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/PreRestartException$.html
title: PreRestartException$
---

# PreRestartException$

## Content

Package [akka.actor](package-summary.html)
## Class PreRestartException$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option\<java.lang.Object\>,​[PreRestartException](PreRestartException.html "class in akka.actor")\>
	- - akka.actor.PreRestartException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>,​[PreRestartException](PreRestartException.html "class in akka.actor")>`

---

```
public class PreRestartException$
extends scala.runtime.AbstractFunction4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>,​[PreRestartException](PreRestartException.html "class in akka.actor")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.PreRestartException$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PreRestartException$](PreRestartException$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PreRestartException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PreRestartException](PreRestartException.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,java.lang.Throwable,java.lang.Throwable,scala.Option))​([ActorRef](ActorRef.html "class in akka.actor") actor,  java.lang.Throwable cause,  java.lang.Throwable originalCause,  scala.Option<java.lang.Object> messageOption)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.actor.PreRestartException))​([PreRestartException](PreRestartException.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PreRestartException$](PreRestartException$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PreRestartException$
		
		
		
		```
		public PreRestartException$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>,​[PreRestartException](PreRestartException.html "class in akka.actor")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>,​[PreRestartException](PreRestartException.html "class in akka.actor")>`
		- #### apply
		
		
		
		```
		public [PreRestartException](PreRestartException.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") actor,
		                                 java.lang.Throwable cause,
		                                 java.lang.Throwable originalCause,
		                                 scala.Option<java.lang.Object> messageOption)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>,​[PreRestartException](PreRestartException.html "class in akka.actor")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​scala.Option<java.lang.Object>>> unapply​([PreRestartException](PreRestartException.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/PreRestartException$.html
- https://doc.akka.io/japi/akka/current/akka/actor/PreRestartException.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/PreRestartException$.html](https://doc.akka.io/japi/akka/current/akka/actor/PreRestartException$.html)*