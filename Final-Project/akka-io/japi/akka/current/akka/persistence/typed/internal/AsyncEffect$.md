---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:28:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/AsyncEffect$.html
title: AsyncEffect$
---

# AsyncEffect$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class AsyncEffect$

- java.lang.Object
- - akka.persistence.typed.internal.AsyncEffect$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class AsyncEffect$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.AsyncEffect$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AsyncEffect$](AsyncEffect$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AsyncEffect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Event,​State>akka.persistence.typed.internal.AsyncEffect<Event,​State>` | `[apply](#apply(scala.concurrent.Future))​(scala.concurrent.Future<[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> effect)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<Event,​State>scala.Option<scala.concurrent.Future<[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>>>` | `[unapply](#unapply(akka.persistence.typed.internal.AsyncEffect))​(akka.persistence.typed.internal.AsyncEffect<Event,​State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AsyncEffect$](AsyncEffect$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AsyncEffect$
		
		
		
		```
		public AsyncEffect$()
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
		public <Event,​State> akka.persistence.typed.internal.AsyncEffect<Event,​State> apply​(scala.concurrent.Future<[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>> effect)
		```
		- #### unapply
		
		
		
		```
		public <Event,​State> scala.Option<scala.concurrent.Future<[Effect](../scaladsl/Effect.html "interface in akka.persistence.typed.scaladsl")<Event,​State>>> unapply​(akka.persistence.typed.internal.AsyncEffect<Event,​State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/AsyncEffect$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/AsyncEffect$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/internal/AsyncEffect$.html)*