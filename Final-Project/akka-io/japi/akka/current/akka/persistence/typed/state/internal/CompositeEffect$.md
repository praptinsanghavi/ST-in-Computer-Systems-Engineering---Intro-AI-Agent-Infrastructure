---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/CompositeEffect$.html
title: CompositeEffect$
---

# CompositeEffect$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class CompositeEffect$

- java.lang.Object
- - akka.persistence.typed.state.internal.CompositeEffect$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class CompositeEffect$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.typed.state.internal.CompositeEffect$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CompositeEffect$](CompositeEffect$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CompositeEffect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<State> akka.persistence.typed.state.internal.CompositeEffect<State>` | `[apply](#apply(akka.persistence.typed.state.scaladsl.EffectBuilder,akka.persistence.typed.state.internal.SideEffect))​([EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> effect,  akka.persistence.typed.state.internal.SideEffect<State> sideEffects)` |  |
	| `<State> akka.persistence.typed.state.internal.CompositeEffect<State>` | `[apply](#apply(akka.persistence.typed.state.scaladsl.EffectBuilder,scala.collection.immutable.Seq))​([EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> persistingEffect,  scala.collection.immutable.Seq<akka.persistence.typed.state.internal.SideEffect<State>> _sideEffects)` | INTERNAL API |
	| `<State> scala.Option<scala.Tuple2<[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>,​scala.collection.immutable.Seq<akka.persistence.typed.state.internal.SideEffect<State>>>>` | `[unapply](#unapply(akka.persistence.typed.state.internal.CompositeEffect))​(akka.persistence.typed.state.internal.CompositeEffect<State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CompositeEffect$](CompositeEffect$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CompositeEffect$
		
		
		
		```
		public CompositeEffect$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <State> akka.persistence.typed.state.internal.CompositeEffect<State> apply​([EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> effect,
		                                                                                  akka.persistence.typed.state.internal.SideEffect<State> sideEffects)
		```
		- #### apply
		
		
		
		```
		public <State> akka.persistence.typed.state.internal.CompositeEffect<State> apply​([EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State> persistingEffect,
		                                                                                  scala.collection.immutable.Seq<akka.persistence.typed.state.internal.SideEffect<State>> _sideEffects)
		```
		
		INTERNAL API
		- #### unapply
		
		
		
		```
		public <State> scala.Option<scala.Tuple2<[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.state.scaladsl")<State>,​scala.collection.immutable.Seq<akka.persistence.typed.state.internal.SideEffect<State>>>> unapply​(akka.persistence.typed.state.internal.CompositeEffect<State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/CompositeEffect$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/CompositeEffect$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/CompositeEffect$.html)*