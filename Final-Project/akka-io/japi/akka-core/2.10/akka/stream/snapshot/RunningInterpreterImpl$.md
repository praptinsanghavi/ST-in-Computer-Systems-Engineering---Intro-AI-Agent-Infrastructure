---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:19:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/RunningInterpreterImpl$.html
title: RunningInterpreterImpl$
---

# RunningInterpreterImpl$

## Content

Package [akka.stream.snapshot](package-summary.html)
## Class RunningInterpreterImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction5\<scala.collection.immutable.Seq\<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")\>,​scala.collection.immutable.Seq\<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")\>,​java.lang.String,​java.lang.Object,​scala.collection.immutable.Seq\<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")\>,​akka.stream.snapshot.RunningInterpreterImpl\>
	- - akka.stream.snapshot.RunningInterpreterImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function5<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")>,​java.lang.String,​java.lang.Object,​scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.RunningInterpreterImpl>`

---

```
public class RunningInterpreterImpl$
extends scala.runtime.AbstractFunction5<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")>,​java.lang.String,​java.lang.Object,​scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.RunningInterpreterImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.snapshot.RunningInterpreterImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RunningInterpreterImpl$](RunningInterpreterImpl$.html "class in akka.stream.snapshot")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RunningInterpreterImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.snapshot.RunningInterpreterImpl` | `[apply](#apply(scala.collection.immutable.Seq,scala.collection.immutable.Seq,java.lang.String,int,scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> logics,  scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")> connections,  java.lang.String queueStatus,  int runningLogicsCount,  scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> stoppedLogics)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple5<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")>,​java.lang.String,​java.lang.Object,​scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>>>` | `[unapply](#unapply(akka.stream.snapshot.RunningInterpreterImpl))​(akka.stream.snapshot.RunningInterpreterImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction5
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function5
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RunningInterpreterImpl$](RunningInterpreterImpl$.html "class in akka.stream.snapshot") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RunningInterpreterImpl$
		
		
		
		```
		public RunningInterpreterImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function5<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")>,​java.lang.String,​java.lang.Object,​scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.RunningInterpreterImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction5<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")>,​java.lang.String,​java.lang.Object,​scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​akka.stream.snapshot.RunningInterpreterImpl>`
		- #### apply
		
		
		
		```
		public akka.stream.snapshot.RunningInterpreterImpl apply​(scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> logics,
		                                                         scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")> connections,
		                                                         java.lang.String queueStatus,
		                                                         int runningLogicsCount,
		                                                         scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")> stoppedLogics)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>,​scala.collection.immutable.Seq<[ConnectionSnapshot](ConnectionSnapshot.html "interface in akka.stream.snapshot")>,​java.lang.String,​java.lang.Object,​scala.collection.immutable.Seq<[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot")>>> unapply​(akka.stream.snapshot.RunningInterpreterImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/ConnectionSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/LogicSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/RunningInterpreterImpl$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/RunningInterpreterImpl$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/RunningInterpreterImpl$.html)*