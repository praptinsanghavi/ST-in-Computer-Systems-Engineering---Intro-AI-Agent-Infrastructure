---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PostRestartException$.html
title: PostRestartException$
---

# PostRestartException$

## Content

Package [akka.actor](package-summary.html)
## Class PostRestartException$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​[PostRestartException](PostRestartException.html "class in akka.actor")\>
	- - akka.actor.PostRestartException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​[PostRestartException](PostRestartException.html "class in akka.actor")>`

---

```
public class PostRestartException$
extends scala.runtime.AbstractFunction3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​[PostRestartException](PostRestartException.html "class in akka.actor")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.PostRestartException$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PostRestartException$](PostRestartException$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PostRestartException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[PostRestartException](PostRestartException.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,java.lang.Throwable,java.lang.Throwable))​([ActorRef](ActorRef.html "class in akka.actor") actor,  java.lang.Throwable cause,  java.lang.Throwable originalCause)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.PostRestartException))​([PostRestartException](PostRestartException.html "class in akka.actor") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PostRestartException$](PostRestartException$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### PostRestartException$
		
		
		
		```
		public PostRestartException$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​[PostRestartException](PostRestartException.html "class in akka.actor")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​[PostRestartException](PostRestartException.html "class in akka.actor")>`
		- #### apply
		
		
		
		```
		public [PostRestartException](PostRestartException.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") actor,
		                                  java.lang.Throwable cause,
		                                  java.lang.Throwable originalCause)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable,​[PostRestartException](PostRestartException.html "class in akka.actor")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorRef](ActorRef.html "class in akka.actor"),​java.lang.Throwable,​java.lang.Throwable>> unapply​([PostRestartException](PostRestartException.html "class in akka.actor") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PostRestartException$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PostRestartException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PostRestartException$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/PostRestartException$.html)*