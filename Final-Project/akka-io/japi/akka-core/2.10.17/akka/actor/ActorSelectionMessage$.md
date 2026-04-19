---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSelectionMessage$.html
title: ActorSelectionMessage$
---

# ActorSelectionMessage$

## Content

Package [akka.actor](package-summary.html)
## Class ActorSelectionMessage$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​scala.collection.immutable.Iterable\<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")\>,​java.lang.Object,​akka.actor.ActorSelectionMessage\>
	- - akka.actor.ActorSelectionMessage$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​scala.collection.immutable.Iterable<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")>,​java.lang.Object,​akka.actor.ActorSelectionMessage>`

---

```
public class ActorSelectionMessage$
extends scala.runtime.AbstractFunction3<java.lang.Object,​scala.collection.immutable.Iterable<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")>,​java.lang.Object,​akka.actor.ActorSelectionMessage>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorSelectionMessage$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorSelectionMessage$](ActorSelectionMessage$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSelectionMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.ActorSelectionMessage` | `[apply](#apply(java.lang.Object,scala.collection.immutable.Iterable,boolean))​(java.lang.Object msg,  scala.collection.immutable.Iterable<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")> elements,  boolean wildcardFanOut)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​scala.collection.immutable.Iterable<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")>,​java.lang.Object>>` | `[unapply](#unapply(akka.actor.ActorSelectionMessage))​(akka.actor.ActorSelectionMessage x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorSelectionMessage$](ActorSelectionMessage$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorSelectionMessage$
		
		
		
		```
		public ActorSelectionMessage$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​scala.collection.immutable.Iterable<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")>,​java.lang.Object,​akka.actor.ActorSelectionMessage>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​scala.collection.immutable.Iterable<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")>,​java.lang.Object,​akka.actor.ActorSelectionMessage>`
		- #### apply
		
		
		
		```
		public akka.actor.ActorSelectionMessage apply​(java.lang.Object msg,
		                                              scala.collection.immutable.Iterable<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")> elements,
		                                              boolean wildcardFanOut)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​scala.collection.immutable.Iterable<[SelectionPathElement](SelectionPathElement.html "interface in akka.actor")>,​java.lang.Object>> unapply​(akka.actor.ActorSelectionMessage x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSelectionMessage$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SelectionPathElement.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSelectionMessage$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSelectionMessage$.html)*