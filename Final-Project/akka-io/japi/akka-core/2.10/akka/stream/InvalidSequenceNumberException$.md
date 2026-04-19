---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:18:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/InvalidSequenceNumberException$.html
title: InvalidSequenceNumberException$
---

# InvalidSequenceNumberException$

## Content

Package [akka.stream](package-summary.html)
## Class InvalidSequenceNumberException$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​java.lang.String,​[InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream")\>
	- - akka.stream.InvalidSequenceNumberException$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​java.lang.Object,​java.lang.String,​[InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream")>`

---

```
public class InvalidSequenceNumberException$
extends scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.Object,​java.lang.String,​[InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.InvalidSequenceNumberException$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [InvalidSequenceNumberException$](InvalidSequenceNumberException$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InvalidSequenceNumberException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream")` | `[apply](#apply(long,long,java.lang.String))​(long expectedSeqNr,  long gotSeqNr,  java.lang.String msg)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.String>>` | `[unapply](#unapply(akka.stream.InvalidSequenceNumberException))​([InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [InvalidSequenceNumberException$](InvalidSequenceNumberException$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### InvalidSequenceNumberException$
		
		
		
		```
		public InvalidSequenceNumberException$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​java.lang.Object,​java.lang.String,​[InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.Object,​java.lang.String,​[InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream")>`
		- #### apply
		
		
		
		```
		public [InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream") apply​(long expectedSeqNr,
		                                            long gotSeqNr,
		                                            java.lang.String msg)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​java.lang.Object,​java.lang.String>> unapply​([InvalidSequenceNumberException](InvalidSequenceNumberException.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/InvalidSequenceNumberException$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/InvalidSequenceNumberException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/InvalidSequenceNumberException$.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/InvalidSequenceNumberException$.html)*