---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:51:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.ActorRefCompressionAdvertisementAck$.html
title: CompressionProtocol.ActorRefCompressionAdvertisementAck$
---

# CompressionProtocol.ActorRefCompressionAdvertisementAck$

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Class CompressionProtocol.ActorRefCompressionAdvertisementAck$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck\>
	- - akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck>`

Enclosing class:
[CompressionProtocol](CompressionProtocol.html "class in akka.remote.artery.compress")

---

```
public static class CompressionProtocol.ActorRefCompressionAdvertisementAck$
extends scala.runtime.AbstractFunction2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CompressionProtocol.ActorRefCompressionAdvertisementAck$](CompressionProtocol.ActorRefCompressionAdvertisementAck$.html "class in akka.remote.artery.compress")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefCompressionAdvertisementAck$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck` | `[apply](#apply(akka.remote.UniqueAddress,byte))​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,  byte tableVersion)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​java.lang.Object>>` | `[unapply](#unapply(akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck))​(akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CompressionProtocol.ActorRefCompressionAdvertisementAck$](CompressionProtocol.ActorRefCompressionAdvertisementAck$.html "class in akka.remote.artery.compress") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorRefCompressionAdvertisementAck$
		
		
		
		```
		public ActorRefCompressionAdvertisementAck$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​java.lang.Object,​akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck>`
		- #### apply
		
		
		
		```
		public akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck apply​([UniqueAddress](../../UniqueAddress.html "class in akka.remote") from,
		                                                                                                 byte tableVersion)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[UniqueAddress](../../UniqueAddress.html "class in akka.remote"),​java.lang.Object>> unapply​(akka.remote.artery.compress.CompressionProtocol.ActorRefCompressionAdvertisementAck x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.ActorRefCompressionAdvertisementAck$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.ActorRefCompressionAdvertisementAck$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/artery/compress/CompressionProtocol.ActorRefCompressionAdvertisementAck$.html)*