---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:53:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/VectorClockStats$.html
title: VectorClockStats$
---

# VectorClockStats$

## Content

Package [akka.cluster](package-summary.html)
## Class VectorClockStats$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​akka.cluster.VectorClockStats\>
	- - akka.cluster.VectorClockStats$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​java.lang.Object,​akka.cluster.VectorClockStats>`

---

```
public class VectorClockStats$
extends scala.runtime.AbstractFunction2<java.lang.Object,​java.lang.Object,​akka.cluster.VectorClockStats>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.VectorClockStats$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [VectorClockStats$](VectorClockStats$.html "class in akka.cluster")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[VectorClockStats$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `akka.cluster.VectorClockStats` | `[apply](#apply(int,int))​(int versionSize,  int seenLatest)` |  |
	| `int` | `[apply$default$1](#apply$default$1())()` |  |
	| `int` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.VectorClockStats))​(akka.cluster.VectorClockStats x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [VectorClockStats$](VectorClockStats$.html "class in akka.cluster") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### VectorClockStats$
		
		
		
		```
		public VectorClockStats$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public int $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public int $lessinit$greater$default$2()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​java.lang.Object,​akka.cluster.VectorClockStats>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​java.lang.Object,​akka.cluster.VectorClockStats>`
		- #### apply
		
		
		
		```
		public akka.cluster.VectorClockStats apply​(int versionSize,
		                                           int seenLatest)
		```
		- #### apply$default$1
		
		
		
		```
		public int apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public int apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>> unapply​(akka.cluster.VectorClockStats x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/cluster/VectorClockStats$.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/VectorClockStats$.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/VectorClockStats$.html)*