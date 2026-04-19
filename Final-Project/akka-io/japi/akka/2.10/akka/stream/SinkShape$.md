---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:03:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape$.html
title: SinkShape$
---

# SinkShape$

## Content

Package [akka.stream](package-summary.html)
## Class SinkShape$

- java.lang.Object
- - akka.stream.SinkShape$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SinkShape$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.SinkShape$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SinkShape$](SinkShape$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SinkShape$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [SinkShape](SinkShape.html "class in akka.stream")<T>` | `[apply](#apply(akka.stream.Inlet))​([Inlet](Inlet.html "class in akka.stream")<T> in)` |  |
	| `<T> [SinkShape](SinkShape.html "class in akka.stream")<T>` | `[of](#of(akka.stream.Inlet))​([Inlet](Inlet.html "class in akka.stream")<T> inlet)` | Java API |
	| `<T> scala.Option<[Inlet](Inlet.html "class in akka.stream")<T>>` | `[unapply](#unapply(akka.stream.SinkShape))​([SinkShape](SinkShape.html "class in akka.stream")<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SinkShape$](SinkShape$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SinkShape$
		
		
		
		```
		public SinkShape$()
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public <T> [SinkShape](SinkShape.html "class in akka.stream")<T> of​([Inlet](Inlet.html "class in akka.stream")<T> inlet)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public <T> [SinkShape](SinkShape.html "class in akka.stream")<T> apply​([Inlet](Inlet.html "class in akka.stream")<T> in)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<[Inlet](Inlet.html "class in akka.stream")<T>> unapply​([SinkShape](SinkShape.html "class in akka.stream")<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/Inlet.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/SinkShape$.html)*