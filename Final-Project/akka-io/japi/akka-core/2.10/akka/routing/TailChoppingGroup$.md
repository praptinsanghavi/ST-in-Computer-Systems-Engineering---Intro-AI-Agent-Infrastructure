---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:17:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup$.html
title: TailChoppingGroup$
---

# TailChoppingGroup$

## Content

Package [akka.routing](package-summary.html)
## Class TailChoppingGroup$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<scala.collection.immutable.Iterable\<java.lang.String\>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")\>
	- - akka.routing.TailChoppingGroup$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")>`

---

```
public class TailChoppingGroup$
extends scala.runtime.AbstractFunction4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.TailChoppingGroup$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TailChoppingGroup$](TailChoppingGroup$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TailChoppingGroup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")` | `[apply](#apply(scala.collection.immutable.Iterable,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  java.lang.String routerDispatcher)` |  |
	| `java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String>>` | `[unapply](#unapply(akka.routing.TailChoppingGroup))​([TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TailChoppingGroup$](TailChoppingGroup$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TailChoppingGroup$
		
		
		
		```
		public TailChoppingGroup$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$4
		
		
		
		```
		public java.lang.String $lessinit$greater$default$4()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") apply​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                               scala.concurrent.duration.FiniteDuration within,
		                               scala.concurrent.duration.FiniteDuration interval,
		                               java.lang.String routerDispatcher)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String,​[TailChoppingGroup](TailChoppingGroup.html "class in akka.routing")>`
		- #### apply$default$4
		
		
		
		```
		public java.lang.String apply$default$4()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<scala.collection.immutable.Iterable<java.lang.String>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​java.lang.String>> unapply​([TailChoppingGroup](TailChoppingGroup.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingGroup$.html)*