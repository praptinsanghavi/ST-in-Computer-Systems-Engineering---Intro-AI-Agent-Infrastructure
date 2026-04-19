---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:07:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/JoinSeedNodes$.html
title: JoinSeedNodes$
---

# JoinSeedNodes$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class JoinSeedNodes$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[Address](../../actor/Address.html "class in akka.actor")\>,​[JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")\>
	- - akka.cluster.typed.JoinSeedNodes$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>,​[JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")>`

---

```
public class JoinSeedNodes$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>,​[JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.JoinSeedNodes$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JoinSeedNodes$](JoinSeedNodes$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[JoinSeedNodes$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>>` | `[unapply](#unapply(akka.cluster.typed.JoinSeedNodes))​([JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JoinSeedNodes$](JoinSeedNodes$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### JoinSeedNodes$
		
		
		
		```
		public JoinSeedNodes$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>,​[JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>,​[JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")>`
		- #### apply
		
		
		
		```
		public [JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed") apply​(scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")> seedNodes)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>,​[JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<[Address](../../actor/Address.html "class in akka.actor")>> unapply​([JoinSeedNodes](JoinSeedNodes.html "class in akka.cluster.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/JoinSeedNodes$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/JoinSeedNodes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/JoinSeedNodes$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/JoinSeedNodes$.html)*