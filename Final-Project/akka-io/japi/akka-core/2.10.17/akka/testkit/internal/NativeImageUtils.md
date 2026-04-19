---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/internal/NativeImageUtils.ReflectMethod$.html
title: NativeImageUtils.ReflectMethod$
---

# NativeImageUtils.ReflectMethod$

## Content

Package [akka.testkit.internal](package-summary.html)
## Class NativeImageUtils.ReflectMethod$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.String,​scala.collection.immutable.Seq\<java.lang.String\>,​[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")\>
	- - akka.testkit.internal.NativeImageUtils.ReflectMethod$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.String,​scala.collection.immutable.Seq<java.lang.String>,​[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")>`

Enclosing class:
[NativeImageUtils](NativeImageUtils.html "class in akka.testkit.internal")

---

```
public static class NativeImageUtils.ReflectMethod$
extends scala.runtime.AbstractFunction2<java.lang.String,​scala.collection.immutable.Seq<java.lang.String>,​[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.testkit.internal.NativeImageUtils.ReflectMethod$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NativeImageUtils.ReflectMethod$](NativeImageUtils.ReflectMethod$.html "class in akka.testkit.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReflectMethod$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")` | `[apply](#apply(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String name,  scala.collection.immutable.Seq<java.lang.String> parameterTypes)` |  |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.String,​scala.collection.immutable.Seq<java.lang.String>>>` | `[unapply](#unapply(akka.testkit.internal.NativeImageUtils.ReflectMethod))​([NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NativeImageUtils.ReflectMethod$](NativeImageUtils.ReflectMethod$.html "class in akka.testkit.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReflectMethod$
		
		
		
		```
		public ReflectMethod$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> $lessinit$greater$default$2()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.String,​scala.collection.immutable.Seq<java.lang.String>,​[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.String,​scala.collection.immutable.Seq<java.lang.String>,​[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")>`
		- #### apply
		
		
		
		```
		public [NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal") apply​(java.lang.String name,
		                                            scala.collection.immutable.Seq<java.lang.String> parameterTypes)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.String,​scala.collection.immutable.Seq<java.lang.String>,​[NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal")>`
		- #### apply$default$2
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​scala.collection.immutable.Seq<java.lang.String>>> unapply​([NativeImageUtils.ReflectMethod](NativeImageUtils.ReflectMethod.html "class in akka.testkit.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/internal/NativeImageUtils.ReflectMethod$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/internal/NativeImageUtils.ReflectMethod.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/internal/NativeImageUtils.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/internal/NativeImageUtils.ReflectMethod$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/testkit/internal/NativeImageUtils.ReflectMethod$.html)*