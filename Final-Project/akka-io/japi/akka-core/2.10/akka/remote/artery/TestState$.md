---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/TestState$.html
title: TestState$
---

# TestState$

## Content

Package [akka.remote.artery](package-summary.html)
## Class TestState$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<scala.collection.immutable.Map\<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set\<[Address](../../actor/Address.html "class in akka.actor")\>\>,​scala.Option\<java.lang.Throwable\>,​akka.remote.artery.TestState\>
	- - akka.remote.artery.TestState$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>,​scala.Option<java.lang.Throwable>,​akka.remote.artery.TestState>`

---

```
public class TestState$
extends scala.runtime.AbstractFunction2<scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>,​scala.Option<java.lang.Throwable>,​akka.remote.artery.TestState>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.artery.TestState$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TestState$](TestState$.html "class in akka.remote.artery")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TestState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.TestState` | `[apply](#apply(scala.collection.immutable.Map,scala.Option))​(scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>> blackholes,  scala.Option<java.lang.Throwable> failInboundStream)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>,​scala.Option<java.lang.Throwable>>>` | `[unapply](#unapply(akka.remote.artery.TestState))​(akka.remote.artery.TestState x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TestState$](TestState$.html "class in akka.remote.artery") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TestState$
		
		
		
		```
		public TestState$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>,​scala.Option<java.lang.Throwable>,​akka.remote.artery.TestState>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>,​scala.Option<java.lang.Throwable>,​akka.remote.artery.TestState>`
		- #### apply
		
		
		
		```
		public akka.remote.artery.TestState apply​(scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>> blackholes,
		                                          scala.Option<java.lang.Throwable> failInboundStream)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>,​scala.Option<java.lang.Throwable>,​akka.remote.artery.TestState>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​scala.collection.immutable.Set<[Address](../../actor/Address.html "class in akka.actor")>>,​scala.Option<java.lang.Throwable>>> unapply​(akka.remote.artery.TestState x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/TestState$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/TestState$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/TestState$.html)*