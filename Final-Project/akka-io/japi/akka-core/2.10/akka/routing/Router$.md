---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router$.html
title: Router$
---

# Router$

## Content

Package [akka.routing](package-summary.html)
## Class Router$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq\<[Routee](Routee.html "interface in akka.routing")\>,​[Router](Router.html "class in akka.routing")\>
	- - akka.routing.Router$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>,​[Router](Router.html "class in akka.routing")>`

---

```
public class Router$
extends scala.runtime.AbstractFunction2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>,​[Router](Router.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.Router$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Router$](Router$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Router$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[Router](Router.html "class in akka.routing")` | `[apply](#apply(akka.routing.RoutingLogic,scala.collection.immutable.IndexedSeq))​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` |  |
	| `scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>>>` | `[unapply](#unapply(akka.routing.Router))​([Router](Router.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Router$](Router$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Router$
		
		
		
		```
		public Router$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> $lessinit$greater$default$2()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>,​[Router](Router.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>,​[Router](Router.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [Router](Router.html "class in akka.routing") apply​([RoutingLogic](RoutingLogic.html "interface in akka.routing") logic,
		                    scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>,​[Router](Router.html "class in akka.routing")>`
		- #### apply$default$2
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[RoutingLogic](RoutingLogic.html "interface in akka.routing"),​scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")>>> unapply​([Router](Router.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router$.html)*