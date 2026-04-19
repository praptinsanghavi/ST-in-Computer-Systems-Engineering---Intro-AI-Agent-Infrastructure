---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:00:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Invalid$.html
title: Invalid$
---

# Invalid$

## Content

Package [akka.cluster](package-summary.html)
## Class Invalid$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<java.lang.String\>,​[Invalid](Invalid.html "class in akka.cluster")\>
	- - akka.cluster.Invalid$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.Seq<java.lang.String>,​[Invalid](Invalid.html "class in akka.cluster")>`

---

```
public class Invalid$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<java.lang.String>,​[Invalid](Invalid.html "class in akka.cluster")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.Invalid$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Invalid$](Invalid$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Invalid$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Invalid](Invalid.html "class in akka.cluster")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.String> errorMessages)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.Seq<java.lang.String>>` | `[unapply](#unapply(akka.cluster.Invalid))​([Invalid](Invalid.html "class in akka.cluster") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Invalid$](Invalid$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Invalid$
		
		
		
		```
		public Invalid$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.Seq<java.lang.String>,​[Invalid](Invalid.html "class in akka.cluster")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<java.lang.String>,​[Invalid](Invalid.html "class in akka.cluster")>`
		- #### apply
		
		
		
		```
		public [Invalid](Invalid.html "class in akka.cluster") apply​(scala.collection.immutable.Seq<java.lang.String> errorMessages)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.Seq<java.lang.String>,​[Invalid](Invalid.html "class in akka.cluster")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<java.lang.String>> unapply​([Invalid](Invalid.html "class in akka.cluster") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Invalid$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Invalid.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Invalid$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Invalid$.html)*