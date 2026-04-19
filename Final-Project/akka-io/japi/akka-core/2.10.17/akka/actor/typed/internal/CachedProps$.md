---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/CachedProps$.html
title: CachedProps$
---

# CachedProps$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class CachedProps$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[Props](../Props.html "class in akka.actor.typed"),​[Props](../../Props.html "class in akka.actor"),​java.lang.Object,​akka.actor.typed.internal.CachedProps\>
	- - akka.actor.typed.internal.CachedProps$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[Props](../Props.html "class in akka.actor.typed"),​[Props](../../Props.html "class in akka.actor"),​java.lang.Object,​akka.actor.typed.internal.CachedProps>`

---

```
public class CachedProps$
extends scala.runtime.AbstractFunction3<[Props](../Props.html "class in akka.actor.typed"),​[Props](../../Props.html "class in akka.actor"),​java.lang.Object,​akka.actor.typed.internal.CachedProps>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.CachedProps$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CachedProps$](CachedProps$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CachedProps$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.internal.CachedProps` | `[apply](#apply(akka.actor.typed.Props,akka.actor.Props,boolean))​([Props](../Props.html "class in akka.actor.typed") typedProps,  [Props](../../Props.html "class in akka.actor") adaptedProps,  boolean rethrowTypedFailure)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[Props](../Props.html "class in akka.actor.typed"),​[Props](../../Props.html "class in akka.actor"),​java.lang.Object>>` | `[unapply](#unapply(akka.actor.typed.internal.CachedProps))​(akka.actor.typed.internal.CachedProps x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CachedProps$](CachedProps$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CachedProps$
		
		
		
		```
		public CachedProps$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[Props](../Props.html "class in akka.actor.typed"),​[Props](../../Props.html "class in akka.actor"),​java.lang.Object,​akka.actor.typed.internal.CachedProps>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[Props](../Props.html "class in akka.actor.typed"),​[Props](../../Props.html "class in akka.actor"),​java.lang.Object,​akka.actor.typed.internal.CachedProps>`
		- #### apply
		
		
		
		```
		public akka.actor.typed.internal.CachedProps apply​([Props](../Props.html "class in akka.actor.typed") typedProps,
		                                                   [Props](../../Props.html "class in akka.actor") adaptedProps,
		                                                   boolean rethrowTypedFailure)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[Props](../Props.html "class in akka.actor.typed"),​[Props](../../Props.html "class in akka.actor"),​java.lang.Object>> unapply​(akka.actor.typed.internal.CachedProps x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/CachedProps$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/CachedProps$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/CachedProps$.html)*