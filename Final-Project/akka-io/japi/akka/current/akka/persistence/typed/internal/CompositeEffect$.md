---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/CompositeEffect$.html
title: CompositeEffect$
---

# CompositeEffect$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class CompositeEffect$

- java.lang.Object
- - akka.persistence.typed.internal.CompositeEffect$

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
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.CompositeEffect$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CompositeEffect$](CompositeEffect$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CompositeEffect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Event,​State>akka.persistence.typed.internal.CompositeEffect<Event,​State>` | `[apply](#apply(akka.persistence.typed.scaladsl.EffectBuilder,akka.persistence.typed.internal.SideEffect))​([EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> effect,  akka.persistence.typed.internal.SideEffect<State> sideEffects)` |  |
	| `<Event,​State>akka.persistence.typed.internal.CompositeEffect<Event,​State>` | `[apply](#apply(akka.persistence.typed.scaladsl.EffectBuilder,scala.collection.immutable.Seq))​([EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> persistingEffect,  scala.collection.immutable.Seq<akka.persistence.typed.internal.SideEffect<State>> _sideEffects)` | INTERNAL API |
	| `<Event,​State>scala.Option<scala.Tuple2<[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>,​scala.collection.immutable.Seq<akka.persistence.typed.internal.SideEffect<State>>>>` | `[unapply](#unapply(akka.persistence.typed.internal.CompositeEffect))​(akka.persistence.typed.internal.CompositeEffect<Event,​State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CompositeEffect$](CompositeEffect$.html "class in akka.persistence.typed.internal") MODULE$
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
		public <Event,​State> akka.persistence.typed.internal.CompositeEffect<Event,​State> apply​([EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> effect,
		                                                                                                    akka.persistence.typed.internal.SideEffect<State> sideEffects)
		```
		- #### apply
		
		
		
		```
		public <Event,​State> akka.persistence.typed.internal.CompositeEffect<Event,​State> apply​([EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State> persistingEffect,
		                                                                                                    scala.collection.immutable.Seq<akka.persistence.typed.internal.SideEffect<State>> _sideEffects)
		```
		
		INTERNAL API
		- #### unapply
		
		
		
		```
		public <Event,​State> scala.Option<scala.Tuple2<[EffectBuilder](../scaladsl/EffectBuilder.html "interface in akka.persistence.typed.scaladsl")<Event,​State>,​scala.collection.immutable.Seq<akka.persistence.typed.internal.SideEffect<State>>>> unapply​(akka.persistence.typed.internal.CompositeEffect<Event,​State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/CompositeEffect$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/CompositeEffect$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/CompositeEffect$.html)*