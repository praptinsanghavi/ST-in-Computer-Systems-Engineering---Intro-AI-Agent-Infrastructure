---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:59:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AdaptMessage$.html
title: AdaptMessage$
---

# AdaptMessage$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class AdaptMessage$

- java.lang.Object
- - akka.actor.typed.internal.AdaptMessage$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class AdaptMessage$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.AdaptMessage$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AdaptMessage$](AdaptMessage$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdaptMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<U,​T>akka.actor.typed.internal.AdaptMessage<U,​T>` | `[apply](#apply(U,scala.Function1))​(U message,  scala.Function1<U,​T> adapter)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<U,​T>scala.Option<scala.Tuple2<U,​scala.Function1<U,​T>>>` | `[unapply](#unapply(akka.actor.typed.internal.AdaptMessage))​(akka.actor.typed.internal.AdaptMessage<U,​T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AdaptMessage$](AdaptMessage$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AdaptMessage$
		
		
		
		```
		public AdaptMessage$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <U,​T> akka.actor.typed.internal.AdaptMessage<U,​T> apply​(U message,
		                                                                           scala.Function1<U,​T> adapter)
		```
		- #### unapply
		
		
		
		```
		public <U,​T> scala.Option<scala.Tuple2<U,​scala.Function1<U,​T>>> unapply​(akka.actor.typed.internal.AdaptMessage<U,​T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AdaptMessage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AdaptMessage$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AdaptMessage$.html)*