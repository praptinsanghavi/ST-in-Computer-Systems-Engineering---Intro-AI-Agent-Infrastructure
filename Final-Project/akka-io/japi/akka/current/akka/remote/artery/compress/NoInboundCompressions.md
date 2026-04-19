---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:32:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/NoInboundCompressions.html
title: NoInboundCompressions
---

# NoInboundCompressions

## Content

Package [akka.remote.artery.compress](package-summary.html)
## Class NoInboundCompressions

- java.lang.Object
- - akka.remote.artery.compress.NoInboundCompressions

- ---

```
public class NoInboundCompressions
extends java.lang.Object
```

INTERNAL API
 
 Literarily, no compression!

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoInboundCompressions](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static void` | `[close](#close(long))​(long originUid)` |  |
	| `static void` | `[confirmActorRefCompressionAdvertisement](#confirmActorRefCompressionAdvertisement(long,byte))​(long originUid,  byte tableVersion)` |  |
	| `static void` | `[confirmClassManifestCompressionAdvertisement](#confirmClassManifestCompressionAdvertisement(long,byte))​(long originUid,  byte tableVersion)` |  |
	| `static scala.collection.immutable.Set<java.lang.Object>` | `[currentOriginUids](#currentOriginUids())()` |  |
	| `static <any>` | `[decompressActorRef](#decompressActorRef(long,byte,int))​(long originUid,  byte tableVersion,  int idx)` |  |
	| `static <any>` | `[decompressClassManifest](#decompressClassManifest(long,byte,int))​(long originUid,  byte tableVersion,  int idx)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static void` | `[hitActorRef](#hitActorRef(long,akka.actor.Address,akka.actor.ActorRef,int))​(long originUid,  [Address](../../../actor/Address.html "class in akka.actor") remote,  [ActorRef](../../../actor/ActorRef.html "class in akka.actor") ref,  int n)` |  |
	| `static void` | `[hitClassManifest](#hitClassManifest(long,akka.actor.Address,java.lang.String,int))​(long originUid,  [Address](../../../actor/Address.html "class in akka.actor") remote,  java.lang.String manifest,  int n)` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static void` | `[runNextActorRefAdvertisement](#runNextActorRefAdvertisement())()` |  |
	| `static void` | `[runNextClassManifestAdvertisement](#runNextClassManifestAdvertisement())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoInboundCompressions
		
		
		
		```
		public NoInboundCompressions()
		```

	- ### Method Detail
	
	
	
		- #### hitActorRef
		
		
		
		```
		public static void hitActorRef​(long originUid,
		                               [Address](../../../actor/Address.html "class in akka.actor") remote,
		                               [ActorRef](../../../actor/ActorRef.html "class in akka.actor") ref,
		                               int n)
		```
		- #### decompressActorRef
		
		
		
		```
		public static <any> decompressActorRef​(long originUid,
		                                       byte tableVersion,
		                                       int idx)
		```
		- #### confirmActorRefCompressionAdvertisement
		
		
		
		```
		public static void confirmActorRefCompressionAdvertisement​(long originUid,
		                                                           byte tableVersion)
		```
		- #### runNextActorRefAdvertisement
		
		
		
		```
		public static void runNextActorRefAdvertisement()
		```
		- #### hitClassManifest
		
		
		
		```
		public static void hitClassManifest​(long originUid,
		                                    [Address](../../../actor/Address.html "class in akka.actor") remote,
		                                    java.lang.String manifest,
		                                    int n)
		```
		- #### decompressClassManifest
		
		
		
		```
		public static <any> decompressClassManifest​(long originUid,
		                                            byte tableVersion,
		                                            int idx)
		```
		- #### confirmClassManifestCompressionAdvertisement
		
		
		
		```
		public static void confirmClassManifestCompressionAdvertisement​(long originUid,
		                                                                byte tableVersion)
		```
		- #### runNextClassManifestAdvertisement
		
		
		
		```
		public static void runNextClassManifestAdvertisement()
		```
		- #### currentOriginUids
		
		
		
		```
		public static scala.collection.immutable.Set<java.lang.Object> currentOriginUids()
		```
		- #### close
		
		
		
		```
		public static void close​(long originUid)
		```
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/NoInboundCompressions.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/compress/NoInboundCompressions.html)*