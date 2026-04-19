---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:10:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/ResolvConf$.html
title: ResolvConf$
---

# ResolvConf$

## Content

Package [akka.io.dns.internal](package-summary.html)
## Class ResolvConf$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<scala.collection.immutable.List\<java.lang.String\>,​java.lang.Object,​akka.io.dns.internal.ResolvConf\>
	- - akka.io.dns.internal.ResolvConf$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<scala.collection.immutable.List<java.lang.String>,​java.lang.Object,​akka.io.dns.internal.ResolvConf>`

---

```
public class ResolvConf$
extends scala.runtime.AbstractFunction2<scala.collection.immutable.List<java.lang.String>,​java.lang.Object,​akka.io.dns.internal.ResolvConf>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.io.dns.internal.ResolvConf$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ResolvConf$](ResolvConf$.html "class in akka.io.dns.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResolvConf$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.io.dns.internal.ResolvConf` | `[apply](#apply(scala.collection.immutable.List,int))​(scala.collection.immutable.List<java.lang.String> search,  int ndots)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<scala.collection.immutable.List<java.lang.String>,​java.lang.Object>>` | `[unapply](#unapply(akka.io.dns.internal.ResolvConf))​(akka.io.dns.internal.ResolvConf x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ResolvConf$](ResolvConf$.html "class in akka.io.dns.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ResolvConf$
		
		
		
		```
		public ResolvConf$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<scala.collection.immutable.List<java.lang.String>,​java.lang.Object,​akka.io.dns.internal.ResolvConf>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<scala.collection.immutable.List<java.lang.String>,​java.lang.Object,​akka.io.dns.internal.ResolvConf>`
		- #### apply
		
		
		
		```
		public akka.io.dns.internal.ResolvConf apply​(scala.collection.immutable.List<java.lang.String> search,
		                                             int ndots)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<scala.collection.immutable.List<java.lang.String>,​java.lang.Object>> unapply​(akka.io.dns.internal.ResolvConf x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/ResolvConf$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/ResolvConf$.html](https://doc.akka.io/japi/akka-core/2.10/akka/io/dns/internal/ResolvConf$.html)*