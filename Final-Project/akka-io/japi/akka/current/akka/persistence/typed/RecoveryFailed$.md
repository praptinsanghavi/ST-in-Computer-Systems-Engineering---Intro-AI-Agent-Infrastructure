---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:43:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/RecoveryFailed$.html
title: RecoveryFailed$
---

# RecoveryFailed$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class RecoveryFailed$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Throwable,​[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")\>
	- - akka.persistence.typed.RecoveryFailed$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Throwable,​[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")>`

---

```
public class RecoveryFailed$
extends scala.runtime.AbstractFunction1<java.lang.Throwable,​[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.RecoveryFailed$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RecoveryFailed$](RecoveryFailed$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RecoveryFailed$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable failure)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.persistence.typed.RecoveryFailed))​([RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RecoveryFailed$](RecoveryFailed$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RecoveryFailed$
		
		
		
		```
		public RecoveryFailed$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Throwable,​[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Throwable,​[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")>`
		- #### apply
		
		
		
		```
		public [RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed") apply​(java.lang.Throwable failure)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<java.lang.Throwable,​[RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed")>`
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Throwable> unapply​([RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/RecoveryFailed$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/RecoveryFailed$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/RecoveryFailed$.html)*