---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:46:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshotImpl$.html
title: ConnectionSnapshotImpl$
---

# ConnectionSnapshotImpl$

## Content

Package [akka.stream.snapshot](package-summary.html)
## Class ConnectionSnapshotImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<java.lang.Object,​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot"),​akka.stream.snapshot.ConnectionSnapshotImpl\>
	- - akka.stream.snapshot.ConnectionSnapshotImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<java.lang.Object,​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot"),​akka.stream.snapshot.ConnectionSnapshotImpl>`

---

```
public class ConnectionSnapshotImpl$
extends scala.runtime.AbstractFunction4<java.lang.Object,​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot"),​akka.stream.snapshot.ConnectionSnapshotImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.snapshot.ConnectionSnapshotImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConnectionSnapshotImpl$](ConnectionSnapshotImpl$.html "class in akka.stream.snapshot")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionSnapshotImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.snapshot.ConnectionSnapshotImpl` | `[apply](#apply(int,akka.stream.snapshot.LogicSnapshot,akka.stream.snapshot.LogicSnapshot,akka.stream.snapshot.ConnectionSnapshot.ConnectionState))​(int id,  [LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot") in,  [LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot") out,  [ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot") state)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot")>>` | `[unapply](#unapply(akka.stream.snapshot.ConnectionSnapshotImpl))​(akka.stream.snapshot.ConnectionSnapshotImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConnectionSnapshotImpl$](ConnectionSnapshotImpl$.html "class in akka.stream.snapshot") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConnectionSnapshotImpl$
		
		
		
		```
		public ConnectionSnapshotImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<java.lang.Object,​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot"),​akka.stream.snapshot.ConnectionSnapshotImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<java.lang.Object,​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot"),​akka.stream.snapshot.ConnectionSnapshotImpl>`
		- #### apply
		
		
		
		```
		public akka.stream.snapshot.ConnectionSnapshotImpl apply​(int id,
		                                                         [LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot") in,
		                                                         [LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot") out,
		                                                         [ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot") state)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[LogicSnapshot](LogicSnapshot.html "interface in akka.stream.snapshot"),​[ConnectionSnapshot.ConnectionState](ConnectionSnapshot.ConnectionState.html "interface in akka.stream.snapshot")>> unapply​(akka.stream.snapshot.ConnectionSnapshotImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshot.ConnectionState.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshotImpl$.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/LogicSnapshot.html
- https://doc.akka.io/japi/akka/current/akka/stream/snapshot/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshotImpl$.html](https://doc.akka.io/japi/akka/current/akka/stream/snapshot/ConnectionSnapshotImpl$.html)*