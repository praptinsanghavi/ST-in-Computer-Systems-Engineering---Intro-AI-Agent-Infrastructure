---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:27:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IOResult$.html
title: IOResult$
---

# IOResult$

## Content

Package [akka.stream](package-summary.html)
## Class IOResult$

- java.lang.Object
- - akka.stream.IOResult$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class IOResult$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.IOResult$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [IOResult$](IOResult$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IOResult$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[apply](#apply(long))​(long count)` |  |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[apply](#apply(long,scala.util.Try))​(long count,  scala.util.Try<[Done](../Done.html "class in akka")> status)` |  |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[createFailed](#createFailed(long,java.lang.Throwable))​(long count,  java.lang.Throwable ex)` | Deprecated. use IOOperationIncompleteException. |
	| `[IOResult](IOResult.html "class in akka.stream")` | `[createSuccessful](#createSuccessful(long))​(long count)` | JAVA API: Creates successful IOResult |
	| `scala.Option<scala.Tuple2<java.lang.Object,​scala.util.Try<[Done](../Done.html "class in akka")>>>` | `[unapply](#unapply(akka.stream.IOResult))​([IOResult](IOResult.html "class in akka.stream") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [IOResult$](IOResult$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### IOResult$
		
		
		
		```
		public IOResult$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") apply​(long count)
		```
		- #### createSuccessful
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") createSuccessful​(long count)
		```
		
		JAVA API: Creates successful IOResult
		- #### createFailed
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") createFailed​(long count,
		                             java.lang.Throwable ex)
		```
		
		Deprecated.
		use IOOperationIncompleteException. Since 2\.6\.0\.
		- #### apply
		
		
		
		```
		public [IOResult](IOResult.html "class in akka.stream") apply​(long count,
		                      scala.util.Try<[Done](../Done.html "class in akka")> status)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​scala.util.Try<[Done](../Done.html "class in akka")>>> unapply​([IOResult](IOResult.html "class in akka.stream") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/Done.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IOResult$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IOResult.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IOResult$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/IOResult$.html)*