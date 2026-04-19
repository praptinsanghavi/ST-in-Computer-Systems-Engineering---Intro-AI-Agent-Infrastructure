---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:51:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/FlushAck$.html
title: FlushAck$
---

# FlushAck$

## Content

Package [akka.remote.artery](package-summary.html)
## Class FlushAck$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<java.lang.Object,​akka.remote.artery.FlushAck\>
	- - akka.remote.artery.FlushAck$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<java.lang.Object,​akka.remote.artery.FlushAck>`

---

```
public class FlushAck$
extends scala.runtime.AbstractFunction1<java.lang.Object,​akka.remote.artery.FlushAck>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.artery.FlushAck$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FlushAck$](FlushAck$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FlushAck$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.FlushAck` | `[apply](#apply(int))​(int expectedAcks)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.remote.artery.FlushAck))​(akka.remote.artery.FlushAck x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FlushAck$](FlushAck$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FlushAck$
		
		
		
		```
		public FlushAck$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<java.lang.Object,​akka.remote.artery.FlushAck>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<java.lang.Object,​akka.remote.artery.FlushAck>`
		- #### apply
		
		
		
		```
		public akka.remote.artery.FlushAck apply​(int expectedAcks)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.Object> unapply​(akka.remote.artery.FlushAck x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/FlushAck$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/FlushAck$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/FlushAck$.html)*