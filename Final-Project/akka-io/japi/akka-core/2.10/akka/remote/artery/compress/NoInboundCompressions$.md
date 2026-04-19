---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:15:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/NoInboundCompressions$.html
title: NoInboundCompressions$
---

# NoInboundCompressions$

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Class NoInboundCompressions$

- java.lang.Object
- - akka.remote.artery.compress.NoInboundCompressions$

- All Implemented Interfaces:
`[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class NoInboundCompressions$
extends java.lang.Object
implements [InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress"), scala.Product, java.io.Serializable
```

INTERNAL API
 
 Literarily, no compression!

See Also:
[Serialized Form](../../../../serialized-form.html#akka.remote.artery.compress.NoInboundCompressions$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoInboundCompressions$](NoInboundCompressions$.html "class in akka.remote.artery.compress")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoInboundCompressions$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `void` | `[close](#close(long))​(long originUid)` | Remove compression and cancel advertisement scheduling for a specific origin |
	| `void` | `[confirmActorRefCompressionAdvertisement](#confirmActorRefCompressionAdvertisement(long,byte))​(long originUid,  byte tableVersion)` |  |
	| `void` | `[confirmClassManifestCompressionAdvertisement](#confirmClassManifestCompressionAdvertisement(long,byte))​(long originUid,  byte tableVersion)` |  |
	| `scala.collection.immutable.Set<java.lang.Object>` | `[currentOriginUids](#currentOriginUids())()` |  |
	| `<any>` | `[decompressActorRef](#decompressActorRef(long,byte,int))​(long originUid,  byte tableVersion,  int idx)` |  |
	| `<any>` | `[decompressClassManifest](#decompressClassManifest(long,byte,int))​(long originUid,  byte tableVersion,  int idx)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `void` | `[hitActorRef](#hitActorRef(long,akka.actor.Address,akka.actor.ActorRef,int))​(long originUid,  [Address](../../../actor/Address.html "class in akka.actor") remote,  [ActorRef](../../../actor/ActorRef.html "class in akka.actor") ref,  int n)` |  |
	| `void` | `[hitClassManifest](#hitClassManifest(long,akka.actor.Address,java.lang.String,int))​(long originUid,  [Address](../../../actor/Address.html "class in akka.actor") remote,  java.lang.String manifest,  int n)` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `void` | `[runNextActorRefAdvertisement](#runNextActorRefAdvertisement())()` | Triggers compression advertisement via control message. |
	| `void` | `[runNextClassManifestAdvertisement](#runNextClassManifestAdvertisement())()` | Triggers compression advertisement via control message. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoInboundCompressions$](NoInboundCompressions$.html "class in akka.remote.artery.compress") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoInboundCompressions$
		
		
		
		```
		public NoInboundCompressions$()
		```

	- ### Method Detail
	
	
	
		- #### hitActorRef
		
		
		
		```
		public void hitActorRef​(long originUid,
		                        [Address](../../../actor/Address.html "class in akka.actor") remote,
		                        [ActorRef](../../../actor/ActorRef.html "class in akka.actor") ref,
		                        int n)
		```
		
		
		Specified by:
		`[hitActorRef](InboundCompressions.html#hitActorRef(long,akka.actor.Address,akka.actor.ActorRef,int))` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### decompressActorRef
		
		
		
		```
		public <any> decompressActorRef​(long originUid,
		                                byte tableVersion,
		                                int idx)
		```
		
		
		Specified by:
		`[decompressActorRef](InboundCompressions.html#decompressActorRef(long,byte,int))` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### confirmActorRefCompressionAdvertisement
		
		
		
		```
		public void confirmActorRefCompressionAdvertisement​(long originUid,
		                                                    byte tableVersion)
		```
		
		
		Specified by:
		`[confirmActorRefCompressionAdvertisement](InboundCompressions.html#confirmActorRefCompressionAdvertisement(long,byte))` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### runNextActorRefAdvertisement
		
		
		
		```
		public void runNextActorRefAdvertisement()
		```
		
		Description copied from interface: `[InboundCompressions](InboundCompressions.html#runNextActorRefAdvertisement())`
		Triggers compression advertisement via control message.
		
		Specified by:
		`[runNextActorRefAdvertisement](InboundCompressions.html#runNextActorRefAdvertisement())` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### hitClassManifest
		
		
		
		```
		public void hitClassManifest​(long originUid,
		                             [Address](../../../actor/Address.html "class in akka.actor") remote,
		                             java.lang.String manifest,
		                             int n)
		```
		
		
		Specified by:
		`[hitClassManifest](InboundCompressions.html#hitClassManifest(long,akka.actor.Address,java.lang.String,int))` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### decompressClassManifest
		
		
		
		```
		public <any> decompressClassManifest​(long originUid,
		                                     byte tableVersion,
		                                     int idx)
		```
		
		
		Specified by:
		`[decompressClassManifest](InboundCompressions.html#decompressClassManifest(long,byte,int))` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### confirmClassManifestCompressionAdvertisement
		
		
		
		```
		public void confirmClassManifestCompressionAdvertisement​(long originUid,
		                                                         byte tableVersion)
		```
		
		
		Specified by:
		`[confirmClassManifestCompressionAdvertisement](InboundCompressions.html#confirmClassManifestCompressionAdvertisement(long,byte))` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### runNextClassManifestAdvertisement
		
		
		
		```
		public void runNextClassManifestAdvertisement()
		```
		
		Description copied from interface: `[InboundCompressions](InboundCompressions.html#runNextClassManifestAdvertisement())`
		Triggers compression advertisement via control message.
		
		Specified by:
		`[runNextClassManifestAdvertisement](InboundCompressions.html#runNextClassManifestAdvertisement())` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### currentOriginUids
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.Object> currentOriginUids()
		```
		
		
		Specified by:
		`[currentOriginUids](InboundCompressions.html#currentOriginUids())` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### close
		
		
		
		```
		public void close​(long originUid)
		```
		
		Description copied from interface: `[InboundCompressions](InboundCompressions.html#close(long))`
		Remove compression and cancel advertisement scheduling for a specific origin
		
		Specified by:
		`[close](InboundCompressions.html#close(long))` in interface `[InboundCompressions](InboundCompressions.html "interface in akka.remote.artery.compress")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/InboundCompressions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/NoInboundCompressions$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/NoInboundCompressions$.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/artery/compress/NoInboundCompressions$.html)*