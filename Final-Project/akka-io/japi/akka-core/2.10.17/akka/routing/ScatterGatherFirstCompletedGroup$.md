---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:53:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ScatterGatherFirstCompletedGroup$.html
title: ScatterGatherFirstCompletedGroup$
---

# ScatterGatherFirstCompletedGroup$

## Content

Package [akka.routing](package-summary.html)
## Class ScatterGatherFirstCompletedGroup$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<scala.collection.immutable.Iterable\<java.lang.String\>,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")\>
	- - akka.routing.ScatterGatherFirstCompletedGroup$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")>`

---

```
public class ScatterGatherFirstCompletedGroup$
extends scala.runtime.AbstractFunction3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ScatterGatherFirstCompletedGroup$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ScatterGatherFirstCompletedGroup$](ScatterGatherFirstCompletedGroup$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ScatterGatherFirstCompletedGroup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")` | `[apply](#apply(scala.collection.immutable.Iterable,scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  scala.concurrent.duration.FiniteDuration within,  java.lang.String routerDispatcher)` |  |
	| `java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String>>` | `[unapply](#unapply(akka.routing.ScatterGatherFirstCompletedGroup))​([ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ScatterGatherFirstCompletedGroup$](ScatterGatherFirstCompletedGroup$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ScatterGatherFirstCompletedGroup$
		
		
		
		```
		public ScatterGatherFirstCompletedGroup$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$3
		
		
		
		```
		public java.lang.String $lessinit$greater$default$3()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") apply​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                                              scala.concurrent.duration.FiniteDuration within,
		                                              java.lang.String routerDispatcher)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing")>`
		- #### apply$default$3
		
		
		
		```
		public java.lang.String apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​java.lang.String>> unapply​([ScatterGatherFirstCompletedGroup](ScatterGatherFirstCompletedGroup.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ScatterGatherFirstCompletedGroup$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ScatterGatherFirstCompletedGroup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ScatterGatherFirstCompletedGroup$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/ScatterGatherFirstCompletedGroup$.html)*