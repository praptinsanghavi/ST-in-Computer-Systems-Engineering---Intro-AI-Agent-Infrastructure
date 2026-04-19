---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:19:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/LogicSnapshotImpl$.html
title: LogicSnapshotImpl$
---

# LogicSnapshotImpl$

## Content

Package [akka.stream.snapshot](package-summary.html)
## Class LogicSnapshotImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.String,​[Attributes](../Attributes.html "class in akka.stream"),​akka.stream.snapshot.LogicSnapshotImpl\>
	- - akka.stream.snapshot.LogicSnapshotImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​java.lang.String,​[Attributes](../Attributes.html "class in akka.stream"),​akka.stream.snapshot.LogicSnapshotImpl>`

---

```
public class LogicSnapshotImpl$
extends scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.String,​[Attributes](../Attributes.html "class in akka.stream"),​akka.stream.snapshot.LogicSnapshotImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.stream.snapshot.LogicSnapshotImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LogicSnapshotImpl$](LogicSnapshotImpl$.html "class in akka.stream.snapshot")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogicSnapshotImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.snapshot.LogicSnapshotImpl` | `[apply](#apply(int,java.lang.String,akka.stream.Attributes))​(int index,  java.lang.String label,  [Attributes](../Attributes.html "class in akka.stream") attributes)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​java.lang.String,​[Attributes](../Attributes.html "class in akka.stream")>>` | `[unapply](#unapply(akka.stream.snapshot.LogicSnapshotImpl))​(akka.stream.snapshot.LogicSnapshotImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LogicSnapshotImpl$](LogicSnapshotImpl$.html "class in akka.stream.snapshot") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LogicSnapshotImpl$
		
		
		
		```
		public LogicSnapshotImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​java.lang.String,​[Attributes](../Attributes.html "class in akka.stream"),​akka.stream.snapshot.LogicSnapshotImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.String,​[Attributes](../Attributes.html "class in akka.stream"),​akka.stream.snapshot.LogicSnapshotImpl>`
		- #### apply
		
		
		
		```
		public akka.stream.snapshot.LogicSnapshotImpl apply​(int index,
		                                                    java.lang.String label,
		                                                    [Attributes](../Attributes.html "class in akka.stream") attributes)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​java.lang.String,​[Attributes](../Attributes.html "class in akka.stream")>> unapply​(akka.stream.snapshot.LogicSnapshotImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/LogicSnapshotImpl$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/LogicSnapshotImpl$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/snapshot/LogicSnapshotImpl$.html)*