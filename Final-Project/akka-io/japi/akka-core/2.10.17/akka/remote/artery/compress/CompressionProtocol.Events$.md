---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:52:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$.html
title: CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$
---

# CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Class CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable\<java.lang.String\>,​akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable\>
	- - akka.remote.artery.compress.CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>,​akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable>`

Enclosing class:
[CompressionProtocol.Events$](CompressionProtocol.Events$.html "class in akka.remote.artery.compress")

---

```
public class CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$
extends scala.runtime.AbstractFunction2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>,​akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.remote.artery.compress.CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$](CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$.html "class in akka.remote.artery.compress")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReceivedClassManifestCompressionTable$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable` | `[apply](#apply(akka.remote.UniqueAddress,akka.remote.artery.compress.CompressionTable))​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,  akka.remote.artery.compress.CompressionTable<java.lang.String> table)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>>>` | `[unapply](#unapply(akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable))​(akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$](CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$.html "class in akka.remote.artery.compress") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReceivedClassManifestCompressionTable$
		
		
		
		```
		public ReceivedClassManifestCompressionTable$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>,​akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>,​akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable>`
		- #### apply
		
		
		
		```
		public akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable apply​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,
		                                                                                                          akka.remote.artery.compress.CompressionTable<java.lang.String> table)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>,​akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​akka.remote.artery.compress.CompressionTable<java.lang.String>>> unapply​(akka.remote.artery.compress.CompressionProtocol.Events.ReceivedClassManifestCompressionTable x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.Events$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.Events$.ReceivedClassManifestCompressionTable$.html)*