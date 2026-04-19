---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SingleEventSeq$.html
title: SingleEventSeq$
---

# SingleEventSeq$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class SingleEventSeq$

- java.lang.Object
- - akka.persistence.typed.SingleEventSeq$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SingleEventSeq$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.SingleEventSeq$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SingleEventSeq$](SingleEventSeq$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SingleEventSeq$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> akka.persistence.typed.SingleEventSeq<A>` | `[apply](#apply(A))​(A event)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<A>` | `[unapply](#unapply(akka.persistence.typed.SingleEventSeq))​(akka.persistence.typed.SingleEventSeq<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SingleEventSeq$](SingleEventSeq$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SingleEventSeq$
		
		
		
		```
		public SingleEventSeq$()
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
		public <A> akka.persistence.typed.SingleEventSeq<A> apply​(A event)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<A> unapply​(akka.persistence.typed.SingleEventSeq<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SingleEventSeq$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SingleEventSeq$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/SingleEventSeq$.html)*