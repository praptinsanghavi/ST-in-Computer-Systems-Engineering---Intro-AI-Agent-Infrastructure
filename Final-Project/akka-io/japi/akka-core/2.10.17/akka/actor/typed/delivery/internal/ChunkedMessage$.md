---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ChunkedMessage$.html
title: ChunkedMessage$
---

# ChunkedMessage$

## Content

Package [akka.actor.typed.delivery.internal](package-summary.html)
## Class ChunkedMessage$

- java.lang.Object
- - scala.runtime.AbstractFunction5\<[ByteString](../../../../util/ByteString.html "class in akka.util"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​akka.actor.typed.delivery.internal.ChunkedMessage\>
	- - akka.actor.typed.delivery.internal.ChunkedMessage$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function5<[ByteString](../../../../util/ByteString.html "class in akka.util"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​akka.actor.typed.delivery.internal.ChunkedMessage>`

---

```
public class ChunkedMessage$
extends scala.runtime.AbstractFunction5<[ByteString](../../../../util/ByteString.html "class in akka.util"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​akka.actor.typed.delivery.internal.ChunkedMessage>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.typed.delivery.internal.ChunkedMessage$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ChunkedMessage$](ChunkedMessage$.html "class in akka.actor.typed.delivery.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ChunkedMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.delivery.internal.ChunkedMessage` | `[apply](#apply(akka.util.ByteString,boolean,boolean,int,java.lang.String))​([ByteString](../../../../util/ByteString.html "class in akka.util") serialized,  boolean firstChunk,  boolean lastChunk,  int serializerId,  java.lang.String manifest)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple5<[ByteString](../../../../util/ByteString.html "class in akka.util"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String>>` | `[unapply](#unapply(akka.actor.typed.delivery.internal.ChunkedMessage))​(akka.actor.typed.delivery.internal.ChunkedMessage x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction5
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function5
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ChunkedMessage$](ChunkedMessage$.html "class in akka.actor.typed.delivery.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ChunkedMessage$
		
		
		
		```
		public ChunkedMessage$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function5<[ByteString](../../../../util/ByteString.html "class in akka.util"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​akka.actor.typed.delivery.internal.ChunkedMessage>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction5<[ByteString](../../../../util/ByteString.html "class in akka.util"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String,​akka.actor.typed.delivery.internal.ChunkedMessage>`
		- #### apply
		
		
		
		```
		public akka.actor.typed.delivery.internal.ChunkedMessage apply​([ByteString](../../../../util/ByteString.html "class in akka.util") serialized,
		                                                               boolean firstChunk,
		                                                               boolean lastChunk,
		                                                               int serializerId,
		                                                               java.lang.String manifest)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<[ByteString](../../../../util/ByteString.html "class in akka.util"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.String>> unapply​(akka.actor.typed.delivery.internal.ChunkedMessage x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ChunkedMessage$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ChunkedMessage$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/delivery/internal/ChunkedMessage$.html)*