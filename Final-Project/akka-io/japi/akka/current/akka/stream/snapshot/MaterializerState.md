---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/snapshot/MaterializerState.html
title: MaterializerState
---

# MaterializerState

## Content

Package [akka.stream.snapshot](package-summary.html)
## Class MaterializerState

- java.lang.Object
- - akka.stream.snapshot.MaterializerState

- ---

```
public class MaterializerState
extends java.lang.Object
```

Debug utility to dump the running streams of a materializers in a structure describing the graph layout
 and "waits\-on" relationships.
 
 Some of the data extracted may be off unless the stream has settled, for example in when deadlocked, but the
 structure should be valid regardless. Extracting the information often will have an impact on the performance
 of the running streams.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MaterializerState](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.concurrent.Future<scala.collection.immutable.Seq<[StreamSnapshot](StreamSnapshot.html "interface in akka.stream.snapshot")>>` | `[streamSnapshots](#streamSnapshots(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Dump stream snapshots of all streams of the default system materializer. |
	| `static scala.concurrent.Future<scala.collection.immutable.Seq<[StreamSnapshot](StreamSnapshot.html "interface in akka.stream.snapshot")>>` | `[streamSnapshots](#streamSnapshots(akka.stream.Materializer))​([Materializer](../Materializer.html "class in akka.stream") mat)` | Dump stream snapshots of all streams of the given materializer. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MaterializerState
		
		
		
		```
		public MaterializerState()
		```

	- ### Method Detail
	
	
	
		- #### streamSnapshots
		
		
		
		```
		public static scala.concurrent.Future<scala.collection.immutable.Seq<[StreamSnapshot](StreamSnapshot.html "interface in akka.stream.snapshot")>> streamSnapshots​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Dump stream snapshots of all streams of the default system materializer.
		- #### streamSnapshots
		
		
		
		```
		public static scala.concurrent.Future<scala.collection.immutable.Seq<[StreamSnapshot](StreamSnapshot.html "interface in akka.stream.snapshot")>> streamSnapshots​([Materializer](../Materializer.html "class in akka.stream") mat)
		```
		
		Dump stream snapshots of all streams of the given materializer.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/StreamSnapshot.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/snapshot/MaterializerState.html](https://doc.akka.io/japi/akka/current/akka/stream/snapshot/MaterializerState.html)*