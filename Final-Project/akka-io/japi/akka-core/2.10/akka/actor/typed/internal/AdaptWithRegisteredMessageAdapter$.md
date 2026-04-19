---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:59:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AdaptWithRegisteredMessageAdapter$.html
title: AdaptWithRegisteredMessageAdapter$
---

# AdaptWithRegisteredMessageAdapter$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class AdaptWithRegisteredMessageAdapter$

- java.lang.Object
- - akka.actor.typed.internal.AdaptWithRegisteredMessageAdapter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class AdaptWithRegisteredMessageAdapter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.AdaptWithRegisteredMessageAdapter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AdaptWithRegisteredMessageAdapter$](AdaptWithRegisteredMessageAdapter$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdaptWithRegisteredMessageAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<U> akka.actor.typed.internal.AdaptWithRegisteredMessageAdapter<U>` | `[apply](#apply(U))​(U msg)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<U> scala.Option<U>` | `[unapply](#unapply(akka.actor.typed.internal.AdaptWithRegisteredMessageAdapter))​(akka.actor.typed.internal.AdaptWithRegisteredMessageAdapter<U> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AdaptWithRegisteredMessageAdapter$](AdaptWithRegisteredMessageAdapter$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AdaptWithRegisteredMessageAdapter$
		
		
		
		```
		public AdaptWithRegisteredMessageAdapter$()
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
		public <U> akka.actor.typed.internal.AdaptWithRegisteredMessageAdapter<U> apply​(U msg)
		```
		- #### unapply
		
		
		
		```
		public <U> scala.Option<U> unapply​(akka.actor.typed.internal.AdaptWithRegisteredMessageAdapter<U> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AdaptWithRegisteredMessageAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AdaptWithRegisteredMessageAdapter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AdaptWithRegisteredMessageAdapter$.html)*