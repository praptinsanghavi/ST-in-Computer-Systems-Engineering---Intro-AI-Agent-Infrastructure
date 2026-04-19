---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/AmorphousShape$.html
title: AmorphousShape$
---

# AmorphousShape$

## Content

Package [akka.stream](package-summary.html)
## Class AmorphousShape$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<scala.collection.immutable.Seq\<[Inlet](Inlet.html "class in akka.stream")\<?\>\>,​scala.collection.immutable.Seq\<[Outlet](Outlet.html "class in akka.stream")\<?\>\>,​[AmorphousShape](AmorphousShape.html "class in akka.stream")\>
	- - akka.stream.AmorphousShape$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>,​[AmorphousShape](AmorphousShape.html "class in akka.stream")>`

---

```
public class AmorphousShape$
extends scala.runtime.AbstractFunction2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>,​[AmorphousShape](AmorphousShape.html "class in akka.stream")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.AmorphousShape$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AmorphousShape$](AmorphousShape$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AmorphousShape$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[AmorphousShape](AmorphousShape.html "class in akka.stream")` | `[apply](#apply(scala.collection.immutable.Seq,scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets,  scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>>>` | `[unapply](#unapply(akka.stream.AmorphousShape))​([AmorphousShape](AmorphousShape.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AmorphousShape$](AmorphousShape$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AmorphousShape$
		
		
		
		```
		public AmorphousShape$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>,​[AmorphousShape](AmorphousShape.html "class in akka.stream")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>,​[AmorphousShape](AmorphousShape.html "class in akka.stream")>`
		- #### apply
		
		
		
		```
		public [AmorphousShape](AmorphousShape.html "class in akka.stream") apply​(scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>> inlets,
		                            scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>> outlets)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>,​[AmorphousShape](AmorphousShape.html "class in akka.stream")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<scala.collection.immutable.Seq<[Inlet](Inlet.html "class in akka.stream")<?>>,​scala.collection.immutable.Seq<[Outlet](Outlet.html "class in akka.stream")<?>>>> unapply​([AmorphousShape](AmorphousShape.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/AmorphousShape$.html
- https://doc.akka.io/japi/akka/current/akka/stream/AmorphousShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/AmorphousShape$.html](https://doc.akka.io/japi/akka/current/akka/stream/AmorphousShape$.html)*