---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:29:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/Counter.Updated$.html
title: Counter.Updated$
---

# Counter.Updated$

## Content

Package [akka.persistence.typed.crdt](package-summary.html)
## Class Counter.Updated$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.math.BigInt,​[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")\>
	- - akka.persistence.typed.crdt.Counter.Updated$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.math.BigInt,​[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")>`

Enclosing class:
[Counter](Counter.html "class in akka.persistence.typed.crdt")

---

```
public static class Counter.Updated$
extends scala.runtime.AbstractFunction1<scala.math.BigInt,​[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.crdt.Counter.Updated$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Counter.Updated$](Counter.Updated$.html "class in akka.persistence.typed.crdt")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Updated$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")` | `[apply](#apply(scala.math.BigInt))​(scala.math.BigInt delta)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.math.BigInt>` | `[unapply](#unapply(akka.persistence.typed.crdt.Counter.Updated))​([Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Counter.Updated$](Counter.Updated$.html "class in akka.persistence.typed.crdt") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Updated$
		
		
		
		```
		public Updated$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.math.BigInt,​[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.math.BigInt,​[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")>`
		- #### apply
		
		
		
		```
		public [Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt") apply​(scala.math.BigInt delta)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.math.BigInt,​[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.math.BigInt> unapply​([Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/Counter.Updated$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/Counter.Updated.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/Counter.Updated$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/crdt/Counter.Updated$.html)*