---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/DeleteMessagesSuccess$.html
title: DeleteMessagesSuccess$
---

# DeleteMessagesSuccess$

## Content

Package [akka.persistence](package-summary.html)
## Class DeleteMessagesSuccess$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​[DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence")\>
	- - akka.persistence.DeleteMessagesSuccess$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​[DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence")>`

---

```
public class DeleteMessagesSuccess$
extends scala.runtime.AbstractFunction1<java.lang.Object,​[DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.DeleteMessagesSuccess$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeleteMessagesSuccess$](DeleteMessagesSuccess$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteMessagesSuccess$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence")` | `[apply](#apply(long))​(long toSequenceNr)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.persistence.DeleteMessagesSuccess))​([DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeleteMessagesSuccess$](DeleteMessagesSuccess$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeleteMessagesSuccess$
		
		
		
		```
		public DeleteMessagesSuccess$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​[DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​[DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence")>`
		- #### apply
		
		
		
		```
		public [DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence") apply​(long toSequenceNr)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​([DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/DeleteMessagesSuccess$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/DeleteMessagesSuccess$.html](https://doc.akka.io/japi/akka/current/akka/persistence/DeleteMessagesSuccess$.html)*