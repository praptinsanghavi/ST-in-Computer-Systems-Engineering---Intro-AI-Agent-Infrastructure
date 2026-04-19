---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/testkit/ForceDisassociate$.html
title: ForceDisassociate$
---

# ForceDisassociate$

## Content

Package [akka.remote.testkit](package-summary.html)
## Class ForceDisassociate$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[Address](../../actor/Address.html "class in akka.actor"),​[ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")\>
	- - akka.remote.testkit.ForceDisassociate$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[Address](../../actor/Address.html "class in akka.actor"),​[ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")>`

---

```
public class ForceDisassociate$
extends scala.runtime.AbstractFunction1<[Address](../../actor/Address.html "class in akka.actor"),​[ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testkit.ForceDisassociate$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ForceDisassociate$](ForceDisassociate$.html "class in akka.remote.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ForceDisassociate$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")` | `[apply](#apply(akka.actor.Address))​([Address](../../actor/Address.html "class in akka.actor") address)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[Address](../../actor/Address.html "class in akka.actor")>` | `[unapply](#unapply(akka.remote.testkit.ForceDisassociate))​([ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ForceDisassociate$](ForceDisassociate$.html "class in akka.remote.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ForceDisassociate$
		
		
		
		```
		public ForceDisassociate$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[Address](../../actor/Address.html "class in akka.actor"),​[ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[Address](../../actor/Address.html "class in akka.actor"),​[ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")>`
		- #### apply
		
		
		
		```
		public [ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit") apply​([Address](../../actor/Address.html "class in akka.actor") address)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[Address](../../actor/Address.html "class in akka.actor"),​[ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[Address](../../actor/Address.html "class in akka.actor")> unapply​([ForceDisassociate](ForceDisassociate.html "class in akka.remote.testkit") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/ForceDisassociate$.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/ForceDisassociate.html
- https://doc.akka.io/japi/akka/current/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/testkit/ForceDisassociate$.html](https://doc.akka.io/japi/akka/current/akka/remote/testkit/ForceDisassociate$.html)*