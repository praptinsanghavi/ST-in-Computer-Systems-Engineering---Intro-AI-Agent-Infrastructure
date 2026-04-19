---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/TestPayload$.html
title: TestPayload$
---

# TestPayload$

## Content

Package [akka.persistence](package-summary.html)
## Class TestPayload$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[TestPayload](TestPayload.html "class in akka.persistence")\>
	- - akka.persistence.TestPayload$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[TestPayload](TestPayload.html "class in akka.persistence")>`

---

```
public class TestPayload$
extends scala.runtime.AbstractFunction1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[TestPayload](TestPayload.html "class in akka.persistence")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.TestPayload$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestPayload$](TestPayload$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestPayload$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TestPayload](TestPayload.html "class in akka.persistence")` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.persistence.TestPayload))​([TestPayload](TestPayload.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestPayload$](TestPayload$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestPayload$
		
		
		
		```
		public TestPayload$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[TestPayload](TestPayload.html "class in akka.persistence")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[TestPayload](TestPayload.html "class in akka.persistence")>`
		- #### apply
		
		
		
		```
		public [TestPayload](TestPayload.html "class in akka.persistence") apply​([ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ActorRef](../actor/ActorRef.html "class in akka.actor"),​[TestPayload](TestPayload.html "class in akka.persistence")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](../actor/ActorRef.html "class in akka.actor")> unapply​([TestPayload](TestPayload.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/TestPayload$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/TestPayload.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/TestPayload$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/TestPayload$.html)*