---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingGroup$.html
title: ConsistentHashingGroup$
---

# ConsistentHashingGroup$

## Content

Package [akka.routing](package-summary.html)
## Class ConsistentHashingGroup$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<scala.collection.immutable.Iterable\<java.lang.String\>,​java.lang.Object,​scala.PartialFunction\<java.lang.Object,​java.lang.Object\>,​java.lang.String,​[ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing")\>
	- - akka.routing.ConsistentHashingGroup$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<scala.collection.immutable.Iterable<java.lang.String>,​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>,​java.lang.String,​[ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing")>`

---

```
public class ConsistentHashingGroup$
extends scala.runtime.AbstractFunction4<scala.collection.immutable.Iterable<java.lang.String>,​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>,​java.lang.String,​[ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ConsistentHashingGroup$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConsistentHashingGroup$](ConsistentHashingGroup$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConsistentHashingGroup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `scala.PartialFunction<java.lang.Object,​java.lang.Object>` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `[ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing")` | `[apply](#apply(scala.collection.immutable.Iterable,int,scala.PartialFunction,java.lang.String))​(scala.collection.immutable.Iterable<java.lang.String> paths,  int virtualNodesFactor,  scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping,  java.lang.String routerDispatcher)` |  |
	| `int` | `[apply$default$2](#apply$default$2())()` |  |
	| `scala.PartialFunction<java.lang.Object,​java.lang.Object>` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<scala.collection.immutable.Iterable<java.lang.String>,​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>,​java.lang.String>>` | `[unapply](#unapply(akka.routing.ConsistentHashingGroup))​([ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConsistentHashingGroup$](ConsistentHashingGroup$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConsistentHashingGroup$
		
		
		
		```
		public ConsistentHashingGroup$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​java.lang.Object> $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public java.lang.String $lessinit$greater$default$4()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<scala.collection.immutable.Iterable<java.lang.String>,​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>,​java.lang.String,​[ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<scala.collection.immutable.Iterable<java.lang.String>,​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>,​java.lang.String,​[ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing") apply​(scala.collection.immutable.Iterable<java.lang.String> paths,
		                                    int virtualNodesFactor,
		                                    scala.PartialFunction<java.lang.Object,​java.lang.Object> hashMapping,
		                                    java.lang.String routerDispatcher)
		```
		- #### apply$default$2
		
		
		
		```
		public int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​java.lang.Object> apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public java.lang.String apply$default$4()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<scala.collection.immutable.Iterable<java.lang.String>,​java.lang.Object,​scala.PartialFunction<java.lang.Object,​java.lang.Object>,​java.lang.String>> unapply​([ConsistentHashingGroup](ConsistentHashingGroup.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingGroup$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingGroup$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingGroup$.html)*