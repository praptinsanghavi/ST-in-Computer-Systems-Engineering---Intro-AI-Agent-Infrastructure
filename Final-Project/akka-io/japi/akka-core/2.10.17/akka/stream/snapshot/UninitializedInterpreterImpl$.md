---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:55:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/UninitializedInterpreterImpl$.html
title: UninitializedInterpreterImpl$
---

# UninitializedInterpreterImpl$

## Content

Package [akka.stream.snapshot](package-summary.html)
## Class UninitializedInterpreterImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")\>,​akka.stream.snapshot.UninitializedInterpreterImpl\>
	- - akka.stream.snapshot.UninitializedInterpreterImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.UninitializedInterpreterImpl>`

---

```
public class UninitializedInterpreterImpl$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.UninitializedInterpreterImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.snapshot.UninitializedInterpreterImpl$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UninitializedInterpreterImpl$](UninitializedInterpreterImpl$.html "class in akka.stream.snapshot")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UninitializedInterpreterImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.snapshot.UninitializedInterpreterImpl` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> logics)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>>` | `[unapply](#unapply(akka.stream.snapshot.UninitializedInterpreterImpl))​(akka.stream.snapshot.UninitializedInterpreterImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UninitializedInterpreterImpl$](UninitializedInterpreterImpl$.html "class in akka.stream.snapshot") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UninitializedInterpreterImpl$
		
		
		
		```
		public UninitializedInterpreterImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.UninitializedInterpreterImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.UninitializedInterpreterImpl>`
		- #### apply
		
		
		
		```
		public akka.stream.snapshot.UninitializedInterpreterImpl apply​(scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> logics)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.UninitializedInterpreterImpl>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>> unapply​(akka.stream.snapshot.UninitializedInterpreterImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/LogicSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/UninitializedInterpreterImpl$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/UninitializedInterpreterImpl$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/snapshot/UninitializedInterpreterImpl$.html)*