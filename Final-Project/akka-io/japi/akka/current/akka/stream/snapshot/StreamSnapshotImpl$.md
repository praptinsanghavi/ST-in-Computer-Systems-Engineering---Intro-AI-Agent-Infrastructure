---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/snapshot/StreamSnapshotImpl$.html
title: StreamSnapshotImpl$
---

# StreamSnapshotImpl$

## Content

Package [akka.stream.snapshot](package-summary.html)
## Class StreamSnapshotImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[ActorPath](../../actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq\<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")\>,​scala.collection.immutable.Seq\<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")\>,​akka.stream.snapshot.StreamSnapshotImpl\>
	- - akka.stream.snapshot.StreamSnapshotImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[ActorPath](../../actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.StreamSnapshotImpl>`

---

```
public class StreamSnapshotImpl$
extends scala.runtime.AbstractFunction3<[ActorPath](../../actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.StreamSnapshotImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.snapshot.StreamSnapshotImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StreamSnapshotImpl$](StreamSnapshotImpl$.html "class in akka.stream.snapshot")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamSnapshotImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.snapshot.StreamSnapshotImpl` | `[apply](#apply(akka.actor.ActorPath,scala.collection.immutable.Seq,scala.collection.immutable.Seq))​([ActorPath](../../actor/ActorPath.html "interface in akka.actor") self,  scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")> activeInterpreters,  scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")> newShells)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[ActorPath](../../actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")>>>` | `[unapply](#unapply(akka.stream.snapshot.StreamSnapshotImpl))​(akka.stream.snapshot.StreamSnapshotImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StreamSnapshotImpl$](StreamSnapshotImpl$.html "class in akka.stream.snapshot") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StreamSnapshotImpl$
		
		
		
		```
		public StreamSnapshotImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[ActorPath](../../actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.StreamSnapshotImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[ActorPath](../../actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.StreamSnapshotImpl>`
		- #### apply
		
		
		
		```
		public akka.stream.snapshot.StreamSnapshotImpl apply​([ActorPath](../../actor/ActorPath.html "interface in akka.actor") self,
		                                                     scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")> activeInterpreters,
		                                                     scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")> newShells)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[ActorPath](../../actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.StreamSnapshotImpl>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorPath](../../actor/ActorPath.html "interface in akka.actor"),​scala.collection.immutable.Seq<[RunningInterpreter](RunningInterpreter.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[UninitializedInterpreter](UninitializedInterpreter.html "interface in akka.stream.snapshot")>>> unapply​(akka.stream.snapshot.StreamSnapshotImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/RunningInterpreter.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/StreamSnapshotImpl$.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/UninitializedInterpreter.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/snapshot/StreamSnapshotImpl$.html](https://doc.akka.io/japi/akka/current/akka/stream/snapshot/StreamSnapshotImpl$.html)*